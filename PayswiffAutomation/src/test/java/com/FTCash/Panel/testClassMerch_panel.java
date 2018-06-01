/*
 * @author Sai G
 * 
 */
package com.FTCash.Panel;

import org.openqa.selenium.By;

public class testClassMerch_panel {

	//Left Panel Merchant_button
	public static By FT_LMerchant = By.xpath(".//*[@id='merchantsSlider']/a/span");
		
	//Selecting the first merchant
	public static By Frst_Mer = By.xpath(".//*[@id='merchantsList']/tbody/tr[1]/td[1]/a");
	
	//First Merchant ID
	public static By Frst_MerID = By.xpath(".//*[@id='page-wrapper']/div[2]/div[2]/div/div[2]/div[1]/div[1]/div/strong");
	
	//Documents tab in the merchant detail page
	  public static By Merch_Doc = By.xpath(".//*[@id='accordion']/div[2]/div[1]/h4/a");
	
	//Documents tab in the merchant detail page
	  public static By Doc = By.xpath(".//*[@id='documentCreateForm']/div[5]/div/div/div");
	  
	//Actions button
	  public static By CreateDoc = By.xpath(".//*[@id='documents']/div/div[1]/button");
	  
	  //Upload Document
	  public static By DocType = By.xpath(".//*[@id='documentTypeId']");
	  
	  //Upload Document select field
	  public static By DocSpec = By.xpath(".//*[@id='documentSpecificationId']"); 
	  
	  //Click on submit on Document popup
	  public static By DocSub = By.xpath(".//*[@id='documentCreateForm']/div[7]/div/button"); 
	  
	  //UsersAct
	  public static By userAct= By.xpath(".//*[@id='DataTables_Table_3']/tbody/tr/td[7]/div/button");
	  
	//Click on Users tab
	  public static By Users = By.xpath("//a[contains(@href, '#usersTab')]");
	  
	  
	  public static By UsersHis = By.xpath(".//*[@id='DataTables_Table_3']/tbody/tr/td[7]/div/ul/li/a");
	  
	  public static By UserCIcon = By.xpath(".//*[@id='userHistoryPop']/div/div/div[1]/button");
		
}
