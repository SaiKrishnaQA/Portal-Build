/*
 * @author Sai G
 * 
 */
package com.Portal.Panel;

import org.openqa.selenium.By;

public class Header_Footer_Panel {

	//Header Section
	public static By SM_HeaderTitle = By.xpath(".//*[@id='page-wrapper']/div[1]/nav/ul/li[2]/span");
	
	//Logout button
	public static By SM_Logout = By.xpath(".//*[@id='page-wrapper']/div[1]/nav/ul/li[3]/a");
	
	//Footer Section
	public static By SM_Footer = By.xpath(".//*[@id='page-wrapper']/div[4]/div[2]");
	
	//Footer Payswiff 
	public static By SM_PayswiffFooter = By.xpath(".//*[@id='page-wrapper']/div[4]/div[1]/a");
}
