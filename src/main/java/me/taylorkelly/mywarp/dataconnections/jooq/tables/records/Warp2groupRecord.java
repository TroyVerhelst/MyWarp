/**
 * This class is generated by jOOQ
 */
package me.taylorkelly.mywarp.dataconnections.jooq.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Warp2groupRecord extends org.jooq.impl.UpdatableRecordImpl<me.taylorkelly.mywarp.dataconnections.jooq.tables.records.Warp2groupRecord> implements org.jooq.Record2<org.jooq.types.UInteger, org.jooq.types.UInteger> {

	private static final long serialVersionUID = 453339644;

	/**
	 * Setter for <code>mywarp.warp2group.group-id</code>.
	 */
	public void setGroup_id(org.jooq.types.UInteger value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>mywarp.warp2group.group-id</code>.
	 */
	public org.jooq.types.UInteger getGroup_id() {
		return (org.jooq.types.UInteger) getValue(0);
	}

	/**
	 * Setter for <code>mywarp.warp2group.warp-id</code>.
	 */
	public void setWarp_id(org.jooq.types.UInteger value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>mywarp.warp2group.warp-id</code>.
	 */
	public org.jooq.types.UInteger getWarp_id() {
		return (org.jooq.types.UInteger) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record2<org.jooq.types.UInteger, org.jooq.types.UInteger> key() {
		return (org.jooq.Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<org.jooq.types.UInteger, org.jooq.types.UInteger> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<org.jooq.types.UInteger, org.jooq.types.UInteger> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.UInteger> field1() {
		return me.taylorkelly.mywarp.dataconnections.jooq.tables.Warp2group.WARP2GROUP.GROUP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.UInteger> field2() {
		return me.taylorkelly.mywarp.dataconnections.jooq.tables.Warp2group.WARP2GROUP.WARP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.UInteger value1() {
		return getGroup_id();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.UInteger value2() {
		return getWarp_id();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Warp2groupRecord value1(org.jooq.types.UInteger value) {
		setGroup_id(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Warp2groupRecord value2(org.jooq.types.UInteger value) {
		setWarp_id(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Warp2groupRecord values(org.jooq.types.UInteger value1, org.jooq.types.UInteger value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached Warp2groupRecord
	 */
	public Warp2groupRecord() {
		super(me.taylorkelly.mywarp.dataconnections.jooq.tables.Warp2group.WARP2GROUP);
	}

	/**
	 * Create a detached, initialised Warp2groupRecord
	 */
	public Warp2groupRecord(org.jooq.types.UInteger group_id, org.jooq.types.UInteger warp_id) {
		super(me.taylorkelly.mywarp.dataconnections.jooq.tables.Warp2group.WARP2GROUP);

		setValue(0, group_id);
		setValue(1, warp_id);
	}
}
