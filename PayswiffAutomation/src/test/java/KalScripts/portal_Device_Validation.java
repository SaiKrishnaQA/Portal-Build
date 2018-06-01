package KalScripts;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.payswiff.config.SeleniumNGSuite;
import com.payswiff.util.DriverUtilsImpl;
import com.payswiff.util.TestResultUtils;
import com.relevantcodes.extentreports.LogStatus;

public class portal_Device_Validation {

	SeleniumNGSuite testSuite = new SeleniumNGSuite();
	DriverUtilsImpl library = new DriverUtilsImpl();
	SM_Devices_Panel objects = new SM_Devices_Panel();

	@Test
	public void Reports() throws Exception {

		TestResultUtils.logger = TestResultUtils.extent.startTest("Device Screen Validation");
		try {

			if (library.gClick(objects.SM_Deviceslider) == true) {
				System.out.println("Clicked on Devices tab");
			} else {
				System.out.println("Unable to click on Device tab");
				TestResultUtils.logger.log(LogStatus.FAIL, "Unable to click Devices tab"
						+ TestResultUtils.logger.addScreenCapture(library.takescreenshot("Devices tab")));
			}
		} catch (Exception e) {
			System.out.println("Unable to click on Device tab");
			TestResultUtils.logger.log(LogStatus.FAIL, "Unable to click Devices tab"
					+ TestResultUtils.logger.addScreenCapture(library.takescreenshot("Devices tab")));
		}

		/**
		 * I See Devices Header
		 */
		try {
			String DeviceHeader = library.gWebElementGetText(objects.D_Header);
			if (library.gVerifyContainsText(DeviceHeader, "Device") == true) {
				System.out.println("Payments Header field in the Payments Screen : Passed");
				TestResultUtils.logger.log(LogStatus.PASS, "Payments Header field in the Payments Screen : Passed");
			} else {
				System.out.println("No header saying Devices");
				TestResultUtils.logger.log(LogStatus.FAIL, "Payments Header field in the Payments Screen : Failed"
						+ TestResultUtils.logger.addScreenCapture(library
								.takescreenshot("Payments Header is not present in the Header section of the page")));
			}
		} catch (Exception e) {
			System.out.println("No header saying Devices");
			TestResultUtils.logger.log(LogStatus.FAIL, "Payments Header field in the Payments Screen : Failed"
					+ TestResultUtils.logger.addScreenCapture(library
							.takescreenshot("Payments Header is not present in the Header section of the page")));
		}

		/**
		 * I See Devices Header Crumb
		 */
		try {
			String DeviceCrumb = library.gWebElementGetText(objects.D_DeviceCrumb);
			if (library.gVerifyContainsText(DeviceCrumb, "Home Inventory Device") == true) {
				System.out.println("Device Crumb Header field in the Devices Screen : Passed");
				TestResultUtils.logger.log(LogStatus.PASS, "Device Crumb Header field in the Devices Screen : Passed");
			} else {
				System.out.println("No Crumb saying Devices");
				TestResultUtils.logger.log(LogStatus.FAIL, "No Crumb saying Devices"
						+ TestResultUtils.logger.addScreenCapture(library.takescreenshot("Device Crumb")));
			}
		} catch (Exception e) {
			System.out.println("No Crumb saying Devices");
			TestResultUtils.logger.log(LogStatus.FAIL, "No Crumb saying Devices"
					+ TestResultUtils.logger.addScreenCapture(library.takescreenshot("Device Crumb")));
		}

		/**
		 * ISee Allotment Type Partner in the Device Header Section
		 */
		try {
			if (library.gClick(objects.D_StatusCode) == true) {
				System.out.println("Able to click on Allotment Type in the Device Header Section");
			} else {
				System.out.println("Unable to click Allotment Type in the Device Header Section");
			}
			library.gClick(objects.D_StatusCode);
			Collection<String> MerchantStatusList = Arrays.asList("---Inventory Status---", "New", "Open",
					"Installation Pending", "Shipped", "Faulty", "Delivered", "Pickup Pending", "Live", "Assigned",
					"Recovered By Partner", "Recovered By Payswiff", "Return to vendor", "POS Status Test", "Lost",
					"De-Installation Pending", "Delivered By Hand", "Lost By Partner", "Lost By Paynear",
					"Lost By Party", "Service Request", "Alloted", "Returned");
			List<WebElement> Merchant_SLOV = library.gGetAllOptions(objects.D_StatusCode);

			boolean isScontains = true;
			for (int i = 0; i < Merchant_SLOV.size(); i++) {
				String MSList = Merchant_SLOV.get(i).getText();
				if (!MerchantStatusList.contains(MSList)) {
					isScontains = false;
					break;
				}
			}
			if (isScontains == true)
				TestResultUtils.logger.log(LogStatus.PASS, "Inventory Status List in Device Screen : Passed");
			else
				TestResultUtils.logger.log(LogStatus.FAIL, "Inventory Status List in Device Screen : Failed"
						+ TestResultUtils.logger.addScreenCapture(library.takescreenshot("Inventory Status List")));

		} catch (Exception e) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Inventory Status List in Device Screen : Failed"
					+ TestResultUtils.logger.addScreenCapture(library.takescreenshot("Inventory Status List")));

		}
		/**
		 * ISee Allotment Type Partner in the Device Header Section
		 */
		try {
			if (library.gClick(objects.D_CustomDD) == true) {
				System.out.println("");
			}
			Collection<String> InvStatusDDList = Arrays.asList("---Select---", "Serial No.", "Device Model", "MID",
					"Merchant Name");
			List<WebElement> D_SLOV = library.gGetAllOptions(objects.D_CustomDD);

			boolean isScontains1 = true;
			for (int i = 0; i < D_SLOV.size(); i++) {
				String InvList = D_SLOV.get(i).getText();
				if (!InvStatusDDList.contains(InvList)) {
					isScontains1 = false;
					break;
				}
			}
			if (isScontains1 == true)
				TestResultUtils.logger.log(LogStatus.PASS, "Custom Filed List in Device Screen : Passed");
			else
				TestResultUtils.logger.log(LogStatus.FAIL, "Custom Filed List in Device Screen : Failed"
						+ TestResultUtils.logger.addScreenCapture(library.takescreenshot("Custom Filed List")));

			// D_CustomFiled

			if (library.isElementPresent(objects.D_CustomFiled) == true) {
				System.out.println("Custom Filed is present in the Devices Screen");
				TestResultUtils.logger.log(LogStatus.PASS, "Custom Filed is present in the Devices Screen");
			} else {
				System.out.println("No Custom Field in the Devices Screen");
				TestResultUtils.logger.log(LogStatus.FAIL,
						"No Filed saying Enter here in the Device Screen" + TestResultUtils.logger
								.addScreenCapture(library.takescreenshot("Enter Here Filed in the Device Screen")));
			}
		} catch (Exception e) {
			System.out.println("No Custom Field in the Devices Screen");
			TestResultUtils.logger.log(LogStatus.FAIL,
					"No Filed saying Enter here in the Device Screen" + TestResultUtils.logger
							.addScreenCapture(library.takescreenshot("Enter Here Filed in the Device Screen")));
		}

		/**
		 * I See Allotment Type Partner in the Device Header Section
		 *//*
			 * String PartnerType = library.gWebElementGetText(objects.D_AllotmntPartners);
			 * if (library.gVerifyContainsText(PartnerType, "Partners") == true) {
			 * System.out.println("Allotment Type Filter Partner is available");
			 * TestResultUtils.logger.log(LogStatus.PASS,
			 * "Allotment Type Filter Partner is available"); } else { System.out.
			 * println("Partner allotment is not present in the header section of Devices Screen"
			 * ); TestResultUtils.logger.log(LogStatus.FAIL, "No Crumb saying Devices" +
			 * TestResultUtils.logger .addScreenCapture(library.
			 * takescreenshot("Allotment Partner Type in Device Screen"))); }
			 */
		/**
		 * I See Inventory Status code Type in the Device Header Section
		 */
		/*
		 * String InvStatusDD = library.gWebElementGetText(objects.D_StatusCode); if
		 * (library.gVerifyContainsText(InvStatusDD, "Payments") == true) {
		 * System.out.println("Inventory Status code Type in the Device Header Section"
		 * ); TestResultUtils.logger.log(LogStatus.PASS,
		 * "Inventory Status Code Drop Down in Devices Screen"); } else { System.out.
		 * println("There is no Inventory Status code Type in the Device Header Section"
		 * ); TestResultUtils.logger.log(LogStatus.FAIL, "No Crumb saying Devices" +
		 * TestResultUtils.logger .addScreenCapture(library.
		 * takescreenshot("Inventory Status Code in Devices Screen"))); }
		 */

		/**
		 * I See Custom Status DropDown Type in the Device Header Section
		 */
		/*
		 * String CustmDD = library.gWebElementGetText(objects.D_CustomDD); if
		 * (library.gVerifyContainsText(CustmDD, "Payments") == true) { System.out.
		 * println("Custom Status Drop Down Type in the Device Header Section");
		 * TestResultUtils.logger.log(LogStatus.PASS,
		 * "Custom Status Drop Down Type in the Device Header Section"); } else {
		 * System.out.
		 * println("There is no Custom Status code Drop Down in the Device Header Section"
		 * ); TestResultUtils.logger.log(LogStatus.FAIL,
		 * "Custom Status Code Drop Down in Devices Screen" +
		 * TestResultUtils.logger.addScreenCapture(
		 * library.takescreenshot("Custom Status Code Drop Down in Devices Screen"))); }
		 */
		/**
		 * I See Custom Status Filed Type in the Device Header Section
		 */
		/*
		 * String CustmFiled = library.gWebElementGetText(objects.D_CustomFiled); if
		 * (library.gVerifyContainsText(CustmFiled, "Payments") == true) {
		 * System.out.println("Custom Status Field Type in the Device Header Section");
		 * TestResultUtils.logger.log(LogStatus.PASS,
		 * "Custom Status Field Type in the Device Header Section"); } else {
		 * System.out.
		 * println("There is no Custom Status code Filed in the Device Header Section");
		 * TestResultUtils.logger.log(LogStatus.FAIL, "No Crumb saying Devices" +
		 * TestResultUtils.logger .addScreenCapture(library.
		 * takescreenshot("Custome Status Code in Devices Screen"))); }
		 */

		/**
		 * I See GO Filed Type in the Device Header Section
		 */
		try {
			String Go = library.gWebElementGetText(objects.D_GO);
			if (library.gVerifyContainsText(Go, "Go") == true) {
				System.out.println("Go search type in the Device Header Section");
				TestResultUtils.logger.log(LogStatus.PASS, "Go search type is present in the Device Header Section");
			} else {
				System.out.println("There is no Go Filed in the Device Header Section");
				TestResultUtils.logger.log(LogStatus.FAIL, "No button saying Go" + TestResultUtils.logger
						.addScreenCapture(library.takescreenshot("Go button in Devices Screen")));
			}

			/**
			 * I See Show Filed Type in the Device Screen
			 */
			if (library.isElementPresent(objects.D_Shw) == true) {
				System.out.println("Show drop down is displayed");
				TestResultUtils.logger.log(LogStatus.PASS, "Show drop down is displayed");
			} else {
				System.out.println("No Show drp down in the Devices Screen");
				TestResultUtils.logger.log(LogStatus.FAIL, "No Drop Down saying Show"
						+ TestResultUtils.logger.addScreenCapture(library.takescreenshot("Show Drop Down")));
			}
		} catch (Exception e) {
			System.out.println("No Show drp down in the Devices Screen");
			TestResultUtils.logger.log(LogStatus.FAIL, "No Drop Down saying Show"
					+ TestResultUtils.logger.addScreenCapture(library.takescreenshot("Show Drop Down")));
		}

		/**
		 * I See Show Filed Type in the Device Screen
		 */
		/*
		 * String D_Show = library.gWebElementGetText(objects.D_Shw); if
		 * (library.gVerifyContainsText(D_Show, "Payments") == true) {
		 * System.out.println("Show search type in the Device Header Section");
		 * TestResultUtils.logger.log(LogStatus.PASS,
		 * "Show search type is present in the Device Header Section"); } else {
		 * System.out.println("There is no Show Filed in the Device Header Section");
		 * TestResultUtils.logger.log(LogStatus.FAIL, "No button saying Show" +
		 * TestResultUtils.logger
		 * .addScreenCapture(library.takescreenshot("Show button in Devices Screen")));
		 * }
		 */

		/**
		 * I See Serial Number in the Device Screen
		 */
		try {
			String D_SerNo = library.gWebElementGetText(objects.D_SerialNum);
			if (library.gVerifyContainsText(D_SerNo, "Serial No.") == true) {
				System.out.println("Serial Number in the Device table Section");
				TestResultUtils.logger.log(LogStatus.PASS, "Serial Number in the Device table Section");
			} else {
				System.out.println("There is no Serial Number Filed in the Device Table Section");
				TestResultUtils.logger.log(LogStatus.FAIL, "No Filed saying Serial Number" + TestResultUtils.logger
						.addScreenCapture(library.takescreenshot("Serial Number Field in Devices Screen")));
			}
		} catch (Exception e) {
			System.out.println("There is no Serial Number Filed in the Device Table Section");
			TestResultUtils.logger.log(LogStatus.FAIL, "No Filed saying Serial Number" + TestResultUtils.logger
					.addScreenCapture(library.takescreenshot("Serial Number Field in Devices Screen")));
		}

		/**
		 * I See Model in the Device Screen
		 */
		try {
			String D_Model = library.gWebElementGetText(objects.D_ModelNum);
			if (library.gVerifyContainsText(D_Model, "Device Model") == true) {
				System.out.println("Model Number in the Device table Section");
				TestResultUtils.logger.log(LogStatus.PASS, "Model Number in the Device table Section");
			} else {
				System.out.println("There is no Model Number Filed in the Device Table Section");
				TestResultUtils.logger.log(LogStatus.FAIL, "No Filed saying Model Number" + TestResultUtils.logger
						.addScreenCapture(library.takescreenshot("Model Number Field in Devices Screen")));
			}
		} catch (Exception e) {
			System.out.println("There is no Model Number Filed in the Device Table Section");
			TestResultUtils.logger.log(LogStatus.FAIL, "No Filed saying Model Number" + TestResultUtils.logger
					.addScreenCapture(library.takescreenshot("Model Number Field in Devices Screen")));
		}

		/**
		 * I See Allotment in the Device Screen
		 */
		try {
			String D_Allotmnt = library.gWebElementGetText(objects.D_Allotmnt);
			if (library.gVerifyContainsText(D_Allotmnt, "Allotment") == true) {
				System.out.println("Allotment filed in the Device table Section");
				TestResultUtils.logger.log(LogStatus.PASS, "Allotment field in the Device table Section");
			} else {
				System.out.println("There is no Allotment Filed in the Device Table Section");
				TestResultUtils.logger.log(LogStatus.FAIL, "No Filed saying Allotment" + TestResultUtils.logger
						.addScreenCapture(library.takescreenshot("Allotment Field in Devices Screen")));
			}
		} catch (Exception e) {
			System.out.println("There is no Allotment Filed in the Device Table Section");
			TestResultUtils.logger.log(LogStatus.FAIL, "No Filed saying Allotment" + TestResultUtils.logger
					.addScreenCapture(library.takescreenshot("Allotment Field in Devices Screen")));
		}

		/**
		 * I See MID in the Device Screen
		 */
		try {
			String D_MID = library.gWebElementGetText(objects.D_MId);
			if (library.gVerifyContainsText(D_MID, "MID") == true) {
				System.out.println("MID in the Device table Section");
				TestResultUtils.logger.log(LogStatus.PASS, "MID in the Device table Section");
			} else {
				System.out.println("There is no MID Filed in the Device Table Section");
				TestResultUtils.logger.log(LogStatus.FAIL, "No Filed saying MID" + TestResultUtils.logger
						.addScreenCapture(library.takescreenshot("MID Field in Devices Screen")));
			}
		} catch (Exception e) {
			System.out.println("There is no MID Filed in the Device Table Section");
			TestResultUtils.logger.log(LogStatus.FAIL, "No Filed saying MID"
					+ TestResultUtils.logger.addScreenCapture(library.takescreenshot("MID Field in Devices Screen")));
		}

		/**
		 * I See Merchant Name in the Device Screen
		 */
		try {
			String D_MerchName = library.gWebElementGetText(objects.D_MerchName);
			if (library.gVerifyContainsText(D_MerchName, "Merchant Name") == true) {
				System.out.println("Merchant Name in the Device table Section");
				TestResultUtils.logger.log(LogStatus.PASS, "Merchant Name in the Device table Section");
			} else {
				System.out.println("There is no Merchant Name Filed in the Device Table Section");
				TestResultUtils.logger.log(LogStatus.FAIL, "No Filed saying Merchant Name" + TestResultUtils.logger
						.addScreenCapture(library.takescreenshot("Merchant Name Field in Devices Screen")));
			}
		} catch (Exception e) {
			System.out.println("There is no Merchant Name Filed in the Device Table Section");
			TestResultUtils.logger.log(LogStatus.FAIL, "No Filed saying Merchant Name" + TestResultUtils.logger
					.addScreenCapture(library.takescreenshot("Merchant Name Field in Devices Screen")));
		}

		/**
		 * I See Merchant Location in the Device Screen
		 */
		try {
			String D_MerchLoc = library.gWebElementGetText(objects.D_MerchLoc);
			if (library.gVerifyContainsText(D_MerchLoc, "Merchant Location") == true) {
				System.out.println("Merchant Location in the Device table Section");
				TestResultUtils.logger.log(LogStatus.PASS, "Merchant Location in the Device table Section");
			} else {
				System.out.println("There is no Merchant Location Filed in the Device Table Section");
				TestResultUtils.logger.log(LogStatus.FAIL, "No Filed saying Merchant Location" + TestResultUtils.logger
						.addScreenCapture(library.takescreenshot("Merchant Location Field in Devices Screen")));
			}
		} catch (Exception e) {
			System.out.println("There is no Merchant Location Filed in the Device Table Section");
			TestResultUtils.logger.log(LogStatus.FAIL, "No Filed saying Merchant Location" + TestResultUtils.logger
					.addScreenCapture(library.takescreenshot("Merchant Location Field in Devices Screen")));
		}

		/**
		 * I See Inventory Location in the Device Screen
		 */
		try {
			String D_InvnLoc = library.gWebElementGetText(objects.D_InvLoc);
			if (library.gVerifyContainsText(D_InvnLoc, "Inventory Location") == true) {
				System.out.println("Model Number in the Device table Section");
				TestResultUtils.logger.log(LogStatus.PASS, "Inventory Location in the Device table Section");
			} else {
				System.out.println("There is no Inventory Location Filed in the Device Table Section");
				TestResultUtils.logger.log(LogStatus.FAIL, "No Filed saying Inventory Location" + TestResultUtils.logger
						.addScreenCapture(library.takescreenshot("Inventory Location Field in Devices Screen")));
			}
		} catch (Exception e) {
			System.out.println("There is no Inventory Location Filed in the Device Table Section");
			TestResultUtils.logger.log(LogStatus.FAIL, "No Filed saying Inventory Location" + TestResultUtils.logger
					.addScreenCapture(library.takescreenshot("Inventory Location Field in Devices Screen")));
		}

		/**
		 * I See Status Filed in the Device Screen
		 */
		try {
			String D_Stats = library.gWebElementGetText(objects.D_Status);
			if (library.gVerifyContainsText(D_Stats, "Status") == true) {
				System.out.println("Status Field in the Device table Section");
				TestResultUtils.logger.log(LogStatus.PASS, "Status Field in the Device table Section");
			} else {
				System.out.println("There is no Status Field in the Device Table Section");
				TestResultUtils.logger.log(LogStatus.FAIL, "No Filed saying Status " + TestResultUtils.logger
						.addScreenCapture(library.takescreenshot("Status  Field in Devices Screen")));
			}
		} catch (Exception e) {
			System.out.println("There is no Status Field in the Device Table Section");
			TestResultUtils.logger.log(LogStatus.FAIL, "No Filed saying Status " + TestResultUtils.logger
					.addScreenCapture(library.takescreenshot("Status  Field in Devices Screen")));
		}

		/**
		 * I See History filed in the Device Screen
		 */
		try {
			String D_Hist = library.gWebElementGetText(objects.D_His);
			if (library.gVerifyContainsText(D_Hist, "History") == true) {
				System.out.println("History Field in the Device table Section");
				TestResultUtils.logger.log(LogStatus.PASS, "History Field in the Device table Section");
			} else {
				System.out.println("There is no History Filed in the Device Table Section");
				TestResultUtils.logger.log(LogStatus.FAIL, "No Filed saying History" + TestResultUtils.logger
						.addScreenCapture(library.takescreenshot("History Field in Devices Screen")));
			}
		} catch (Exception e) {
			System.out.println("There is no History Filed in the Device Table Section");
			TestResultUtils.logger.log(LogStatus.FAIL, "No Filed saying History" + TestResultUtils.logger
					.addScreenCapture(library.takescreenshot("History Field in Devices Screen")));
		}

		/**
		 * I See Last Action Date in the Device Screen
		 */
		try {
			String D_LAD = library.gWebElementGetText(objects.D_LADate);
			if (library.gVerifyContainsText(D_LAD, "Last Action Date") == true) {
				System.out.println("Last Action Date Field in the Device table Section");
				TestResultUtils.logger.log(LogStatus.PASS, "Last Action Date Field in the Device table Section");
			} else {
				System.out.println("There is no Last Action Date Filed in the Device Table Section");
				TestResultUtils.logger.log(LogStatus.FAIL, "No Filed saying Last Action Date" + TestResultUtils.logger
						.addScreenCapture(library.takescreenshot("Last Action Date Field in Devices Screen")));
			}
		} catch (Exception e) {
			System.out.println("There is no Last Action Date Filed in the Device Table Section");
			TestResultUtils.logger.log(LogStatus.FAIL, "No Filed saying Last Action Date" + TestResultUtils.logger
					.addScreenCapture(library.takescreenshot("Last Action Date Field in Devices Screen")));
		}

		/**
		 * I See Updated By in the Device Screen
		 */
		try {
			String D_UpdatedBy = library.gWebElementGetText(objects.D_LUBy);
			if (library.gVerifyContainsText(D_UpdatedBy, "Updated By") == true) {
				System.out.println("Updated By Field in the Device table Section");
				TestResultUtils.logger.log(LogStatus.PASS, "Updated By Field in the Device table Section");
			} else {
				System.out.println("There is no Updated By Filed in the Device Table Section");
				TestResultUtils.logger.log(LogStatus.FAIL, "No Filed saying Updated By" + TestResultUtils.logger
						.addScreenCapture(library.takescreenshot("Updated By Field in Devices Screen")));
			}
		} catch (Exception e) {
			System.out.println("There is no Updated By Filed in the Device Table Section");
			TestResultUtils.logger.log(LogStatus.FAIL, "No Filed saying Updated By" + TestResultUtils.logger
					.addScreenCapture(library.takescreenshot("Updated By Field in Devices Screen")));
		}

		/**
		 * ISee First
		 */
		try {
			if (library.isElementPresentAndDisplayed(objects.D_First) == true) {
				System.out.println("First is present in the Lower section of the page: Passed");
				TestResultUtils.logger.log(LogStatus.PASS, "First is present in the Lower section of the page: Passed");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL,
						"First is present in the Lower section of the page" + TestResultUtils.logger.addScreenCapture(
								library.takescreenshot("First is present in the Lower section of the page")));
			}
		} catch (Exception e) {
			TestResultUtils.logger.log(LogStatus.FAIL,
					"First is present in the Lower section of the page" + TestResultUtils.logger.addScreenCapture(
							library.takescreenshot("First is present in the Lower section of the page")));
		}

		/**
		 * ISee Previous
		 */
		try {
			if (library.isElementPresentAndDisplayed(objects.D_Previous) == true) {
				System.out.println("Previous is present in the Lower section of the page: Passed");
				TestResultUtils.logger.log(LogStatus.PASS,
						"Previous is present in the Lower section of the page: Passed");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL, "Previous is present in the Lower section of the page"
						+ TestResultUtils.logger.addScreenCapture(
								library.takescreenshot("Previous is present in the Lower section of the page")));
			}
		} catch (Exception e) {
			TestResultUtils.logger.log(LogStatus.FAIL,
					"Previous is present in the Lower section of the page" + TestResultUtils.logger.addScreenCapture(
							library.takescreenshot("Previous is present in the Lower section of the page")));
		}

		/**
		 * ISee Next
		 */
		try {
			if (library.isElementPresentAndDisplayed(objects.D_Next) == true) {
				System.out.println("Next is present in the Lower section of the page: Passed");
				TestResultUtils.logger.log(LogStatus.PASS, "Next is present in the Lower section of the page: Passed");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL,
						"Next is present in the Lower section of the page" + TestResultUtils.logger.addScreenCapture(
								library.takescreenshot("Next is present in the Lower section of the page")));
			}
		} catch (Exception e) {
			TestResultUtils.logger.log(LogStatus.FAIL,
					"Next is present in the Lower section of the page" + TestResultUtils.logger.addScreenCapture(
							library.takescreenshot("Next is present in the Lower section of the page")));
		}

		/**
		 * ISee Last
		 */
		try {
			if (library.isElementPresentAndDisplayed(objects.D_Last) == true) {
				System.out.println("Last is present in the Lower section of the page: Passed");
				TestResultUtils.logger.log(LogStatus.PASS, "Last is present in the Lower section of the page: Passed");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL,
						"Last is present in the Lower section of the page" + TestResultUtils.logger.addScreenCapture(
								library.takescreenshot("Last is present in the Lower section of the page")));
			}
		} catch (Exception e) {
			TestResultUtils.logger.log(LogStatus.PASS, "Last is present in the Lower section of the page: Passed");
		}
	}
}
