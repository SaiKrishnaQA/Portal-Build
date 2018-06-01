/*
 * @author Sai G
 * 
 */
package com.Portal_validation;

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
	SM_MyAccount_Panel objects = new SM_MyAccount_Panel();

	@Test
	public void MyAccount_UI() throws Exception {

		TestResultUtils.logger = TestResultUtils.extent.startTest("MyAccount Screen UI Validation");

		/**
		 * I click on My Account tab from left panel in the main screen
		 */
		/*
		 * if (library.gClick(objects.SM_MyAccountSlider) == true) {
		 * System.out.println("Clicked on MyAccount tab");
		 * TestResultUtils.logger.log(LogStatus.PASS, "Clicked on MyAccount tab"); }
		 * else { TestResultUtils.logger.log(LogStatus.FAIL, "Unable to click MyAccount"
		 * + TestResultUtils.logger
		 * .addScreenCapture(library.takescreenshot("MyAccount tab in Main Screen"))); }
		 */

		/**
		 * I See MyAccount header in MyAccount Screen
		 */
		try {
			String MyAccount = library.gWebElementGetText(objects.SM_MyAccHeader);

			if (library.gVerifyContainsText(MyAccount, "My Account")) {
				System.out.println("MyAccount Header is present in the Header section of the page: Passed");
				TestResultUtils.logger.log(LogStatus.PASS,
						"MyAccount Header is present in the Header section of the page: Passed");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL,
						"MyAccount Header is not present in the Header section of the page"
								+ TestResultUtils.logger.addScreenCapture(library.takescreenshot(
										"MyAccount Header is not present in the Header section of the page")));
			}
		} catch (Exception e) {
			System.out.println("MyAccount Header is not present in the Header section of the page");
			TestResultUtils.logger.log(LogStatus.FAIL,
					"MyAccount Header is not present in the Header section of the page"
							+ TestResultUtils.logger.addScreenCapture(library.takescreenshot(
									"MyAccount Header is not present in the Header section of the page")));
		}

		/**
		 * ISee Profile tab in the MyAccount Screen
		 */

		/*
		 * if (library.gClick(objects.SM_Profile) == true) {
		 * System.out.println("Profile tab is displayed and clickable");
		 * TestResultUtils.logger.log(LogStatus.PASS,
		 * "Profile tab is displayed and clickable"); } else {
		 * TestResultUtils.logger.log(LogStatus.FAIL,
		 * "No tab saying Profile in the MyAccount Screen" + TestResultUtils.logger
		 * .addScreenCapture(library.takescreenshot("Profile tab in MyAccount Screen")))
		 * ; }
		 */

		/**
		 * ISee User Details in the Profile tab in the MyAccount Screen
		 */

		try {
			String UserDet = library.gWebElementGetText(objects.M_UserDetail);
			if (library.gVerifyContainsText(UserDet, "User Details")) {
				System.out.println("UserDetail Header is present in the Profile Section of MyAccount Screen");
				TestResultUtils.logger.log(LogStatus.PASS,
						"UserDetail Header is present in the Profile Section of MyAccount Screen");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL, "No Header saying User Details in MyAccount Screen"
						+ TestResultUtils.logger.addScreenCapture(library.takescreenshot("MyAccount Profile Screen")));
			}
		} catch (Exception e) {
			TestResultUtils.logger.log(LogStatus.FAIL, "No Header saying User Details in MyAccount Screen"
					+ TestResultUtils.logger.addScreenCapture(library.takescreenshot("MyAccount Profile Screen")));
		}

		/**
		 * ISee User Details in the Profile tab in the MyAccount Screen
		 */
		try {

			String UserEmail = library.gWebElementGetText(objects.M_UserEmailID);
			if (library.gVerifyContainsText(UserEmail, "Email Id")) {
				System.out.println("Email Id Filed is present in the Profile Section of MyAccount Screen");
				TestResultUtils.logger.log(LogStatus.PASS,
						"Email Id Filed is present in the Profile Section of MyAccount Screen");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL, "No Filed saying Email Id in MyAccount Screen"
						+ TestResultUtils.logger.addScreenCapture(library.takescreenshot("MyAccount Profile Screen")));
			}
		} catch (Exception e) {
			TestResultUtils.logger.log(LogStatus.FAIL, "No Filed saying Email Id in MyAccount Screen"
					+ TestResultUtils.logger.addScreenCapture(library.takescreenshot("MyAccount Profile Screen")));
		}

		/**
		 * ISee Name Filed in the Profile tab in the MyAccount Screen
		 */
		try {

			String UserName = library.gWebElementGetText(objects.M_UserName);
			if (library.gVerifyContainsText(UserName, "Name")) {
				System.out.println("UserName Filed is present in the Profile Section of MyAccount Screen");
				TestResultUtils.logger.log(LogStatus.PASS,
						"UserName Filed is present in the Profile Section of MyAccount Screen");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL, "No Header saying User Name in MyAccount Screen"
						+ TestResultUtils.logger.addScreenCapture(library.takescreenshot("MyAccount Profile Screen")));
			}
		} catch (Exception e) {
			TestResultUtils.logger.log(LogStatus.FAIL, "No Header saying User Name in MyAccount Screen"
					+ TestResultUtils.logger.addScreenCapture(library.takescreenshot("MyAccount Profile Screen")));
		}

		/**
		 * ISee Mobile Number in the Profile tab in the MyAccount Screen
		 */
		try {
			String UserMob = library.gWebElementGetText(objects.M_UserMob);
			if (library.gVerifyContainsText(UserMob, "Mobile Number")) {
				System.out.println("Mobile Number field is present in the Profile Section of MyAccount Screen");
				TestResultUtils.logger.log(LogStatus.PASS,
						"Mobile Number field is present in the Profile Section of MyAccount Screen");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL, "No Header saying Mobile Number in MyAccount Screen"
						+ TestResultUtils.logger.addScreenCapture(library.takescreenshot("MyAccount Profile Screen")));
			}
		} catch (Exception e) {
			TestResultUtils.logger.log(LogStatus.FAIL, "No Header saying Mobile Number in MyAccount Screen"
					+ TestResultUtils.logger.addScreenCapture(library.takescreenshot("MyAccount Profile Screen")));
		}

		/**
		 * ISee User IS Active in the Profile tab in the MyAccount Screen
		 */
		try {
			String UserIsAct = library.gWebElementGetText(objects.M_UserISAct);
			if (library.gVerifyContainsText(UserIsAct, "Is Active")) {
				System.out.println("Is Active is present in the Profile Section of MyAccount Screen");
				TestResultUtils.logger.log(LogStatus.PASS,
						"Is Active is present in the Profile Section of MyAccount Screen");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL, "No Header saying Is Active in MyAccount Screen"
						+ TestResultUtils.logger.addScreenCapture(library.takescreenshot("MyAccount Profile Screen")));
			}
		} catch (Exception e) {
			TestResultUtils.logger.log(LogStatus.FAIL, "No Header saying Is Active in MyAccount Screen"
					+ TestResultUtils.logger.addScreenCapture(library.takescreenshot("MyAccount Profile Screen")));
		}

		/**
		 * ISee Is Locked in the Profile tab in the MyAccount Screen
		 */

		String UserIsLoc = library.gWebElementGetText(objects.M_UserISLOC);
		if (library.gVerifyContainsText(UserIsLoc, "Is Locked")) {
			System.out.println("Is Locked is present in the Profile Section of MyAccount Screen");
			TestResultUtils.logger.log(LogStatus.PASS,
					"Is Locked is present in the Profile Section of MyAccount Screen");
		} else {
			TestResultUtils.logger.log(LogStatus.FAIL, "No Header saying Is Locked in MyAccount Screen"
					+ TestResultUtils.logger.addScreenCapture(library.takescreenshot("MyAccount Profile Screen")));
		}

		/**
		 * ISee Created Date in the Profile tab in the MyAccount Screen
		 */

		try {
			String UserCreDate = library.gWebElementGetText(objects.M_UserCREDate);
			if (library.gVerifyContainsText(UserCreDate, "Created Date")) {
				System.out.println("Created Date is present in the Profile Section of MyAccount Screen");
				TestResultUtils.logger.log(LogStatus.PASS,
						"Created Date is present in the Profile Section of MyAccount Screen");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL, "No Header saying Created Date in MyAccount Screen"
						+ TestResultUtils.logger.addScreenCapture(library.takescreenshot("MyAccount Profile Screen")));
			}
		} catch (Exception e) {
			TestResultUtils.logger.log(LogStatus.FAIL, "No Header saying Created Date in MyAccount Screen"
					+ TestResultUtils.logger.addScreenCapture(library.takescreenshot("MyAccount Profile Screen")));
		}

		/**
		 * ISee Change Password in the Profile tab in the MyAccount Screen
		 */

		try {
			if (library.gClick(objects.SM_ChangePwd) == true) {
				System.out.println("Change Password tab in MyAccount Screen");
				TestResultUtils.logger.log(LogStatus.PASS, "Change Password tab in MyAccount Screen");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL,
						"No tab saying Change Password in MyAccount Screen" + TestResultUtils.logger
								.addScreenCapture(library.takescreenshot("MyAccount Change Password Screen")));
			}

		} catch (Exception e) {
			TestResultUtils.logger.log(LogStatus.FAIL,
					"No tab saying Change Password in MyAccount Screen" + TestResultUtils.logger
							.addScreenCapture(library.takescreenshot("MyAccount Change Password Screen")));
		}
		/**
		 * ISee Change Password in the Change Password tab in the MyAccount Screen
		 */

		try {
			String UserChngPwdHeadr = library.gWebElementGetText(objects.SM_Profile_changepassword);
			if (library.gVerifyContainsText(UserChngPwdHeadr, "Change Password")) {
				System.out.println("Change Password is present in the Change Password Section of MyAccount Screen");
				TestResultUtils.logger.log(LogStatus.PASS,
						"Change Password is present in the Change Password Section of MyAccount Screen");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL,
						"No Header saying Change Password in MyAccount Screen Change Password tab"
								+ TestResultUtils.logger
										.addScreenCapture(library.takescreenshot("MyAccount ChangePassword Screen")));
			}
		} catch (Exception e) {
			TestResultUtils.logger.log(LogStatus.FAIL,
					"No Header saying Change Password in MyAccount Screen Change Password tab" + TestResultUtils.logger
							.addScreenCapture(library.takescreenshot("MyAccount ChangePassword Screen")));
		}

		/**
		 * ISee Current Password in the Change Password tab in the MyAccount Screen
		 */

		try {
			String UserCurntPwd = library.gWebElementGetText(objects.SM_Profile_currentpassword);
			if (library.gVerifyContainsText(UserCurntPwd, "Current Password*")) {
				System.out.println("Current Password is present in the Change Password Section of MyAccount Screen");
				TestResultUtils.logger.log(LogStatus.PASS,
						"Current Password is present in the Change Password Section of MyAccount Screen");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL,
						"No Field saying Current Password in MyAccount Screen Change Password tab"
								+ TestResultUtils.logger
										.addScreenCapture(library.takescreenshot("MyAccount ChangePassword Screen")));
			}
		} catch (Exception e) {
			TestResultUtils.logger.log(LogStatus.FAIL,
					"No Field saying Current Password in MyAccount Screen Change Password tab" + TestResultUtils.logger
							.addScreenCapture(library.takescreenshot("MyAccount ChangePassword Screen")));
		}

		/**
		 * ISee New Password in the Change Password tab in the MyAccount Screen
		 */

		try {
			String UserNewPwd = library.gWebElementGetText(objects.SM_Profile_newpassword);
			if (library.gVerifyContainsText(UserNewPwd, "New Password*")) {
				System.out.println("New Password is present in the Change Password Section of MyAccount Screen");
				TestResultUtils.logger.log(LogStatus.PASS,
						"New Password is present in the Change Password Section of MyAccount Screen");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL,
						"No Field saying New Password in MyAccount Screen Change Password tab" + TestResultUtils.logger
								.addScreenCapture(library.takescreenshot("MyAccount ChangePassword Screen")));
			}
		} catch (Exception e) {
			TestResultUtils.logger.log(LogStatus.FAIL,
					"No Field saying New Password in MyAccount Screen Change Password tab" + TestResultUtils.logger
							.addScreenCapture(library.takescreenshot("MyAccount ChangePassword Screen")));
		}

		/**
		 * ISee Confirm Password in the Change Password tab in the MyAccount Screen
		 */

		try {
			String UserConfPwd = library.gWebElementGetText(objects.SM_Profile_confirmpassword);
			if (library.gVerifyContainsText(UserConfPwd, "Confirm Password*")) {
				System.out.println("Confirm Password is present in the Change Password Section of MyAccount Screen");
				TestResultUtils.logger.log(LogStatus.PASS,
						"Confirm Password is present in the Change Password Section of MyAccount Screen");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL,
						"No Field saying Confirm Password in MyAccount Screen Change Password tab"
								+ TestResultUtils.logger
										.addScreenCapture(library.takescreenshot("MyAccount ChangePassword Screen")));
			}
		} catch (Exception e) {
			TestResultUtils.logger.log(LogStatus.FAIL,
					"No Field saying Confirm Password in MyAccount Screen Change Password tab" + TestResultUtils.logger
							.addScreenCapture(library.takescreenshot("MyAccount ChangePassword Screen")));
		}

		/**
		 * ISee New Password in the Change Password tab in the MyAccount Screen
		 */

		try {
			if (library.gClick(objects.SM_Profile_Change) == true) {
				System.out.println("Change Button is displayed and clickable in the MyAccount Screen");
				TestResultUtils.logger.log(LogStatus.PASS,
						"Change Button is displayed and clickable in the MyAccount Screen");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL,
						"No button saying Change in MyAccount Screen Change Password tab" + TestResultUtils.logger
								.addScreenCapture(library.takescreenshot("MyAccount ChangePassword Screen")));
			}
		} catch (Exception e) {
			TestResultUtils.logger.log(LogStatus.FAIL,
					"No button saying Change in MyAccount Screen Change Password tab" + TestResultUtils.logger
							.addScreenCapture(library.takescreenshot("MyAccount ChangePassword Screen")));
		}

		/**
		 * ISee Partner Configuration in the MyAccount Screen
		 */

		try {
			if (library.gClick(objects.SM_PartConfig) == true) {
				System.out.println("Partner Configuration tab in the MyAccount Screen");
				TestResultUtils.logger.log(LogStatus.PASS, "Partner Configuration tab in the MyAccount Screen");
			} else {
				System.out.println("Partner Configuration tab in the MyAccount Screen");
				TestResultUtils.logger.log(LogStatus.FAIL,
						"No tab saying Partner Configuration in MyAccount Screen" + TestResultUtils.logger
								.addScreenCapture(library.takescreenshot("MyAccount Partner Configuration Screen")));
			}
		} catch (Exception e) {
			System.out.println("No tab saying Partner Configuration in MyAccount Screen");
			TestResultUtils.logger.log(LogStatus.FAIL,
					"No tab saying Partner Configuration in MyAccount Screen" + TestResultUtils.logger
							.addScreenCapture(library.takescreenshot("MyAccount Partner Configuration Screen")));
		}

		/**
		 * ISee Partner Configuration Header in the MyAccount Screen
		 */

		try {
			String UserPartCnf = library.gWebElementGetText(objects.SM_PartnerConf);
			if (library.gVerifyContainsText(UserPartCnf, "Partner Configuration")) {
				System.out.println(
						"Partner Configuration tab is present in the Partner Configuration tab of MyAccount Screen");
				TestResultUtils.logger.log(LogStatus.PASS,
						"Partner Configuration tab is present in the Partner Configuration tab of MyAccount Screen");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL,
						"No Header saying Partner Configuration in MyAccount Screen Partner Configuration tab"
								+ TestResultUtils.logger.addScreenCapture(
										library.takescreenshot("MyAccount Partner Configuration Screen")));
			}
		} catch (Exception e) {
			TestResultUtils.logger.log(LogStatus.FAIL,
					"No Header saying Partner Configuration in MyAccount Screen Partner Configuration tab"
							+ TestResultUtils.logger.addScreenCapture(
									library.takescreenshot("MyAccount Partner Configuration Screen")));
		}

		/**
		 * ISee Email Signature in Partner Configuration tab in the MyAccount Screen
		 */

		String UserEmailSig = library.gWebElementGetText(objects.SM_PartnerEmailSig);
		if (library.gVerifyContainsText(UserEmailSig, "Email Signature*")) {
			System.out.println("Email Signature filed is present in the Partner Configuration of MyAccount Screen");
			TestResultUtils.logger.log(LogStatus.PASS,
					"Email Signature filed is present in the Partner Configuration of MyAccount Screen");
		} else {
			TestResultUtils.logger.log(LogStatus.FAIL,
					"No filed saying Email Signature in Partner Configuration of MyAccount Screen"
							+ TestResultUtils.logger.addScreenCapture(
									library.takescreenshot("MyAccount Partner Configuration Screen")));
		}

		/**
		 * ISee Support Email Id in Partner Configuration tab in the MyAccount Screen
		 */

		try {
			String UserSupEmail = library.gWebElementGetText(objects.SM_PartnerSupp);
			if (library.gVerifyContainsText(UserSupEmail, "Support EmailId*")) {
				System.out
						.println("Support Email Id filed is present in the Partner Configuration of MyAccount Screen");
				TestResultUtils.logger.log(LogStatus.PASS,
						"Support Email Id filed is present in the Partner Configuration of MyAccount Screen");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL,
						"No filed saying Support Email Id in Partner Configuration of MyAccount Screen"
								+ TestResultUtils.logger.addScreenCapture(
										library.takescreenshot("MyAccount Partner Configuration Screen")));
			}
		} catch (Exception e) {
			TestResultUtils.logger.log(LogStatus.FAIL,
					"No filed saying Support Email Id in Partner Configuration of MyAccount Screen"
							+ TestResultUtils.logger.addScreenCapture(
									library.takescreenshot("MyAccount Partner Configuration Screen")));
		}

		/**
		 * ISee Support Number in Partner Configuration tab in the MyAccount Screen
		 */

		try {
			String UserSuppNum = library.gWebElementGetText(objects.SM_SuppNum);
			if (library.gVerifyContainsText(UserSuppNum, "Support No*")) {
				System.out.println("Support No filed is present in the Partner Configuration of MyAccount Screen");
				TestResultUtils.logger.log(LogStatus.PASS,
						"Support No filed is present in the Partner Configuration of MyAccount Screen");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL,
						"No filed saying Support Number in Partner Configuration of MyAccount Screen"
								+ TestResultUtils.logger.addScreenCapture(
										library.takescreenshot("MyAccount Partner Configuration Screen")));
			}
		} catch (Exception e) {
			TestResultUtils.logger.log(LogStatus.FAIL,
					"No filed saying Support Number in Partner Configuration of MyAccount Screen"
							+ TestResultUtils.logger.addScreenCapture(
									library.takescreenshot("MyAccount Partner Configuration Screen")));
		}

		/**
		 * ISee Configure Button in the Change Password tab in the MyAccount Screen
		 */

		try {
			if (library.gClick(objects.SM_Conf) == true) {
				System.out.println("Configure Button is displayed and clickable in the MyAccount Screen");
				TestResultUtils.logger.log(LogStatus.PASS,
						"Configure Button is displayed and clickable in the MyAccount Screen");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL,
						"No button saying Configure in MyAccount Screen Partner Configuration tab"
								+ TestResultUtils.logger.addScreenCapture(
										library.takescreenshot("MyAccount Partner Configuration Screen")));
			}
		} catch (Exception e) {
			TestResultUtils.logger.log(LogStatus.FAIL,
					"No button saying Configure in MyAccount Screen Partner Configuration tab" + TestResultUtils.logger
							.addScreenCapture(library.takescreenshot("MyAccount Partner Configuration Screen")));
		}

		/**
		 * ISee Configure Button in the Change Password tab in the MyAccount Screen
		 */

		try {
			if (library.gClick(objects.SM_OK) == true) {
				System.out.println("Configure Button is displayed and clickable in the MyAccount Screen");

			} else {

			}
		} catch (Exception e) {
			System.out.println("No Confirmation PopUp");
		}

	}
}
