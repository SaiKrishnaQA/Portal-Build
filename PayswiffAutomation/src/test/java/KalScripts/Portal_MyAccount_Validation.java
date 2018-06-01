package KalScripts;

/*
 * @author Sai G
 * 
 */

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Portal.Panel.SM_MyAccount_Panel;
import com.payswiff.config.SeleniumNGSuite;
import com.payswiff.util.DriverUtilsImpl;
import com.payswiff.util.TestResultUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Portal_MyAccount_Validation {

	SeleniumNGSuite testSuite = new SeleniumNGSuite();
	DriverUtilsImpl library = new DriverUtilsImpl();
	SM_MyAccount_Panel objects= new SM_MyAccount_Panel();
	
	//@Test(priority= 3)
	@Test
	public void Reports() throws Exception {
		
		TestResultUtils.logger = TestResultUtils.extent.startTest("MyAccount Screen Validation");
		library.gClick(objects.SM_MyAccountSlider);
		
		/**
		 * ISee MyAccount Status Header in the Header section of the page
		 */
		try {
		library.isElementPresentAndDisplayed(objects.SM_MyAccHeader);
		Assert.assertTrue(true);
		System.out.println("MyAccount Header is present in the Header section of the page: Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "MyAccount Header is present in the Header section of the page: Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "MyAccount Header is not present in the Header section of the page" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("MyAccount Header is not present in the Header section of the page")));
	}
		
		/**
		 * ISee Profile Header in the Header section of the page
		 */
		try {
		library.isElementPresentAndDisplayed(objects.SM_Profile);
		Assert.assertTrue(true);
		System.out.println("Profile Header is present in the Header section of the page: Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Profile Header is present in the Header section of the page: Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "Profile Header is not present in the Header section of the page" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Profile Header is not present in the Header section of the page")));
	}
		
		/**
		 * ISee Change Password Status Header in the Header section of the page
		 */
		try {
		library.isElementPresentAndDisplayed(objects.SM_ChangePwd);
		Assert.assertTrue(true);
		System.out.println("Change Password Header is present in the Header section of the page: Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Change Password Header is present in the Header section of the page: Passed");
	}
		catch(Exception exception) {
		TestResultUtils.logger.log(LogStatus.FAIL, "Change Password Header is not present in the Header section of the page" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Change Password Header is not present in the Header section of the page")));
	}
		
		/**
		 * ISee Partner Configuration Status Header in the Header section of the page
		 */		
		if(library.gClick(objects.SM_PartConfig) == true) {
			System.out.println("Partner Configuration Header is present in the Header section of the page: Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Partner Configuration Header is present in the Header section of the page: Passed");
		}else {
			TestResultUtils.logger.log(LogStatus.FAIL, "Partner Configuration Header is not present in the Header section of the page" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Partner Configuration Header is not present in the Header section of the page")));
		}
		
		
		//to click on Profile in my account
		
		library.gClick(objects.SM_Profile);
		
		//to check profile is clickable or not
		String userdetailstxt = library.gWebElementGetText(objects.M_UserDetail);
		System.out.println(userdetailstxt);
		try {
			if(library.gVerifyContainsText(userdetailstxt, "User Details") ==true) {
				System.out.println("Profile is clickable in the My account Screen : Passed");
				TestResultUtils.logger.log(LogStatus.PASS, "Profile is clickable in the My account Screen : Passed");
				
			}else
			{
			System.out.println("Unable to open the popup");
			TestResultUtils.logger.log(LogStatus.FAIL, "Unable to open the popup");
			

			}
		}
		catch(Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Profile is clickable in the My account Screen" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Profile was not clickable")));
		}
		
		//to click on Changepassword in my account
		
				library.gClick(objects.SM_ChangePwd);
				
				//to check profile is clickable or not
				String changepasswordtxt = library.gWebElementGetText(objects.SM_Profile_changepassword);
				System.out.println(changepasswordtxt);
				String currentpasswordtxt = library.gWebElementGetText(objects.SM_Profile_currentpassword);
				System.out.println(currentpasswordtxt);
				String newpasswordtxt = library.gWebElementGetText(objects.SM_Profile_newpassword);
				System.out.println(newpasswordtxt);
				String confirmpasswordtxt = library.gWebElementGetText(objects.SM_Profile_confirmpassword);
				System.out.println(confirmpasswordtxt);
				String notestxt = library.gWebElementGetText(objects.SM_Notes);
				System.out.println(notestxt);
				try {
					if((library.gVerifyContainsText(changepasswordtxt, "Change Password") ==true) &&(library.gVerifyContainsText(currentpasswordtxt, "Current Password*") ==true)&&(library.gVerifyContainsText(newpasswordtxt, "New Password*") ==true)&&(library.gVerifyContainsText(confirmpasswordtxt, "Confirm Password*") ==true)&&(library.gVerifyContainsText(notestxt, "Password should contain atleast one special character,number,capital and small letter") ==true)){
						System.out.println("Change password is clickable in the myaccount Screen : Passed");
						TestResultUtils.logger.log(LogStatus.PASS, "Change password is clickable in the myaccount Screen : Passed");
						
					}else
					{
					System.out.println("Unable to open the popup");
					TestResultUtils.logger.log(LogStatus.FAIL, "Unable to open the popup");
					

					}
				}
				catch(Exception exception) {
					TestResultUtils.logger.log(LogStatus.FAIL, "Change password is clickable in the myaccount Screen" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Change password was not clickable")));
				}
		
}
}