/*
 * @author Sai G
 * 
 */
package com.Paynear.Portal;

import java.io.InputStream;
import java.util.Properties;

import org.apache.tools.ant.taskdefs.LoadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.FTCash.Panel.Fetch_MerchDetails;
import com.FTCash.Panel.Fetch_MerchID;
import com.Portal.Panel.Merchants_D_Panel;
import com.payswiff.config.SeleniumNGSuite;
import com.payswiff.constants.Constants;
import com.payswiff.util.DriverUtilsImpl;
import com.payswiff.util.PropertyUtils;
import com.payswiff.util.TestResultUtils;
import com.relevantcodes.extentreports.LogStatus;

import junit.framework.Assert;

public class Portal_Device_Assign_Test {
	
	SeleniumNGSuite testSuite = new SeleniumNGSuite();
	DriverUtilsImpl library = new DriverUtilsImpl();
	Merchants_D_Panel objects= new Merchants_D_Panel();
	
	//@Test(priority= 5)
	@Test
	public void Device_Assign() throws Exception {
		
		//Starts the logging of the report
		TestResultUtils.logger = TestResultUtils.extent.startTest("Second Device Assign Report ");
		
		try {
		/**
		 * I click Merchants tab 
		 */
		if(library.gClick(objects.FT_LMerchant) == true) {
			
			System.out.println("Successfully Clicked on Merchants tab and navigated to Merchants Screen: Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on Merchants tab and navigated to Merchants Screen : Passed");
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully Clicked on Merchants tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Merchants tab")));

		}
		
		/**
		 * I enter the merchant value in the search field 
		 */
		//if(library.sendText(objects.FT_MercahntID, testSuite.Merch_ID) == true) {
		System.out.println("Value of S is: "+Fetch_MerchDetails.S);
		if(library.sendText(objects.FT_MercahntID, Fetch_MerchDetails.S) == true) {
			System.out.println("Successfully entered Merchant ID in the search field: Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully entered Merchant ID in the search field : Passed");
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully entered Merchant ID in the search field : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully entered Merchant ID in the search field")));

		}
		
		/**
		 * I click Search Button
		 */
		if(library.gClick(objects.FT_SearchButton) == true) {
			
			System.out.println("Successfully Clicked on Search tab: Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on Search tab : Passed");
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully Clicked on Search tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Search tab")));

		}
		
		/**
		 * I click result merch ID
		 */
		if(library.gClick(objects.FT_firstMerchID) == true) {
			
			System.out.println("Successfully Clicked on Merchant tab: Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on Merchant tab : Passed");
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully Clicked on Merchant tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Merchant tab")));

		}

		/**
		 * I click Devices
		 */
		if(library.gClick(objects.FT_HeadDevices) == true) {
			
			System.out.println("Successfully Clicked on Devices tab: Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on Devices tab : Passed");
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully Clicked on Devices tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Devices tab")));

		}
		    
		/**
		 * I click Assign New Device
		 */
		if(library.gClick(objects.FT_AsssigneNewDevice) == true) {
			
			System.out.println("Successfully Clicked on Assign New Device tab: Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on Assign New Device tab : Passed");
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully Clicked on Assign New Device tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Assign New Device tab")));

		}
		
		/**
		 * I select Device Model from Drop Down
		 */
		if(library.gListSelectByisibleText(objects.FT_DeviceModel, SeleniumNGSuite.Dev_Sel) == true) {
			
			System.out.println("Successfully selected the device from drop down: Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully selected the device from drop down: Passed");
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully selected the device from drop down: Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully selected the device from drop down")));

		}
		
		    
		/**
		 * I assign the number of devices in the field
		 */
		if(library.sendText(objects.FT_Dev2BAssigned, String.valueOf(2)) == true) {
			
			System.out.println("Successfully entered the number : Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully entered the number : Passed");
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully entered the number : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully entered the number")));

		}
		  
		/**
		 * I click on Show Button
		 */
		if(library.gClick(objects.FT_Show) == true) {
			
			System.out.println("Successfully clicked on Show button : Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully clicked on Show button : Passed");
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully clicked on Show button : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully clicked on Show button")));

		}
		
		
		//To handle the no devices case- After enhancement in the application
		try {
				
			if(library.gClick(objects.FT_Show) == true) {
				
				// Getting text from confirmation window pop-up
					String ConfText = library.gWebElementGetText(By.xpath("html/body/div[6]/p"));
							
					System.out.println("Insufficient Devices" +ConfText);
					TestResultUtils.logger.log(LogStatus.FAIL, "Insufficient Devices For Device Model"+TestResultUtils.logger.addScreenCapture(library.takescreenshot("Insufficient Devices")));
							
					//Assert.assertEquals(objects.FT_MErchantSuccess, "Uploaded Successfully");
					// Clicking on OK button
					library.gClick(By.xpath("html/body/div[7]/div[7]/button[2]"));
					library.gClick(By.xpath(".//*[@id='assignTerminalsNew']/div/div/div[1]/button"));
					System.out.println("Closed the Device Assignement Panel");
				
				    System.out.println("Successfully clicked on Show button : Passed");
				    TestResultUtils.logger.log(LogStatus.PASS, "Successfully clicked on Show button : Passed");
			}
			else {
				System.out.println("Successfully Device has been Selected");
				TestResultUtils.logger.log(LogStatus.PASS, "Successfully Selected the Devices");

			}

				} catch (Exception e) {
					TestResultUtils.logger.log(LogStatus.PASS, "Successfully clicked on Show button : Failed");

				}
		
		
		/**
		 * I click on Assign Button
		 */
		if(library.gClick(objects.FT_Assign) == true) {
			
			System.out.println("Successfully clicked on Assign button : Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully clicked on Assign button : Passed");
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully clicked on Assign button : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully clicked on Assign button")));

		}
		
		/**
		 * I click on OK Button
		 */
		if(library.gClick(objects.FT_TerOK) == true) {
			
			System.out.println("Successfully clicked on OK button : Passed");
			
			testSuite.JavaScriptExec();
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully clicked on OK button : Passed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully assigned Devices to the Merchant")));
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully clicked on OK button : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully clicked on OK button")));

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
		/**
		 * I click on Terminals Button
		 */
		
		//testSuite.JavaScriptExec();
		//testSuite.jse.executeScript("window.scrollBy(0,1000)");
		if(library.gClick(objects.FT_Headterminal) == true) {
			
			//for Scroll By sai G
			testSuite.JavaScriptExec();
			
			System.out.println("Successfully clicked on Terminals Tab : Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully clicked on Terminals Tab : Passed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Terminal Ids")));
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully clicked on Terminals Tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully clicked on Terminals Tab")));

		}	
		
		String Text = library.gWebElementGetText(objects.Pro);
		System.out.println("Assigned TID is: " +Text);
		
		//String Device_Serial_Number = library.gWebElementGetText(objects.Device_SerNum);
		/*String Terminal_Serial_Number = library.gWebElementGetText(objects.terminal_SerNum);
		
		if(library.gVerifyContainsText(Device_Serial_Number, Terminal_Serial_Number) == true) {
			System.out.println("Successfully assigned the Terminal to the Merchant : Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully clicked on Terminals Tab : Passed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully clicked on Terminals Tab")));
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully clicked on Terminals Tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Failed to clicked on Terminals Tab")));

		}
		
		//WebHook Creation
		if(library.gClick(objects.WebHookTab) == true) {

			System.out.println("Successfully clicked on WebHook Tab : Passed");
			
			testSuite.JavaScriptExec();
			Thread.sleep(2000);
			
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully clicked on WebHook Tab : Passed");
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully clicked on WebHook Tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully clicked on WebHook Tab")));

		}	
		
		//WebHook Creation
		if(library.gClick(objects.CreWH) == true) {

			System.out.println("Successfully clicked on Create Webhook button : Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully clicked on Create Webhook button : Passed");
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Already webhhook was created : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Already webhhook was created")));

		}	
		
		//Enter the Url
		if(library.sendText(objects.WebHookURL, "https://www.test.com") == true){
			
			System.out.println("Successfully entered the Webhook Url : Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully entered the Webhook Url : Passed");
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Unable to enter the Webhook Url : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Unable to enter the Webhook Url")));

		}
		
		//Click on Create
		if(library.gClick(objects.CreWHBtn) == true) {

			System.out.println("Successfully Created the Webhook Url : Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully Created the Webhook Url : Passed");
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Unable to enter the Webhook Url : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Unable to enter the Webhook Url")));

		}
		
		String WHText = library.gWebElementGetText(objects.SuccessWH);
		if(library.gVerifyContainsText(WHText, "") == true) {
			System.out.println("");
			library.gClick(objects.SuccessOK);
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully Created the Webhook Url : Passed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully created the Webhook Url")));
		}
		else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Unable to create the Webhook Url : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Unable to create the Webhook Url")));

		}*/	
}
}

