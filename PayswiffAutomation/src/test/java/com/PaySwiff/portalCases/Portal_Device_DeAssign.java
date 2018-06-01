package com.PaySwiff.portalCases;

import org.testng.annotations.Test;

import com.FTCash.Panel.Fetch_MerchDetails;
import com.FTCash.Panel.Fetch_MerchID;
import com.Portal.Panel.Merchants_D_Panel;
import com.payswiff.config.SeleniumNGSuite;
import com.payswiff.util.DriverUtilsImpl;
import com.payswiff.util.TestResultUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Portal_Device_DeAssign {


	SeleniumNGSuite testSuite = new SeleniumNGSuite();
	DriverUtilsImpl library = new DriverUtilsImpl();
	Merchants_D_Panel objects= new Merchants_D_Panel();

	//@Test(priority= 7)
	
	@Test
	public void FT_MIDUpload() throws Exception {

		//TestResultUtils.logger= TestResultUtils.extent.startTest("Device DeAssign to the Merchant");
	
	/**
	 * I click Merchants tab 
	 */
	try {
		if(library.gClick(objects.FT_LMerchant) == true) {

			System.out.println("Successfully Clicked on Merchants tab : Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on Merchants tab : Passed");
		}else {
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
	if(library.gClick(objects.Updte_Status) == true) {
		
		System.out.println("Update Status on Devices tab: Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Update Status on Devices tab: Passed");
	}else {
		TestResultUtils.logger.log(LogStatus.FAIL, "Update Status on Devices tab: Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Update Status on Devices tab")));

	}
	
	/**
	 * I change the Device Change Update
	 */
	if(library.gListSelectByisibleText(objects.DvceStatus_Updte, "De-Installed") == true) {
		
		System.out.println("Selected De Installed from the Drop Down");
		TestResultUtils.logger.log(LogStatus.PASS, "Selected De Installed from the Drop Down: Passed");
	}else {
		TestResultUtils.logger.log(LogStatus.FAIL, "Selected De Installed from the Drop Down: Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Selected De Installed from the Drop Down")));

	}
	

	/**
	 * I click on Update
	 */
	library.gClick(objects.Update_Btn);
	
	String SuccesText = library.gWebElementGetText(objects.Suc_text);
	
	
	if(library.gVerifyContainsText(SuccesText, "Terminal updated successfully.")) {
		
		library.gClick(objects.Succ_OK);
		System.out.println("Terminal updated successfully.");
		TestResultUtils.logger.log(LogStatus.PASS, "Terminal updated successfully :Passed");
		
	}else {
		TestResultUtils.logger.log(LogStatus.FAIL, "Terminal not updated successfully: Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Terminal updated successfully")));

	}
}catch(Exception exception) {
	System.out.println(exception.getMessage());

}
}
}
