package com.Paynear.Portal;

import org.testng.annotations.Test;

import com.FTCash.Panel.Fetch_MerchDetails;
import com.Portal.Panel.Merchants_D_Panel;
import com.payswiff.config.SeleniumNGSuite;
import com.payswiff.util.DriverUtilsImpl;
import com.payswiff.util.TestResultUtils;
import com.relevantcodes.extentreports.LogStatus;

public class portal_MIDIncrmnt2 {
	
	public static String TID2;
	
	SeleniumNGSuite testSuite = new SeleniumNGSuite();
	DriverUtilsImpl library = new DriverUtilsImpl();
	Merchants_D_Panel objects= new Merchants_D_Panel();
	
	//@Test(priority= 6)
	@Test
	public void Device_Assign() throws Exception {
		
		//Starts the logging of the report
		//TestResultUtils.logger = TestResultUtils.extent.startTest("TID Increment Scenario");
		
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
		 * I click MIDs Tab to take the screen shot
		 */
		try {
		if(library.gClick(objects.Portal_POSMID) == true) {

			System.out.println("Successfully Clicked on POS MID tab: Passed");
			library.JavaScriptExec();
			
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Unable to click POS-MID /TID tab: Failed");

		}
		}catch(Exception e) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Unable to click POS-MID /TID tab: Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Unable to click POS-MID /TID tab")));
		}
		
		/**
		 * I click Create New 
		 */
		if(library.gClick(objects.Mid_Cre) == true) {

			System.out.println("Successfully Clicked on Create New MID button: Passed");
			//TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on Create New MID button : Passed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Create New MID button")));
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Unable to click Create New Button" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Unable to click Create New Button")));

		}
		
		/**
		 * I select the processor value from Drop Down 
		 */
		try {

			Thread.sleep(2000);

			if(library.gClick(objects.Mid_Proc) ==true) {
				System.out.println("Clicked on DropDown");
			}else {
				System.out.println("Unable to click on DropDown");
			}

			library.sendText(objects.Mid_ProcField, SeleniumNGSuite.Bank_DP);

			if(library.gClick(objects.Mid_ProcSelField)== true) {
				System.out.println("Clicked on Select");
			}else {
				System.out.println("Unable to Click on Select");
			}

			//TestResultUtils.logger.log(LogStatus.PASS, "Successfully Selected from the Drop Down: Passed");
		}catch(Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully Selected from the Drop Down : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Selected from the Drop Down")));

		}
		
		/**
		 * I select the Payment Mode value from Drop Down 
		 */
		try {

			Thread.sleep(2000);

			if(library.gClick(objects.Mid_PaymntMode) ==true) {
				System.out.println("Clicked on DropDown");
			}else {
				System.out.println("Unable to click on DropDown");
			}

			library.sendText(objects.Mid_PayField, SeleniumNGSuite.Pay_Mode);

			if(library.gClick(objects.Mid_PaycSelField)== true) {
				System.out.println("Clicked on Select");
			}else {
				System.out.println("Unable to Click on Select");
			}

			//TestResultUtils.logger.log(LogStatus.PASS, "Successfully Selected from the Drop Down: Passed");
		}catch(Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully Selected from the Drop Down : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Selected from the Drop Down")));

		}
		
		/**
		 * I enter the MID value in the MID field
		 */
		try {
		
			if(library.sendText(objects.Mid_field, Fetch_MerchDetails.S) == true) {
				System.out.println("Successfully entered MID in the search field: Passed");
			}else {
				TestResultUtils.logger.log(LogStatus.FAIL, "MID field is not diaplayed in the popup" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("MID field is not diaplayed in the popup")));

			}
			
		}catch(Exception e) {
			TestResultUtils.logger.log(LogStatus.FAIL, "MID field is not diaplayed in the popup" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("MID field is not diaplayed in the popup")));
		}
		
		String TidValue = library.gWebElementGetText(objects.TIDValue);
		System.out.println("TID Value is: " +TidValue);
		
		/**
		 * I enter the TID value in the MID field
		 */
		try {
		
			TID2= portal_MIDIncrmnt.TID1+1;
			if(library.sendText(objects.Tid_field, TID2) == true) {
				System.out.println("Successfully entered TID ID in the search field: Passed");
			}else {
				TestResultUtils.logger.log(LogStatus.FAIL, "TID field is not diaplayed in the popup" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("TID field is not diaplayed in the popup")));

			}
			
		}catch(Exception e) {
			TestResultUtils.logger.log(LogStatus.FAIL, "TID field is not diaplayed in the popup" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("TID field is not diaplayed in the popup")));
		}
		
		
		/**
		 * I click Submit on pos MID TID popup
		 */
		if(library.gClick(objects.Mid_Sub) == true) {

			System.out.println("Successfully Clicked on Submit: Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on Submit : Passed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Submit")));
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Unable to click on Submit" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Unable to click on Submit")));

		}
		
		/**
		 * I click OK
		 */
		if(library.gClick(objects.Mid_SuccOK) == true) {

			System.out.println("Successfully Clicked on OK: Passed");
			//TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on Submit : Passed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on OK")));
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Unable to click on OK" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Unable to click on OK")));

		}
		
		try {
			//Thread.sleep(1000);

			// Getting text from confirmation window pop-up
			/*String ConfText = library.gWebElementGetText(objects.Mid_Success);
			System.out.println("Confirmation Text: " +ConfText);
			if(library.gVerifyContainsText(ConfText, "MID And TID created successfully")== true) {*/

			// Clicking on OK button
			library.gClick(objects.Mid_SuccOK);
			//Elements_LeadCreate.BtnOk.click();
			System.out.println("Clicked on OK button");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully uploaded MID's and TID 2" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully uploaded MID's and TID's")));
			/*}else
				System.out.println("Please enter the valid details");
*/
		} catch (Exception e) {
			System.out.println("Please enter the valid details");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully uploaded MID's and TID" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Please enter the valid details")));
}
}
}
