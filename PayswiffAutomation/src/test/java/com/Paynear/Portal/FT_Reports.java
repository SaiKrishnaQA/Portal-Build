/*
 * @author Sai G
 * 
 */
package com.Paynear.Portal;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Portal.Panel.SM_Reports_Panel;
import com.payswiff.config.SeleniumNGSuite;
import com.payswiff.util.DriverUtilsImpl;
import com.payswiff.util.TestResultUtils;
import com.relevantcodes.extentreports.LogStatus;

public class FT_Reports {

	SeleniumNGSuite testSuite = new SeleniumNGSuite();
	DriverUtilsImpl library = new DriverUtilsImpl();
	SM_Reports_Panel objects= new SM_Reports_Panel();
	
	@Test(priority= 4)
	public void Reports() throws Exception {
		TestResultUtils.logger= TestResultUtils.extent.startTest("Reports");
		/**
		 * I click on Txnivation Issue Screen
		 */
		try {
			if (library.gClick(objects.FT_Reports) == true) {
				System.out.println("Reports is clicked and navigated to Reports Screen");
				TestResultUtils.logger.log(LogStatus.PASS, "Reports is clicked and navigated to Reports Screen");
			}
			else {
				TestResultUtils.logger.log(LogStatus.FAIL, "Reports was not clicked");
			}
		}
		catch (Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Reports was not clicked" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Reports was not clicked")));
		}
		
		
		/**
		 * I See Reports Header
		 */
		
		try {
		String FT_ReportsHeader= library.gWebElementGetText(objects.FT_HReports);	
		Assert.assertEquals(FT_ReportsHeader, "Reports");
		System.out.println("Reports field in the Reports Screen : Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Reports field is present in the Reports Screen : Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.PASS, "Reports field in the Reports Screen : Failed");
	}
		
		/**
		 * I See Reports Header
		 */
		
		try {
		String FT_ReportsCrumb= library.gWebElementGetText(objects.FT_HReportsCrumb);	
		Assert.assertEquals(FT_ReportsCrumb, "Home Reports");
		System.out.println("ReportsCrumb field in the Reports Screen : Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "ReportsCrumb field is present in the Reports Screen : Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.PASS, "ReportsCrumb field in the Reports Screen : Failed");
	}
		
		/**
		 * I See Reports Header
		 */
		
		try {
		String FT_SalesTranRprt= library.gWebElementGetText(objects.FT_HSalesTranReport);	
		Assert.assertEquals(FT_SalesTranRprt, "Sale Transaction Report");
		System.out.println("ReportsCrumb field in the Reports Screen : Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Sales Transaction Report field is present in the Reports Screen : Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.PASS, "Sales Transaction Report field in the Reports Screen : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Sales Transaction Report Filed was not seen")));
	}
		
		/**
		 * I click on Sales Transaction Report View Button
		 */
		try {
			if (library.gClick(objects.FT_SalesTRView) == true) {
				System.out.println("Sales Transaction Report is clicked and navigated to Sales Transaction Report Screen");
				TestResultUtils.logger.log(LogStatus.PASS, "Sales Transaction Report is clicked and navigated to Sales Transaction Reports Screen");
			}
			else {
				TestResultUtils.logger.log(LogStatus.FAIL, "Sales Transaction Report was not clicked: Failed");
			}
		}
		catch (Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Sales Transaction Report was not clicked: Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Sales Transaction Report was not clicked: Failed")));
		}
		
		/**
		 * I See Settlement Detailed Report
		 */
		
		try {
		library.gClick(objects.FT_Reports);
		String FT_SettlmetDetaildRprt= library.gWebElementGetText(objects.FT_SettlementView);	
		Assert.assertEquals(FT_SettlmetDetaildRprt, "View");
		System.out.println("Settlement Detailed Report field in the Reports Screen : Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Settlement Detailed Report field is present in the Reports Screen : Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.PASS, "Settlement Detailed Report field in the Reports Screen : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Settlement Detailed Report Filed was not seen")));
	}
		
		/**
		 * I click on Settlement Detailed Report View Button
		 */
		try {
			
			if (library.gClick(objects.FT_SetSummaryViewBut) == true) 
				System.out.println("Settlement Detailed Report View Button is clicked and navigated to Settlement Detailed Report Screen");
				TestResultUtils.logger.log(LogStatus.PASS, "Settlement Detailed Report View Button is clicked and navigated to Settlement Detailed Report Screen");			
		}
		catch (Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Settlement Detailed Report View Button was not clicked: Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Settlement Detailed Report View Button was not clicked: Failed")));
		}
		
		/**
		 * I See Settlement Summary Report
		 */
		library.gClick(objects.FT_Reports);
		String FT_SettlmetSumryRprt= library.gWebElementGetText(objects.FT_SetSummaryReport);
		try {
			
		Assert.assertEquals(FT_SettlmetSumryRprt, "Settlement Summary Report");
		System.out.println("Settlement Detailed Report in the Reports Screen : Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Settlement Summary Report field is present in the Reports Screen : Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.PASS, "Settlement Summary Report field in the Reports Screen : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Settlement Summary Report Filed was not seen")));
	}
		
		/**
		 * I click on Settlement Summary Report View Button
		 */
		try {
			
			if (library.gClick(objects.FT_SetSummaryViewBut) == true) {
				System.out.println("Settlement Summary Report View Button is clicked and navigated to Settlement Summary Report Screen");
				TestResultUtils.logger.log(LogStatus.PASS, "Settlement Summary Report View Button is clicked and navigated to Settlement Summary Report Screen");
			}
			else {
				TestResultUtils.logger.log(LogStatus.FAIL, "Settlement Summary Report View Button was not clicked: Failed");
			}
		}
		catch (Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Settlement Summary Report View Button was not clicked: Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Settlement Summary Report View Button was not clicked: Failed")));
		}
}
}
