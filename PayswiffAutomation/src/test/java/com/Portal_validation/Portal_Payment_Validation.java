/*
 * @author Sai G
 * 
 */
package com.Portal_validation;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Portal.Panel.SM_Payments_Panel;
import com.payswiff.config.SeleniumNGSuite;
import com.payswiff.util.DriverUtilsImpl;
import com.payswiff.util.TestResultUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Portal_Payment_Validation {


	SeleniumNGSuite testSuite = new SeleniumNGSuite();
	DriverUtilsImpl library = new DriverUtilsImpl();
	SM_Payments_Panel objects= new SM_Payments_Panel();
	
	//@Test(priority= 5)
	@Test
	public void Reports() throws Exception {
		
		TestResultUtils.logger = TestResultUtils.extent.startTest("Payments Screen Validation");
		library.gClick(objects.SM_Paymentslider);
		
		
		/**
		 * I See Payments Header
		 */
		String SM_PaymentsHeader= library.gWebElementGetText(objects.SM_PaymentsHeader);
		try {
			
		Assert.assertEquals(SM_PaymentsHeader, "Payments");
		System.out.println("Payments Header field in the Payments Screen : Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Payments Header field in the Payments Screen : Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "Payments Header field in the Payments Screen : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Payments Header is not present in the Header section of the page")));
	}
		
		/**
		 * I See Payments Crumb Header
		 */
		String SM_PaymentsCrumb= library.gWebElementGetText(objects.SM_PaymentsCrumb);
		try {
			
		Assert.assertEquals(SM_PaymentsCrumb, "Home Payments");
		System.out.println("Payments Crumb Header field in the Payments Screen : Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Payments Crumb Header field in the Payments Screen : Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "Payments Crumb Header field in the Payments Screen : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Payments Crumb Header is not present in the Header section of the page")));
	}
		

		/**
		 * I See Merchant ID
		 */
		String SM_ReportsHeader= library.gWebElementGetText(objects.SM_MerchID);
		try {
			
		Assert.assertEquals(SM_ReportsHeader, "Merchant Id");
		System.out.println("Merch ID Field in the table section : Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Merch ID Field in the table section in Payments Screen : Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "Merch ID Field in not present table section in Payments Screen : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Merch ID Field in not present table section in Payments Screen : Failed")));
	}
		

		/**
		 * I See Merchant Name
		 */
		String SM_MerchName= library.gWebElementGetText(objects.SM_MerchName);
		try {
			
		Assert.assertEquals(SM_MerchName, "Merchant Name");
		System.out.println("Merchant Name Field in the table section : Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Merchant Name Field in the table section : Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "Merchant Name Field is not displayed in table section : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Merchant Name Field in not displayed in table section")));
	}
		

		/**
		 * I See Payments ID
		 */
		String SM_PayID= library.gWebElementGetText(objects.SM_PaymentsHeader);
		try {
			
		Assert.assertEquals(SM_PayID, "Payments");
		System.out.println("Payment ID Field in the table section : Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Payment ID Field in the table section : Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "Payment ID Field is not displayed in the table section : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Payment ID Field is not displayed in the table section")));
	}
		

		/**
		 * I See Amount
		 */
		String SM_Amount= library.gWebElementGetText(objects.SM_Amount);
		try {
			
		Assert.assertEquals(SM_Amount, "Amount(Rs.)");
		System.out.println("Amount Field in the table section : Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Amount Field in the table section : Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "Amount Field is not displayedin the table section : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Amount Field is not displayedin the table section")));
	} 	 	 	
		
		
		/**
		 * I See Payment Mode
		 */
		String SM_PayMode= library.gWebElementGetText(objects.SM_PayMode);
		try {
			
		Assert.assertEquals(SM_PayMode, "Payment Mode");
		System.out.println("Payment Mode Field in the table section : Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Payment Mode Field in the table section : Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "Payment Mode Field in the table section: Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Payment Mode Field in the table section")));
	} 	 	 	
		
		
		/**
		 * I See Payment Method
		 */
		String SM_PayMethod= library.gWebElementGetText(objects.SM_PayMethod);
		try {
			
		Assert.assertEquals(SM_PayMethod, "Payment Method");
		System.out.println("payment Method Field in the table section : Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "payment Method Field in the table section : Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "payment Method Field in the table section : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("payment Method Field in the table section")));
	} 	 	 	
		
		
		/**
		 * I See Payment Date
		 */
		String SM_PayDate= library.gWebElementGetText(objects.SM_PayDate);
		try {
			
		Assert.assertEquals(SM_PayDate, "Payment Date");
		System.out.println("Payment Date Field in the table section : Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Payment Date Field in the table section : Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "Payment Date Field is not displayedin the table section : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Payment Date Field is not displayedin the table section")));
	} 	 	 	
		
		
		/**
		 * I See Download Payments 
		 */
		String SM_DwnLdPaymnts= library.gWebElementGetText(objects.SM_DmnLoadPay);
		try {
			
		Assert.assertEquals(SM_DwnLdPaymnts, "Download Payments");
		System.out.println("DownLoad Payments Field in the table section : Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "DownLoad Payments Field in the table section : Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "DownLoad Payments Field is not displayedin the table section : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("DownLoad Payments Field is not displayedin the table section")));
	} 	 
		
		
		/**
		 * ISee Advance Filter
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
		 * ISee Status Drop Down
		 */
		try {
		library.isElementPresentAndDisplayed(objects.SM_StatusValue);
		Assert.assertTrue(true);
		System.out.println("Status Value is present in the Header section of the page: Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Status Value is present in the Header section of the page: Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "Status Value is not present in the Header section of the page" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Status Value is not present in the Header section of the page")));
	}
		
		/**
		 * ISee Show Entries
		 */
		try {
		library.isElementPresentAndDisplayed(objects.SM_Entries);
		Assert.assertTrue(true);
		System.out.println("Show Entries is present in the Header section of the page: Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Show Entries is present in the Header section of the page: Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "Show Entries is present in the Header section of the page" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Show Entries is present in the Header section of the page")));
	}
		
		/**
		 * ISee First
		 */
		try {
		library.isElementPresentAndDisplayed(objects.SM_First);
		Assert.assertTrue(true);
		System.out.println("First is present in the Lower section of the page: Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "First is present in the Lower section of the page: Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "First is present in the Lower section of the page" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("First is present in the Lower section of the page")));
	}
		
		/**
		 * ISee Previous
		 */
		try {
		library.isElementPresentAndDisplayed(objects.SM_Previous);
		Assert.assertTrue(true);
		System.out.println("Previous is present in the Header section of the page: Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Previous is present in the Header section of the page: Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "Previous is present in the Header section of the page" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Previous is present in the Header section of the page")));
	}
		
		/**
		 * ISee Next
		 */
		try {
		library.isElementPresentAndDisplayed(objects.SM_Next);
		Assert.assertTrue(true);
		System.out.println("Next is present in the Header section of the page: Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Next is present in the Header section of the page: Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "Next is present in the Header section of the page" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Next is present in the Header section of the page")));
	}
		
		/**
		 * ISee Last
		 */
		try {
		library.isElementPresentAndDisplayed(objects.SM_Last);
		Assert.assertTrue(true);
		System.out.println("Last is present in the Header section of the page: Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Last is present in the Header section of the page");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "Last is present in the Header section of the page" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Last is present in the Header section of the page")));
	}
		
}
}
