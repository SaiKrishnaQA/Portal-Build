/*
 * @author Sai G
 * 
 */
package com.Portal.Panel;

import org.openqa.selenium.By;

public class SM_Reports_Panel {

	//LeftPanel_Reports
	public static By FT_Reports = By.xpath(".//*[@id='header_report_link']/a");
	
	//ReportsHeader
	public static By FT_HReports = By.xpath(".//*[@id='page-wrapper']/div[2]/div[1]/h2");
	
	//ReportsHeader_Crumb
	public static By FT_HReportsCrumb = By.xpath(".//*[@id='page-wrapper']/div[2]/div[1]/ol");
	
	//SaleTransactionReport_Header
	public static By FT_HSalesTranReport = By.xpath(".//*[@id='page-wrapper']/div[3]/div/div/div[1]/div/div[1]/h5");
	
	//SalesReport_ViewButton
	public static By FT_SalesTRView = By.xpath(".//*[@id='page-wrapper']/div[3]/div/div/div[1]/div/div[2]/form/div/button");
	
	//SalesReport_View From Date Selection
	public static By SalesTRV_FrmDte = By.xpath(".//*[@id='transFromDate']");
	
	//SalesReport_View To Date Selection
	public static By SalesTRV_ToDte = By.xpath(".//*[@id='transToDate']");
	
	//Download Report
	public static By DownLoadRprt = By.xpath(".//*[@id='reportDownloadForm']/div[2]/div/div/div[4]/button");
	
	//Settlement Detail Report Header
	public static By FT_HSettlement = By.xpath(".//*[@id='page-wrapper']/div[3]/div/div/div[2]/div/div[1]/h5");
	
	//Settlement View Button
	public static By FT_SettlementView= By.xpath(".//*[@id='page-wrapper']/div[3]/div/div/div[2]/div/div[2]/form/div/button");
	
	//Selttlement Sumary Report
	public static By FT_SetSummaryReport = By.xpath(".//*[@id='page-wrapper']/div[3]/div/div/div[3]/div/div[1]/h5");
	
	//Settlement Summary View Button
	public static By FT_SetSummaryViewBut= By.xpath(".//*[@id='page-wrapper']/div[3]/div/div/div[3]/div/div[2]/form/div/button");
	
	//DateRange should not be more than 7 days text
	public static By DateRange= By.xpath("html/body/div[7]/p");
	
	//DateRange OK
	public static By DateRange_OK= By.xpath("html/body/div[7]/div[7]/button[2]");
	
	//Data Not available
	public static By DataNtAva = By.xpath("html/body/div[6]/p");
	
	//DataNtAvai_OK
	public static By DataNtAva_OK = By.xpath("html/body/div[6]/div[7]/button[2]");
	
}
