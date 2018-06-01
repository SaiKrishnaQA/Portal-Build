package com.Login_Portal;

import org.testng.annotations.Test;

import com.FTCash.Panel.Fetch_MerchID;
import com.Portal.Panel.Merchants_D_Panel;
import com.payswiff.config.SeleniumNGSuite;
import com.payswiff.constants.Constants;
import com.payswiff.util.DriverUtilsImpl;
import com.payswiff.util.TestResultUtils;
import com.relevantcodes.extentreports.LogStatus;

public class TID_Comparision {

	/** The base project path. */
	public static String baseProjectPath = System.getProperty(Constants.USER_DIR);

	SeleniumNGSuite testSuite = new SeleniumNGSuite();
	DriverUtilsImpl library = new DriverUtilsImpl();
	Merchants_D_Panel objects= new Merchants_D_Panel();
	TIDComparision_Panel obj = new TIDComparision_Panel();
	
	@Test
	public void TID_Validation() throws Exception {
		
		/**
		 * I click Merchants tab for Device Assign
		 */
		try {
			if(library.gClick(objects.FT_LMerchant) == true) 

				System.out.println("Successfully Clicked on Merchants tab : Passed");
			//TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on Merchants tab : Passed");
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
			//TestResultUtils.logger.log(LogStatus.PASS, "Successfully entered Merchant ID in the search field : Passed");
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully entered Merchant ID in the search field : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully entered Merchant ID in the search field")));

		}

		/**
		 * I click Search Button
		 */
		if(library.gClick(objects.FT_SearchButton) == true) {

			System.out.println("Successfully Clicked on Search tab: Passed");
			//TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on Search tab : Passed");
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully Clicked on Search tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Search tab")));

		}

		/**
		 * I click result merch ID
		 */
		if(library.gClick(objects.FT_firstMerchID) == true) {

			System.out.println("Successfully Clicked on Merchant tab: Passed");
			//TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on Merchant tab : Passed");
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully Clicked on Merchant tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Merchant tab")));

		}


		/**
		 * I click MIDs Tab to take the screen shot
		 */
		try {
		if(library.gClick(objects.Portal_POSMID) == true) {

			System.out.println("Successfully Clicked on POS MID tab: Passed");
			library.JavaScriptExec();
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on Assign New Device tab : Passed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("POS- MID/TID")));
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Unable to click POS MID tab: Failed");

		}
		}catch(Exception e) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Unable to click POS MID: Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Unable to click POS MID tab")));
		}
		
		//closing the MID TID tab
		library.gClick(objects.Portal_POSMID);
		
		library.gClick(obj.Terminals);
		
		String First_Row = library.gWebElementGetText(obj.Fir_TID);
		String Second_Row = library.gWebElementGetText(obj.Sec_TID);
		
		
		
		
	}
}
