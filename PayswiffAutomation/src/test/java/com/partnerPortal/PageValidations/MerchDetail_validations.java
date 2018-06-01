package com.partnerPortal.PageValidations;

import org.testng.annotations.Test;

import com.FTCash.Panel.Fetch_MerchDetails;
import com.Portal.Panel.Merchants_D_Panel;
import com.payswiff.config.SeleniumNGSuite;
import com.payswiff.constants.Constants;
import com.payswiff.util.DriverUtilsImpl;
import com.payswiff.util.FT_GenricUtily;
import com.payswiff.util.TestResultUtils;
import com.relevantcodes.extentreports.LogStatus;

import junit.framework.Assert;

public class MerchDetail_validations {
	
	/** The base project path. */
	public static String baseProjectPath = System.getProperty(Constants.USER_DIR);
	
	SeleniumNGSuite testSuite = new SeleniumNGSuite();
	DriverUtilsImpl library = new DriverUtilsImpl();
	Merchants_D_Panel objects= new Merchants_D_Panel();
	
	//@Test(priority= 5)
	@Test
	public void MerchantDetail_Validation() throws Exception {
		
		//Starts the logging of the report
		//TestResultUtils.logger = TestResultUtils.extent.startTest("MerchantDetail Validation");
		
		/**
		 * I click Merchants tab 
		 *//*
		if(library.gClick(objects.FT_LMerchant) == true) {
			
			System.out.println("Successfully Clicked on Merchants tab and navigated to Merchants Screen: Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on Merchants tab and navigated to Merchants Screen : Passed");
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully Clicked on Merchants tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Merchants tab")));

		}
		
		*//**
		 * I enter the merchant value in the search field 
		 *//*
		//if(library.sendText(objects.FT_MercahntID, testSuite.Merch_ID) == true) {
		System.out.println("Value of S is: "+Fetch_MerchDetails.S);
		if(library.sendText(objects.FT_MercahntID, Fetch_MerchDetails.S) == true) {
			System.out.println("Successfully entered Merchant ID in the search field: Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully entered Merchant ID in the search field : Passed");
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully entered Merchant ID in the search field : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully entered Merchant ID in the search field")));

		}
		
		*//**
		 * I click Search Button
		 *//*
		if(library.gClick(objects.FT_SearchButton) == true) {
			
			System.out.println("Successfully Clicked on Search tab: Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on Search tab : Passed");
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully Clicked on Search tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Search tab")));

		}
		
		*//**
		 * I click result merch ID
		 *//*
		if(library.gClick(objects.FT_firstMerchID) == true) {
			
			System.out.println("Successfully Clicked on Merchant tab: Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on Merchant tab : Passed");
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully Clicked on Merchant tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Merchant tab")));

		}*/
		
		TestResultUtils.logger= TestResultUtils.extent.startTest("Merchant Selection");

		/**
		 * I click Merchants tab 
		 */
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
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on first Merchants tab : Passed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Merchants tab")));
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully Clicked on first Merchants tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on first Merchants tab")));

		}
		
		
		/**
		 * I click Services tab
		 */
		if(library.gClick(objects.Merch_Ser) == true) {
			
			System.out.println("Successfully Clicked on Services tab: Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Services tab" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Services tab")));
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully Clicked on Merchant tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Failed to click services tab")));

		}
		//to close the services tab
		library.gClick(objects.Merch_Ser);
		
		/**
		 * I click Documents tab
		 */
		if(library.gClick(objects.Merch_Doc) == true) {
			
			System.out.println("Successfully Clicked on Documents tab: Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Documents tab" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Documents tab")));
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully Clicked on Documents tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Failed to click Documents tab")));

		}
		
		library.gClick(objects.Merch_Doc);
		/*//Click on Action Button
		library.gClick(objects.DocActions);
		
		//to upload the document
		library.gClick(objects.DocUpload);
		
		//Clicking and uploading the file
		library.gClick(objects.DocField);
		
		
		//to close the services tab
		library.gClick(objects.Merch_Doc);
		
		Thread.sleep(2000);
		
		//Selecting the File
		FT_GenricUtily.Robotchoosfile(baseProjectPath.concat(Constants.DocLoc));
		
		//Click on Submit
		library.gClick(objects.DocSub);*/
		
		
		/**
		 * I click Subscrptions tab
		 */
		if(library.gClick(objects.Subscrp) == true) {
			
			System.out.println("Successfully Clicked on Subscriptions tab: Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Subscriptions tab" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Subscriptions tab")));
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Failed to click Subscriptions tab" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Failed to click Subscriptions tab")));

		}
		
		library.gClick(objects.Subscrp_Act);
		library.gClick(objects.Subscrp_close);
		library.gClick(objects.Subscrp);
		
		/**
		 * I click Users tab
		 */
		if(library.gClick(objects.Users) == true) {
			
			System.out.println("Successfully Clicked on Users tab: Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Users tab" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Users tab")));
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Failed to click Users tab" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Failed to click Users tab")));

		}
		//To close the Users tab
		library.gClick(Merchants_D_Panel.Users);
		
		/**
		 * I click Address Info tab
		 */
		if(library.gClick(objects.AddInfo) == true) {
			
			System.out.println("Successfully Clicked on AddInfo tab: Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "AddInfo tab" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on AddInfo tab")));
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Failed to click AddInfo tab" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Failed to click AddInfo tab")));

		}
		
		if(library.gClick(objects.AddCre) == true) {
			System.out.println("Create Button is visible and Clicked");
		}else
			System.out.println("Button is not visible");
		
		library.sendText(objects.Add1, "Payswiff");
		
		library.gClick(objects.country);
		library.gListSelectByisibleText(objects.country, "INDIA");
		
		library.gClick(objects.state);
		library.gListSelectByisibleText(objects.state, "Telangana");
		
		library.gClick(objects.city);
		library.gListSelectByisibleText(objects.city, "Hyderabad");
		
		library.gClick(objects.Creaddress);
		
		String SuccPOPup = library.gWebElementGetText(objects.POPMsg);		
		
		try {
        	Assert.assertEquals(SuccPOPup, "Address Created Successfully");
        	System.out.println("successfull popup");
        }catch(Exception exception) {
        	System.out.println("Unable to create");
        }
        
        library.gClick(objects.PopUpOK);
        
        Thread.sleep(2000);
        
        String AddType = library.gWebElementGetText(objects.Cor_AddType);
        System.out.println("Address Type: " +AddType);
        
        try {
        	Assert.assertEquals(AddType, "Correspondence");        
        	System.out.println("Add Info created");
			TestResultUtils.logger.log(LogStatus.PASS, "Add Info tab" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully created Add Info details")));
        }catch(Exception exception) {
        	TestResultUtils.logger.log(LogStatus.FAIL, "Failed to create Add Info" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Failed to create Add Info")));
        }
      
		//To close the Users tab
		library.gClick(objects.AddInfo);
		
		/**
		 * I click ContactInfo tab
		 */
		if(library.gClick(objects.Contact) == true) {
			
			System.out.println("Successfully Clicked on ContactInfo tab: Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "ContactInfo tab" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on ContactInfo tab")));
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Failed to click ContactInfo tab" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Failed to click ContactInfo tab")));

		}
		//To close the Users tab
		library.gClick(objects.Contact);
		
		
		/**
		 * I click Bank tab
		 */
		if(library.gClick(objects.BankInf) == true) {
			
			System.out.println("Successfully Clicked on BankInfo tab: Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "BankInfo tab" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on BankInfo tab")));
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Failed to click BankInfo tab" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Failed to click BankInfo tab")));

		}
		
       if(library.gClick(objects.Cre_BankInfo) == true) {
			
			System.out.println("Successfully Clicked on CreNew tab: Passed");
			testSuite.JavaScriptExec();
			
		}else {
			System.out.println("Unable to find the Create New button");
		}
		
        library.sendText(objects.HolderName_GW, "Test123");
        
        library.sendText(objects.Acnt_Num, "2568875465");
        
        if(library.gClick(objects.Acct_Type)== true)
        	System.out.println("Successfully selected the account type");
        else
        	System.out.println("Unable to select the value from the drop down");
        
        library.gListSelectByisibleText(objects.Acct_Type, "Savings");
        
        library.sendText(objects.Bank_Name, "Axis");
        
        library.sendText(objects.Bank_Branch, "Gachibowli");
        
        library.sendText(objects.IFSC_Code, "1256742");
        
        library.gClick(objects.Cre_Bank);
        
       String BankpopUp = library.gWebElementGetText(objects.BankPOPup);
        
        try {
        	Assert.assertEquals(BankpopUp, "Bank Details Created Successfully");
        	System.out.println("successfull popup");
        }catch(Exception exception) {
        	System.out.println("Unable to create");
        }
        
        library.gClick(objects.Popup_OK);
        
        Thread.sleep(2000);
        
        String AccType = library.gWebElementGetText(objects.AccType);
        System.out.println("Account Type: " +AccType);
        
        try {
        	Assert.assertEquals(AccType, "Savings");        
        	System.out.println("Banke Info created");
			TestResultUtils.logger.log(LogStatus.PASS, "Bank Info tab" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully created bank Info details")));
        }catch(Exception exception) {
        	TestResultUtils.logger.log(LogStatus.FAIL, "Failed to create Bank Info" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Failed to create Bank Info")));
        }
        
		//To close the Users tab
		library.gClick(objects.BankInf);
		
		
		/**
		 * I click Gateways tab
		 */
		if(library.gClick(objects.Gateways) == true) {
			
			System.out.println("Successfully Clicked on Gateways tab: Passed");
			testSuite.JavaScriptExec();
			
			TestResultUtils.logger.log(LogStatus.PASS, "Gateways tab" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Gateways tab")));
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Failed to click Gateways tab" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Failed to click Gateways tab")));

		}
		
		//Gate Way PG
		if(library.gClick(objects.GW_DD) == true) {
			System.out.println("Able to select from DropDown");
		}else
			System.out.println("Unable to Select the Value from Drop Down");
		
		try {
	    library.gListSelectByisibleText(objects.GW_DD, "PG");
	    TestResultUtils.logger.log(LogStatus.PASS, "Gateways tab with PG" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Gateways tab with PG")));
		}catch(Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Failed for PG GateWays");
		}
	    
		//Gate Way PG
		if(library.gClick(objects.GW_DD) == true) {
		System.out.println("Able to select from DropDown");
		}else
		System.out.println("Unable to Select the Value from Drop Down");
				
		try {
			  library.gListSelectByisibleText(objects.GW_DD, "CASH@POS");
			  TestResultUtils.logger.log(LogStatus.PASS, "Gateways tab with CASH@POS" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Gateways tab with CASH@POS")));
			}catch(Exception exception) {
			  TestResultUtils.logger.log(LogStatus.FAIL, "Failed for CASH@POS GateWays");
			}

		//To close the Users tab
		library.gClick(objects.Gateways);
		
		/**
		 * I click Webhook tab
		 */
		if(library.gClick(objects.Webhook) == true) {
			
			System.out.println("Successfully Clicked on Webhook tab: Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Webhook tab" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Webhook tab")));
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Failed to click Webhook tab" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Failed to click Webhook tab")));

		}
		//To close the Users tab
		library.gClick(objects.Webhook);
		
		}
	}
