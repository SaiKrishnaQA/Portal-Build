package com.FTCash.Panel;

import org.openqa.selenium.By;

public class MerchantDetails_Panel {

	
	//Left Panel Merchant_button
	public static By FT_LMerchant = By.xpath(".//*[@id='merchantsSlider']/a");
			
	//Selecting the first merchant
	public static By Frst_Mer = By.xpath(".//*[@id='merchantsList']/tbody/tr[1]/td[1]/a");
		
	//Click on Services tab
	public static By Services = By.xpath(".//*[@id='headingTwo']/h4/a");
	
	//Click on Services tab
	public static By Subsptns = By.xpath(".//*[@id='merchantUsers']/h4/a");
	
	//Click on Services tab
	public static By Gateways = By.xpath(".//*[@id='headingGateways']/h4/a");
	
	//posMID TID
	public static By POSMID = By.xpath(".//*[@id='headingFour']/h4/a");
	
	//Header_Devices
	//public static By FT_HeadDevices = By.xpath(".//*[@id='headingTerminal']/h4/a");
	public static By FT_HeadDevices = By.xpath("//a[contains(@href,'#terminals')]");
	
	//Header_terminal
	//public static By FT_HeadDevices = By.xpath(".//*[@id='headingTerminal']/h4/a");
	public static By FT_Headterminal = By.xpath("//a[contains(@href,'#terminalsMapping')]");
	
	//WebHook tab
	public static By WebHook = By.xpath(".//*[@id='accordion']/div[12]/div[1]/h4/a");
	
	//Create WebHook
	public static By CreWH = By.xpath(".//*[@id='webhookList']/button");
	
	//WebHook URL
	public static By WebHookURL = By.xpath(".//*[@id='url']");
	
	//Create WHook
	public static By CreWHBtn = By.xpath(".//*[@id='merchantWebhookForm']/div[3]/div/input");
	
	//Create Successful PopUp
	public static By SuccessWH = By.xpath("html/body/div[6]/p");
	
	//Success OK Button
	public static By SuccessOK = By.xpath("html/body/div[6]/div[7]/button[2]");
	
	
}
