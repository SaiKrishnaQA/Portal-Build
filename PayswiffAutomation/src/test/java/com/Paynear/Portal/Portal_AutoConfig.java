/*
 * @author Sai G
 * 
 */
package com.Paynear.Portal;

import java.io.InputStream;
import java.util.Properties;

import org.apache.tools.ant.taskdefs.LoadProperties;
import org.testng.annotations.Test;

import com.Portal.Panel.Merchants_D_Panel;
import com.payswiff.config.SeleniumNGSuite;
import com.payswiff.util.DriverUtilsImpl;
import com.payswiff.util.TestResultUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Portal_AutoConfig {

	SeleniumNGSuite testSuite = new SeleniumNGSuite();
	DriverUtilsImpl library = new DriverUtilsImpl();
	Merchants_D_Panel objects= new Merchants_D_Panel();
	
	@Test(priority= 8)
	public void AutoConfig() throws Exception {
		
		/**
		 * To reload the property file
		 */
		
		Properties prop = new Properties();
		InputStream trackerFileStream = 
		LoadProperties.class.getClassLoader().getResourceAsStream("/home/itadmin/Desktop/sai/workspace/PayswiffAutomation/src/test/resources/properties/Merchant_ID.property");
		prop.load(trackerFileStream);
		
		try {
		//Starts the logging of the report
		TestResultUtils.logger = TestResultUtils.extent.startTest("Auto Config");

		try {
		/**
		 * I click on Merchant Button
		 */
		if(library.gClick(objects.FT_LMerchant) == true) 
			
			System.out.println("Successfully clicked on merchants button : Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully clicked on merchants button : Passed");
		}
		catch(Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully clicked on merchants button : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully clicked on merchants button")));

		}
		
		
		/**
		 * I enter merchant value in the search field
		 */
		//if(library.sendText(objects.FT_MercahntID, testSuite.Merch_ID) == true) {
		try {	
		if(library.sendText(objects.FT_MercahntID, prop.getProperty("Merchant_ID")) == true) 
			System.out.println("Successfully entered on merchants search field : Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully clicked on merchants search field : Passed");
		}
		catch(Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully clicked on merchants search field : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully clicked on merchants search field")));

		}
		
		/**
		 * I click on search Button
		 */
		try {
		if(library.gClick(objects.FT_SearchButton) == true) 
			
			System.out.println("Successfully clicked on search : Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "uccessfully clicked on search : Passed");
		}
		catch(Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL, "uccessfully clicked on search : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("uccessfully clicked on search")));

		}
		
		/**
		 * I click on result filed
		 */
		try {
		if(library.gClick(objects.FT_firstMerchID) == true) 
			
			System.out.println("Successfully clicked on reslut merchant : Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully clicked on reslut merchant : Passed");
		}
		catch(Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully clicked on reslut merchant : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully clicked on reslut merchant")));

		}
		
		/**
		 * I click on Devices Panel Header
		 */
		try {
		if(library.gClick(objects.FT_HeadDevices) == true) 
			
			System.out.println("Successfully clicked on Devices Panel : Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully clicked on Devices Panel : Passed");
		}
		catch(Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully clicked on Devices Panel : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully clicked on Devices Panel")));

		}
		    
		/**
		 * I click on Auto Config Button
		 */
		if(library.gClick(objects.FT_AutoConfig) == true) {
			
			System.out.println("Successfully clicked on Auto Config button : Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully clicked on Auto Config button : Passed");
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully clicked on Auto Config button : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully clicked on Auto Config button")));

		}
		
		/**
		 * I click on Success Button
		 */
		if(library.gClick(objects.FT_SuccessOK) == true) {
			
			System.out.println("Successfully clicked on SuccessOK button : Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully clicked on SuccessOK button : Passed");
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully clicked on SuccessOK button : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully clicked on SuccessOK button")));

		}		    
		   
		    TestResultUtils.logger.log(LogStatus.PASS, "Device Assign Functionality is working as expected: Passed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Auto Configured the devices and are in live Status")));
		    
		    }
			catch(Exception exception) {
				
			TestResultUtils.logger.log(LogStatus.FAIL, "Issue with Device Assigning: Insufficient or Already Assigned: Failed" + TestResultUtils.logger.addScreenCapture(library.takescreenshot("Issue with Device Assigning: Insufficient or Already Assigned")));
			library.gClick(objects.FT_DeviceAssigOK);
			}
		
		library.gClick(objects.FT_HeadDevices);
		library.gClick(objects.FT_HeadDevices);
		//Terminals 
		
		/**
		 * I click on Terminals Button
		 */
		if(library.gClick(objects.FT_SuccessOK) == true) {
			
			System.out.println("Successfully clicked on Terminals Tab : Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully clicked on Terminals Tab : Passed");
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully clicked on Terminals Tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully clicked on Terminals Tab")));

		}	
		
		String Device_Serial_Number = library.gWebElementGetText(objects.Device_SerNum);
		String Terminal_Serial_Number = library.gWebElementGetText(objects.terminal_SerNum);
		
		if(library.gVerifyContainsText(Device_Serial_Number, Terminal_Serial_Number) == true) {
			System.out.println("Successfully assigned the Terminal to the Merchant : Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully clicked on Terminals Tab : Passed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully clicked on Terminals Tab")));
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully clicked on Terminals Tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Failed to clicked on Terminals Tab")));

		}	
		
}
}

