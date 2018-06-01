/*
 * @author Sai G
 * 
 */
package com.Portal.Panel;

import org.openqa.selenium.By;

public class Portal_MerchPage_Panel {
	
	//Merchant Header
	public static By M_MerchHeader = By.xpath(".//*[@id='page-wrapper']/div[2]/div[1]/div[1]/h2");
	
	//Merchant BreadCrumb
	public static By M_Merchantbreadcrumb = By.xpath(".//*[@id='page-wrapper']/div[2]/div[1]/div[1]/ol");
	
	// click on filter
	public static By filterele = By.xpath(".//*[@id='adv-search']/div/div/div/button");
	
	// Mid
		public static By M_Mid = By.xpath(".//*[@id='pendingKYCList']/thead/tr/th[10]");
		
		// Merchant Name
		public static By M_MerchName = By.xpath(".//*[@id='pendingKYCList']/thead/tr/th[2]");
		
		// Location
		public static By M_Location = By.xpath(".//*[@id='pendingKYCList']/thead/tr/th[3]");
		
		// Mobile Number
		public static By M_MobileNumber = By.xpath(".//*[@id='pendingKYCList']/thead/tr/th[4]");
		
		// Date
		public static By M_Date = By.xpath(".//*[@id='pendingKYCList']/thead/tr/th[5]");
		
		// Mode
		public static By M_Mode = By.xpath(".//*[@id='pendingKYCList']/thead/tr/th[6]");
		
		// NoOfDevices
		public static By M_NoofDevices = By.xpath(".//*[@id='pendingKYCList']/thead/tr/th[7]");
		
		//Installation Pending
		public static By M_InstallationPending = By.xpath(".//*[@id='pendingKYCList']/thead/tr/th[8]");
		
		//Status
		public static By M_Status = By.xpath(".//*[@id='pendingKYCList']/thead/tr/th[9]");
		
		//DemoFlag
		public static By M_DemoFlag = By.xpath(".//*[@id='pendingKYCList']/thead/tr/th[10]");
		
		// Txn Flag
		public static By M_TxnFlag = By.xpath(".//*[@id='pendingKYCList']/thead/tr/th[11]");
		
		// to check Previous is avaiable in the paging in the merchant page
		public static By M_Pervious = By.xpath(".//*[@id='merchantsList_previous']");
		
		// to check Next is avaiable in the paging in the merchant page
		public static By M_Next = By.xpath(".//*[@id='merchantsList_next']");
		
		// to check Next is avaiable in the paging in the merchant page
		public static By M_First = By.xpath(".//*[@id='merchantsList_first']");
		
		// to check Next is avaiable in the paging in the merchant page
		public static By M_Last = By.xpath(".//*[@id='merchantsList_last']");
		
		//MID TID Approvals
		public static By SM_MIDAppr = By.xpath(".//*[@id='page-wrapper']/div[2]/div[4]/div/div/div/div[2]/button[4]");
		
		//MID TID Upload
		public static By SM_MIDAssign = By.xpath(".//*[@id='page-wrapper']/div[2]/div[4]/div/div/div/div[2]/button[3]");
		
		//Upload Bulk Additional Information
		public static By SM_UploadAddInfo = By.xpath(".//*[@id='page-wrapper']/div[2]/div[4]/div/div/div/div[2]/button[2]");
		
		//upload Bulk Merchants
		public static By SM_UploadMer = By.xpath(".//*[@id='page-wrapper']/div[2]/div[4]/div/div/div/div[2]/button[1]");
		
		//Action
		public static By SM_Action = By.xpath(".//*[@id='merchantsList']/thead/tr/th[9]");
		
		//Status
		public static By SM_Status = By.xpath(".//*[@id='merchantsList']/thead/tr/th[8]");
				
		//RegDate
		public static By SM_RegDate = By.xpath(".//*[@id='merchantsList']/thead/tr/th[7]");
				
		//Partner Name	 
		public static By SM_PartnerName = By.xpath(".//*[@id='merchantsList']/thead/tr/th[6]");
				
		//Sale Type
		public static By SM_SaleType = By.xpath(".//*[@id='merchantsList']/thead/tr/th[5]");
				
		//City
		public static By SM_City = By.xpath(".//*[@id='merchantsList']/thead/tr/th[4]");
				
		//Email ID
		public static By SM_EmailID = By.xpath(".//*[@id='merchantsList']/thead/tr/th[3]");
				
		//MobileNum
		public static By SM_MobNum = By.xpath(".//*[@id='merchantsList']/thead/tr/th[2]");
				
		//Merchant Name
		public static By SM_MerchName = By.xpath(".//*[@id='merchantsList']/thead/tr/th[1]");
		
		//Mercahnt Side Bar
		public static By SM_MerchSider = By.xpath(".//*[@id='merchantsSlider']/a");
		
		//Merchant ID DrpDown
		public static By SM_MerchDrpDwn = By.xpath(".//*[@id='searchField']");
		
		//Advance Filter PopUp
		public static By SM_AdvFilter = By.xpath(".//*[@id='adv-search']/div/div/div/button");
		
		//Search Field Value
		public static By SM_SearchFiled = By.xpath(".//*[@id='searchFieldValue']");
		
		//Search Button
		public static By SM_SearchBut = By.xpath(".//*[@id='merchantDTO']/div[1]/div[3]/button");
		
		//Today 
		public static By SM_Today = By.xpath(".//*[@id='today']");
				
		//This Week
		public static By SM_Week = By.xpath(".//*[@id='thisWeek']");
				
		//Month
		public static By SM_Month = By.xpath(".//*[@id='createdMonth']");
				
		//Status Code DrpDown
		public static By SM_StatusDrpDwn = By.xpath(".//*[@id='statusCode']");
		
		//Merchant Filter DrpDown
		public static By MerchFDD = By.xpath(".//*[@id='searchField']");
		
		//Merchant DrpDown
		public static By MerchSDD = By.xpath(".//*[@id='statusCode']");
		
}
