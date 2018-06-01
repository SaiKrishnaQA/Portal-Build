package com.Paynear.Portal;

import org.testng.annotations.Test;

import com.Portal.Panel.Merchants_D_Panel;
import com.payswiff.config.SeleniumNGSuite;
import com.payswiff.util.DriverUtilsImpl;
import com.payswiff.util.TestResultUtils;
import com.relevantcodes.extentreports.LogStatus;

public class portal_final_AutoConfig {

	SeleniumNGSuite testSuite = new SeleniumNGSuite();
	DriverUtilsImpl library = new DriverUtilsImpl();
	Merchants_D_Panel objects= new Merchants_D_Panel();
	
	//@Test(priority= 6)
	@Test
	public void Device_Assign() throws Exception {
		
		//Starts the logging of the report
		TestResultUtils.logger = TestResultUtils.extent.startTest("Final Auto Config");
		
		try {
		/**
		 * I click Merchants tab 
		 */
		if(library.gClick(objects.FT_LMerchant) == true) {
			
			System.out.println("Successfully Clicked on Merchants tab and navigated to Merchants Screen: Passed");
			//TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on Merchants tab and navigated to Merchants Screen : Passed");
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully Clicked on Merchants tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Merchants tab")));

		}}catch(Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully Clicked on Merchants tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Merchants tab")));

		}
		
		/**
		 * I click first Merchant  
		 */
		if(library.gClick(objects.Frst_Mer) == true) {

			System.out.println("Successfully Clicked on first Merchants tab : Passed");
			//TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on first Merchants tab : Passed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Merchants tab")));
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully Clicked on first Merchants tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on first Merchants tab")));

		}
		
		/**
		 * I click Devices
		 */
		if(library.gClick(objects.FT_HeadDevices) == true) {

			System.out.println("Successfully Clicked on Devices tab: Passed");
			//TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on Devices tab : Passed");
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Devices tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Devices tab")));

		}
	
		/**
		 * I click on Auto Config Button
		 */
		if(library.gClick(objects.FT_AutoConfig) == true) {

			System.out.println("Successfully clicked on Auto Config button : Passed");
			//TestResultUtils.logger.log(LogStatus.PASS, "Successfully clicked on Auto Config button : Passed");
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully clicked on Auto Config button : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully clicked on Auto Config button")));

		}
		
		/**
		 * I select processor from auto config popup
		 */
		/**
		 * I select the value from Drop Down 
		 */
		try {
			library.gClick(objects.Auto_Proc);

			library.sendText(objects.Auto_VProc, SeleniumNGSuite.Bank_DP);
			
			library.gClick(objects.Auto_SelRes);

			library.gClick(objects.Auto_Submit);

			//TestResultUtils.logger.log(LogStatus.PASS, "Successfully Selected from the Drop Down: Passed");
		}catch(Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Failed to select the value from drop down" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Failed to select the value from drop down")));

		}

		/**
		 * I click on Success Button
		 */try {
		if(library.gClick(objects.Auto_SuccessOK) == true) {

			System.out.println("Successfully clicked on SuccessOK button : Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "AutoConfig and Merchant is Live: Passed");
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully clicked on SuccessOK button : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully clicked on SuccessOK button")));

		}		    
		/*library.gClick(objects.FT_HeadDevices);
		library.gClick(objects.FT_HeadDevices);

		Thread.sleep(2000);
		testSuite.JavaScriptExec();*/
		
		TestResultUtils.logger.log(LogStatus.PASS, "Merchant Devices are LIVE: Passed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Auto Configured the devices and are in live Status")));
		 }
		catch(Exception exception) {

				TestResultUtils.logger.log(LogStatus.FAIL, "Issue with Device Assigning: Insufficient or Already Assigned: Failed" + TestResultUtils.logger.addScreenCapture(library.takescreenshot("Issue with Device Assigning: Insufficient or Already Assigned")));
				library.gClick(objects.FT_DeviceAssigOK);
				}

		library.gClick(objects.FT_HeadDevices);
		/**
		 * I click on Terminals Button
		 */

		testSuite.JavaScriptExec();
		//testSuite.jse.executeScript("window.scrollBy(0,1000)");
		if(library.gClick(objects.FT_Headterminal) == true) {

			testSuite.JavaScriptExec();
			System.out.println("Successfully clicked on Terminals Tab : Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Terminals Panel Final" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Terminal Ids")));
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully clicked on Terminals Tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully clicked on Terminals Tab")));

		}
	}
}
