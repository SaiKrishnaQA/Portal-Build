/*
 * @author Sai G
 * 
 */
package com.Portal.Panel;

import org.openqa.selenium.By;

public class SM_MyAccount_Panel {

	// My Account Slider
	public static By SM_MyAccountSlider = By.xpath(".//*[@id='myAccountSlider']/a");

	// Profile
	public static By SM_Profile = By.xpath(".//*[@id='page-wrapper']/div[3]/div/div/div/div/ul/li[1]/a");

	// My Account Header
	public static By SM_MyAccHeader = By.xpath(".//*[@id='page-wrapper']/div[2]/div[1]/h2");

	// Profile Tab
	public static By M_MerchHeader = By.xpath(".//*[@id='page-wrapper']/div[3]/div/div/div/div/ul/li[1]/a");

	// User detail in the profile tab in the MyAccount Screen
	public static By M_UserDetail = By.xpath(".//*[@id='profile']/div/div/h4");

	// User detail in the profile tab in the MyAccount Screen
	public static By M_UserEmailID = By.xpath(".//*[@id='user']/div[1]/label");

	// User detail in the profile tab in the MyAccount Screen
	public static By M_UserName = By.xpath(".//*[@id='user']/div[3]/label");

	// User detail in the profile tab in the MyAccount Screen
	public static By M_UserMob = By.xpath(".//*[@id='user']/div[5]/label");

	// User detail in the profile tab in the MyAccount Screen
	public static By M_UserISAct = By.xpath(".//*[@id='user']/div[7]/label");

	// User detail in the profile tab in the MyAccount Screen
	public static By M_UserISLOC = By.xpath(".//*[@id='user']/div[9]/label");

	// User detail in the profile tab in the MyAccount Screen
	public static By M_UserCREDate = By.xpath(".//*[@id='user']/div[11]/label");

	// Change Password
	public static By SM_ChangePwd = By.xpath(".//*[@id='page-wrapper']/div[3]/div/div/div/div/ul/li[2]/a");

	// Partner Configuration
	public static By SM_PartConfig = By.xpath(".//*[@id='page-wrapper']/div[3]/div/div/div/div/ul/li[3]/a");

	// Change password
	public static By SM_Profile_changepassword = By.xpath("//*[@id=\"settings\"]/div/div/h4");

	// Current password
	public static By SM_Profile_currentpassword = By.xpath("//*[@id=\"chPasswordForm\"]/div[1]/label");

	// New password
	public static By SM_Profile_newpassword = By.xpath("//*[@id=\"chPasswordForm\"]/div[2]/label");

	// Confirm password
	public static By SM_Profile_confirmpassword = By.xpath("//*[@id=\"chPasswordForm\"]/div[3]/label");
	
	//Partner Configuration header in the My Account Screen Partner Configuration tab
	public static By SM_PartnerConf = By.xpath(".//*[@id='partnerConfiguration']/div/div/h4");
	
	//Email Signature
	public static By SM_PartnerEmailSig = By.xpath(".//*[@id='partnerConfigurationForm']/div[1]/label");
	
	//Support Email Id in the Partner Configuration tab in MyAccount Screen
	public static By SM_PartnerSupp = By.xpath(".//*[@id='partnerConfigurationForm']/div[2]/label");

	//Support Number in the Partner Configuration tab in MyAccount Screen
	public static By SM_SuppNum = By.xpath(".//*[@id='partnerConfigurationForm']/div[3]/label");
	
	//Configure button in MyAccount Screen in Parnter Conguration tab
	public static By SM_Conf = By.xpath(".//*[@id='partnerConfigurationForm']/div[4]/input");
	
	//Ok in MyAccount Screen Partner Configuration popup
	public static By SM_OK = By.xpath("html/body/div[6]/div[7]/button[2]");	
	
	// Change Button
	public static By SM_Profile_Change = By.xpath(".//*[@id='chPasswordForm']/div[4]/input");
		
		
	// Notes
	public static By SM_Notes = By.xpath("//*[@id=\"chPasswordForm\"]/table/tbody/tr[2]/td/span[2]");

}