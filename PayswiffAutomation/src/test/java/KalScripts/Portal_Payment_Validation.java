package KalScripts;

/*
 * @author Sai G
 * 
 */

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Portal.Panel.SM_Payments_Panel;
import com.payswiff.config.SeleniumNGSuite;
import com.payswiff.util.DriverUtilsImpl;
import com.payswiff.util.TestResultUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Portal_Payment_Validation {

	SeleniumNGSuite testSuite = new SeleniumNGSuite();
	DriverUtilsImpl library = new DriverUtilsImpl();
	SM_Payments_Panel objects = new SM_Payments_Panel();

	// @Test(priority= 5)
	@Test
	public void Reports() throws Exception {

		TestResultUtils.logger = TestResultUtils.extent.startTest("Payments Screen Validation");
		library.gClick(objects.SM_Paymentslider);

		/**
		 * I See Payments Header
		 */

		try {
			String SM_PaymentsHeader = library.gWebElementGetText(objects.SM_PaymentsHeader);
			if (library.gVerifyContainsText(SM_PaymentsHeader, "Payments")) {
				System.out.println("Payments Header field in the Payments Screen : Passed");
				TestResultUtils.logger.log(LogStatus.PASS, "Payments Header field in the Payments Screen : Passed");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL, "Payments Header field in the Payments Screen : Failed"
						+ TestResultUtils.logger.addScreenCapture(library
								.takescreenshot("Payments Header is not present in the Header section of the page")));
			}
		} catch (Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Payments Header field in the Payments Screen : Failed"
					+ TestResultUtils.logger.addScreenCapture(library
							.takescreenshot("Payments Header is not present in the Header section of the page")));
		}

		/**
		 * I See Payments Crumb Header
		 */

		try {
			String SM_PaymentsCrumb = library.gWebElementGetText(objects.SM_PaymentsCrumb);

			if (library.gVerifyContainsText(SM_PaymentsCrumb, "Home Payments")) {
				System.out.println("Payments Crumb Header field in the Payments Screen : Passed");
				TestResultUtils.logger.log(LogStatus.PASS,
						"Payments Crumb Header field in the Payments Screen : Passed");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL,
						"Payments Crumb Header field in the Payments Screen : Failed"
								+ TestResultUtils.logger.addScreenCapture(library.takescreenshot(
										"Payments Crumb Header is not present in the Header section of the page")));
			}
		} catch (Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Payments Crumb Header field in the Payments Screen : Failed"
					+ TestResultUtils.logger.addScreenCapture(library
							.takescreenshot("Payments Crumb Header is not present in the Header section of the page")));
		}

		/**
		 * I See Merchant ID
		 */

		try {
			String SM_ReportsHeader = library.gWebElementGetText(objects.SM_MerchID);

			if (library.gVerifyContainsText(SM_ReportsHeader, "Merchant Id") == true) {
				System.out.println("Merch ID Field in the table section : Passed");
				TestResultUtils.logger.log(LogStatus.PASS,
						"Merch ID Field in the table section in Payments Screen : Passed");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL,
						"Merch ID Field in not present table section in Payments Screen : Failed"
								+ TestResultUtils.logger.addScreenCapture(library.takescreenshot(
										"Merch ID Field in not present table section in Payments Screen : Failed")));
			}
		} catch (Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL,
					"Merch ID Field in not present table section in Payments Screen : Failed"
							+ TestResultUtils.logger.addScreenCapture(library.takescreenshot(
									"Merch ID Field in not present table section in Payments Screen : Failed")));
		}

		/**
		 * I See Merchant Name
		 */

		try {
			String SM_MerchName = library.gWebElementGetText(objects.SM_MerchName);

			if (library.gVerifyContainsText(SM_MerchName, "Merchant Name")) {
				System.out.println("Merchant Name Field in the table section : Passed");
				TestResultUtils.logger.log(LogStatus.PASS, "Merchant Name Field in the table section : Passed");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL,
						"Merchant Name Field is not displayed in table section : Failed"
								+ TestResultUtils.logger.addScreenCapture(library
										.takescreenshot("Merchant Name Field in not displayed in table section")));
			}
		} catch (Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL,
					"Merchant Name Field is not displayed in table section : Failed"
							+ TestResultUtils.logger.addScreenCapture(
									library.takescreenshot("Merchant Name Field in not displayed in table section")));
		}

		/**
		 * I See Payments ID
		 */

		try {
			String SM_PayID = library.gWebElementGetText(objects.SM_PayID);

			if (library.gVerifyContainsText(SM_PayID, "Payment Id")) {
				System.out.println("Payment ID Field in the table section : Passed");
				TestResultUtils.logger.log(LogStatus.PASS, "Payment ID Field in the table section : Passed");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL,
						"Payment ID Field is not displayed in the table section : Failed"
								+ TestResultUtils.logger.addScreenCapture(library
										.takescreenshot("Payment ID Field is not displayed in the table section")));
			}
		} catch (Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL,
					"Payment ID Field is not displayed in the table section : Failed"
							+ TestResultUtils.logger.addScreenCapture(
									library.takescreenshot("Payment ID Field is not displayed in the table section")));
		}

		/**
		 * I See Amount
		 */

		try {
			String SM_Amount = library.gWebElementGetText(objects.SM_Amount);
			if (library.gVerifyContainsText(SM_Amount, "Amount(Rs.)")) {
				System.out.println("Amount Field in the table section : Passed");
				TestResultUtils.logger.log(LogStatus.PASS, "Amount Field in the table section : Passed");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL,
						"Amount Field is not displayedin the table section : Failed"
								+ TestResultUtils.logger.addScreenCapture(
										library.takescreenshot("Amount Field is not displayedin the table section")));
			}
		} catch (Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL,
					"Amount Field is not displayedin the table section : Failed"
							+ TestResultUtils.logger.addScreenCapture(
									library.takescreenshot("Amount Field is not displayedin the table section")));
		}

		/**
		 * I See Payment Mode
		 */

		try {
			String SM_PayMode = library.gWebElementGetText(objects.SM_PayMode);

			if (library.gVerifyContainsText(SM_PayMode, "Payment Mode") == true) {
				System.out.println("Payment Mode Field in the table section : Passed");
				TestResultUtils.logger.log(LogStatus.PASS, "Payment Mode Field in the table section : Passed");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL,
						"Payment Mode Field in the table section: Failed" + TestResultUtils.logger
								.addScreenCapture(library.takescreenshot("Payment Mode Field in the table section")));
			}

		} catch (Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL,
					"Payment Mode Field in the table section: Failed" + TestResultUtils.logger
							.addScreenCapture(library.takescreenshot("Payment Mode Field in the table section")));
		}

		/**
		 * I See Payment Method
		 */

		try {
			String SM_PayMethod = library.gWebElementGetText(objects.SM_PayMethod);
			if (library.gVerifyContainsText(SM_PayMethod, "Payment Method") == true) {
				System.out.println("payment Method Field in the table section : Passed");
				TestResultUtils.logger.log(LogStatus.PASS, "payment Method Field in the table section : Passed");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL,
						"payment Method Field in the table section : Failed" + TestResultUtils.logger
								.addScreenCapture(library.takescreenshot("payment Method Field in the table section")));
			}
		} catch (Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL,
					"payment Method Field in the table section : Failed" + TestResultUtils.logger
							.addScreenCapture(library.takescreenshot("payment Method Field in the table section")));
		}

		/**
		 * I See Payment Date
		 */

		try {
			String SM_PayDate = library.gWebElementGetText(objects.SM_PayDate);

			if (library.gVerifyContainsText(SM_PayDate, "Payment Date") == true) {
				System.out.println("Payment Date Field in the table section : Passed");
				TestResultUtils.logger.log(LogStatus.PASS, "Payment Date Field in the table section : Passed");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL,
						"Payment Date Field is not displayedin the table section : Failed"
								+ TestResultUtils.logger.addScreenCapture(library
										.takescreenshot("Payment Date Field is not displayedin the table section")));
			}
		} catch (Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL,
					"Payment Date Field is not displayedin the table section : Failed"
							+ TestResultUtils.logger.addScreenCapture(
									library.takescreenshot("Payment Date Field is not displayedin the table section")));
		}

		/**
		 * I See Download Payments
		 */

		try {
			String SM_DwnLdPaymnts = library.gWebElementGetText(objects.SM_DmnLoadPay);
			if (library.gVerifyContainsText(SM_DwnLdPaymnts, "Download Payments") == true) {
				System.out.println("DownLoad Payments Field in the table section : Passed");
				TestResultUtils.logger.log(LogStatus.PASS, "DownLoad Payments Field in the table section : Passed");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL,
						"DownLoad Payments Field is not displayedin the table section : Failed"
								+ TestResultUtils.logger.addScreenCapture(library.takescreenshot(
										"DownLoad Payments Field is not displayedin the table section")));
			}
		} catch (Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL,
					"DownLoad Payments Field is not displayedin the table section : Failed"
							+ TestResultUtils.logger.addScreenCapture(library
									.takescreenshot("DownLoad Payments Field is not displayedin the table section")));
		}

		/**
		 * ISee Advance Filter
		 */
		try {
			if (library.isElementPresentAndDisplayed(objects.SM_AdvFilter) == true) {
				System.out.println("Advance Filter is present in the Header section of the page: Passed");
				TestResultUtils.logger.log(LogStatus.PASS,
						"Advance Filter is present in the Header section of the page: Passed");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL,
						"Advance Filter is not present in the Header section of the page"
								+ TestResultUtils.logger.addScreenCapture(library.takescreenshot(
										"Advance Filter is not present in the Header section of the page")));
			}
		} catch (Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Advance Filter is not present in the Header section of the page"
					+ TestResultUtils.logger.addScreenCapture(
							library.takescreenshot("Advance Filter is not present in the Header section of the page")));
		}

		/**
		 * ISee Status Drop Down
		 */
		try {

			if (library.isElementPresentAndDisplayed(objects.SM_StatusValue) == true) {
				System.out.println("Status Value is present in the Header section of the page: Passed");
				TestResultUtils.logger.log(LogStatus.PASS,
						"Status Value is present in the Header section of the page: Passed");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL,
						"Status Value is not present in the Header section of the page"
								+ TestResultUtils.logger.addScreenCapture(library.takescreenshot(
										"Status Value is not present in the Header section of the page")));
			}
		} catch (Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Status Value is not present in the Header section of the page"
					+ TestResultUtils.logger.addScreenCapture(
							library.takescreenshot("Status Value is not present in the Header section of the page")));
		}
		
		/**
		 * ISee Show Entries
		 */
		try {

			if (library.isElementPresentAndDisplayed(objects.SM_Entries) == true) {
				System.out.println("Show Entries is present in the Header section of the page: Passed");
				TestResultUtils.logger.log(LogStatus.PASS,
						"Show Entries is present in the Header section of the page: Passed");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL, "Show Entries is present in the Header section of the page"
						+ TestResultUtils.logger.addScreenCapture(
								library.takescreenshot("Show Entries is present in the Header section of the page")));
			}
		} catch (Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Show Entries is present in the Header section of the page"
					+ TestResultUtils.logger.addScreenCapture(
							library.takescreenshot("Show Entries is present in the Header section of the page")));
		}

		/**
		 * ISee First
		 */
		try {

			if (library.isElementPresentAndDisplayed(objects.SM_First) == true) {
				System.out.println("First is present in the Lower section of the page: Passed");
				TestResultUtils.logger.log(LogStatus.PASS, "First is present in the Lower section of the page: Passed");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL,
						"First is present in the Lower section of the page" + TestResultUtils.logger.addScreenCapture(
								library.takescreenshot("First is present in the Lower section of the page")));
			}
		} catch (Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL,
					"First is present in the Lower section of the page" + TestResultUtils.logger.addScreenCapture(
							library.takescreenshot("First is present in the Lower section of the page")));
		}

		/**
		 * ISee Previous
		 */
		try {
			if (library.isElementPresentAndDisplayed(objects.SM_Previous) == true) {
				System.out.println("Previous is present in the Header section of the page: Passed");
				TestResultUtils.logger.log(LogStatus.PASS,
						"Previous is present in the Header section of the page: Passed");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL, "Previous is present in the Header section of the page"
						+ TestResultUtils.logger.addScreenCapture(
								library.takescreenshot("Previous is present in the Header section of the page")));
			}
		} catch (Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL,
					"Previous is present in the Header section of the page" + TestResultUtils.logger.addScreenCapture(
							library.takescreenshot("Previous is present in the Header section of the page")));
		}

		/**
		 * ISee Next
		 */
		try {

			if (library.isElementPresentAndDisplayed(objects.SM_Next) == true) {

				System.out.println("Next is present in the Header section of the page: Passed");
				TestResultUtils.logger.log(LogStatus.PASS, "Next is present in the Header section of the page: Passed");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL,
						"Next is present in the Header section of the page" + TestResultUtils.logger.addScreenCapture(
								library.takescreenshot("Next is present in the Header section of the page")));

			}
		} catch (Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL,
					"Next is present in the Header section of the page" + TestResultUtils.logger.addScreenCapture(
							library.takescreenshot("Next is present in the Header section of the page")));
		}

		/**
		 * ISee Last
		 */
		try {
			if (library.isElementPresentAndDisplayed(objects.SM_Last) == true) {
				System.out.println("Last is present in the Header section of the page: Passed");
				TestResultUtils.logger.log(LogStatus.PASS, "Last is present in the Header section of the page");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL,
						"Last is present in the Header section of the page" + TestResultUtils.logger.addScreenCapture(
								library.takescreenshot("Last is present in the Header section of the page")));
			}
		} catch (Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL,
					"Last is present in the Header section of the page" + TestResultUtils.logger.addScreenCapture(
							library.takescreenshot("Last is present in the Header section of the page")));
		}

		// to click on Advance filter merchant
		try {
			if (library.gClick(objects.SM_Advancefilter_icon) == true) {
				System.out.println("Clicked on Advance Filter");
			} else {
				System.out.println("Unable to click on Advance Filter");
			}

			// to check adavce filter is clickable or not
			String advancefiltertxt = library.gWebElementGetText(objects.SM_adavnce_filter_txt);
			System.out.println(advancefiltertxt);

			if (library.gVerifyContainsText(advancefiltertxt, "Payment Mode") == true) {
				System.out.println("Advance filter is clickable in the Payments Screen : Passed");
				TestResultUtils.logger.log(LogStatus.PASS,
						"Advance filter is clickable in the Payments Screen : Passed");

			} else {
				System.out.println("Unable to open the popup");
				TestResultUtils.logger.log(LogStatus.FAIL, "Unable to open the popup");

			}
		} catch (Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL,
					"Advance filter is clickable in the Payments Screen" + TestResultUtils.logger
							.addScreenCapture(library.takescreenshot("Advance filter was not clickable")));
		}
		
		// to click on status filter merchant

		library.gListSelectByIndex(objects.SM_filter_status_select, 1);
		String thisweekfiltertxt = library.gWebElementGetText(objects.SM_First);
		System.out.println(thisweekfiltertxt);

		try {
			if (library.gVerifyContainsText(thisweekfiltertxt, "First") == true) {
				System.out.println("status filter is clickable in the Payments Screen : Passed");
				TestResultUtils.logger.log(LogStatus.PASS,
						"status filter is clickable in the Payments Screen : Passed");

			} else {
				System.out.println("Unable to open the popup");
				TestResultUtils.logger.log(LogStatus.FAIL, "Unable to open the popup");
			}
		} catch (Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL,
					"Status filter is clickable in the Payments Screen" + TestResultUtils.logger
							.addScreenCapture(library.takescreenshot("Status filter was not clickable")));
		}

		// to click on show entries

		try {

			if (library.gClick(objects.SM_payment_showentries) == true) {
				System.out.println("Clicked on Show entries");
			} else {
				System.out.println("Unable to click on Show entries");
			}

			if (library.gVerifyContainsText(thisweekfiltertxt, "First") == true) {
				System.out.println("Show entries is clickable in the Payments Screen : Passed");
				TestResultUtils.logger.log(LogStatus.PASS, "Show entries is clickable in the Payments Screen : Passed");

			} else {
				System.out.println("Unable to open the popup");
				TestResultUtils.logger.log(LogStatus.FAIL, "Unable to open the popup");
			}
		}

		catch (Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL,
					"Show entries is clickable in the Payments Screen" + TestResultUtils.logger
							.addScreenCapture(library.takescreenshot("Show entries was not clickable")));
		}

		// to click on download payments

		/*library.gClick(objects.SM_download_payment_button);

		try {
			String downloadpaymenturltxt = library.System.out.println(downloadpaymenturltxt);
			if (library.gVerifyContainsText(thisweekfiltertxt, "First") == true) {
				System.out.println("Show entries is clickable in the Payments Screen : Passed");
				TestResultUtils.logger.log(LogStatus.PASS, "Show entries is clickable in the Payments Screen : Passed");

			} else {
				System.out.println("Unable to open the popup");
				TestResultUtils.logger.log(LogStatus.FAIL, "Unable to open the popup");

			}
		}

		catch (Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL,
					"Show entries is clickable in the Payments Screen" + TestResultUtils.logger
							.addScreenCapture(library.takescreenshot("Show entries was not clickable")));
		}*/

		}
}

