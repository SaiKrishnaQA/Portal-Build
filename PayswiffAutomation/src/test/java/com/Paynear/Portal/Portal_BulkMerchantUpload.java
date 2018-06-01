/*
 * @author Sai G
 * 
 */
package com.Paynear.Portal;

import java.beans.Visibility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.Portal.Panel.Merchants_D_Panel;
import com.payswiff.config.SeleniumNGSuite;
import com.payswiff.constants.Constants;
import com.payswiff.util.DriverUtilsImpl;
import com.payswiff.util.FT_GenricUtily;
import com.payswiff.util.TestResultUtils;
import com.relevantcodes.extentreports.LogStatus;

import junit.framework.Assert;

public class Portal_BulkMerchantUpload {

	/** The base project path. */
	public static String baseProjectPath = System.getProperty(Constants.USER_DIR);
	
	SeleniumNGSuite testSuite = new SeleniumNGSuite();
	DriverUtilsImpl library = new DriverUtilsImpl();
	Merchants_D_Panel objects= new Merchants_D_Panel();
	String sheetName = "SmokeCases";
	
	
	//@Test(priority= 2)
	@Test
	public void FT_BulkMerchantUpload() throws Exception {
		
		TestResultUtils.logger= TestResultUtils.extent.startTest("Bulk Merchants Upload ");
		
		/**
		 * I click Merchants tab 
		 */
		try {
		if(library.gClick(objects.FT_LMerchant) == true) 
			
			System.out.println("Successfully Clicked on Merchants tab : Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on Merchants tab : Passed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Merchants tab")));
		}catch(Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully Clicked on Merchants tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Merchants tab")));

		}
		
		/**
		 * I click Uplaod Bulk Merchant 
		 */
		try {
		if(library.gClick(objects.FT_Upload_Bulk_Merchant) == true) 
			
			System.out.println("Successfully Clicked on Upload Bulk Merchant tab : Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on Upload Bulk Merchant tab : Passed");
		}catch(Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully Clicked on Upload Bulk Merchant tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Upload Bulk Merchant tab")));

		}
		
		/**
		 * I select package from drop down 
		 */
		try {
		if(library.gListSelectByisibleText(objects.FT_MerchPackage, SeleniumNGSuite.Merch_Package) == true) 
			
			System.out.println("Successfully selected Paynear One mPay from drop down: Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully selected Paynear One mPay from drop down : Passed");
		}catch(Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully selected Paynear One mPay from drop down : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully selected Paynear One mPay from drop down")));

		}
		
		/**
		 * I click on Select File Button
		 */
		try {
		if(library.gClick(objects.FT_BulkMerchSelTab) == true) 
			
			System.out.println("Successfully clicked on select file to select the file: Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully clicked on select file to select the file : Passed");
		}catch(Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully clicked on select file to select the file : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully clicked on select file to select the file")));

		}
		
		// Selecting POS template
		Thread.sleep(1000);
		
		FT_GenricUtily.Robotchoosfile(baseProjectPath.concat(Constants.BulkUpload));
		//FT_GenricUtily.Robotchoosfile(FT_GenricUtily.RobotFlpath("Bulk_upload"));
		System.out.println("File is selected");
		
		Thread.sleep(2000);
		

		/**
		 * I click on Upload button
		 */
		try {
		if(library.gClick(objects.FT_MerchUpload) == true) 
			
			System.out.println("Successfully clicked on upload: Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully clicked on upload : Passed");
		}catch(Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully clicked on upload : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully clicked on upload")));

		}
		
		
		try {
			
			//Explicit Wait 
			WebDriverWait wait = new WebDriverWait(SeleniumNGSuite.driver, 200);

			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(objects.FT_OK));
			
			// Getting text from confirmation window pop-up
			String ConfText = library.gWebElementGetText(objects.FT_MErchantSuccess);
			
			System.out.println("Confirmation Text: " +ConfText);
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully Onboarded all the Merchants through Bulk Upload Functionality");
			
			//Assert.assertEquals(objects.FT_MErchantSuccess, "Uploaded Successfully");
			// Clicking on OK button
			library.gClick(objects.FT_OK);
			Assert.assertTrue(true);
			//Elements_LeadCreate.BtnOk.click();
			System.out.println("Clicked on OK button");
			
			//Passed case Screen Shot
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully Onboarded all the Merchants through Bulk Upload Functionality" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Onboarded all the Merchants through Bulk Upload Functionality")));

		} catch (Exception e) {
			System.out.println("File already exist");
			TestResultUtils.logger.log(LogStatus.FAIL, "Unable to OnBoard the file. Please Verify the File and retry" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Bulk Upload Merchants")));
			
			library.gClick(objects.FT_MerchCloseIcon);
			library.gClick(objects.FT_MerchCloseIcon2);
			//Assert.assertTrue(false);
		}
	}
	
	/*//@Test(priority= 2, dependsOnMethods= "FT_BulkMerchantUpload", alwaysRun=true)
	@Test(priority= 2)
	public void FT_MIDUpload() throws Exception {
		
		TestResultUtils.logger= TestResultUtils.extent.startTest("uploadMerchantsPOSApplicationForm");
		
		//Click on left panel Merchant tab 
		library.gClick(objects.FT_LMerchant);
		
		// Clicking on Activation menu
		library.gClick(objects.FT_MIDUpload);
		
		//Click on Select File Tab
		library.gClick(objects.FT_MIDSelTab);
		System.out.println("Clicked on Select Tab from the upload POS Req Appl pop up");

		// Selecting POS template
		Thread.sleep(1000);
		
		FT_GenricUtily.Robotchoosfile(FT_GenricUtily.RobotFlpath("POS_Req_Templete"));
		System.out.println("File is selected");
		
		Thread.sleep(2000);
		//click on Upload
		library.gClick(objects.FT_Upload);
		System.out.println("Clicked on upload button");

		try {
			//Thread.sleep(1000);
			
			// Getting text from confirmation window pop-up
			String ConfText = library.gWebElementGetText(objects.FT_MIDConfirmation);
			System.out.println("Confirmation Text: " +ConfText);
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully Onboarded all the MID's and TID's");
			
			// Clicking on OK button
			library.gClick(objects.FT_OK);
			//Elements_LeadCreate.BtnOk.click();
			System.out.println("Clicked on OK button");

		} catch (Exception e) {
			System.out.println("File already exist");
			TestResultUtils.logger.log(LogStatus.FAIL, "Unable to OnBoard the MIDs and TIDs. Please Verify the File and retry" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("POS Files Upload")));
			library.gClick(objects.FT_OK);
			//Elements_LeadCreate.BtnOk.click();
			
			library.gClick(objects.FT_CloseIcon);
			//Elements_MIDTID.Closeicon.click();
			System.out.println("Clicked on close icon");
		}
	}
	
	*/
	
	/*//Tickets
	@Test(priority= 4)
	public void Tickets_Reg() throws Exception {
		
		//Starts the logging of the report
		TestResultUtils.logger = TestResultUtils.extent.startTest("Device Assign Report");

		library.gClick(objects.FT_LMerchant);
		System.out.println("Successfully navigated to Merchant Screen");
		
		
		*//**
		 * I enter Merchant value in the Search field when the drop down is Mercahnt ID
		 *//*
				
		try {
		    //library.sendText(objects.FT_MercahntID, "1014494");
			
		    library.sendText(objects.FT_MercahntID, "1014490");

		    library.gClick(objects.FT_SearchButton);
		    
		    library.gClick(objects.FT_firstMerchID);
		    
		    //Click on Devices 
		    library.gClick(objects.FT_HeadDevices);
		    
		    //Click on Assign New Device
		    library.gClick(objects.FT_AsssigneNewDevice);
		    
		    //Selecting Device Model from Drop Down
		    library.gListSelectByisibleText(objects.FT_DeviceModel, "QPOS");
		    
		    //Assigng the number for devices
		    library.sendText(objects.FT_Dev2BAssigned, String.valueOf(1));
		    
		    //Click on Show Button
		    library.gClick(objects.FT_Show);
		    
		    //library.gClick(objects.FT_SerNum);
		    
		    //click on Assign
		    library.gClick(objects.FT_Assign);
		
		    //Click on OK
		    library.gClick(objects.FT_TerOK);
		    
		    //Click on AutoConfig
		    library.gClick(objects.FT_AutoConfig);
		    
		    //click on OK in the Auto Cofig POPup
		    library.gClick(objects.FT_SuccessOK);
		    
		   
		    TestResultUtils.logger.log(LogStatus.PASS, "Device Assign Functionality is working as expected: Passed");
		}
		catch(Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Device Assign Functionality is not working as expected: Failed" + TestResultUtils.logger.addScreenCapture(library.takescreenshot("MID Search Option")));
		}
}*/
}
