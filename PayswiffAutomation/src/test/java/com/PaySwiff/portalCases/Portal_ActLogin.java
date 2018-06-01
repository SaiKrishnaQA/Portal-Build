package com.PaySwiff.portalCases;

import org.testng.annotations.Test;

import com.Portal.Panel.Merchants_D_Panel;
import com.payswiff.config.SeleniumNGSuite;
import com.payswiff.util.DriverUtilsImpl;
import com.payswiff.util.TestResultUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Portal_ActLogin {

	SeleniumNGSuite testSuite = new SeleniumNGSuite();
	DriverUtilsImpl library = new DriverUtilsImpl();
	Merchants_D_Panel objects = new Merchants_D_Panel();
	com.FTCash.Panel.loginpage objects1 = new com.FTCash.Panel.loginpage();

	@Test
	public void Logout() throws Exception {

		try {
			if (library.gClick(objects.AppLogout) == true) {
				System.out.println("Application logged out successfully");
				TestResultUtils.logger.log(LogStatus.PASS, "Application logged out successfully");
			}

			library.sendText(objects1.Login_UserName, testSuite.A_UName);
			library.sendText(objects1.Login_Password, testSuite.A_Pwd);

			Thread.sleep(1000);

			library.gClick(objects1.Submit);
			TestResultUtils.logger.log(LogStatus.PASS, "Application logged with Activation User");
		} catch (Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Unable to Logout the application"
					+ TestResultUtils.logger.addScreenCapture(library.takescreenshot("Logout Issue")));
		}
	}

}
