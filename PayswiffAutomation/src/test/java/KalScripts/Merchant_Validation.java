package KalScripts;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Portal.Panel.Portal_MerchPage_Panel;
import com.Portal.Panel.loginpage;
import com.payswiff.config.SeleniumNGSuite;
import com.payswiff.util.DriverUtilsImpl;
import com.payswiff.util.TestResultUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Merchant_Validation {

	SeleniumNGSuite testSuite = new SeleniumNGSuite();
	DriverUtilsImpl library = new DriverUtilsImpl();
	Portal_MerchPage_Panel objects = new Portal_MerchPage_Panel();
	loginpage objects1 = new loginpage();

	// @Test(priority= 4)
	@Test
	public void MerchantPage_Validation() throws Exception {

		TestResultUtils.logger = TestResultUtils.extent.startTest("MerchantPage Validation");

		/**
		 * IClick on Merchant tab
		 */
		try {
			if (library.gClick(objects.SM_MerchSider) == true) {
				System.out.println("Merchant Screen");
				TestResultUtils.logger.log(LogStatus.PASS, "Navigated to Merchant Screen");
			} else {
				System.out.println("No Merchant Tab in the screen");
				TestResultUtils.logger.log(LogStatus.FAIL, "No Merchant Tab in the screen"
						+ TestResultUtils.logger.addScreenCapture(library.takescreenshot("Merchant Screen")));
			}
		} catch (Exception e) {
			System.out.println("No Merchant Tab in the screen");
			TestResultUtils.logger.log(LogStatus.FAIL, "No Merchant Tab in the screen"
					+ TestResultUtils.logger.addScreenCapture(library.takescreenshot("Merchant Screen")));
		}

		/**
		 * ISee Merchant Header
		 */

		try {
			String SM_MerchantsHeader = library.gWebElementGetText(objects.M_MerchHeader);

			if (library.gVerifyContainsText(SM_MerchantsHeader, "Merchants")) {
				System.out.println("Merchants Header is present in the Merchants Screen : Passed");
				TestResultUtils.logger.log(LogStatus.PASS,
						"Merchants Header is present in the Merchants Screen : Passed");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL,
						"Merchants Header is not present in the Merchants Screen" + TestResultUtils.logger
								.addScreenCapture(library.takescreenshot("Merchants Header was not displayed")));
			}
		} catch (Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL,
					"Merchants Header is not present in the Merchants Screen" + TestResultUtils.logger
							.addScreenCapture(library.takescreenshot("Merchants Header was not displayed")));
		}

		/**
		 * ISee Merchant Header Crumb
		 */

		try {
			String SM_MerchantsHeaderCrumb = library.gWebElementGetText(objects.M_Merchantbreadcrumb);

			if (library.gVerifyContainsText(SM_MerchantsHeaderCrumb, "Home Merchants")) {
				System.out.println("Merchants Header Crumb is present in the Merchants Screen : Passed");
				TestResultUtils.logger.log(LogStatus.PASS,
						"Merchants Header breadcrumb is present in the Merchants Screen : Passed");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL,
						"Merchants Header breadcrumb is not present in the Merchants Screen" + TestResultUtils.logger
								.addScreenCapture(library.takescreenshot("Merchants Header Crumb was not displayed")));
			}
		} catch (Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL,
					"Merchants Header breadcrumb is not present in the Merchants Screen" + TestResultUtils.logger
							.addScreenCapture(library.takescreenshot("Merchants Header Crumb was not displayed")));
		}

		/**
		 * ISee Merchant Filter DropDown and Status
		 */
		try {
			if (library.gClick(objects.MerchFDD) == true) {
				System.out.println("Clicked on Merchant DropdDown");
			} else {
				System.out.println("Unable to click Merchant Drop Down");
			}

			Collection<String> MerchantFilterList = Arrays.asList("Merchant ID", "Merchant Name", "Email ID",
					"Contact No");
			List<WebElement> Merchant_LOV = library.gGetAllOptions(objects.MerchFDD);

			boolean iscontains = true;
			for (int i = 0; i < Merchant_LOV.size(); i++) {
				String MList1 = Merchant_LOV.get(i).getText();
				if (!MerchantFilterList.contains(MList1)) {
					iscontains = false;
					break;
				}
			}
			if (iscontains == true)
				TestResultUtils.logger.log(LogStatus.PASS, "Merchant Filter List : Passed");
			else
				TestResultUtils.logger.log(LogStatus.FAIL, "Merchant Filter List: Failed"
						+ TestResultUtils.logger.addScreenCapture(library.takescreenshot("Merchant Filter List")));
		} catch (Exception e) {
			TestResultUtils.logger.log(LogStatus.FAIL, "No Merchant DropDown to click"
					+ TestResultUtils.logger.addScreenCapture(library.takescreenshot("Merchant Filter List")));
		}

		/**
		 * ISee Merchant Status DropDown
		 */
		try {

			if (library.gClick(objects.MerchSDD) == true) {
				System.out.println("Clicked on Merchant Status DropDown");
			} else {
				System.out.println("Unable to click on Merchant Status Drop Down");
			}

			Collection<String> MerchantStatusList = Arrays.asList("Active", "InActive", "DeActivated");
			List<WebElement> Merchant_SLOV = library.gGetAllOptions(objects.MerchSDD);

			boolean isScontains = true;
			for (int i = 0; i < Merchant_SLOV.size(); i++) {
				String MSList = Merchant_SLOV.get(i).getText();
				if (MerchantStatusList.contains(MSList)) {
					isScontains = false;
					break;
				}
			}
			if (isScontains == true)
				TestResultUtils.logger.log(LogStatus.PASS, "Merchant Status List : Passed");
			else
				TestResultUtils.logger.log(LogStatus.FAIL, "Merchant Status List: Failed"
						+ TestResultUtils.logger.addScreenCapture(library.takescreenshot("Merchant Status List")));
		} catch (Exception e) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Merchant Status List: Failed"
					+ TestResultUtils.logger.addScreenCapture(library.takescreenshot("Merchant Status List")));
		}
	}
}