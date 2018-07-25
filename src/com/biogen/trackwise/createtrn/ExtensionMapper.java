/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:23:23 CEST)
 */

package com.biogen.trackwise.createtrn;

/**
 * ExtensionMapper class
 */
@SuppressWarnings({"unchecked", "unused"})
public class ExtensionMapper {

	public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
			java.lang.String typeName, javax.xml.stream.XMLStreamReader reader)
			throws java.lang.Exception {

		if ("http://createtrn.trackwise.biogen.com".equals(namespaceURI)
				&& "AttachmentType".equals(typeName)) {

			return com.biogen.trackwise.createtrn.AttachmentType.Factory
					.parse(reader);

		}

		if ("http://bean.trackwise.biogen.com/xsd".equals(namespaceURI)
				&& "InputField".equals(typeName)) {

			return com.biogen.trackwise.bean.InputField.Factory.parse(reader);

		}

		if ("http://serviceresponse.trackwise.biogen.com/xsd"
				.equals(namespaceURI) && "SoapValues".equals(typeName)) {

			return com.biogen.trackwise.serviceresponse.xsd.SoapValues.Factory
					.parse(reader);

		}

		if ("http://createtrn.trackwise.biogen.com".equals(namespaceURI)
				&& "CreateTRNException".equals(typeName)) {

			return com.biogen.trackwise.createtrn.CreateTRNException.Factory
					.parse(reader);

		}

		if ("http://bean.trackwise.biogen.com/xsd".equals(namespaceURI)
				&& "InputGrid".equals(typeName)) {

			return com.biogen.trackwise.bean.InputGrid.Factory.parse(reader);

		}

		if ("http://bean.trackwise.biogen.com/xsd".equals(namespaceURI)
				&& "ArrayOfInputField".equals(typeName)) {

			return com.biogen.trackwise.bean.ArrayOfInputField.Factory
					.parse(reader);
		}

		if ("http://serviceresponse.trackwise.biogen.com/xsd"
				.equals(namespaceURI) && "ServiceResponse".equals(typeName)) {

			return com.biogen.trackwise.serviceresponse.xsd.ServiceResponse.Factory
					.parse(reader);

		}

		throw new org.apache.axis2.databinding.ADBException("Unsupported type "
				+ namespaceURI + " " + typeName);
	}

}
