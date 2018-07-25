package com.biogen.trackwise.createtrn.db.dao;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.biogen.trackwise.db.dao.TrackWiseDAO;
import com.biogen.trackwise.db.exception.TrackWiseSQLException;
import com.biogen.util.XMLPropertiesBundle;

/**
 * GlobalDeviationGridDAO.java
 * 
 * This class is the DAO that provides the SQL grids an interface to obtain
 * database information about their respective grid fields.
 * 
 * @author Liron Liptz
 * @version 1.0
 */
public class CreateTRNDAO extends TrackWiseDAO {
	/**
	 * The string that will be returned by the class if there is an error while
	 * obtaining information from the database
	 */
	public static final String ERROR_STRING = "ERROR";

	/** The log4j object used for logging information and errors **/
	private static Logger logger = Logger.getLogger(CreateTRNDAO.class);

	private static final String QUERY_PROPERTIES_FILE = "queries.properties";

	private static final XMLPropertiesBundle QUERY_BUNDLE = new XMLPropertiesBundle(
			QUERY_PROPERTIES_FILE);

	private static Map<String, Integer> activityIdsCache = new HashMap<String, Integer>();

	/**
	 * This constructor simply calls the parent class constructor to create the
	 * database connection object.
	 */
	public CreateTRNDAO() {
		super();
	}

	/**
	 * This method ...
	 * 
	 * @param requiredValues
	 *            The list of parameters for the query, which is just a single
	 *            value for the Equipment ID
	 * @return The description for the given Equipment ID if there are no
	 *         errors, the ERROR_STRING value if there is an error while
	 *         retrieving information from the database, or null if there is a
	 *         problem connecting to the database and executing the query
	 */
	public boolean checkUnique(String queryName, String value, String prId) {
		String[] requiredValues = {value, prId};

		// String sqlText = QUERY_BUNDLE.getProperty("checkUniqueFromView");
		String sqlText = QUERY_BUNDLE.getProperty(queryName);
		// sqlText = sqlText.replace("$TBL_NAME", viewName);
		try {
			// openOracleConnection();
			String[] queryResults = queryDatabase(sqlText, requiredValues);
			// closeOracleConnection();
			int count = Integer.parseInt(queryResults[0]);
			return count == 0;
		} catch (TrackWiseSQLException e) {
			String msg = e.getMessage();
			logger.error("Error while checking if value is unique db: " + msg);
			// closeOracleConnection();
			return false;
		}
	}

	public boolean checkUpdateable(int prId) {
		String[] requiredValues = {"" + prId};

		// String sqlText = QUERY_BUNDLE.getProperty("checkUniqueFromView");
		String sqlText = QUERY_BUNDLE.getProperty("checkPRClosed");
		// sqlText = sqlText.replace("$TBL_NAME", viewName);
		try {
			// openOracleConnection();
			String[] queryResults = queryDatabase(sqlText, requiredValues);
			// closeOracleConnection();
			if (queryResults.length < 1) {
				logger.debug("Cannot find pr [" + prId + "] in DB");
				return true;
			}
			int isClosed = Integer.parseInt(queryResults[0]);
			return isClosed != 1; // 1 means closed
		} catch (TrackWiseSQLException e) {
			String msg = e.getMessage();
			logger.error("Error while checking checkPRClosed in db: " + msg);
			// closeOracleConnection();
			return false;
		}
	}

	public int getActivityId(String activity) throws Exception {
		// first search in cache
		if (activityIdsCache.get(activity) != null) {
			return activityIdsCache.get(activity);
		}

		String[] requiredValues = {activity};
		String sqlText = QUERY_BUNDLE.getProperty("getActivityId");
		try {
			// openOracleConnection();
			String[] queryResults = queryDatabase(sqlText, requiredValues);
			// closeOracleConnection();
			int id = Integer.parseInt(queryResults[0]);
			// store in cache
			activityIdsCache.put(activity, id);

			return id;
		} catch (TrackWiseSQLException e) {
			String msg = e.getMessage();
			String err = "Error while finding the ID of activity [" + activity
					+ "]";
			logger.error(msg);
			logger.error(err);
			// closeOracleConnection();
			throw new Exception(err);
		}
	}

	public String[][] getEntryFormDataView1(String reportNumber)
			throws Exception {

		String[] requiredValues = {reportNumber};
		String sqlText = QUERY_BUNDLE.getProperty("getEntryFormDataView1");
		try {
			// openOracleConnection();
			return queryTW_AGTrackerDatabase(sqlText, requiredValues);
			// closeOracleConnection();

		} catch (TrackWiseSQLException e) {
			String msg = e.getMessage();
			String err = "Error while finding the entry form data of report_no ["
					+ reportNumber + "]";
			logger.error(msg);
			logger.error(err);
			// closeOracleConnection();
			throw new Exception(err);
		}
	}

	public String[][] getEntryFormDataView2(String reportNumber)
			throws Exception {

		String[] requiredValues = {reportNumber};
		String sqlText = QUERY_BUNDLE.getProperty("getEntryFormDataView2");
		try {
			// openOracleConnection();
			return queryTW_AGTrackerDatabase(sqlText, requiredValues);
			// closeOracleConnection();

		} catch (TrackWiseSQLException e) {
			String msg = e.getMessage();
			String err = "Error while finding the entry form data of report_no ["
					+ reportNumber + "]";
			logger.error(msg);
			logger.error(err);
			// closeOracleConnection();
			throw new Exception(err);
		}
	}

	/*  This method uses the input parameter to query a table and return a String[][] of
	 *  Complaint Product Grid data.
	 *  
	 * @param confirmLotNumber  The value used in the Where clause to return data
	 */
	public String[][] getComplaintProductGridData(String confirmLotNumber)
			throws Exception {
		String[] requiredValues = {confirmLotNumber};
		String sqlText = QUERY_BUNDLE
				.getProperty("getComplaintProductGridData");
		try {
			// openOracleConnection();
			String[][] queryResults = queryDatabaseMultipleRows(sqlText,
					requiredValues, false);
			// closeOracleConnection();

			if (queryResults == null || queryResults.length < 1) {
				return new String[0][];
			}

			return queryResults;
		} catch (TrackWiseSQLException e) {
			String msg = e.getMessage();
			String dispErr = "No rows found for confirmed lot # "
					+ confirmLotNumber;
			logger.error(msg);
			logger.error(dispErr);
			// closeOracleConnection();
			throw new Exception(e);
		}
	}

	/*
	 * This method takes a Country Code and uses it to get the associated Country Name
	 */
	public String getCountryName(String countryCode) throws Exception {
		String[] requiredValues = {countryCode};
		String sqlText = QUERY_BUNDLE.getProperty("getCountryName");
		try {
			// openOracleConnection();
			String[] queryResults = queryDatabase(sqlText, requiredValues);
			// closeOracleConnection();

			if (queryResults == null || queryResults.length < 1) {
				return null;
			}

			return queryResults[0];
		} catch (TrackWiseSQLException e) {
			String msg = e.getMessage();
			String dispErr = "No rows found for country code " + countryCode;
			logger.error(msg);
			logger.error(dispErr);
			// closeOracleConnection();
			throw new Exception(e);
		}
	}

	/*
	 * This method takes a Country Name and uses it to get the associated Country Code
	 */
	public String getCountryCode(String countryName) throws Exception {
		String[] requiredValues = {countryName};
		String sqlText = QUERY_BUNDLE.getProperty("getCountryCode");
		try {
			// openOracleConnection();
			String[] queryResults = queryDatabase(sqlText, requiredValues);
			// closeOracleConnection();

			if (queryResults == null || queryResults.length < 1) {
				return null;
			}

			return queryResults[0];
		} catch (TrackWiseSQLException e) {
			String msg = e.getMessage();
			String dispErr = "No rows found for country name " + countryName;
			logger.error(msg);
			logger.error(dispErr);
			// closeOracleConnection();
			throw new Exception(e);
		}
	}

	/*
	 * This method validates an external_case_id
	 * Returns true if the sValue parameter that represents the external_case_id doesn't exist.
	 * Returns false if the sValue parameter already exists 
	 */
	public boolean validateExternalCaseID(String sValue) throws Exception {
		String[] requiredValues = {sValue};
		String sqlText = QUERY_BUNDLE.getProperty("validateExternalCaseID");
		try {
			// openOracleConnection();
			String[] queryResults = queryDatabase(sqlText, requiredValues);
			// closeOracleConnection();

			if (queryResults == null || queryResults.length < 1) {
				return true;
			}

			return false;
		} catch (TrackWiseSQLException e) {
			String msg = e.getMessage();
			logger.error(msg);
			if (msg.equals("No results were returned by the query!"))
				return true;
			// closeOracleConnection();
			else
				throw new Exception(e);
		}
	}
	/*
	 * This method takes a TRN ID and checks if it's locked.
	 * If it is, TRUE is returned.  Else FALSE
	 */
	public boolean getLockedStatus(String prId) throws Exception {

		String[] requiredValues = {prId};
		String sqlText = QUERY_BUNDLE.getProperty("checkLockedStatus");
		try {
			// openOracleConnection();
			String[] queryResults = queryDatabase(sqlText, requiredValues);
			// closeOracleConnection();
			int count = Integer.parseInt(queryResults[0]);
			// store in cache
			if (count > 0)
				return true;

			return false;
		} catch (TrackWiseSQLException e) {
			String msg = e.getMessage();
			String err = "Error while finding the lock status of pr [" + prId
					+ "]";
			logger.error(msg);
			logger.error(err);
			// closeOracleConnection();
			throw new Exception(err);
		}
	}

	/**
	 * The main method, which is used for unit testing only.
	 * 
	 * @param args
	 *            Command line arguments, not used
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		String[] values = {"D11641", "H02448-04"};

		// System.out.println(getEquipmentDescription(value));
		// value = getInstrumentInfo(value);

	}
}
