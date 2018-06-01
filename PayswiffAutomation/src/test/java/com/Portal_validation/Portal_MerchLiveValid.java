package com.Portal_validation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.FTCash.Panel.Fetch_MerchDetails;
import com.Portal.Panel.Merchants_D_Panel;
import com.payswiff.config.SeleniumNGSuite;
import com.payswiff.constants.Constants;
import com.payswiff.util.DriverUtilsImpl;
import com.payswiff.util.TestResultUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Portal_MerchLiveValid {

	/** The base project path. */
	public static String baseProjectPath = System.getProperty(Constants.USER_DIR);

	SeleniumNGSuite testSuite = new SeleniumNGSuite();
	DriverUtilsImpl library = new DriverUtilsImpl();
	Merchants_D_Panel objects = new Merchants_D_Panel();
	com.FTCash.Panel.loginpage objects1 = new com.FTCash.Panel.loginpage();

	// @Test(priority= 4)
	@Test
	public void FT_MIDUpload() throws Exception {

		TestResultUtils.logger = TestResultUtils.extent.startTest("Merchant OnBoarding");

		try {
			library.gClick(objects.AppLogout);
			Thread.sleep(2000);
			
			library.sendText(objects1.Login_UserName, testSuite.A_UName);
			library.sendText(objects1.Login_Password, testSuite.A_Pwd);

			Thread.sleep(1000);

			library.gClick(objects1.Submit);
			TestResultUtils.logger.log(LogStatus.PASS, "Application logged with Activation User");
			
			
			/**
			 * I click Merchants tab for Device Assign
			 */
			if (library.gClick(objects.FT_LMerchant) == true) {

				System.out.println("Successfully Clicked on Merchants tab : Passed");
			} else {
				System.out.println("Unable to click the Merchant tab");
				TestResultUtils.logger.log(LogStatus.FAIL, "Unable to click the Merchant tab" + TestResultUtils.logger
						.addScreenCapture(library.takescreenshot("Unable to click the Merchant tab")));

			}

			/**
			 * I enter the merchant value in the search field
			 */
			// if(library.sendText(objects.FT_MercahntID, testSuite.Merch_ID) == true) {
			System.out.println("Value of S is: " + Fetch_MerchDetails.S);
			if (library.sendText(objects.FT_MercahntID, Fetch_MerchDetails.S) == true) {
				System.out.println("Successfully entered Merchant ID in the search field: Passed");
				// TestResultUtils.logger.log(LogStatus.PASS, "Successfully entered Merchant ID
				// in the search field : Passed");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL,
						"Successfully entered Merchant ID in the search field : Failed"
								+ TestResultUtils.logger.addScreenCapture(library
										.takescreenshot("Successfully entered Merchant ID in the search field")));
			}

			/**
			 * I click Search Button
			 */
			if (library.gClick(objects.FT_SearchButton) == true) {

				System.out.println("Successfully Clicked on Search tab: Passed");
				// TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on Search
				// tab : Passed");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL, "Unable to click on Search tab" + TestResultUtils.logger
						.addScreenCapture(library.takescreenshot("Unable to click on Search tab")));

			}

			/**
			 * I click result merch ID
			 */
			if (library.gClick(objects.FT_firstMerchID) == true) {

				System.out.println("Successfully Clicked on Merchant tab: Passed");
				// TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on Merchant
				// tab : Passed");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL, "Unable to click on Merchant tab" + TestResultUtils.logger
						.addScreenCapture(library.takescreenshot("Unable to click on Merchant tab")));

			}

			/**
			 * I click MIDs Tab to take the screen shot
			 */
			if (library.gClick(objects.Portal_POSMID) == true) {

				System.out.println("Successfully Clicked on POS MID tab: Passed");
				library.JavaScriptExec();
				/*
				 * TestResultUtils.logger.log(LogStatus.PASS, "POS-MID /TID tab" +
				 * TestResultUtils.logger.addScreenCapture(library.takescreenshot("POS- MID/TID"
				 * )));
				 */
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL,
						"Unable to click POS-MID /TID tab: Failed" + TestResultUtils.logger
								.addScreenCapture(library.takescreenshot("Unable to click POS-MID /TID tab: Failed")));

			}

			// To close the POS MID TID tab
			library.gClick(objects.Portal_POSMID);

			/**
			 * I click Devices
			 */
			if (library.gClick(objects.FT_HeadDevices) == true) {

				System.out.println("Successfully Clicked on Devices tab: Passed");
				// TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on Devices
				// tab : Passed");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL, "Unable to click on Devices tab" + TestResultUtils.logger
						.addScreenCapture(library.takescreenshot("Unable to click on Devices tab")));

			}

			/**
			 * I click Assign New Device
			 */
			if (library.gClick(objects.FT_AsssigneNewDevice) == true) {

				System.out.println("Successfully Clicked on Assign New Device tab: Passed");
				// TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on Assign
				// New Device tab : Passed");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL,
						"Successfully Clicked on Assign New Device tab : Failed"
								+ TestResultUtils.logger.addScreenCapture(
										library.takescreenshot("Successfully Clicked on Assign New Device tab")));

			}

			/**
			 * I select Device Model from Drop Down
			 */
			if (library.gListSelectByisibleText(objects.FT_DeviceModel, SeleniumNGSuite.Dev_Sel) == true) {

				System.out.println("Successfully selected the device from drop down: Passed");
				// TestResultUtils.logger.log(LogStatus.PASS, "Successfully selected the device
				// from drop down: Passed");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL,
						"Successfully selected the device from drop down: Failed"
								+ TestResultUtils.logger.addScreenCapture(
										library.takescreenshot("Successfully selected the device from drop down")));

			}

			/**
			 * I assign the number of devices in the field
			 */
			if (library.sendText(objects.FT_Dev2BAssigned, String.valueOf(2)) == true) {

				System.out.println("Successfully entered the number : Passed");
				// TestResultUtils.logger.log(LogStatus.PASS, "Successfully entered the number :
				// Passed");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL,
						"Successfully entered the number : Failed" + TestResultUtils.logger
								.addScreenCapture(library.takescreenshot("Successfully entered the number")));

			}

			/**
			 * I click on Show Button
			 */
			if (library.gClick(objects.FT_Show) == true) {

				System.out.println("Successfully clicked on Show button : Passed");
				// TestResultUtils.logger.log(LogStatus.PASS, "Successfully clicked on Show
				// button : Passed");
			} else {
				System.out.println("Successfully clicked on Show button : Failed");
				// TestResultUtils.logger.log(LogStatus.FAIL, "Successfully clicked on Show
			}

			// To handle the no devices case- After enhancement in the application
			try {

				if (library.gClick(objects.FT_Show) == true) {

					// Getting text from confirmation window pop-up
					String ConfText = library.gWebElementGetText(By.xpath("html/body/div[6]/p"));

					System.out.println("Insufficient Devices" + ConfText);
					TestResultUtils.logger.log(LogStatus.FAIL, "Insufficient Devices For Device Model"
							+ TestResultUtils.logger.addScreenCapture(library.takescreenshot("Insufficient Devices")));

					// Assert.assertEquals(objects.FT_MErchantSuccess, "Uploaded Successfully");
					// Clicking on OK button
					library.gClick(By.xpath("html/body/div[7]/div[7]/button[2]"));
					library.gClick(By.xpath(".//*[@id='assignTerminalsNew']/div/div/div[1]/button"));
					System.out.println("Closed the Device Assignement Panel");

					System.out.println("Successfully clicked on Show button : Passed");
					TestResultUtils.logger.log(LogStatus.PASS, "Successfully clicked on Show button : Passed");
				} else {
					System.out.println("Successfully Device has been Selected");
					TestResultUtils.logger.log(LogStatus.PASS, "Successfully Selected the Devices");

				}

			} catch (Exception e) {
				TestResultUtils.logger.log(LogStatus.PASS, "Successfully clicked on Show button : Failed");

			}

			/**
			 * I click on Assign Button
			 */
			if (library.gClick(objects.FT_Assign) == true) {

				System.out.println("Successfully clicked on Assign button : Passed");
				// TestResultUtils.logger.log(LogStatus.PASS, "Successfully clicked on Assign
				// button : Passed");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL,
						"Successfully clicked on Assign button : Failed" + TestResultUtils.logger
								.addScreenCapture(library.takescreenshot("Successfully clicked on Assign button")));

			}

			/**
			 * I click on OK Button
			 */
			try {

				WebDriverWait wait = new WebDriverWait(testSuite.driver, 10);
				wait.until(ExpectedConditions.visibilityOfElementLocated(objects.OK_Text));
				library.gClick(objects.FT_TerOK);

				// wait.until(ExpectedConditions.elementToBeClickable(objects.FT_TerOK));
				/*
				 * if(library.gClick(objects.FT_TerOK) == true) {
				 * 
				 * System.out.println("Successfully clicked on OK button : Passed");
				 */
			} catch (Exception exception) {
				System.out.println("Popup is not displayed: ReCheck");
			}

			/**
			 * I click on Auto Config Button
			 */
			if (library.gClick(objects.FT_AutoConfig) == true) {

				System.out.println("Successfully clicked on Auto Config button : Passed");
				TestResultUtils.logger.log(LogStatus.PASS, "Successfully clicked on Auto Config button : Passed");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL,
						"Successfully clicked on Auto Config button : Failed" + TestResultUtils.logger.addScreenCapture(
								library.takescreenshot("Successfully clicked on Auto Config button")));

			}

			/**
			 * I select the value from Drop Down
			 */
			try {
				library.gClick(objects.Auto_Proc);

				library.sendText(objects.Auto_VProc, SeleniumNGSuite.Bank_DP);

				library.gClick(objects.Auto_SelRes);

				library.gClick(objects.Auto_Submit);

				// TestResultUtils.logger.log(LogStatus.PASS, "Successfully Selected from the
				// Drop Down: Passed");
			} catch (Exception exception) {
				TestResultUtils.logger.log(LogStatus.FAIL,
						"Failed to select the value from drop down" + TestResultUtils.logger
								.addScreenCapture(library.takescreenshot("Failed to select the value from drop down")));

			}

			/**
			 * I click on Success Button
			 */
			if (library.gClick(objects.Auto_SuccessOK) == true) {

				System.out.println("Successfully clicked on SuccessOK button : Passed");
				TestResultUtils.logger.log(LogStatus.PASS, "AutoConfig and Merchant is Live: Passed");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL,
						"Successfully clicked on SuccessOK button : Failed" + TestResultUtils.logger
								.addScreenCapture(library.takescreenshot("Successfully clicked on SuccessOK button")));

			}

			TestResultUtils.logger.log(LogStatus.PASS, "Devices are assigned to Merchant");

			/**
			 * I click on Terminals Button
			 */

			if (library.gClick(objects.FT_Headterminal) == true) {

				testSuite.JavaScriptExec();
				System.out.println("Successfully clicked on Terminals Tab : Passed");
				// TestResultUtils.logger.log(LogStatus.PASS, "Terminals Panel1");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL,
						"Successfully clicked on Terminals Tab : Failed" + TestResultUtils.logger
								.addScreenCapture(library.takescreenshot("Successfully clicked on Terminals Tab")));

			}
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
			TestResultUtils.logger.log(LogStatus.FAIL, exception.getMessage()
					+ TestResultUtils.logger.addScreenCapture(library.takescreenshot("Logout Issue")));
		}
	}
}
