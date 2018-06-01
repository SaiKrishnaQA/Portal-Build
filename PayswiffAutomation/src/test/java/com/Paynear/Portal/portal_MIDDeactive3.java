package com.Paynear.Portal;

import org.testng.annotations.Test;

import com.Portal.Panel.Merchants_D_Panel;
import com.payswiff.config.SeleniumNGSuite;
import com.payswiff.util.DriverUtilsImpl;
import com.payswiff.util.TestResultUtils;
import com.relevantcodes.extentreports.LogStatus;

public class portal_MIDDeactive3 {

	SeleniumNGSuite testSuite = new SeleniumNGSuite();
	DriverUtilsImpl library = new DriverUtilsImpl();
	Merchants_D_Panel objects= new Merchants_D_Panel();
	
	//@Test(priority= 6)
	@Test
	public void Device_Assign() throws Exception {
		
		//Starts the logging of the report
		//TestResultUtils.logger = TestResultUtils.extent.startTest("Portal MID DeActive 3");
		
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
		 * I click MIDs Tab Action tab
		 */
		try {
		if(library.gClick(objects.MID_Act3) == true) {

			System.out.println("Successfully Clicked on POS MID Actions tab: Passed");
			library.JavaScriptExec();
			
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Unable to click POS MID Actions tab: Failed");

		}
		}catch(Exception e) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Unable to click POS MID Actions tab: Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Unable to click POS MID Actions tab")));
		}
		
		/**
		 * I select the Status from MID TID Upload popup 
		 */
		try {

			Thread.sleep(2000);

			if(library.gClick(objects.Act_Status) ==true) {
				System.out.println("Clicked on DropDown");
			}else {
				System.out.println("Unable to click on DropDown");
			}

			Thread.sleep(2000);
			library.sendText(objects.Act_Statustext, "DEACTIVATED");

			if(library.gClick(objects.Act_Status_Sel)== true) {
				System.out.println("Clicked on Select");
			}else {
				System.out.println("Unable to Click on Select");
			}

			//TestResultUtils.logger.log(LogStatus.PASS, "Successfully Selected from the Drop Down: Passed");
		}catch(Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Unable to select from the drop down" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Unable to select from the drop down")));

		}
		
		/**
		 * I click Update
		 */
		try {
		if(library.gClick(objects.Act_Update) == true) {

			System.out.println("Successfully Clicked on POS MID Actions tab: Passed");
			library.JavaScriptExec();
			
			
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Unable to click POS MID Actions tab: Failed");

		}
		}catch(Exception e) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Unable to click POS MID Actions tab: Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Unable to click POS MID Actions tab")));
		}
		
		library.gClick(objects.Act_OK);
		TestResultUtils.logger.log(LogStatus.PASS, "POS MID TID after DeActive 3" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("POS MID TID after DeActive")));
		
	}
}
