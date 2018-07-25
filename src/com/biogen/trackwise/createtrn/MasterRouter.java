package com.biogen.trackwise.createtrn;

import com.biogen.util.PropertiesBundle;

/**
 * Will help decide which property file to choose based on the message type
 * 
 * @author lliptz
 *
 */
public class MasterRouter {
	/** The properties file name for data fields for Patient Status Form records */
	private final static String MASTER_BUNDLE_NAME = "router";

	private static PropertiesBundle masterRouter = new PropertiesBundle(
			MASTER_BUNDLE_NAME);

	public static PRTypeInfo getTypeInfo(String type, String action)
			throws java.lang.Exception {
		if (type == null || type.length() == 0) {
			throw new java.lang.Exception("Cannot handle empty type");
		}

		if (action == null || action.length() == 0) {
			throw new java.lang.Exception("Cannot handle empty action");
		}

		String[] actionParts = action.split("[:]");

		String key = type + "." + action; // actionParts[0];
		// String cmd = actionParts.length > 1 ? actionParts[1] : null;
		String props = masterRouter.getString(key);

		if (props == null) {
			throw new Exception("Cannot handle type [" + type
					+ "] and action [" + action + "]");
		}
		String[] parts = props.split(",");
		if (parts.length < 3) {
			throw new Exception("Invalid format of PRTypeInfo [" + props + "]."
					+ "Should have 3 parts, has only " + parts.length);
		}

		PRTypeInfo typeInfo = new PRTypeInfo();
		typeInfo.division = parts[0];
		typeInfo.project = parts[1];
		typeInfo.propFile = parts[2];
		// typeInfo.cmd = cmd == null ? null : PRCmd.valueOf(cmd);

		return typeInfo;
	}
}
