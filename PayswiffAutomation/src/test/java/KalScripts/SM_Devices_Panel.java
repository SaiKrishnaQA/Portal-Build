package KalScripts;


import org.openqa.selenium.By;

public class SM_Devices_Panel {
	 //Payments Slider
	public static By SM_Deviceslider = By.xpath("//*[@id=\"header_inventory_link\"]/a/span");
	
	//Devices Header
	public static By D_Header = By.xpath(".//*[@id='page-wrapper']/div[2]/div[1]/h2");
	
	// Device Crumb
	public static By D_DeviceCrumb = By.xpath(".//*[@id='page-wrapper']/div[2]/div[1]/ol");

	// D_AllotmntPartners
	public static By D_AllotmntPartners = By.xpath(".//*[@id='allotmentType']");

	// StatusValue
	public static By D_StatusCode = By.xpath(".//*[@id='statusCode']");

	// Custome Drop Down in the Header Section
	public static By D_CustomDD = By.xpath(".//*[@id='customField']");

	// Custom Search Filed header Scetion
	public static By D_CustomFiled = By.xpath(".//*[@id='customField1']");

	// Payment List Entries
	public static By D_GO = By.xpath(".//*[@id='assetInventryDto']/div[1]/div/div[2]/div[3]/button");

	// Show Drop Down
	public static By D_Shw = By.xpath(".//*[@id='DataTables_Table_0_length']/label");
		
	
	//Devices table "Serial Number"
	public static By D_SerialNum = By.xpath(".//*[@id='DataTables_Table_0']/thead/tr/th[1]");
	
	//Device Model Number
	public static By D_ModelNum = By.xpath(".//*[@id='DataTables_Table_0']/thead/tr/th[2]");
	
	
	//Device Allotment 
	public static By D_Allotmnt = By.xpath(".//*[@id='DataTables_Table_0']/thead/tr/th[3]");
	
	//Device MID
	public static By D_MId = By.xpath(".//*[@id='DataTables_Table_0']/thead/tr/th[4]");
		
	//Device Merchant Name
	public static By D_MerchName = By.xpath(".//*[@id='DataTables_Table_0']/thead/tr/th[5]");
		
	//Device Merchant Location
	public static By D_MerchLoc = By.xpath(".//*[@id='DataTables_Table_0']/thead/tr/th[6]");
		
	//Device Inventory Location
	public static By D_InvLoc = By.xpath(".//*[@id='DataTables_Table_0']/thead/tr/th[7]");
		
	//Device Status
	public static By D_Status = By.xpath(".//*[@id='DataTables_Table_0']/thead/tr/th[8]");
		
	//Device History
	public static By D_His = By.xpath(".//*[@id='DataTables_Table_0']/thead/tr/th[9]");
		
	//Device Last Action Date
	public static By D_LADate = By.xpath(".//*[@id='DataTables_Table_0']/thead/tr/th[10]");
		
	// Device Updated By
	public static By D_LUBy = By.xpath(".//*[@id='DataTables_Table_0']/thead/tr/th[11]");

	// Devices First
	public static By D_First = By.xpath(".//*[@id='DataTables_Table_0_first']");

	// Devices Previous
	public static By D_Previous = By.xpath(".//*[@id='DataTables_Table_0_previous']");

	// Devices Next
	public static By D_Next = By.xpath(".//*[@id='DataTables_Table_0_next']");

	// Devices Last
	public static By D_Last = By.xpath(".//*[@id='DataTables_Table_0_last']");
	
	//Payments Header
	public static By SM_PaymentsHeader = By.xpath(".//*[@id='page-wrapper']/div[2]/div[1]/div[1]/h2");
	
	//Payments Crumb
	public static By SM_PaymentsCrumb = By.xpath(".//*[@id='page-wrapper']/div[2]/div[1]/div[1]/ol");
	
	//Advance Search
	public static By SM_AdvFilter = By.xpath(".//*[@id='adv-search']/div/div/div/button");
	
	//StatusValue
	public static By SM_StatusValue = By.xpath(".//*[@id='statusValue']");
	
	//Payment List Entries
	public static By SM_Entries = By.xpath(".//*[@id='paymentsList_length']/label");
	
	//Mercahnt ID
	public static By SM_MerchID = By.xpath(".//*[@id='paymentsList']/thead/tr/th[1]");
	
	//Merchant Name
	public static By SM_MerchName = By.xpath(".//*[@id='paymentsList']/thead/tr/th[2]");
	
	//PaymentID
	public static By SM_PayID = By.xpath(".//*[@id='paymentsList']/thead/tr/th[3]");
	
	//Amount
	public static By SM_Amount = By.xpath(".//*[@id='paymentsList']/thead/tr/th[4]");
	
	//payment Mode
	public static By SM_PayMode = By.xpath(".//*[@id='paymentsList']/thead/tr/th[5]");
			
	//Payment Method
	public static By SM_PayMethod = By.xpath(".//*[@id='paymentsList']/thead/tr/th[6]");
			
	//Payment Date
	public static By SM_PayDate = By.xpath(".//*[@id='paymentsList']/thead/tr/th[7]");
			
	//DownLoad Payment
	public static By SM_DmnLoadPay = By.xpath(".//*[@id='download_payments_list_btn']");
			
	//First
	public static By SM_First = By.xpath(".//*[@id='paymentsList_first']");
			
	//Previous
	public static By SM_Previous = By.xpath(".//*[@id='paymentsList_previous']");
			
	//Next
	public static By SM_Next = By.xpath(".//*[@id='paymentsList_next']");
			
	//Last
	public static By SM_Last = By.xpath(".//*[@id='paymentsList_last']");
	
	public static By SM_Advancefilter_icon = By.xpath("//*[@id=\"adv-search\"]/div/div/div/button/i");
	
	public static By SM_adavnce_filter_txt = By.xpath("//*[@id=\"dropdown-menu1\"]/form/ul/li[1]/h5");
	
	public static By SM_filter_status_select = By.id("statusValue");
	
	public static By SM_payment_showentries = By.name("paymentsList_length");
	
	public static By SM_download_payment_button = By.xpath("//*[@id=\"download_payments_list_btn\"]");

}