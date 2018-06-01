package com.Paynear.Portal;

import org.testng.annotations.Test;

import com.Portal.Panel.SM_Reports_Panel;
import com.payswiff.config.SeleniumNGSuite;
import com.payswiff.util.DriverUtilsImpl;
import com.payswiff.util.TestResultUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Portal_Reports {

	SeleniumNGSuite testSuite = new SeleniumNGSuite();
	DriverUtilsImpl library = new DriverUtilsImpl();
	SM_Reports_Panel objects= new SM_Reports_Panel();

	@Test(priority= 9)
	public void FT_MIDUpload() throws Exception {

		TestResultUtils.logger= TestResultUtils.extent.startTest("MID & TID Assign to merchants");

		/**
		 * I click Reports tab 
		 */
		try {
			if(library.gClick(objects.FT_Reports) == true) 

				System.out.println("Successfully navigated to Reports Screen : Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully navigated to Reports Screen : Passed");
		}catch(Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL, "navigated to Reports Screen: Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("navigated to Reports Screen")));

		}
		
		/**
		 * I click Reports tab 
		 */
		try {
			if(library.gClick(objects.FT_SalesTRView) == true) 

				System.out.println("Successfully navigated to Sales Transaction Report Screen : Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully navigated to Sales Transaction Report Screen : Passed");
		}catch(Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL, "navigated to Sales Transaction Report Screen: Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("navigated to Sales Transaction Report Screen")));

		}
		
		/**
		 * I enter From Date
		 */
		try {
			if(library.sendText(objects.SalesTRV_FrmDte, "10/04/2018") == true) 

				System.out.println("Successfully entered the From Date in the field : Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully entered the From Date in the field : Passed");
		}catch(Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully entered the From Date in the field: Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully entered the From Date in the field")));

		}
		
		/**
		 * I enter To Date
		 */
		try {
			if(library.sendText(objects.SalesTRV_ToDte, "10/04/2018") == true) 

				System.out.println("Successfully entered the To Date in the field : Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully entered the To Date in the field : Passed");
		}catch(Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully entered the To Date in the field: Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully entered the To Date in the field")));

		}
		
		/**
		 * I click Download Report button 
		 */
		try {
			library.gClick(objects.DownLoadRprt);
			String STR_Text1= library.gWebElementGetText(objects.DateRange);
			//String STR_Text2= library.gWebElementGetText(objects.DataNtAva);
			
			//if(library.gVerifyContainsText(STR_Text1, "Data Not Available")) {
			if(library.gVerifyContainsText(STR_Text1, "Data Not Available")) {
				
				System.out.println("Date Range should be with in 7 days");
				TestResultUtils.logger.log(LogStatus.FAIL, "Date range should be in between 7 days : Passed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Date range should be in between 7 days")));
			
			}/*else if (library.gVerifyContainsText(STR_Text2, "")) {
				System.out.println("Data Not Available");
				TestResultUtils.logger.log(LogStatus.PASS, "Data Not Available: Passed");
			}*/else {
				System.out.println("Downloaded the Report");
				TestResultUtils.logger.log(LogStatus.PASS, "Downloaded the Report: Passed");
			}
		}catch(Exception exception) {
			System.out.println("Unable to Download the Report");
			TestResultUtils.logger.log(LogStatus.FAIL, "Unable to Download the Sales Transaction Report: Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Unable to download the Sales Transaction Report")));
		}
		
		library.gClick(objects.DataNtAva_OK);

	}
}