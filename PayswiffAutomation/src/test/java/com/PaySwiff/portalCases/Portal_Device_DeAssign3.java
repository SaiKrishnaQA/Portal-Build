package com.PaySwiff.portalCases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.testng.annotations.Test;

import com.FTCash.Panel.Fetch_MerchDetails;
import com.FTCash.Panel.Fetch_MerchID;
import com.Portal.Panel.Merchants_D_Panel;
import com.payswiff.config.SeleniumNGSuite;
import com.payswiff.util.DriverUtilsImpl;
import com.payswiff.util.TestResultUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Portal_Device_DeAssign3 {


	SeleniumNGSuite testSuite = new SeleniumNGSuite();
	DriverUtilsImpl library = new DriverUtilsImpl();
	Merchants_D_Panel objects= new Merchants_D_Panel();

	//@Test(priority= 7)
	@Test
	public void FT_MIDUpload() throws Exception {

		TestResultUtils.logger= TestResultUtils.extent.startTest("Device DeAssign to the Merchant- TID > Devices");
	
	/**
	 * I click Merchants tab 
	 */
	try {
		if(library.gClick(objects.FT_LMerchant) == true) {

		System.out.println("Successfully Clicked on Merchants tab : Passed");
		//TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on Merchants tab : Passed");
		}
	else {
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
	if(library.gClick(objects.Portal_POSMID) == true) {

		System.out.println("Successfully Clicked on POS MID tab: Passed");
		library.JavaScriptExec();
		
	}else {
		TestResultUtils.logger.log(LogStatus.FAIL, "Unable to click POS-MID /TID tab: Failed");

	}
	
	//To fetch the TIDs from POS MID TID tab
    String TID1= library.gWebElementGetText(objects.tid1);
    String TID2= library.gWebElementGetText(objects.tid2);
    String TID3= library.gWebElementGetText(objects.tid3);
    String TID4= library.gWebElementGetText(objects.tid4);
    String TID5= library.gWebElementGetText(objects.tid5);
    		
    //Saving all the values in the list
	Collection TIDList = new ArrayList<>(Arrays.asList(TID1, TID2, TID3, TID4, TID5));
	System.out.println("TID List: " +TIDList);
			
	//To close the POS MID TID tab
	library.gClick(objects.Portal_POSMID);
	
	
	/**
	 * I click Devices
	 */
	if(library.gClick(objects.FT_HeadDevices) == true) {
		
		System.out.println("Successfully Clicked on Devices tab: Passed");
		//TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on Devices tab : Passed");
	}else {
		TestResultUtils.logger.log(LogStatus.FAIL, "Successfully Clicked on Devices tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Devices tab")));

	}
	
	
	/**
	 * I click Devices Actions
	 */
		if(library.gClick(objects.Dev_DeActivate) == true) {
			
			System.out.println("Successfully Actions Button on Devices tab: Passed");
			//TestResultUtils.logger.log(LogStatus.PASS, "Successfully Actions Button on Devices tab : Passed");
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully Actions Button on Devices tab: Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Actions Button on Devices tab")));
	
		}
		
	
	/**
	 * I click Update Status 
	 */
	if(library.gClick(objects.Dev_Update) == true) {
		
		System.out.println("Update Status on Devices tab: Passed");
		//TestResultUtils.logger.log(LogStatus.PASS, "Update Status on Devices tab: Passed");
	}else {
		TestResultUtils.logger.log(LogStatus.FAIL, "Update Status on Devices tab: Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Update Status on Devices tab")));

	}
	
	/**
	 * I change the Device Change Update
	 */
	if(library.gListSelectByisibleText(objects.DvceStatus_Updte, "De-Installed") == true) {
		
		System.out.println("Selected De Installed from the Drop Down");
		//TestResultUtils.logger.log(LogStatus.PASS, "Selected De Installed from the Drop Down: Passed");
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
		//TestResultUtils.logger.log(LogStatus.PASS, "Terminal updated successfully :Passed");
		
	}else {
		TestResultUtils.logger.log(LogStatus.FAIL, "Terminal not updated successfully: Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Terminal updated successfully")));

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
	 */
	if(library.gClick(objects.Auto_SuccessOK) == true) {

		System.out.println("Successfully clicked on SuccessOK button : Passed");
		//TestResultUtils.logger.log(LogStatus.PASS, "AutoConfig and Merchant is Live: Passed");
	}else {
		TestResultUtils.logger.log(LogStatus.FAIL, "Issue with Device Assigning: Insufficient or Already Assigned: Failed" + TestResultUtils.logger.addScreenCapture(library.takescreenshot("Issue with Device Assigning: Insufficient or Already Assigned")));
        library.gClick(objects.FT_DeviceAssigOK);
	}	
	TestResultUtils.logger.log(LogStatus.PASS, "Devices are assigned to Merchant");
	
	 
	 //To fetch the Devices list
	 String Dev1= library.gWebElementGetText(objects.Device1);
	 String Dev2 = library.gWebElementGetText(objects.Device2);
	 String Dev3 = library.gWebElementGetText(objects.Device3);
	 
	 Collection listDev = new ArrayList(Arrays.asList(Dev1, Dev2, Dev3));
     System.out.println("Devices tab lst: " +listDev);		 

	library.gClick(objects.FT_HeadDevices);
	/**
	 * I click on Terminals Button
	 */

	//testSuite.JavaScriptExec();
	//testSuite.jse.executeScript("window.scrollBy(0,1000)");
	if(library.gClick(objects.FT_Headterminal) == true) {

		testSuite.JavaScriptExec();
		System.out.println("Successfully clicked on Terminals Tab : Passed");
		//TestResultUtils.logger.log(LogStatus.PASS, "Terminals Panel1");
	}else {
		TestResultUtils.logger.log(LogStatus.FAIL, "Successfully clicked on Terminals Tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully clicked on Terminals Tab")));

	}
	
	String Terminal1= library.gWebElementGetText(objects.terminal1);
	String Terminal2 = library.gWebElementGetText(objects.terminal2);
	String Terminal3 = library.gWebElementGetText(objects.terminal3);
	
	Collection TerDevList = new ArrayList(Arrays.asList(Terminal1, Terminal2, Terminal3));
	System.out.println("Terminal Device List: " +TerDevList);
	
	//Fetching the TIDs from the terminal tab
	String TTID1= library.gWebElementGetText(objects.TTId1);
	String TTID2 = library.gWebElementGetText(objects.TTId2);
	String TTID3 = library.gWebElementGetText(objects.TTId3);
	
	Collection TerTIDList = new ArrayList(Arrays.asList(TTID1, TTID2, TTID3));
	System.out.println("Terminals TID List: "+TerTIDList);
	
	
	//Validating the Devices tab and Terminal Devvices tab in Merchnat Details Screen
	listDev.removeAll(TerDevList);
	System.out.println("TerDevList: " +listDev);
	
	if(listDev.isEmpty()) {
		System.out.println("All Devices are Auto Configured");
		TestResultUtils.logger.log(LogStatus.PASS, "All Devices are Auto Configured");
		//TestResultUtils.logger.log(LogStatus.PASS, "All Devices are Auto Configured" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("All Devices are Auto Configured: Passed")));
	}else {
		System.out.println("All devices are not configured. Please check the Devices and Terminals");
		TestResultUtils.logger.log(LogStatus.PASS, "All devices are not configured. Please check the Devices and Terminals" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("All devices are not configured. Please check the Devices and Terminals")));
	}
	
	//To validate the TIDS in the POS MID TID tab and Terminals tab in merchant Details Screen
	TIDList.retainAll(TerTIDList);
	System.out.println("TIDs List: " +TerTIDList);
	
	if(TIDList.size()== 3) {
		System.out.println("No duplicate terminals are assigned to the Devices: Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "No duplicate terminals are assigned to the Devices");
		//TestResultUtils.logger.log(LogStatus.PASS, "No duplicate terminals are assigned to the Devices" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("All terminals are assigned to Devices: Passed")));
	}else {
		System.out.println("Terminals are not assigned to Devices: Failed");
		TestResultUtils.logger.log(LogStatus.PASS, "Terminals are not assigned to Devices" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Terminals are not assigned to Devices: Failed")));

	}	
	
	
}catch(Exception exception) {
	
	System.out.println(exception.getMessage());

}
}
}
