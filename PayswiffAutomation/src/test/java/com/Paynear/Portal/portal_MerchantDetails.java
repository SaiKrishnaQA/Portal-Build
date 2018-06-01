package com.Paynear.Portal;

import org.testng.annotations.Test;

import com.FTCash.Panel.MerchantDetails_Panel;
import com.payswiff.config.SeleniumNGSuite;
import com.payswiff.util.DriverUtilsImpl;
import com.payswiff.util.TestResultUtils;
import com.relevantcodes.extentreports.LogStatus;

public class portal_MerchantDetails {
	
	SeleniumNGSuite testSuite = new SeleniumNGSuite();
	DriverUtilsImpl library = new DriverUtilsImpl();
	MerchantDetails_Panel objects= new MerchantDetails_Panel();

	@Test(priority = 7)
	public void FT_MidApproval() throws Exception {
		TestResultUtils.logger= TestResultUtils.extent.startTest("MID_TID Approaval");

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
		 * I click first Merchant  
		 */
		if(library.gClick(objects.Frst_Mer) == true) {

			System.out.println("Successfully Clicked on first Merchants tab : Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on first Merchants tab : Passed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Merchants tab")));
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully Clicked on first Merchants tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on first Merchants tab")));

		}

	
	/**
	 * I click on Merchant Services tab
	 */
	try {
		if(library.gClick(objects.Services) == true) 

			System.out.println("Successfully Clicked on Services tab : Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on Services tab : Passed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Services tab")));
	}catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "Failed to click on Services tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Services tab")));

	}
	library.gClick(objects.Services);
	
	
	/**
	 * I click on Subscriptions tab
	 */
	try {
		if(library.gClick(objects.Subsptns) == true) 

			System.out.println("Successfully Clicked on Subscriptions tab : Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on Subscriptions tab : Passed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Subscriptions tab")));
	}catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "Successfully Clicked on Subscriptions tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Subscriptions tab")));

	}
	library.gClick(objects.Subsptns);
	
	
	/**
	 * I click on GateWays tab
	 */
	try {
		if(library.gClick(objects.Gateways) == true) 

			System.out.println("Successfully Clicked on GateWays tab : Passed");
		
		testSuite.JavaScriptExec();
		Thread.sleep(2000);
		
		TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on GateWays tab : Passed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on GateWays tab")));
	}catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "Successfully Clicked on GateWays tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on GateWays tab")));

	}
	library.gClick(objects.Gateways);
	
	/**
	 * I click on POS MID TID tab
	 */
	try {
		if(library.gClick(objects.POSMID) == true) 

			System.out.println("Successfully Clicked on POS MID TID tab : Passed");
		
		testSuite.JavaScriptExec();
		Thread.sleep(2000);
		
		TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on POS MID TID tab : Passed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on POS MID TID tab")));
	}catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "Successfully Clicked on POS MID TID tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on POS MID TID tab")));

	}
	library.gClick(objects.POSMID);
	
	/**
	 * I click on Devices tab
	 */
	try {
		if(library.gClick(objects.FT_HeadDevices) == true) 

			System.out.println("Successfully Clicked on Devices tab : Passed");
		
		testSuite.JavaScriptExec();
		Thread.sleep(2000);
		
		TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on Devices tab : Passed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Devices tab")));
	}catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "Successfully Clicked on Devices tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Devices tab")));

	}
	library.gClick(objects.FT_HeadDevices);
	
	
	/**
	 * I click on terminals tab
	 */
	try {
		if(library.gClick(objects.FT_Headterminal) == true) 

			System.out.println("Successfully Clicked on Terminals tab : Passed");

		testSuite.JavaScriptExec();
		Thread.sleep(2000);

		TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on Terminals tab : Passed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Terminals tab")));
	}catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "Successfully Clicked on Terminals tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Terminals tab")));

	}
	library.gClick(objects.FT_Headterminal);
}
}