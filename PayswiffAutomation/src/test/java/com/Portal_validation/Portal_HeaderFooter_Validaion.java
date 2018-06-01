/*
 * @author Sai G
 * 
 */
package com.Portal_validation;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Portal.Panel.Header_Footer_Panel;
import com.Portal.Panel.SM_MyAccount_Panel;
import com.payswiff.config.SeleniumNGSuite;
import com.payswiff.util.DriverUtilsImpl;
import com.payswiff.util.TestResultUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Portal_HeaderFooter_Validaion {


	SeleniumNGSuite testSuite = new SeleniumNGSuite();
	DriverUtilsImpl library = new DriverUtilsImpl();
	Header_Footer_Panel objects= new Header_Footer_Panel();
	
	@Test(priority= 2)
	public void Header_Footer() throws Exception {
		
		TestResultUtils.logger = TestResultUtils.extent.startTest("Header Footer Validation");
		
		/**
		 * ISee Merchant Header
		 */
		String SM_HeaderTitle= library.gWebElementGetText(objects.SM_HeaderTitle);
		try {
			
		Assert.assertEquals(SM_HeaderTitle, "Welcome to SPICE MONEY");
		System.out.println("Welcome to SPICE MONEY in the Merchants Screen : Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Welcome to SPICE MONEY in the Merchants Screen : Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "Welcome to SPICE MONEY in the Merchants Screen : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Welcome to SPICE MONEY in the Merchants Screen")));
	}
		
		/**
		 * ISee Logout Button
		 */
		try {
			
		library.isElementPresentAndDisplayed(objects.SM_Logout);
		Assert.assertTrue(true);
		System.out.println("Logout in header section of the page: Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Logout in header section of the page: Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "Logout in header section of the page" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Logout in header section of the page")));
	}
		

		/**
		 * ISee PoweredBy PaySwiff Solutions in footer section
		 */
		String SM_PPaySwifff= library.gWebElementGetText(objects.SM_Footer);
		try {
			
		Assert.assertEquals(SM_PPaySwifff, "© 2018 Powered by Payswiff Solutions Pvt. Ltd.");
		System.out.println("© 2018 Powered by Payswiff Solutions Pvt. Ltd. in the Merchants Screen : Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "© 2018 Powered by Payswiff Solutions Pvt. Ltd. in the Merchants Screen : Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "© 2018 Powered by Payswiff Solutions Pvt. Ltd. in the Merchants Screen : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("© 2018 Powered by Payswiff Solutions Pvt. Ltd. in the Merchants Screen")));
	}
		

		/**
		 * ISee Merchant Header
		 */
		String SM_FooterPaySwiff= library.gWebElementGetText(objects.SM_PayswiffFooter);
		try {
			
		Assert.assertEquals(SM_FooterPaySwiff, "www.payswiff.com");
		System.out.println("www.payswiff.com in the Merchants Screen : Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "www.payswiff.com in the Merchants Screen : Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "www.payswiff.com in the Merchants Screen : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("www.payswiff.com in the Merchants Screen")));
	}
}
}
