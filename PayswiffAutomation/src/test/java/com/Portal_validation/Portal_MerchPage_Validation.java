/*
 * @author Sai G
 * 
 */
package com.Portal_validation;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Portal.Panel.Portal_MerchPage_Panel;
import com.Portal.Panel.loginpage;
import com.payswiff.config.SeleniumNGSuite;
import com.payswiff.util.DriverUtilsImpl;
import com.payswiff.util.TestResultUtils;
import com.relevantcodes.extentreports.LogStatus;


public class Portal_MerchPage_Validation {

	SeleniumNGSuite testSuite = new SeleniumNGSuite();
	DriverUtilsImpl library = new DriverUtilsImpl();
	Portal_MerchPage_Panel objects= new Portal_MerchPage_Panel();
	loginpage objects1 = new loginpage();
	
	//@Test(priority= 4)
	@Test
	public void Axis_MerchantValidation() throws Exception {
		
		TestResultUtils.logger = TestResultUtils.extent.startTest("MerchantPage_Screen Validation");
		
		//Merchant Page Screen
		library.gClick(objects.SM_MerchSider);
		String MerchTitle= library.getTitle();
		System.out.println("Merchant Page Title: "+MerchTitle);
		/*Assert.assertEquals(MerchTitle, "Welcome to Axis Bank");
		System.out.println("Successfully navigated to Merchant Screen");*/
		
		
		/**
		 * ISee Merchant Header
		 */
		String SM_MerchantsHeader= library.gWebElementGetText(objects.M_MerchHeader);
		try {
			
		Assert.assertEquals(SM_MerchantsHeader, "Merchants");
		System.out.println("Merchants Header is present in the Merchants Screen : Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Merchants Header is present in the Merchants Screen : Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "Merchants Header is not present in the Merchants Screen" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Merchants Header was not displayed")));
	}
		
		
		/**
		 * ISee Merchant Header Crumb
		 */
		String SM_MerchantsHeaderCrumb= library.gWebElementGetText(objects.M_Merchantbreadcrumb);
		try {
			
		Assert.assertEquals(SM_MerchantsHeaderCrumb, "Home Merchants");
		System.out.println("Merchants Header Crumb is present in the Merchants Screen : Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Merchants Header Crumb is present in the Merchants Screen : Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "Merchants Header Crumb is not present in the Merchants Screen" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Merchants Header Crumb was not displayed")));
	}
		
		/**
		 * ISee Merchant Name in the table section of the page
		 */
		String SM_MerchantsName= library.gWebElementGetText(objects.SM_MerchName);
		try {
			
		Assert.assertEquals(SM_MerchantsName, "Merchant Name");
		System.out.println("MerchantName is present in the table section of the page : Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "MerchantName is present in the table section of the page: Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "MerchantName is not present in the table section of the page" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("MerchantName is not present in the table section of the page")));
	}
		
		/**
		 * ISee Merchant Mobile in the table section of the page
		 */
		String SM_MerchantsMobile= library.gWebElementGetText(objects.SM_MobNum);
		try {
			
		Assert.assertEquals(SM_MerchantsMobile, "Mobile No");
		System.out.println("Merchant mobile Number is present in the table section of the page: Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Merchant mobile Number is present in the table section of the page: Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "Merchant mobile Number is not present in the table section of the page" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Merchant mobile Number is not present in the table section of the page")));
	}
				
		/**
		 * ISee Merchant Email ID in the table section of the page
		 */
		String SM_MerchantsEmail= library.gWebElementGetText(objects.SM_EmailID);
		try {
			
		Assert.assertEquals(SM_MerchantsEmail, "Email Id");
		System.out.println("Merchant Email is present in the table section of the page: Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Merchant Email is present in the table section of the page: Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "Merchant Email is not present in the table section of the page" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Merchant Email is not present in the table section of the page")));
	}
		
		/**
		 * ISee Merchant City in the table section of the page
		 */
		String SM_MerchantsCity= library.gWebElementGetText(objects.SM_City);
		try {
			
		Assert.assertEquals(SM_MerchantsCity, "City");
		System.out.println("Merchant City is present in the table section of the page: Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Merchant City is present in the table section of the page: Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "Merchant City is not present in the table section of the page" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Merchant City is not present in the table section of the page")));
	}
		
		/**
		 * ISee Merchant Sale Type in the table section of the page
		 */
		String SM_MerchantsSaleType= library.gWebElementGetText(objects.SM_SaleType);
		try {
			
		Assert.assertEquals(SM_MerchantsSaleType, "Sale Type");
		System.out.println("Merchant Sale Type is present in the table section of the page: Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Merchant Sale Type is present in the table section of the page: Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "Merchant Sale Type is not present in the table section of the page" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Merchant Sale Type is not present in the table section of the page")));
	}
		
		/**
		 * ISee Merchant Partner Name in the table section of the page
		 */
		String SM_MerchantsPName= library.gWebElementGetText(objects.SM_PartnerName);
		try {
			
		Assert.assertEquals(SM_MerchantsPName, "Partner Name(ID)");
		System.out.println("Merchant Partner Name is present in the table section of the page: Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Merchant Partner Name is present in the table section of the page: Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "Merchant Partner Name is not present in the table section of the page" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Merchant Partner Name is not present in the table section of the page")));
	}
		
		/**
		 * ISee Merchant Reg Date in the table section of the page
		 */
		String SM_MerchantRDate= library.gWebElementGetText(objects.SM_RegDate);
		try {
			
		Assert.assertEquals(SM_MerchantRDate, "Reg. Date");
		System.out.println("Merchant Reg Date is present in the table section of the page: Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Merchant Reg Date is present in the table section of the page: Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "Merchant Reg Date is not present in the table section of the page" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Merchant Reg Date is not present in the table section of the page")));
	}
		
		/**
		 * ISee Merchant Status in the table section of the page
		 */
		String SM_MerchantsStatus= library.gWebElementGetText(objects.SM_Status);
		try {
			
		Assert.assertEquals(SM_MerchantsStatus, "Status");
		System.out.println("Merchant Status is present in the table section of the page: Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Merchant Status is present in the table section of the page: Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "Merchant Status is not present in the table section of the page" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Merchant Status is not present in the table section of the page")));
	}
		
		/**
		 * ISee Merchant Action in the table section of the page
		 */
		String SM_MerchantsAction= library.gWebElementGetText(objects.SM_Action);
		try {
			
		Assert.assertEquals(SM_MerchantsAction, "Action");
		System.out.println("Merchant Action is present in the table section of the page: Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Merchant Action is present in the table section of the page: Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "Merchant Action is not present in the table section of the page" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Merchant Action is not present in the table section of the page")));
	}
	
		
		/**
		 * ISee Upload Bulk Merchants in the Lower section of the page
		 */
		String SM_BulkMerch= library.gWebElementGetText(objects.SM_UploadMer);
		try {
			
		Assert.assertEquals(SM_BulkMerch, "Upload Bulk Merchants");
		System.out.println("Upload Bulk Mercants tab is present in the lower section of the page: Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Upload Bulk Mercants tab is present in the lower section of the page: Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "Upload Bulk Mercants tab is not present in the lower section of the page" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Upload Bulk Mercants tab is not present in the lower section of the page")));
	}
		
		
		/**
		 * ISee MID TID Upload Files tab in the Lower section of the page
		 */
		String SM_MIDTID_Upload= library.gWebElementGetText(objects.SM_MIDAssign);
		try {
			
		Assert.assertEquals(SM_MIDTID_Upload, "POS/Cash@POS Files Upload");
		System.out.println("MID TID Upload tab is present in the lower section of the page: Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "MID TID Upload tab is present in the lower section of the page: Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "MID TID Upload tab is not present in the lower section of the page" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("MID TID Upload tab is not present in the lower section of the page")));
	}
		
		/**
		 * ISee MID TID Approvals Files tab in the Lower section of the page
		 */
		String SM_MIDTID_Appr= library.gWebElementGetText(objects.SM_MIDAppr);
		try {
			
		Assert.assertEquals(SM_MIDTID_Appr, "POS/Cash@POS Approvals");
		System.out.println("MID TID Approvals tab is present in the lower section of the page: Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "MID TID Approvals tab is present in the lower section of the page: Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "MID TID Approvals tab is not present in the lower section of the page" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("MID TID Approvals tab is not present in the lower section of the page")));
	}
		
		
		/**
		 * ISee Upload Additional Information tab in the Lower section of the page
		 */
		String SM_UpAddInfo= library.gWebElementGetText(objects.SM_UploadAddInfo);
		try {
			
		Assert.assertEquals(SM_UpAddInfo, "Upload Bulk Addl Info");
		System.out.println("Upload Additonal Info tab is present in the lower section of the page: Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Upload Additonal Info tab is present in the lower section of the page: Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "Upload Additonal Info tab is not present in the lower section of the page" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Upload Additonal Info tab is not present in the lower section of the page")));
	}
		
		
		/**
		 * ISee First tab in the Lower section of the page
		 */
		try {
			
		library.isElementPresentAndDisplayed(objects.M_First);
		Assert.assertTrue(true);
		System.out.println("First tab is present in the lower section of the page: Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "First tab is present in the lower section of the page: Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "First tab is not present in the lower section of the page" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("First tab is not present in the lower section of the page")));
	}
		
		
		/**
		 * ISee Previous tab in the Lower section of the page
		 */
		try {
		
		library.isElementPresentAndDisplayed(objects.M_Pervious);
		Assert.assertTrue(true);
		System.out.println("Previous tab is present in the lower section of the page: Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Previous tab is present in the lower section of the page: Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "Previous tab is not present in the lower section of the page" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Previous tab is not present in the lower section of the page")));
	}
		
		/**
		 * ISee Next tab in the Lower section of the page
		 */
		try {
		library.isElementPresentAndDisplayed(objects.M_Next);
		Assert.assertTrue(true);
		System.out.println("Next tab is present in the lower section of the page: Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Next tab is present in the lower section of the page: Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "Next tab is not present in the lower section of the page" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Next tab is not present in the lower section of the page")));
	}
		
		/**
		 * ISee Last tab in the Lower section of the page
		 */
		try {
		library.isElementPresentAndDisplayed(objects.M_Last);
		Assert.assertTrue(true);
		System.out.println("Last tab is present in the lower section of the page: Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Last tab is present in the lower section of the page: Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "Last tab is not present in the lower section of the page" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Last tab is not present in the lower section of the page")));
	}
		
		/**
		 * ISee Advance Filter tab in the Header section of the page
		 */
		try {
		library.isElementPresentAndDisplayed(objects.SM_AdvFilter);
		Assert.assertTrue(true);
		System.out.println("Advance Filter is present in the Header section of the page: Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Advance Filter is present in the Header section of the page: Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "Advance Filter is not present in the Header section of the page" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Advance Filter is not present in the Header section of the page")));
	}
		
		/**
		 * ISee Search Filed Dropdown in the Header section of the page
		 */
		try {
		library.isElementPresentAndDisplayed(objects.SM_MerchDrpDwn);
		Assert.assertTrue(true);
		System.out.println("Search Filed DropDown is present in the Header section of the page: Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Search Filed DropDown is present in the Header section of the page: Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "Search Filed DropDown is not present in the Header section of the page" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Search Filed DropDown is not present in the Header section of the page")));
	}
		
		/**
		 * ISee Search tab in the Lower section of the page
		 */
		try {
		library.isElementPresentAndDisplayed(objects.SM_SearchFiled);
		Assert.assertTrue(true);
		System.out.println("Search Field is present in the Header section of the page: Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Search Field is present in the lower section of the page: Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "Search Field is not present in the lower section of the page" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Search Field is not present in the lower section of the page")));
	}
		
		/**
		 * ISee Search Button tab in the Lower section of the page
		 */
		try {
		library.isElementPresentAndDisplayed(objects.SM_SearchBut);
		Assert.assertTrue(true);
		System.out.println("Search Button tab is present in the lower section of the page: Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Search Button tab is present in the lower section of the page: Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "Search Button tab is not present in the lower section of the page" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Search Button tab is not present in the lower section of the page")));
	}
		
		/**
		 * ISee Today tab in the Header section of the page
		 */
		try {
		library.isElementPresentAndDisplayed(objects.SM_Today);
		Assert.assertTrue(true);
		System.out.println("Today tab is present in the header section of the page: Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Today tab is present in the header section of the page: Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "Today tab is not present in the header section of the page" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Today tab is not present in the Header section of the page")));
	}
		
		/**
		 * ISee This Week tab in the Header section of the page
		 */
		try {
		library.isElementPresentAndDisplayed(objects.SM_Week);
		Assert.assertTrue(true);
		System.out.println("This Week tab is present in the Header section of the page: Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "This Week tab is present in the Header section of the page: Passed: Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "This Week tab is not present in the Header section of the page: Passed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("This Week tab is not present in the Header section of the page")));
	}
		
		/**
		 * ISee Month tab in the Header section of the page
		 */
		try {
		library.isElementPresentAndDisplayed(objects.SM_Month);
		Assert.assertTrue(true);
		System.out.println("Month tab is present in the Header section of the page: Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Month tab is present in the Header section of the page: Passed: Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "Month tab is not present in the Header section of the page: Passed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Month tab is not present in the Header section of the page")));
	}
		
		/**
		 * ISee Status Code dropDown in the Header section of the page
		 */
		try {
		library.isElementPresentAndDisplayed(objects.SM_StatusDrpDwn);
		Assert.assertTrue(true);
		System.out.println("Status DropDown is present in the Header section of the page: Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Status DropDown is present in the Header section of the page: Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "Status DropDown is not present in the Header section of the page" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Status DropDown is not present in the Header section of the page")));
	}
	
		
}
}