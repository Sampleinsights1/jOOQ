/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.6"},
                            comments = "This class is generated by jOOQ")
public class TMappedTypesRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.TMappedTypesRecord> {

	private static final long serialVersionUID = 242486662;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TMappedTypes.T_MAPPED_TYPES.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TMappedTypes.T_MAPPED_TYPES.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setJavaUtilDate(java.sql.Timestamp value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TMappedTypes.T_MAPPED_TYPES.JAVA_UTIL_DATE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.sql.Timestamp getJavaUtilDate() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TMappedTypes.T_MAPPED_TYPES.JAVA_UTIL_DATE);
	}

	/**
	 * An uncommented item
	 */
	public void setJavaUtilCalendar(java.sql.Timestamp value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TMappedTypes.T_MAPPED_TYPES.JAVA_UTIL_CALENDAR, value);
	}

	/**
	 * An uncommented item
	 */
	public java.sql.Timestamp getJavaUtilCalendar() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TMappedTypes.T_MAPPED_TYPES.JAVA_UTIL_CALENDAR);
	}

	/**
	 * An uncommented item
	 */
	public void setDefaultEnumOrdinal(org.jooq.test._.OrdinalEnum value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TMappedTypes.T_MAPPED_TYPES.DEFAULT_ENUM_ORDINAL, value);
	}

	/**
	 * An uncommented item
	 */
	public org.jooq.test._.OrdinalEnum getDefaultEnumOrdinal() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TMappedTypes.T_MAPPED_TYPES.DEFAULT_ENUM_ORDINAL);
	}

	/**
	 * An uncommented item
	 */
	public void setDefaultEnumName(org.jooq.test._.StringEnum value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TMappedTypes.T_MAPPED_TYPES.DEFAULT_ENUM_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public org.jooq.test._.StringEnum getDefaultEnumName() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TMappedTypes.T_MAPPED_TYPES.DEFAULT_ENUM_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setCustomEnumNumeric(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TMappedTypes.T_MAPPED_TYPES.CUSTOM_ENUM_NUMERIC, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getCustomEnumNumeric() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TMappedTypes.T_MAPPED_TYPES.CUSTOM_ENUM_NUMERIC);
	}

	/**
	 * An uncommented item
	 */
	public void setCustomEnumText(java.lang.String value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TMappedTypes.T_MAPPED_TYPES.CUSTOM_ENUM_TEXT, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getCustomEnumText() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TMappedTypes.T_MAPPED_TYPES.CUSTOM_ENUM_TEXT);
	}

	/**
	 * Create a detached TMappedTypesRecord
	 */
	public TMappedTypesRecord() {
		super(org.jooq.test.hsqldb.generatedclasses.tables.TMappedTypes.T_MAPPED_TYPES);
	}
}
