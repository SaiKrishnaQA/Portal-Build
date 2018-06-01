/*
 * @author Sai G
 * 
 */
package com.payswiff.util;

public class LocalTestDataManager {

	
	/** The ExtentReportPath. */
	private static ThreadLocal<String> extentReportPath = new ThreadLocal<String>();
	
	
	public static void setExtentReportPath(String ExtentReportPath) {
		extentReportPath.set(ExtentReportPath);
	}
	
}
