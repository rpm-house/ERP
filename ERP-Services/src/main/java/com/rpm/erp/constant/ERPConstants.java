package com.rpm.erp.constant;

/**
 * @author Mohan
 * 
 *         Constant class. Constants are kept in final class to do not modify by
 *         any members and not kept in interface to accommodate the pattern
 *         Constant Interface Anti-Pattern and by having private constructor
 *         cannot be instantiated. Statically imported.
 *
 */
public final class ERPConstants {

	private ERPConstants() {
		// restrict instantiation
	}

	// CONFIG Constants
	public static final String PACKAGE = "com.rpm.erp";

	

}
