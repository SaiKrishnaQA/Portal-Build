/*
 * @author Sai G
 * 
 */
package com.Paynear.Portal;

import org.testng.annotations.Test;

import com.Portal.Panel.SM_Reports_Panel;
import com.payswiff.config.SeleniumNGSuite;
import com.payswiff.util.DriverUtilsImpl;
import com.payswiff.util.TestResultUtils;

public class Reports {

	SeleniumNGSuite testSuite = new SeleniumNGSuite();
	DriverUtilsImpl library = new DriverUtilsImpl();
	SM_Reports_Panel objects= new SM_Reports_Panel();
	
	@Test(priority= 6)
	public void Reports() {
		
		//Starts the logging of the report
		TestResultUtils.logger = TestResultUtils.extent.startTest("Reports Screen");
		
		try {
			
		library.gClick(objects.FT_Reports);
		System.out.println("Successfully navigated to Reports Screen");
		
		library.gWebElementGetText(objects.FT_HReports);
		
		library.gWebElementGetText(objects.FT_HReportsCrumb);
		
		library.gWebElementGetText(objects.FT_HSalesTranReport);
		library.gClick(objects.FT_SalesTRView);
		
		library.gPageReload();
		library.gWebElementGetText(objects.FT_SettlementView);
		library.gClick(objects.FT_SetSummaryViewBut);
		
		library.gPageReload();
		library.gWebElementGetText(objects.FT_SetSummaryReport);
		library.gClick(objects.FT_SetSummaryViewBut);
		
 }catch (Exception e) {
	
	System.out.println("Unable to download the report");
}
}
}
