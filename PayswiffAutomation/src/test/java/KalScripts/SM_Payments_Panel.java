package KalScripts;
/*
 * @author Sai G
 * 
 */

import org.openqa.selenium.By;

public class SM_Payments_Panel {
	
	    //Payments Slider
		public static By SM_Paymentslider = By.xpath(".//*[@id='paymentsMenu']/a");
		
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