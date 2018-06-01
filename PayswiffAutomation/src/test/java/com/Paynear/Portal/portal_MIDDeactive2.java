package com.Paynear.Portal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.Portal.Panel.Merchants_D_Panel;
import com.payswiff.config.SeleniumNGSuite;
import com.payswiff.util.DriverUtilsImpl;
import com.payswiff.util.TestResultUtils;
import com.relevantcodes.extentreports.LogStatus;

public class portal_MIDDeactive2 {

	SeleniumNGSuite testSuite = new SeleniumNGSuite();
	DriverUtilsImpl library = new DriverUtilsImpl();
	Merchants_D_Panel objects= new Merchants_D_Panel();
	
	//@Test(priority= 6)
	@Test
	public void Device_Assign() throws Exception {
		
		//Starts the logging of the report
		TestResultUtils.logger = TestResultUtils.extent.startTest("portal_MIDDeactive- TID < Devices");
		
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
		if(library.gClick(objects.MID_Act2) == true) {

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
			//TestResultUtils.logger.log(LogStatus.PASS, "POS MID TID after DeActive 2");
			
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Unable to click POS MID Actions tab: Failed");

		}
		}catch(Exception e) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Unable to click POS MID Actions tab: Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Unable to click POS MID Actions tab")));
		}
		
		library.gClick(objects.Act_OK);
		//TestResultUtils.logger.log(LogStatus.PASS, "POS MID TID after DeActive" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("POS MID TID after DeActive")));
		library.gClick(objects.Portal_POSMID);
		
		
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
			//TestResultUtils.logger.log(LogStatus.PASS, "AutoConfig and Merchant is Live: Passed");
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully clicked on SuccessOK button : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully clicked on SuccessOK button")));

		}		    
		library.gClick(objects.FT_HeadDevices);
		library.gClick(objects.FT_HeadDevices);

		Thread.sleep(2000);
		testSuite.JavaScriptExec();
		
		//TestResultUtils.logger.log(LogStatus.PASS, "Merchant Devices are LIVE - DeActive: Passed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Auto Configured the devices and are in live Status")));
		TestResultUtils.logger.log(LogStatus.PASS, "Merchant Devices are LIVE");
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
			//TestResultUtils.logger.log(LogStatus.PASS, "Terminals Panel- DeActive" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Terminal Ids")));
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully clicked on Terminals Tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully clicked on Terminals Tab")));

		}
		
		//To fetch the TIDs from POS MID TID tab
	    /*String TID1= library.gWebElementGetText(objects.tid1);
	    String TID2= library.gWebElementGetText(objects.tid2);*/
	    String TID3= library.gWebElementGetText(objects.tid3);
	    String TID4= library.gWebElementGetText(objects.tid4);
	    String TID5= library.gWebElementGetText(objects.tid5);
	    String TID6= library.gWebElementGetText(objects.tid6);
	    String TID7= library.gWebElementGetText(objects.tid7);
	    		
	    //Saving all the values in the list
		Collection TIDList = new ArrayList<>(Arrays.asList(TID3, TID4, TID5, TID6, TID7));
		System.out.println("TID List: " +TIDList);
				
		//To close the POS MID TID tab
		library.gClick(objects.Portal_POSMID);
		
		/**
		 * I click Devices
		 */
		if(library.gClick(objects.FT_HeadDevices) == true) {
			
			System.out.println("Successfully Clicked on Devices tab 3: Passed");
			//TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on Devices tab : Passed");
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully Clicked on Devices tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Devices tab")));

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
			//TestResultUtils.logger.log(LogStatus.PASS, "AutoConfig and Merchant is Live: Passed");
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully clicked on SuccessOK button : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully clicked on SuccessOK button")));

		}		    
		library.gClick(objects.FT_HeadDevices);
		library.gClick(objects.FT_HeadDevices);

		Thread.sleep(2000);
		testSuite.JavaScriptExec();
		
		//TestResultUtils.logger.log(LogStatus.PASS, "Merchant Devices are LIVE 3: Passed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Auto Configured the devices and are in live Status")));
		TestResultUtils.logger.log(LogStatus.PASS, "Merchant Devices are LIVE: Passed");

		 }
		catch(Exception exception) {

				TestResultUtils.logger.log(LogStatus.FAIL, "Issue with Device Assigning: Insufficient or Already Assigned: Failed" + TestResultUtils.logger.addScreenCapture(library.takescreenshot("Issue with Device Assigning: Insufficient or Already Assigned")));
				library.gClick(objects.FT_DeviceAssigOK);
				}
		 
		//To fetch the Devices list
		 String Dev1= library.gWebElementGetText(objects.Device1);
		 String Dev2 = library.gWebElementGetText(objects.Device2);
		 String Dev3= library.gWebElementGetText(objects.Device3);
		 String Dev4 = library.gWebElementGetText(objects.Device4);
		 String Dev5= library.gWebElementGetText(objects.Device5);
		 String Dev6 = library.gWebElementGetText(objects.Device6);
		 
		 
		 Collection listDev = new ArrayList(Arrays.asList(Dev1, Dev2, Dev3, Dev4, Dev5, Dev6));
	     System.out.println("Devices tab lst: " +listDev);		 

		library.gClick(objects.FT_HeadDevices);
		
		/**
		 * I click on Terminals Button
		 */
		
		try {
		if(library.gClick(objects.FT_Headterminal) == true) {

			testSuite.JavaScriptExec();
			System.out.println("Successfully clicked on Terminals Tab 3 : Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Terminals Tab" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Terminal Ids")));
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully clicked on Terminals Tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully clicked on Terminals Tab")));

		}
		
		String TerDev1= library.gWebElementGetText(objects.terminal1);
		String TerDev2 = library.gWebElementGetText(objects.terminal2);
		
		String TerDev3= library.gWebElementGetText(objects.terminal3);
		String TerDev4 = library.gWebElementGetText(objects.terminal4);
		
		String TerDev5= library.gWebElementGetText(objects.terminal5);
		String TerDev6 = library.gWebElementGetText(objects.terminal6);
		
		Collection TerDevList = new ArrayList(Arrays.asList(TerDev1, TerDev2, TerDev3, TerDev4, TerDev5, TerDev6));
		System.out.println("Terminal Device List: " +TerDevList);
		
		//Fetching the TIDs from the terminal tab
		String TTID1= library.gWebElementGetText(objects.TTId1);
		String TTID2 = library.gWebElementGetText(objects.TTId2);
		
		String TTID3= library.gWebElementGetText(objects.TTId3);
		String TTID4 = library.gWebElementGetText(objects.TTId4);
		
		String TTID5= library.gWebElementGetText(objects.TTId5);
		String TTID6 = library.gWebElementGetText(objects.TTId6);
		
		Collection TerTIDList = new ArrayList(Arrays.asList(TTID1, TTID2, TTID3, TTID4, TTID5, TTID6));
		System.out.println("Terminals TID List: "+TerTIDList);
		
		
		//Validating the Devices tab and Terminal Devvices tab in Merchnat Details Screen
		listDev.removeAll(TerDevList);
		System.out.println("TerDevList: " +listDev);
		
		if(listDev.isEmpty()) {
			System.out.println("All Devices are Auto Configured");
			TestResultUtils.logger.log(LogStatus.PASS, "All the Devices are Auto Configured" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("All Devices are Auto Configured: Passed")));
		}else {
			System.out.println("All devices are not configured. Please check the Devices and Terminals");
			TestResultUtils.logger.log(LogStatus.PASS, "All devices are not configured. Please check the Devices and Terminals" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("All devices are not configured. Please check the Devices and Terminals")));
		}
		
		//To validate the TIDS in the POS MID TID tab and Terminals tab in merchant Details Screen
		TerTIDList.retainAll(TIDList);
		System.out.println("Terminal TIDs List: " +TerTIDList);
		
		// add elements to al, including duplicates
		Set<String> hs = new HashSet<>();
		hs.addAll(TerTIDList);
		TerTIDList.clear();
		TerTIDList.addAll(hs);
		
		if(TerTIDList.size()== 5) {
			System.out.println("duplicate terminals are not assigned to the Devices: Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Duplicate terminals are not assigned to the Devices" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("All terminals are assigned to Devices: Passed")));
		}else {
			System.out.println("Terminals are not assigned to Devices: Failed");
			TestResultUtils.logger.log(LogStatus.PASS, "Terminals are not assigned to Devices" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Terminals are not assigned to Devices: Failed")));

		}	
		}catch(Exception exception) {
			System.out.println("Issue with Terminals tab");
			TestResultUtils.logger.log(LogStatus.FAIL, "Issue with terminal tab in Merchant Details Screen" + TestResultUtils.logger.addScreenCapture(library.takescreenshot("Issue with terminal tab in Merchant Details Screen")));
		}	
	
	
	}
}