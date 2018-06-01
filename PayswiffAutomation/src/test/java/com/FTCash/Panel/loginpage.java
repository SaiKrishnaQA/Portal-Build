/*
 * @author Sai G
 * 
 */
package com.FTCash.Panel;


import org.openqa.selenium.By;

import com.payswiff.constants.Constants;
import com.payswiff.util.PropertyUtils;

public class loginpage {

	/** The base project path. */
	public static String baseProjectPath = System.getProperty(Constants.USER_DIR);
	
	/** The repository. *//*
	public static PropertyUtils repository = new PropertyUtils(
			baseProjectPath.concat();*/
	
	
    public static By Login_UserName= By.id("j_username");
	
	public static By Login_Password=By.id("j_password");
	
	public static By Submit= By.xpath("//input[@type='submit']");
	
	  //Axis Bank Image Validation
	   public static By L_AxisImage = By.xpath(".//*[@id='side-menu']/li[1]/div[1]/span/img");
	
     //Axis 
	   public static By L_LoginUser = By.xpath(".//*[@id='side-menu']/li[1]/div[1]/a/span");
	  
	    //Axis 
		public static By L_DashBoard = By.xpath(".//*[@id='side-menu']/li[1]/div[1]/span/img");
		
		//Axis 
		public static By L_analytics = By.xpath(".//*[@id='analytics_link']/a");
		
		//Axis 
		public static By L_installation = By.xpath(".//*[@id='installationSlider']/a");
		
		//Axis 
		public static By L_ServiceReq = By.xpath(".//*[@id='header_maintenance_link']/a");
		
		//Axis 
		public static By L_ShipingRequest = By.xpath(".//*[@id='header_maintenance_link']/a");
		
		//Axis 
		public static By L_Devices = By.xpath(".//*[@id='deviceSliderMenu']/a");
		
		//Axis 
		public static By L_Inventory = By.xpath(".//*[@id='header_inventory_link']/a");
		
		//Axis 
		public static By L_Merchants = By.xpath(".//*[@id='merchantsSliderMenu']/a");
		
		//Axis 
		public static By L_Payments = By.xpath(".//*[@id='paymentsSliderMenu']/a");
		
		//Axis 
		public static By L_Assets = By.xpath(".//*[@id='side-menu']/li[11]/a");
		
		//Axis 
		public static By L_SupportTickets = By.xpath(".//*[@id='supportTicketSliderMen']/a");
		
		//Axis 
		public static By L_Reports = By.xpath(".//*[@id='header_reports_link']/a");
		
		//Axis 
		public static By L_Leads = By.xpath(".//*[@id='leadlider']/a");
		
		//threeSliderNavBar
		public static By L_hreeSliderNavBar = By.xpath(".//*[@id='page-wrapper']/div[1]/nav/div/a");
		
		//Name
		public static By D_Name = By.id("FirstNam");
		
		//Spice Money
		
		public static By SM_ImageLogo = By.xpath(".//*[@id='side-menu']/li[1]/div[1]/span/img");
		
		public static By SM_LoginUser = By.xpath(".//*[@id='side-menu']/li[1]/div[1]/a/span/span/strong");
		
		public static By SM_MyAccount = By.xpath(".//*[@id='myAccountSlider']/a");
		
		public static By SM_Merchant = By.xpath(".//*[@id='merchantsSlider']/a");
		
		public static By SM_Payments = By.xpath(".//*[@id='paymentsMenu']/a");
		
		public static By SM_Reports = By.xpath(".//*[@id='header_report_link']/a");
	
}
