/**
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.pg_catalog.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.3"},
                            comments = "This class is generated by jOOQ")
public class PgAttribute extends org.jooq.impl.TableImpl<org.jooq.util.postgres.pg_catalog.tables.records.PgAttributeRecord> {

	private static final long serialVersionUID = 753041846;

	/**
	 * The singleton instance of pg_attribute
	 */
	public static final org.jooq.util.postgres.pg_catalog.tables.PgAttribute PG_ATTRIBUTE = new org.jooq.util.postgres.pg_catalog.tables.PgAttribute();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.util.postgres.pg_catalog.tables.records.PgAttributeRecord> __RECORD_TYPE = org.jooq.util.postgres.pg_catalog.tables.records.PgAttributeRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.util.postgres.pg_catalog.tables.records.PgAttributeRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgAttributeRecord, java.lang.Long> ATTRELID = createField("attrelid", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgAttributeRecord, java.lang.String> ATTNAME = createField("attname", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgAttributeRecord, java.lang.Long> ATTTYPID = createField("atttypid", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgAttributeRecord, java.lang.Integer> ATTSTATTARGET = createField("attstattarget", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgAttributeRecord, java.lang.Short> ATTLEN = createField("attlen", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgAttributeRecord, java.lang.Short> ATTNUM = createField("attnum", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgAttributeRecord, java.lang.Integer> ATTNDIMS = createField("attndims", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgAttributeRecord, java.lang.Integer> ATTCACHEOFF = createField("attcacheoff", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgAttributeRecord, java.lang.Integer> ATTTYPMOD = createField("atttypmod", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgAttributeRecord, java.lang.Boolean> ATTBYVAL = createField("attbyval", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgAttributeRecord, java.lang.String> ATTSTORAGE = createField("attstorage", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgAttributeRecord, java.lang.String> ATTALIGN = createField("attalign", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgAttributeRecord, java.lang.Boolean> ATTNOTNULL = createField("attnotnull", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgAttributeRecord, java.lang.Boolean> ATTHASDEF = createField("atthasdef", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgAttributeRecord, java.lang.Boolean> ATTISDROPPED = createField("attisdropped", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgAttributeRecord, java.lang.Boolean> ATTISLOCAL = createField("attislocal", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgAttributeRecord, java.lang.Integer> ATTINHCOUNT = createField("attinhcount", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgAttributeRecord, java.lang.String[]> ATTACL = createField("attacl", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgAttributeRecord, java.lang.String[]> ATTOPTIONS = createField("attoptions", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this);

	/**
	 * No further instances allowed
	 */
	private PgAttribute() {
		super("pg_attribute", org.jooq.util.postgres.pg_catalog.PgCatalog.PG_CATALOG);
	}

	/**
	 * No further instances allowed
	 */
	private PgAttribute(java.lang.String alias) {
		super(alias, org.jooq.util.postgres.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.util.postgres.pg_catalog.tables.PgAttribute.PG_ATTRIBUTE);
	}

	@Override
	public org.jooq.util.postgres.pg_catalog.tables.PgAttribute as(java.lang.String alias) {
		return new org.jooq.util.postgres.pg_catalog.tables.PgAttribute(alias);
	}
}
