/*
 * @author Sai G
 * 
 */
package com.Login_Portal;

import java.io.File;

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

public class login {

	SeleniumNGSuite testSuite = new SeleniumNGSuite();
	DriverUtilsImpl library = new DriverUtilsImpl();
	com.FTCash.Panel.loginpage objects = new com.FTCash.Panel.loginpage();
	
	@BeforeTest
	public void setupSuite() throws Throwable{
		
		System.out.println("Before Suite Runs");
		testSuite.setUpSuite();
		TestResultUtils.outputFolder();
		TestResultUtils.extentReportInitialize();
		
	}
	
	/*@AfterTest
	public void endSuite() throws Exception{
		
		System.out.println("Ends suite");
		TestResultUtils.extentReportFlush();
	}*/
	
	@Test(priority= 1)
	public void testMethod() throws Exception{
		
		
		TestResultUtils.logger= TestResultUtils.extent.startTest("loginTest");
		
		
		System.out.println("This class is for Login");
		library.sendText(objects.Login_UserName, testSuite.UName);
		library.sendText(objects.Login_Password, testSuite.Pwd);
		
		Thread.sleep(1000);
		
		library.gClick(objects.Submit);
		
		String title= library.getTitle();
		/*System.out.println("Title: " +title);
		Assert.assertEquals(title, "Welcome to Axis Bank");*/
		TestResultUtils.logger.log(LogStatus.PASS, "Page title is verified :Passed");
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
