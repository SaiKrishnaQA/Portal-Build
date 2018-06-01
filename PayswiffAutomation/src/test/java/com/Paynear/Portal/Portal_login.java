/*
 * @author Sai G
 * 
 */
package com.Paynear.Portal;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.payswiff.config.LocalDriverManager;
import com.payswiff.config.SeleniumNGSuite;
import com.payswiff.util.DriverUtilsImpl;
import com.payswiff.util.TestResultUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Portal_login {

	SeleniumNGSuite testSuite = new SeleniumNGSuite();
	DriverUtilsImpl library = new DriverUtilsImpl();
	com.Portal.Panel.loginpage objects = new com.Portal.Panel.loginpage();
	
	@BeforeTest
	public void setupSuite() throws Throwable{
		
		System.out.println("Before Suite Runs");
		
		testSuite.setUpSuite();
		
		TestResultUtils.outputFolder();
		TestResultUtils.extentReportInitialize();
		
	}
	
	@AfterTest
	public void endSuite() throws Exception{
		
		System.out.println("Ends suite");
		TestResultUtils.extentReportFlush();
	}
	
	//@Test(priority= 1)
	@Test
	public void testMethod() throws Exception{
		TestResultUtils.logger= TestResultUtils.extent.startTest(" Portal Login ");
		
		System.out.println("This class is for Login");		
		System.out.println("Before Login URL: " +library.getURL());
		library.sendText(objects.Login_UserName, testSuite.UName);
		library.sendText(objects.Login_Password, testSuite.Pwd);
		
		Thread.sleep(1000);
		
		library.gClick(objects.Submit);
		
		//validate to check weather the application logged in successfull or not
		String LoginUrl = library.getURL();
		
		System.out.println("After Login Url: " +library.getURL());
		System.out.println("Login Url" +LoginUrl);
		
		if(LoginUrl.equals("http://192.168.1.236:8765/pPortal/getInfo")) {
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully login to Portal Application");
			//TestResultUtils.logger.log(LogStatus.PASS, "Home Page" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Home Page Screen")));
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Invalid Credentials :Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Login Failed")));
		}
		
		
		/*//Page Layout Validations
		//Spice Money Image 
		try {
			if(library.isElementPresentAndDisplayed(objects.SM_ImageLogo) == true)
		//library.isElementPresentAndDisplayed(objects.D_DevicesHeader);
		//Assert.assertTrue(true);
		TestResultUtils.logger.log(LogStatus.PASS, "Portal Image is Displayed: Passed");
		}catch(Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Portal Image is not Displayed: Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Portal Image is Displayed")));
		}
		
		
		//User Name
		try {
		if(library.isElementPresentAndDisplayed(objects.SM_LoginUser) == true)
			//library.isElementPresentAndDisplayed(objects.D_DevicesHeader);
			//Assert.assertTrue(true);
			TestResultUtils.logger.log(LogStatus.PASS, "Login User is Displayed: Passed");
		}catch(Exception exception) {
				TestResultUtils.logger.log(LogStatus.FAIL, "Login User is not Displayed: Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Login User is Displayed")));
			}
		
		//MyAccount
		try {
		if(library.isElementPresentAndDisplayed(objects.SM_MyAccount) == true)
			//library.isElementPresentAndDisplayed(objects.D_DevicesHeader);
			//Assert.assertTrue(true);
			TestResultUtils.logger.log(LogStatus.PASS, "MyAccount is Displayed: Passed");
		}catch(Exception exception) {
					TestResultUtils.logger.log(LogStatus.FAIL, "MyAccount is not Displayed: Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("MyAccount is Displayed")));
					}
				
		//Merchants
		try {
		if(library.isElementPresentAndDisplayed(objects.SM_Merchant) == true)
			//library.isElementPresentAndDisplayed(objects.D_DevicesHeader);
			//Assert.assertTrue(true);
			TestResultUtils.logger.log(LogStatus.PASS, "Merchants is Displayed: Passed");
		}catch(Exception exception) {
					TestResultUtils.logger.log(LogStatus.FAIL, "Merchants is not Displayed: Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Merchants is Displayed")));
					}
				
		//Payments
		try {
		if(library.isElementPresentAndDisplayed(objects.SM_Payments) == true)
			//library.isElementPresentAndDisplayed(objects.D_DevicesHeader);
			//Assert.assertTrue(true);
			TestResultUtils.logger.log(LogStatus.PASS, "Payments is Displayed: Passed");
		}catch(Exception exception) {
					TestResultUtils.logger.log(LogStatus.FAIL, "Payments is not Displayed: Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Payments is Displayed")));
					}
				
				
		//Reports
		try {
		if(library.isElementPresentAndDisplayed(objects.SM_Reports) == true)
			//library.isElementPresentAndDisplayed(objects.D_DevicesHeader);
			//Assert.assertTrue(true);
			TestResultUtils.logger.log(LogStatus.PASS, "Reports is Displayed: Passed");
		}catch(Exception exception) {
					TestResultUtils.logger.log(LogStatus.FAIL, "Reports is not Displayed: Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Reports is Displayed")));
					}*/
				
	}
	
	@AfterMethod
	public void endReport(ITestResult result) {
		if(result.getStatus() == ITestResult.FAILURE) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Test Case Failed" +result.getName());
			TestResultUtils.logger.log(LogStatus.FAIL, "Test Case Failed" +result.getThrowable());
			
			TestResultUtils.getScreenShots(LocalDriverManager.getDriver(), result.getName());
			
		}else if(result.getStatus()== ITestResult.SKIP) {
			TestResultUtils.logger.log(LogStatus.SKIP, "Test Case Skipped" +result.getName());
		}
		TestResultUtils.extent.endTest(TestResultUtils.logger);
	}
	
	@AfterTest
	public void tearDown() {

		SeleniumNGSuite.driver.quit();
	}
}
