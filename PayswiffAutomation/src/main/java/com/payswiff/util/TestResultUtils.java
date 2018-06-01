/*
 * @author SaiKrishna G
 * 
 */
package com.payswiff.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.payswiff.constants.Constants;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class TestResultUtils {

	/** The base project path. */
	public static String baseProjectPath = System.getProperty(Constants.USER_DIR);
	
	/** The Constant SCREENSHOTS. */
	public static final String SCREENSHOTS = "screenshots";
	
	/** The Constant LOG_FILE_NAME. */
	// Test data Path
	public static final String LOG_FILE_NAME = "log.log";
	
	/** The Constant EXCEL. */
	public static final String EXCEL = "excel";
	
	/** The Constant LOGS. */
	public static final String LOGS = "logs";
	
	public static ExtentReports extent;
	public static ExtentTest logger;
	public static String exeutionstartdate;
	public static String executionStartDate;
	public static String executionStartTime;
	public static final String SPACE = " ";
	public static final String HYPHEN = "-";
	public static String userHomeFolder;
	public static String resultsDirectory;
	public static String DOUBLE_FORWARD_SLASH = "//";
	public static final String TEST_RESULTS = "testResults";
	
	/** The Constant EXTENT_REPORT. */
	public static final String EXTENT_REPORT = "extentreport";
	
	
	/** The Constant USER_DIR. */
	public static final String USER_DIR = "user.dir";

	
	/** The extent report directory. */
	public static String extentReportDirectory;
	
	/** The browser directory. */
	public static String browserDirectory;
	
	/** The date directory. */
	public static String dateDirectory;
	
	/** The timestamp directory. */
	public static String timestampDirectory;
	
	/** The screenshot directory. */
	public static String screenshotDirectory;
	
	/** The extent report directory. *//*
	public static String extentReportDirectory;*/
	
	/** The log directory. */
	public static String logDirectory;
	
	/** The log file path. */
	public static String logFilePath;
	
	/** The excel directory. */
	public static String excelDirectory;
	
	/** The excel file path. */
	public static String excelFilePath;
	
	/** The Constant EXCEL_FILE_NAME. */
	public static final String EXCEL_FILE_NAME = "excel.xlsx";
	
	
	public static void extentReportInitialize() {
		
		
		try {
			//Creating the extent report in test results folder(extentReportDirectory)
			//extent.loadConfig(new File("/home/itadmin/Desktop/sai/mystuff/PayswiffAutomation/src/test/resources/testsuites/extent-config.xml"));
			
			String extentReport = extentReportDirectory + "/" + "ExtentReport.html";
			LocalTestDataManager.setExtentReportPath(extentReport);
			System.out.println("extentReport" + extentReport);
			extent = new ExtentReports(extentReport, true);
			
			//to load the customized extent report that was changed in extent-config.xml file
			extent.loadConfig(new File(baseProjectPath.concat(Constants.extentReport)));
			//extent.loadConfig(new File("/home/itadmin/Desktop/sai/mystuff/PayswiffAutomation/src/test/resources/testsuites/extent-config.xml"));
		} catch (Exception exception) {

		}
}
	
	public static String getScreenShots(WebDriver driver, String ScreenShotName) {
		String destination= null;
		try {
		//To get Screen Shots for failure test cases
		TakesScreenshot ts= (TakesScreenshot)driver;
		String dateName= new SimpleDateFormat("yyyymmdd").format(new Date());
		
		File src= ts.getScreenshotAs(OutputType.FILE);
		destination= System.getProperty("user.dir") +"/FailedTestsScreenshots/"+ ScreenShotName + dateName + ".png";
		File destinationFolder = new File(destination);
		FileUtils.copyDirectory(src, destinationFolder);
	
		return destination;
	}
	catch(Exception e) {
		System.out.println("Failed to get the failed screen shot" +e.getMessage());
	}
		return destination;
	}
	public static void extentReportFlush() {
		try {
			extent.endTest(logger);
			extent.flush();
			//extent.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void outputFolder() {
		try {	
		if(executionStartDate == null) {

		Date curDate= new Date();
		SimpleDateFormat format= new SimpleDateFormat("yyyy/MM/dd");
		String DateToString= format.format(curDate);	
		
		format= new SimpleDateFormat("dd-MM-yyyy HH mm ss");
		DateToString = format.format(curDate);
		System.out.println("Complete Date is ::" + DateToString);
		
		executionStartDate = DateToString.substring(0, 10);
		System.out.println("Date is ::" + executionStartDate);
		
		executionStartTime = DateToString.substring(11, 19);
		System.out.println(executionStartTime);
		
		executionStartTime = executionStartTime.replace(SPACE.charAt(0), HYPHEN.charAt(0));
		System.out.println("Execution Start Time:"+executionStartTime);
		
		System.out.println(executionStartTime);
		
		userHomeFolder = System.getProperty("user.dir");
		
		resultsDirectory = userHomeFolder.concat(DOUBLE_FORWARD_SLASH).concat(TEST_RESULTS);
		
		if (null != resultsDirectory) {
			browserDirectory = resultsDirectory.concat(DOUBLE_FORWARD_SLASH).concat("Chrome");
			System.out.println("browser directory is directoryName" + browserDirectory);
			DCTUtils.createDirTree(browserDirectory);
			
		 if (null != browserDirectory) {
				// creating date folder
			dateDirectory = browserDirectory.concat(DOUBLE_FORWARD_SLASH).concat(executionStartDate);
			System.out.println("dateDirectory directory is directoryName" + dateDirectory);
			DCTUtils.createDirTree(dateDirectory);
			
		  if (null != dateDirectory) {
				// creating time stamp folder
			timestampDirectory = dateDirectory.concat(DOUBLE_FORWARD_SLASH).concat(executionStartTime);
			System.out.println("timestamp directory is directoryName" + timestampDirectory);
			DCTUtils.createDirTree(timestampDirectory);
			
		   if (null != timestampDirectory) {
				// creating screenshot folder
			screenshotDirectory = timestampDirectory.concat(DOUBLE_FORWARD_SLASH).concat(SCREENSHOTS);
			System.out.println("screenshot directory is directoryName" + screenshotDirectory);
			DCTUtils.createDirTree(screenshotDirectory);

			// creating extentReportDirectory folder
			extentReportDirectory = timestampDirectory.concat(DOUBLE_FORWARD_SLASH).concat(EXTENT_REPORT);
			System.out.println(
					"extent report dir directory is directoryName" + extentReportDirectory);
			DCTUtils.createDirTree(extentReportDirectory);
			
			// creating extentReportDirectory folder
			logDirectory = timestampDirectory.concat(DOUBLE_FORWARD_SLASH).concat(LOGS);
			System.out.println("log directory is directoryName" + logDirectory);
			DCTUtils.createDirTree(logDirectory);
			
			// creating ExcelDirectory folder
			excelDirectory = timestampDirectory.concat(DOUBLE_FORWARD_SLASH).concat(EXCEL);
			System.out.println("Excel directory is directoryName" + excelDirectory);
			DCTUtils.createDirTree(excelDirectory);
			
			     if (null != excelDirectory) {
				// Creating Excel file
				excelFilePath = excelDirectory.concat(DOUBLE_FORWARD_SLASH).concat(EXCEL_FILE_NAME);
				System.out.println("Excel file name is ::" + excelFilePath);
			}
				
		}
	}
}
}
}
		}catch(Exception e) {
			System.out.println("Error occured while creating files and directories" + e.getMessage());
		}
	
		}
	}