/**
 * CreateTRN.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:23:23 CEST)
 */

package com.biogen.trackwise.createtrn;

/**
 * CreateTRN bean class
 */
@SuppressWarnings({"unchecked", "unused"})
public class CreateTRN implements org.apache.axis2.databinding.ADBBean {

	public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
			"http://createtrn.trackwise.biogen.com", "createTRN", "ns1");

	/**
	 * field for Token
	 */

	protected java.lang.String localToken;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	*   for this attribute. It will be used to determine whether to include this field
	*   in the serialized XML
	*/
	protected boolean localTokenTracker = false;

	public boolean isTokenSpecified() {
		return localTokenTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getToken() {
		return localToken;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Token
	 */
	public void setToken(java.lang.String param) {
		localTokenTracker = true;

		this.localToken = param;

	}

	/**
	 * field for Type
	 */

	protected java.lang.String localType;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	*   for this attribute. It will be used to determine whether to include this field
	*   in the serialized XML
	*/
	protected boolean localTypeTracker = false;

	public boolean isTypeSpecified() {
		return localTypeTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getType() {
		return localType;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Type
	 */
	public void setType(java.lang.String param) {
		localTypeTracker = true;

		this.localType = param;

	}

	/**
	 * field for Action
	 */

	protected java.lang.String localAction;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	*   for this attribute. It will be used to determine whether to include this field
	*   in the serialized XML
	*/
	protected boolean localActionTracker = false;

	public boolean isActionSpecified() {
		return localActionTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getAction() {
		return localAction;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Action
	 */
	public void setAction(java.lang.String param) {
		localActionTracker = true;

		this.localAction = param;

	}

	/**
	 * field for DataFields This was an Array!
	 */

	protected com.biogen.trackwise.bean.InputField[] localDataFields;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	*   for this attribute. It will be used to determine whether to include this field
	*   in the serialized XML
	*/
	protected boolean localDataFieldsTracker = false;

	public boolean isDataFieldsSpecified() {
		return localDataFieldsTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return com.biogen.trackwise.bean.InputField[]
	 */
	public com.biogen.trackwise.bean.InputField[] getDataFields() {
		return localDataFields;
	}

	/**
	 * validate the array for DataFields
	 */
	protected void validateDataFields(
			com.biogen.trackwise.bean.InputField[] param) {

	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            DataFields
	 */
	public void setDataFields(com.biogen.trackwise.bean.InputField[] param) {

		validateDataFields(param);

		localDataFieldsTracker = true;

		this.localDataFields = param;
	}

	/**
	 * Auto generated add method for the array for convenience
	 * 
	 * @param param
	 *            com.biogen.trackwise.bean.InputField
	 */
	public void addDataFields(com.biogen.trackwise.bean.InputField param) {
		if (localDataFields == null) {
			localDataFields = new com.biogen.trackwise.bean.InputField[]{};
		}

		// update the setting tracker
		localDataFieldsTracker = true;

		java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil
				.toList(localDataFields);
		list.add(param);
		this.localDataFields = (com.biogen.trackwise.bean.InputField[]) list
				.toArray(new com.biogen.trackwise.bean.InputField[list.size()]);

	}

	/**
	 * field for Grids
	 */

	protected com.biogen.trackwise.bean.InputGrid[] localGrids;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	*   for this attribute. It will be used to determine whether to include this field
	*   in the serialized XML
	*/
	protected boolean localGridsTracker = false;

	public boolean isGridsSpecified() {
		return localGridsTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return com.biogen.trackwise.bean.InputGrid[]
	 */
	public com.biogen.trackwise.bean.InputGrid[] getGrids() {
		return localGrids;
	}

	/**
	 * validate the array for Grids
	 */
	protected void validateGrids(com.biogen.trackwise.bean.InputGrid[] param) {

	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Grids
	 */
	public void setGrids(com.biogen.trackwise.bean.InputGrid[] param) {

		validateGrids(param);

		localGridsTracker = true;

		this.localGrids = param;
	}

	/**
	 * Auto generated add method for the array for convenience
	 * 
	 * @param param
	 *            com.biogen.trackwise.bean.InputGrid
	 */
	public void addGrids(com.biogen.trackwise.bean.InputGrid param) {
		if (localGrids == null) {
			localGrids = new com.biogen.trackwise.bean.InputGrid[]{};
		}

		// update the setting tracker
		localGridsTracker = true;

		java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil
				.toList(localGrids);
		list.add(param);
		this.localGrids = (com.biogen.trackwise.bean.InputGrid[]) list
				.toArray(new com.biogen.trackwise.bean.InputGrid[list.size()]);

	}

	/**
	 * field for Attachments This was an Array!
	 */

	protected com.biogen.trackwise.createtrn.AttachmentType[] localAttachments;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	*   for this attribute. It will be used to determine whether to include this field
	*   in the serialized XML
	*/
	protected boolean localAttachmentsTracker = false;

	public boolean isAttachmentsSpecified() {
		return localAttachmentsTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return com.biogen.trackwise.createtrn.AttachmentType[]
	 */
	public com.biogen.trackwise.createtrn.AttachmentType[] getAttachments() {
		return localAttachments;
	}

	/**
	 * validate the array for Attachments
	 */
	protected void validateAttachments(
			com.biogen.trackwise.createtrn.AttachmentType[] param) {

	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Attachments
	 */
	public void setAttachments(
			com.biogen.trackwise.createtrn.AttachmentType[] param) {

		validateAttachments(param);

		localAttachmentsTracker = true;

		this.localAttachments = param;
	}

	/**
	 * Auto generated add method for the array for convenience
	 * 
	 * @param param
	 *            com.biogen.trackwise.createtrn.AttachmentType
	 */
	public void addAttachments(
			com.biogen.trackwise.createtrn.AttachmentType param) {
		if (localAttachments == null) {
			localAttachments = new com.biogen.trackwise.createtrn.AttachmentType[]{};
		}

		// update the setting tracker
		localAttachmentsTracker = true;

		java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil
				.toList(localAttachments);
		list.add(param);
		this.localAttachments = (com.biogen.trackwise.createtrn.AttachmentType[]) list
				.toArray(new com.biogen.trackwise.createtrn.AttachmentType[list
						.size()]);

	}

	/**
	 *
	 * @param parentQName
	 * @param factory
	 * @return org.apache.axiom.om.OMElement
	 */
	public org.apache.axiom.om.OMElement getOMElement(
			final javax.xml.namespace.QName parentQName,
			final org.apache.axiom.om.OMFactory factory)
			throws org.apache.axis2.databinding.ADBException {

		org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(
				this, MY_QNAME);
		return factory.createOMElement(dataSource, MY_QNAME);

	}

	public void serialize(final javax.xml.namespace.QName parentQName,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException,
			org.apache.axis2.databinding.ADBException {
		serialize(parentQName, xmlWriter, false);
	}

	public void serialize(final javax.xml.namespace.QName parentQName,
			javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
			throws javax.xml.stream.XMLStreamException,
			org.apache.axis2.databinding.ADBException {

		java.lang.String prefix = null;
		java.lang.String namespace = null;

		prefix = parentQName.getPrefix();
		namespace = parentQName.getNamespaceURI();
		writeStartElement(prefix, namespace, parentQName.getLocalPart(),
				xmlWriter);

		if (serializeType) {

			java.lang.String namespacePrefix = registerPrefix(xmlWriter,
					"http://createtrn.trackwise.biogen.com");
			if ((namespacePrefix != null)
					&& (namespacePrefix.trim().length() > 0)) {
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						namespacePrefix + ":createTRN", xmlWriter);
			} else {
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						"createTRN", xmlWriter);
			}

		}
		if (localTokenTracker) {
			namespace = "http://createtrn.trackwise.biogen.com";
			writeStartElement(null, namespace, "token", xmlWriter);

			if (localToken == null) {
				// write the nil attribute

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {

				xmlWriter.writeCharacters(localToken);

			}

			xmlWriter.writeEndElement();
		}
		if (localTypeTracker) {
			namespace = "http://createtrn.trackwise.biogen.com";
			writeStartElement(null, namespace, "type", xmlWriter);

			if (localType == null) {
				// write the nil attribute

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {

				xmlWriter.writeCharacters(localType);

			}

			xmlWriter.writeEndElement();
		}
		if (localActionTracker) {
			namespace = "http://createtrn.trackwise.biogen.com";
			writeStartElement(null, namespace, "action", xmlWriter);

			if (localAction == null) {
				// write the nil attribute

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {

				xmlWriter.writeCharacters(localAction);

			}

			xmlWriter.writeEndElement();
		}
		if (localDataFieldsTracker) {
			if (localDataFields != null) {
				for (int i = 0; i < localDataFields.length; i++) {
					if (localDataFields[i] != null) {
						localDataFields[i]
								.serialize(
										new javax.xml.namespace.QName(
												"http://createtrn.trackwise.biogen.com",
												"dataFields"), xmlWriter);
					} else {

						writeStartElement(null,
								"http://createtrn.trackwise.biogen.com",
								"dataFields", xmlWriter);

						// write the nil attribute
						writeAttribute("xsi",
								"http://www.w3.org/2001/XMLSchema-instance",
								"nil", "1", xmlWriter);
						xmlWriter.writeEndElement();

					}

				}
			} else {

				writeStartElement(null,
						"http://createtrn.trackwise.biogen.com", "dataFields",
						xmlWriter);

				// write the nil attribute
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);
				xmlWriter.writeEndElement();

			}
		}
		if (localGridsTracker) {
			if (localGrids != null) {
				for (int i = 0; i < localGrids.length; i++) {
					if (localGrids[i] != null) {
						localGrids[i].serialize(new javax.xml.namespace.QName(
								"http://createtrn.trackwise.biogen.com",
								"grids"), xmlWriter);
					} else {

						writeStartElement(null,
								"http://createtrn.trackwise.biogen.com",
								"grids", xmlWriter);

						// write the nil attribute
						writeAttribute("xsi",
								"http://www.w3.org/2001/XMLSchema-instance",
								"nil", "1", xmlWriter);
						xmlWriter.writeEndElement();

					}

				}
			} else {

				writeStartElement(null,
						"http://createtrn.trackwise.biogen.com", "grids",
						xmlWriter);

				// write the nil attribute
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);
				xmlWriter.writeEndElement();

			}
		}
		if (localAttachmentsTracker) {
			if (localAttachments != null) {
				for (int i = 0; i < localAttachments.length; i++) {
					if (localAttachments[i] != null) {
						localAttachments[i]
								.serialize(
										new javax.xml.namespace.QName(
												"http://createtrn.trackwise.biogen.com",
												"attachments"), xmlWriter);
					} else {

						writeStartElement(null,
								"http://createtrn.trackwise.biogen.com",
								"attachments", xmlWriter);

						// write the nil attribute
						writeAttribute("xsi",
								"http://www.w3.org/2001/XMLSchema-instance",
								"nil", "1", xmlWriter);
						xmlWriter.writeEndElement();

					}

				}
			} else {

				writeStartElement(null,
						"http://createtrn.trackwise.biogen.com", "attachments",
						xmlWriter);

				// write the nil attribute
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);
				xmlWriter.writeEndElement();

			}
		}
		xmlWriter.writeEndElement();

	}

	private static java.lang.String generatePrefix(java.lang.String namespace) {
		if (namespace.equals("http://createtrn.trackwise.biogen.com")) {
			return "ns1";
		}
		return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
	}

	/**
	 * Utility method to write an element start tag.
	 */
	private void writeStartElement(java.lang.String prefix,
			java.lang.String namespace, java.lang.String localPart,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
		java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
		if (writerPrefix != null) {
			xmlWriter.writeStartElement(namespace, localPart);
		} else {
			if (namespace.length() == 0) {
				prefix = "";
			} else if (prefix == null) {
				prefix = generatePrefix(namespace);
			}

			xmlWriter.writeStartElement(prefix, localPart, namespace);
			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);
		}
	}

	/**
	 * Util method to write an attribute with the ns prefix
	 */
	private void writeAttribute(java.lang.String prefix,
			java.lang.String namespace, java.lang.String attName,
			java.lang.String attValue,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
		if (xmlWriter.getPrefix(namespace) == null) {
			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);
		}
		xmlWriter.writeAttribute(namespace, attName, attValue);
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeAttribute(java.lang.String namespace,
			java.lang.String attName, java.lang.String attValue,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
		if (namespace.equals("")) {
			xmlWriter.writeAttribute(attName, attValue);
		} else {
			registerPrefix(xmlWriter, namespace);
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeQNameAttribute(java.lang.String namespace,
			java.lang.String attName, javax.xml.namespace.QName qname,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {

		java.lang.String attributeNamespace = qname.getNamespaceURI();
		java.lang.String attributePrefix = xmlWriter
				.getPrefix(attributeNamespace);
		if (attributePrefix == null) {
			attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
		}
		java.lang.String attributeValue;
		if (attributePrefix.trim().length() > 0) {
			attributeValue = attributePrefix + ":" + qname.getLocalPart();
		} else {
			attributeValue = qname.getLocalPart();
		}

		if (namespace.equals("")) {
			xmlWriter.writeAttribute(attName, attributeValue);
		} else {
			registerPrefix(xmlWriter, namespace);
			xmlWriter.writeAttribute(namespace, attName, attributeValue);
		}
	}
	/**
	 * method to handle Qnames
	 */

	private void writeQName(javax.xml.namespace.QName qname,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
		java.lang.String namespaceURI = qname.getNamespaceURI();
		if (namespaceURI != null) {
			java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
			if (prefix == null) {
				prefix = generatePrefix(namespaceURI);
				xmlWriter.writeNamespace(prefix, namespaceURI);
				xmlWriter.setPrefix(prefix, namespaceURI);
			}

			if (prefix.trim().length() > 0) {
				xmlWriter.writeCharacters(prefix
						+ ":"
						+ org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(qname));
			} else {
				// i.e this is the default namespace
				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(qname));
			}

		} else {
			xmlWriter
					.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(qname));
		}
	}

	private void writeQNames(javax.xml.namespace.QName[] qnames,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {

		if (qnames != null) {
			// we have to store this data until last moment since it is not
			// possible to write any
			// namespace data after writing the charactor data
			java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
			java.lang.String namespaceURI = null;
			java.lang.String prefix = null;

			for (int i = 0; i < qnames.length; i++) {
				if (i > 0) {
					stringToWrite.append(" ");
				}
				namespaceURI = qnames[i].getNamespaceURI();
				if (namespaceURI != null) {
					prefix = xmlWriter.getPrefix(namespaceURI);
					if ((prefix == null) || (prefix.length() == 0)) {
						prefix = generatePrefix(namespaceURI);
						xmlWriter.writeNamespace(prefix, namespaceURI);
						xmlWriter.setPrefix(prefix, namespaceURI);
					}

					if (prefix.trim().length() > 0) {
						stringToWrite
								.append(prefix)
								.append(":")
								.append(org.apache.axis2.databinding.utils.ConverterUtil
										.convertToString(qnames[i]));
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil
										.convertToString(qnames[i]));
					}
				} else {
					stringToWrite
							.append(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(qnames[i]));
				}
			}
			xmlWriter.writeCharacters(stringToWrite.toString());
		}

	}

	/**
	 * Register a namespace prefix
	 */
	private java.lang.String registerPrefix(
			javax.xml.stream.XMLStreamWriter xmlWriter,
			java.lang.String namespace)
			throws javax.xml.stream.XMLStreamException {
		java.lang.String prefix = xmlWriter.getPrefix(namespace);
		if (prefix == null) {
			prefix = generatePrefix(namespace);
			javax.xml.namespace.NamespaceContext nsContext = xmlWriter
					.getNamespaceContext();
			while (true) {
				java.lang.String uri = nsContext.getNamespaceURI(prefix);
				if (uri == null || uri.length() == 0) {
					break;
				}
				prefix = org.apache.axis2.databinding.utils.BeanUtil
						.getUniquePrefix();
			}
			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);
		}
		return prefix;
	}

	/**
	 * databinding method to get an XML representation of this object
	 *
	 */
	public javax.xml.stream.XMLStreamReader getPullParser(
			javax.xml.namespace.QName qName)
			throws org.apache.axis2.databinding.ADBException {

		java.util.ArrayList elementList = new java.util.ArrayList();
		java.util.ArrayList attribList = new java.util.ArrayList();

		if (localTokenTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://createtrn.trackwise.biogen.com", "token"));

			elementList.add(localToken == null
					? null
					: org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localToken));
		}
		if (localTypeTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://createtrn.trackwise.biogen.com", "type"));

			elementList.add(localType == null
					? null
					: org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localType));
		}
		if (localActionTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://createtrn.trackwise.biogen.com", "action"));

			elementList.add(localAction == null
					? null
					: org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localAction));
		}
		if (localDataFieldsTracker) {
			if (localDataFields != null) {
				for (int i = 0; i < localDataFields.length; i++) {

					if (localDataFields[i] != null) {
						elementList.add(new javax.xml.namespace.QName(
								"http://createtrn.trackwise.biogen.com",
								"dataFields"));
						elementList.add(localDataFields[i]);
					} else {

						elementList.add(new javax.xml.namespace.QName(
								"http://createtrn.trackwise.biogen.com",
								"dataFields"));
						elementList.add(null);

					}

				}
			} else {

				elementList.add(new javax.xml.namespace.QName(
						"http://createtrn.trackwise.biogen.com", "dataFields"));
				elementList.add(localDataFields);

			}

		}
		if (localGridsTracker) {
			if (localGrids != null) {
				for (int i = 0; i < localGrids.length; i++) {

					if (localGrids[i] != null) {
						elementList.add(new javax.xml.namespace.QName(
								"http://createtrn.trackwise.biogen.com",
								"grids"));
						elementList.add(localGrids[i]);
					} else {

						elementList.add(new javax.xml.namespace.QName(
								"http://createtrn.trackwise.biogen.com",
								"grids"));
						elementList.add(null);

					}

				}
			} else {

				elementList.add(new javax.xml.namespace.QName(
						"http://createtrn.trackwise.biogen.com", "grids"));
				elementList.add(localGrids);

			}

		}
		if (localAttachmentsTracker) {
			if (localAttachments != null) {
				for (int i = 0; i < localAttachments.length; i++) {

					if (localAttachments[i] != null) {
						elementList.add(new javax.xml.namespace.QName(
								"http://createtrn.trackwise.biogen.com",
								"attachments"));
						elementList.add(localAttachments[i]);
					} else {

						elementList.add(new javax.xml.namespace.QName(
								"http://createtrn.trackwise.biogen.com",
								"attachments"));
						elementList.add(null);

					}

				}
			} else {

				elementList
						.add(new javax.xml.namespace.QName(
								"http://createtrn.trackwise.biogen.com",
								"attachments"));
				elementList.add(localAttachments);

			}

		}

		return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(
				qName, elementList.toArray(), attribList.toArray());

	}

	/**
	 * Factory class that keeps the parse method
	 */
	public static class Factory {

		/**
		 * static method to create the object Precondition: If this object is an
		 * element, the current or next start element starts this object and any
		 * intervening reader events are ignorable If this object is not an
		 * element, it is a complex type and the reader is at the event just
		 * after the outer start element Postcondition: If this object is an
		 * element, the reader is positioned at its end element If this object
		 * is a complex type, the reader is positioned at the end element of its
		 * outer element
		 */
		public static CreateTRN parse(javax.xml.stream.XMLStreamReader reader)
				throws java.lang.Exception {
			CreateTRN object = new CreateTRN();

			int event;
			java.lang.String nillableValue = null;
			java.lang.String prefix = "";
			java.lang.String namespaceuri = "";
			try {

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.getAttributeValue(
						"http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
					java.lang.String fullTypeName = reader
							.getAttributeValue(
									"http://www.w3.org/2001/XMLSchema-instance",
									"type");
					if (fullTypeName != null) {
						java.lang.String nsPrefix = null;
						if (fullTypeName.indexOf(":") > -1) {
							nsPrefix = fullTypeName.substring(0,
									fullTypeName.indexOf(":"));
						}
						nsPrefix = nsPrefix == null ? "" : nsPrefix;

						java.lang.String type = fullTypeName
								.substring(fullTypeName.indexOf(":") + 1);

						if (!"createTRN".equals(type)) {
							// find namespace for the prefix
							java.lang.String nsUri = reader
									.getNamespaceContext().getNamespaceURI(
											nsPrefix);
							return (CreateTRN) com.biogen.trackwise.createtrn.ExtensionMapper
									.getTypeObject(nsUri, type, reader);
						}

					}

				}

				// Note all attributes that were handled. Used to differ normal
				// attributes
				// from anyAttributes.
				java.util.Vector handledAttributes = new java.util.Vector();

				reader.next();

				java.util.ArrayList list4 = new java.util.ArrayList();

				java.util.ArrayList list5 = new java.util.ArrayList();

				java.util.ArrayList list6 = new java.util.ArrayList();

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://createtrn.trackwise.biogen.com",
								"token").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setToken(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(content));

					} else {

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://createtrn.trackwise.biogen.com", "type")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setType(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(content));

					} else {

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://createtrn.trackwise.biogen.com",
								"action").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setAction(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(content));

					} else {

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://createtrn.trackwise.biogen.com",
								"dataFields").equals(reader.getName())) {

					// Process the array and step past its final element's end.

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue)
							|| "1".equals(nillableValue)) {
						list4.add(null);
						reader.next();
					} else {
						list4.add(com.biogen.trackwise.bean.InputField.Factory
								.parse(reader));
					}
					// loop until we find a start element that is not part of
					// this array
					boolean loopDone4 = false;
					while (!loopDone4) {
						// We should be at the end element, but make sure
						while (!reader.isEndElement())
							reader.next();
						// Step out of this element
						reader.next();
						// Step to next element event.
						while (!reader.isStartElement()
								&& !reader.isEndElement())
							reader.next();
						if (reader.isEndElement()) {
							// two continuous end elements means we are exiting
							// the xml structure
							loopDone4 = true;
						} else {
							if (new javax.xml.namespace.QName(
									"http://createtrn.trackwise.biogen.com",
									"dataFields").equals(reader.getName())) {

								nillableValue = reader
										.getAttributeValue(
												"http://www.w3.org/2001/XMLSchema-instance",
												"nil");
								if ("true".equals(nillableValue)
										|| "1".equals(nillableValue)) {
									list4.add(null);
									reader.next();
								} else {
									list4.add(com.biogen.trackwise.bean.InputField.Factory
											.parse(reader));
								}
							} else {
								loopDone4 = true;
							}
						}
					}
					// call the converter utility to convert and set the array

					object.setDataFields((com.biogen.trackwise.bean.InputField[]) org.apache.axis2.databinding.utils.ConverterUtil
							.convertToArray(
									com.biogen.trackwise.bean.InputField.class,
									list4));

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://createtrn.trackwise.biogen.com",
								"grids").equals(reader.getName())) {

					// Process the array and step past its final element's end.

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue)
							|| "1".equals(nillableValue)) {
						list5.add(null);
						reader.next();
					} else {
						list5.add(com.biogen.trackwise.bean.InputGrid.Factory
								.parse(reader));
					}
					// loop until we find a start element that is not part of
					// this array
					boolean loopDone5 = false;
					while (!loopDone5) {
						// We should be at the end element, but make sure
						while (!reader.isEndElement())
							reader.next();
						// Step out of this element
						reader.next();
						// Step to next element event.
						while (!reader.isStartElement()
								&& !reader.isEndElement())
							reader.next();
						if (reader.isEndElement()) {
							// two continuous end elements means we are exiting
							// the xml structure
							loopDone5 = true;
						} else {
							if (new javax.xml.namespace.QName(
									"http://createtrn.trackwise.biogen.com",
									"grids").equals(reader.getName())) {

								nillableValue = reader
										.getAttributeValue(
												"http://www.w3.org/2001/XMLSchema-instance",
												"nil");
								if ("true".equals(nillableValue)
										|| "1".equals(nillableValue)) {
									list5.add(null);
									reader.next();
								} else {
									list5.add(com.biogen.trackwise.bean.InputGrid.Factory
											.parse(reader));
								}
							} else {
								loopDone5 = true;
							}
						}
					}
					// call the converter utility to convert and set the array

					object.setGrids((com.biogen.trackwise.bean.InputGrid[]) org.apache.axis2.databinding.utils.ConverterUtil
							.convertToArray(
									com.biogen.trackwise.bean.InputGrid.class,
									list5));

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://createtrn.trackwise.biogen.com",
								"attachments").equals(reader.getName())) {

					// Process the array and step past its final element's end.

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue)
							|| "1".equals(nillableValue)) {
						list6.add(null);
						reader.next();
					} else {
						list6.add(com.biogen.trackwise.createtrn.AttachmentType.Factory
								.parse(reader));
					}
					// loop until we find a start element that is not part of
					// this array
					boolean loopDone6 = false;
					while (!loopDone6) {
						// We should be at the end element, but make sure
						while (!reader.isEndElement())
							reader.next();
						// Step out of this element
						reader.next();
						// Step to next element event.
						while (!reader.isStartElement()
								&& !reader.isEndElement())
							reader.next();
						if (reader.isEndElement()) {
							// two continuous end elements means we are exiting
							// the xml structure
							loopDone6 = true;
						} else {
							if (new javax.xml.namespace.QName(
									"http://createtrn.trackwise.biogen.com",
									"attachments").equals(reader.getName())) {

								nillableValue = reader
										.getAttributeValue(
												"http://www.w3.org/2001/XMLSchema-instance",
												"nil");
								if ("true".equals(nillableValue)
										|| "1".equals(nillableValue)) {
									list6.add(null);
									reader.next();
								} else {
									list6.add(com.biogen.trackwise.createtrn.AttachmentType.Factory
											.parse(reader));
								}
							} else {
								loopDone6 = true;
							}
						}
					}
					// call the converter utility to convert and set the array

					object.setAttachments((com.biogen.trackwise.createtrn.AttachmentType[]) org.apache.axis2.databinding.utils.ConverterUtil
							.convertToArray(
									com.biogen.trackwise.createtrn.AttachmentType.class,
									list6));

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement())
					// A start element we are not expecting indicates a trailing
					// invalid property
					throw new org.apache.axis2.databinding.ADBException(
							"Unexpected subelement " + reader.getName());

			} catch (javax.xml.stream.XMLStreamException e) {
				throw new java.lang.Exception(e);
			}

			return object;
		}

	}// end of factory class

}
