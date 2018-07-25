package com.biogen.trackwise.createtrn;

//import javax.jws.WebService;
//import javax.jws.WebMethod;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.activation.DataHandler;

import org.apache.log4j.Logger;

import com.biogen.trackwise.bean.InputField;
import com.biogen.trackwise.bean.InputGrid;
import com.biogen.trackwise.serviceresponse.ServiceResponse;
import com.biogen.trackwise.util.PRCreator;
import com.biogen.util.PropertiesBundle;
import com.biogen.util.YesNoSelection;

/**
 * CreateTRNServices.java
 *
 * @author Dan Longo (dan.longo@biogen.com)
 * @version 1.0
 */
// @WebService()
public class CreateTRNServices {
	/** The log4j object used for logging information and errors **/
	private static Logger logger = Logger.getLogger(CreateTRNServices.class);

	/** The Division for Patient Status Form records */
	private final String PSF_DIVISION = "REMS Registry";

	/** The Project for Patient Status Form records */
	private final String PSF_PROJECT = "Patient Status Form";

	/** The properties file name for data fields for Patient Status Form records */
	private final String PSF_BUNDLE_NAME = "psf_fields";

	private static final PropertiesBundle TWPropertiesBundle = new PropertiesBundle(
			"application");

	public static final String DATE_FORMAT_NOW = "file_date_format";

	public ArrayList<String> fileNames = new ArrayList<String>();

	/**
	 * This method is exposed for creating a generic record based by it's type.
	 * 
	 * @param type
	 *            - The type of the project. This is used to lookup the
	 *            division, project and properties file.
	 * @param action
	 *            - Together with the type, will help determine the division,
	 *            project and properties file.
	 * @param dataFields
	 *            The list of data fields to be populated in the new record.
	 * @return An error message or the newly created TRN number
	 */
	// @WebMethod()
	public ServiceResponse createTRN(String token, String type, String action,
			AttachmentType[] attachments)

	{

		try {

			if (!validateAction(action)) {
				logger.error("PC Entry Form International creation is currently disabled!\n");
				String errorMessage = "PC Entry Form International creation is currently disabled.";
				ServiceResponse sr = new ServiceResponse();
				sr.setErrorMessage(errorMessage);
				return sr;
			}
			if (!validateToken(token)) {
				logger.error("The authentication token is not valid!\n");
				String errorMessage = "The authentication token is not valid!";
				ServiceResponse sr = new ServiceResponse();
				sr.setErrorMessage(errorMessage);
				return sr;
			}
			fileNames = new ArrayList<String>();
			if (attachments != null) {
				File f = null;
				for (AttachmentType file : attachments) {
					DataHandler dataHandler = file.getBinaryData();
					String newFileName = getFileName(file.getFileName());
					f = new File(newFileName);
					file.setFileName(newFileName); // So Trackwise can retrieve
													// it later in PRCreator
					FileOutputStream fileOutputStream;
					try {
						fileOutputStream = new FileOutputStream(f);

						dataHandler.writeTo(fileOutputStream);
						fileOutputStream.flush();
						fileOutputStream.close();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						String errorMessage = "The file attachment is not valid!";
						ServiceResponse sr = new ServiceResponse();
						sr.setErrorMessage(errorMessage);
						return sr;
					}
				}

			}
			PRTypeInfo typeInfo = MasterRouter.getTypeInfo(type, action);
			logger.info(type + " -> " + typeInfo.toString());

			PRCreator creator = new PRCreator(typeInfo.division,
					typeInfo.project, null, null, typeInfo.propFile,
					attachments, fileNames);// ,
			// typeInfo.cmd);

			ServiceResponse sr = creator.createNewRecord();
			return sr;
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
			ex.printStackTrace();
			logger.error(ex);
			ServiceResponse sr = new ServiceResponse();
			sr.setErrorMessage(ex.getMessage());
			// return ReturnValuesMgr.returnValues("Error", ex.getMessage());
			return sr;
		}
	}
	/**
	 * This method verifies the token that is passed to the web service is valid
	 * by comparing it against the expected token listed in the properties file.
	 * 
	 * @param token
	 *            The token passed to the web service
	 * @return Whether or not the token passed to the service is valid
	 */
	private static boolean validateToken(String token) {
		if (token != null
				&& token.trim().equals(
						TWPropertiesBundle.getString("auth_token").trim())) {
			return true;
		}

		return false;
	}

	/**
	 * This method verifies the action that is passed to the web service. If the
	 * Action is of type International and International isn't enabled, return
	 * false and exit.
	 * 
	 * @param token
	 *            The token passed to the web service
	 * @return Whether or not the action passed to the service is valid
	 */
	private static boolean validateAction(String action) {
		if (action != null
				&& action.trim().equals(
						TWPropertiesBundle.getString("InternationAction")
								.trim())) {
			if (TWPropertiesBundle.getString("InternationEnabled") != null
					&& TWPropertiesBundle.getString("InternationEnabled")
							.equals(YesNoSelection.No)) {
				return false;
			}
		}

		return true;
	}

	public static String now() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(
				TWPropertiesBundle.getString(DATE_FORMAT_NOW));
		return sdf.format(cal.getTime());
	}

	public String getFileName(String fileName) {

		int periodLocation = fileName.lastIndexOf('.');

		String extension = fileName
				.substring(periodLocation, fileName.length());

		// Add MonthDayYearHHMMSS to end of filename before extension
		fileName = fileName.substring(0, periodLocation) + "_"
				+ getTimeAsString() + extension;
		fileNames.add(fileName);
		return TWPropertiesBundle.getString("file_upload_directory") + fileName;
	}

	public String getTimeAsString() {

		return new SimpleDateFormat("MMMddyyyyhhmmss").format(new Date());
	}
	/**
	 * The main method, used for testing purposes only.
	 * 
	 * @param args
	 *            Command line arguments, not used
	 */
	public static void main(String[] args) {
		String[] names = {"Patient CMID", "Prescriber Status",
				"Prescriber Name", "Prescriber Number",
				"Completed Liver Testing?", "Hepatic Injury",
				"Immune-mediated Disorders", "Patient Continuation",
				"Prescriber Ack Provided?", "Prescriber Ack Date"};

		String[] values = {"4178241", "Yes", "Doug Smith", "555-6785", "Yes",
				"Yes", "Yes", "Yes", "Yes", "2016-07-22"};

		InputField[] inputs = new InputField[10];
		for (int i = 0; i < 10; i++) {
			inputs[i] = new InputField();
			inputs[i].setFieldName(names[i]);
			inputs[i].setFieldValue(values[i]);
		}
		InputGrid[] grids = new InputGrid[1];

		CreateTRNServices create = new CreateTRNServices();
		// System.out.println(create.createPatientStatusForm(inputs));
		/*System.out.println(create.createTRN("Middl3W@r3", "psf", "action",
				inputs, grids));*/
	}

}
