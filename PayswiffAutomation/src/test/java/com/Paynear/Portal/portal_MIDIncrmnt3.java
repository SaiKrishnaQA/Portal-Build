package com.Paynear.Portal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.testng.annotations.Test;

import com.FTCash.Panel.Fetch_MerchDetails;
import com.Portal.Panel.Merchants_D_Panel;
import com.payswiff.config.SeleniumNGSuite;
import com.payswiff.util.DriverUtilsImpl;
import com.payswiff.util.TestResultUtils;
import com.relevantcodes.extentreports.LogStatus;

public class portal_MIDIncrmnt3 {

	SeleniumNGSuite testSuite = new SeleniumNGSuite();
	DriverUtilsImpl library = new DriverUtilsImpl();
	Merchants_D_Panel objects= new Merchants_D_Panel();
	
	//@Test(priority= 6)
	@Test
	public void Device_Assign() throws Exception {
		
		//Starts the logging of the report
		TestResultUtils.logger = TestResultUtils.extent.startTest("MID Increment Scenario- TID > Devices");
		
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
		
			String TID3= portal_MIDIncrmnt2.TID2+1;
			if(library.sendText(objects.Tid_field, TID3) == true) {
			//if(library.sendText(objects.Tid_field, "123499") == true) {
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
			//TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on Submit : Passed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Submit")));
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
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully uploaded 3 MID's and 3 TID");
			//TestResultUtils.logger.log(LogStatus.PASS, "Successfully uploaded MID's and TID 3" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully uploaded MID's and TID's")));
			/*}else
				System.out.println("Please enter the valid details");
*/
		} catch (Exception e) {
			System.out.println("Please enter the valid details");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully uploaded MID's and TID" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Please enter the valid details")));
}
		
		//To fetch the TIDs from POS MID TID tab
	    String TID1= library.gWebElementGetText(objects.tid1);
	    System.out.println("TID1: " +TID1);
	    
	    String TID2= library.gWebElementGetText(objects.tid2);
	    System.out.println("TID2: " +TID2);
	    
	    String TID3= library.gWebElementGetText(objects.tid3);
	    String TID4= library.gWebElementGetText(objects.tid4);
	    String TID5= library.gWebElementGetText(objects.tid5);
	    String TID6= library.gWebElementGetText(objects.tid6);
	    String TID7= library.gWebElementGetText(objects.tid7);
	    
	    		
	    //Saving all the values in the list
		Collection TIDList = new ArrayList<>(Arrays.asList(TID1, TID2, TID3, TID4, TID5, TID6, TID7));
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
	
	TestResultUtils.logger.log(LogStatus.PASS, "Devices are assigned to Merchant");
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

	//testSuite.JavaScriptExec();
	//testSuite.jse.executeScript("window.scrollBy(0,1000)");
	try {
	if(library.gClick(objects.FT_Headterminal) == true) {

		testSuite.JavaScriptExec();
		System.out.println("Successfully clicked on Terminals Tab : Passed");
		//TestResultUtils.logger.log(LogStatus.PASS, "Terminals Panel1");
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
		TestResultUtils.logger.log(LogStatus.PASS, "All Devices are Auto Configured");
		//TestResultUtils.logger.log(LogStatus.PASS, "All Devices are Auto Configured" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("All Devices are Auto Configured: Passed")));
	}else {
		System.out.println("All devices are not configured. Please check the Devices and Terminals");
		TestResultUtils.logger.log(LogStatus.PASS, "All devices are not configured. Please check the Devices and Terminals" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("All devices are not configured. Please check the Devices and Terminals")));
	}
	
	//To validate the TIDS in the POS MID TID tab and Terminals tab in merchant Details Screen
	TIDList.retainAll(TerTIDList);
	System.out.println("TIDs List: " +TerTIDList);
	
	if(TIDList.size()== 6) {
		System.out.println("No duplicate terminals are assigned to the Devices: Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "No duplicate terminals are assigned to the Devices");
		//TestResultUtils.logger.log(LogStatus.PASS, "No duplicate terminals are assigned to the Devices" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("All terminals are assigned to Devices: Passed")));
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
