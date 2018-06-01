package com.PaySwiff.portalCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.FTCash.Panel.Fetch_MerchID;
import com.Portal.Panel.Merchants_D_Panel;
import com.payswiff.config.SeleniumNGSuite;
import com.payswiff.util.DriverUtilsImpl;
import com.payswiff.util.TestResultUtils;
import com.relevantcodes.extentreports.LogStatus;

public class PortalMidTid_Sce {

	SeleniumNGSuite testSuite = new SeleniumNGSuite();
	DriverUtilsImpl library = new DriverUtilsImpl();
	Merchants_D_Panel objects= new Merchants_D_Panel();

	@Test(priority= 5)
	public void FT_MIDUpload() throws Exception {

		TestResultUtils.logger= TestResultUtils.extent.startTest("MID TID Scenario ");

		/**
		 * I click Merchants tab 
		 */
		try {
			if(library.gClick(objects.FT_LMerchant) == true) 

				System.out.println("Successfully Clicked on Merchants tab : Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on Merchants tab : Passed");
		}catch(Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully Clicked on Merchants tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Merchants tab")));

		}
	
		/**
		 * I enter the merchant value in the search field 
		 */
		//if(library.sendText(objects.FT_MercahntID, testSuite.Merch_ID) == true) {
		System.out.println("Value of S is: "+Fetch_MerchID.S);
		if(library.sendText(objects.FT_MercahntID, Fetch_MerchID.S) == true) {
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
		 * I click Devices Actions
		 */
		if(library.gClick(objects.Dev_Act) == true) {
			
			System.out.println("Successfully Actions Button on Devices tab: Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully Actions Button on Devices tab : Passed");
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully Actions Button on Devices tab: Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Actions Button on Devices tab")));

		}
		
		/**
		 * I click Update Status 
		 */
		/*if(library.gClick(objects.Updte_Status) == true) {
			
			System.out.println("Update Status on Devices tab: Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Update Status on Devices tab: Passed");
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Update Status on Devices tab: Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Update Status on Devices tab")));

		}
		
		*//**
		 * I change the Device Change Update
		 *//*
		if(library.gListSelectByisibleText(objects.DvceStatus_Updte, "De-Installed") == true) {
			
			System.out.println("Selected De Installed from the Drop Down");
			TestResultUtils.logger.log(LogStatus.PASS, "Selected De Installed from the Drop Down: Passed");
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Selected De Installed from the Drop Down: Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Selected De Installed from the Drop Down")));

		}
		

		*//**
		 * I click on Update
		 *//*
		library.gClick(objects.Update_Btn);
		
		String SuccesText = library.gWebElementGetText(objects.Suc_text);
		
		
		if(library.gVerifyContainsText(SuccesText, "Terminal updated successfully.")) {
			
			library.gClick(objects.Succ_OK);
			System.out.println("Terminal updated successfully.");
			TestResultUtils.logger.log(LogStatus.PASS, "Terminal updated successfully :Passed");
			
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Terminal not updated successfully: Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Terminal updated successfully")));

		}
		*/
		
		
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
		try {
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
			
			System.out.println("Successfully clicked on Terminals Tab : Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully clicked on Terminals Tab : Passed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Terminal Ids")));
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully clicked on Terminals Tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully clicked on Terminals Tab")));

		}	
	}
}
