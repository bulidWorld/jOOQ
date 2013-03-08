/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlite.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class T_785 extends org.jooq.impl.TableImpl<org.jooq.test.sqlite.generatedclasses.tables.records.T_785Record> {

	private static final long serialVersionUID = -811547205;

	/**
	 * The singleton instance of <code>t_785</code>
	 */
	public static final org.jooq.test.sqlite.generatedclasses.tables.T_785 T_785 = new org.jooq.test.sqlite.generatedclasses.tables.T_785();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sqlite.generatedclasses.tables.records.T_785Record> getRecordType() {
		return org.jooq.test.sqlite.generatedclasses.tables.records.T_785Record.class;
	}

	/**
	 * The column <code>t_785.ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.T_785Record, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, T_785);

	/**
	 * The column <code>t_785.NAME</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.T_785Record, java.lang.String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR.length(50), T_785);

	/**
	 * The column <code>t_785.VALUE</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.T_785Record, java.lang.String> VALUE = createField("VALUE", org.jooq.impl.SQLDataType.VARCHAR.length(50), T_785);

	/**
	 * No further instances allowed
	 */
	private T_785() {
		super("t_785", org.jooq.test.sqlite.generatedclasses.DefaultSchema.DEFAULT_SCHEMA);
	}
}
