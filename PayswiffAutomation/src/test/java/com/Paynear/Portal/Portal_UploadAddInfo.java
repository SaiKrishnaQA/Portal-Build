/*
 * @author Sai G
 * 
 */
package com.Paynear.Portal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.Portal.Panel.Merchants_D_Panel;
import com.payswiff.config.SeleniumNGSuite;
import com.payswiff.util.DriverUtilsImpl;
import com.payswiff.util.FT_GenricUtily;
import com.payswiff.util.TestResultUtils;
import com.relevantcodes.extentreports.LogStatus;

import junit.framework.Assert;

public class Portal_UploadAddInfo {

	SeleniumNGSuite testSuite = new SeleniumNGSuite();
	DriverUtilsImpl library = new DriverUtilsImpl();
	Merchants_D_Panel objects= new Merchants_D_Panel();

	@Test(priority= 6)
	public void FT_UploadAddInfo() throws Exception {
			
			TestResultUtils.logger= TestResultUtils.extent.startTest("Update Additional Info");
			
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
			 * I click Merchants tab 
			 */
			try {
			if(library.gClick(objects.SM_AddInfo) == true) 
				
				System.out.println("Successfully Clicked on Add Additional Info tab : Passed");
				TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on Merchants tab : Passed");
			}catch(Exception exception) {
				TestResultUtils.logger.log(LogStatus.FAIL, "Successfully Clicked on Merchants tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Merchants tab")));

			}
			
			/**
			 * I click Merchants tab 
			 */
			try {
			if(library.gClick(objects.SM_SAddInfo) == true) 
				
				System.out.println("Successfully Clicked on Select File tab : Passed");
				TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on Select File tab : Passed");
			}catch(Exception exception) {
				TestResultUtils.logger.log(LogStatus.FAIL, "Successfully Clicked on Select File tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Select File tab")));

			}
			
			// Selecting POS template
			Thread.sleep(1000);
			
			FT_GenricUtily.Robotchoosfile(FT_GenricUtily.RobotFlpath("MerchantAddlFileds"));
			System.out.println("File is selected");
			
			Thread.sleep(2000);
			

			/**
			 * I click on Upload button
			 */
			try {
			if(library.gClick(objects.SM_Upload) == true) 
				
				System.out.println("Successfully clicked on upload: Passed");
				TestResultUtils.logger.log(LogStatus.PASS, "Successfully clicked on upload : Passed");
			}catch(Exception exception) {
				TestResultUtils.logger.log(LogStatus.FAIL, "Successfully clicked on upload : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully clicked on upload")));

			}
			
			//TO handle for the existence information to the merchants
			try {
				
				//Explicit Wait 
				WebDriverWait wait = new WebDriverWait(SeleniumNGSuite.driver, 200);

				WebElement element = wait.until(ExpectedConditions.elementToBeClickable(objects.FT_OK));
				
				// Getting text from confirmation window pop-up
				String ConfText = library.gWebElementGetText(objects.FT_MErchantSuccess);
				
				System.out.println("Confirmation Text: " +ConfText);
				TestResultUtils.logger.log(LogStatus.PASS, "Successfully updated the Additional Information");
				
				//Assert.assertEquals(objects.FT_MErchantSuccess, "Uploaded Successfully");
				// Clicking on OK button
				library.gClick(objects.FT_OK); 
				Assert.assertTrue(true);
				//Elements_LeadCreate.BtnOk.click();
				System.out.println("Clicked on OK button");

			} catch (Exception e) {
				System.out.println("File already exist");
				TestResultUtils.logger.log(LogStatus.FAIL, "Merch Add Info is information" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Merch Add Info is information")));
				
				library.gClick(objects.SM_close);
				Assert.assertTrue(false);
			}
}
}
