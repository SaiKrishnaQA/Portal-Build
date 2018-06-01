package com.Portal_validation;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.FTCash.Panel.Fetch_MerchDetails;
import com.Portal.Panel.Merchants_D_Panel;
import com.partnerPortal.PageValidations.Read_Excel;
import com.payswiff.config.SeleniumNGSuite;
import com.payswiff.constants.Constants;
import com.payswiff.util.DriverUtilsImpl;
import com.payswiff.util.ExcelUtilImpl;
import com.payswiff.util.ExcelUtils2;
import com.payswiff.util.ReadWriteExcelFile;
import com.payswiff.util.TestResultUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Portal_MerchDetail_Validation {

	/** The base project path. */
	public static String baseProjectPath = System.getProperty(Constants.USER_DIR);

	SeleniumNGSuite testSuite = new SeleniumNGSuite();
	DriverUtilsImpl library = new DriverUtilsImpl();
	Merchants_D_Panel objects = new Merchants_D_Panel();
	com.FTCash.Panel.loginpage objects1 = new com.FTCash.Panel.loginpage();

	String DeviceNum = "09813309216012500952";
	Read_Excel excelData = new Read_Excel();

	// @Test(priority= 4)
	@Test
	public void FT_MIDUpload() throws Exception {

		String Ex_File = baseProjectPath.concat(Constants.BulkUpload);

		// User Name
		String Ex_UserName = excelData.readColumn(Ex_File, 1, 8);
		System.out.println("Excel_UserName: " + Ex_UserName);

		// Mobile Number
		double Ex_Mob = excelData.readNumColumn(Ex_File, 1, 10);
		System.out.println("Excel_Mob Num: " + Ex_Mob);

		// Converting double to string
		String S_Mobile = String.valueOf(Ex_Mob);

		// Email ID
		String Ex_Email = excelData.readColumn(Ex_File, 1, 11);
		System.out.println("Excel_Email: " + Ex_Email);

		// Address
		String Ex_Address = excelData.readColumn(Ex_File, 1, 3);
		System.out.println("Excel_Address: " + Ex_Address);

		// Region State
		String Ex_Region = excelData.readColumn(Ex_File, 1, 4);
		System.out.println("Excel_Region: " + Ex_Region);

		// City
		String Ex_City = excelData.readColumn(Ex_File, 1, 5);
		System.out.println("Excel_City: " + Ex_City);

		// LandMark
		String Ex_LMark = excelData.readColumn(Ex_File, 1, 6);
		System.out.println("Excel_LMArk: " + Ex_LMark);

		// ZipCode
		String Ex_ZipCode = excelData.readColumn(Ex_File, 1, 7);
		System.out.println("Excel_ZipCode: " + Ex_ZipCode);

		// Designation
		String Ex_Desg = excelData.readColumn(Ex_File, 1, 9);
		System.out.println("Excel_Designation: " + Ex_Desg);

		TestResultUtils.logger = TestResultUtils.extent.startTest("Merchant OnBoarding");

		/**
		 * I click Merchants tab for Device Assign
		 */
		try {
			if (library.gClick(objects.FT_LMerchant) == true) {

				System.out.println("Successfully Clicked on Merchants tab : Passed");
			} else {
				System.out.println("Unable to click the Merchant tab");
				TestResultUtils.logger.log(LogStatus.FAIL, "Unable to click the Merchant tab" + TestResultUtils.logger
						.addScreenCapture(library.takescreenshot("Unable to click the Merchant tab")));
			}
		} catch (Exception e) {
			System.out.println("Unable to click the Merchant tab");
			TestResultUtils.logger.log(LogStatus.FAIL, "Unable to click the Merchant tab" + TestResultUtils.logger
					.addScreenCapture(library.takescreenshot("Unable to click the Merchant tab")));
		}

		/**
		 * I click first Merchant
		 */
		try {
			if (library.gClick(objects.Frst_Mer) == true) {

				System.out.println("Successfully Clicked on first Merchants tab : Passed");
				// TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on first
				// Merchants tab : Passed"
				// +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully
				// Clicked on Merchants tab")));
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL,
						"Successfully Clicked on first Merchants tab : Failed"
								+ TestResultUtils.logger.addScreenCapture(
										library.takescreenshot("Successfully Clicked on first Merchants tab")));
			}
		} catch (Exception e) {
			TestResultUtils.logger.log(LogStatus.FAIL,
					"Successfully Clicked on first Merchants tab : Failed" + TestResultUtils.logger
							.addScreenCapture(library.takescreenshot("Successfully Clicked on first Merchants tab")));
		}

		/**
		 * I click services
		 */
		try {
			if (library.gClick(objects.M_Services) == true) {

				System.out.println("Successfully Clicked on Services tab : Passed");
				TestResultUtils.logger.log(LogStatus.PASS,
						"Successfully Clicked on Services tab : Passed" + TestResultUtils.logger
								.addScreenCapture(library.takescreenshot("Successfully Clicked on Services tab")));
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL, "Unable to click on Services tab" + TestResultUtils.logger
						.addScreenCapture(library.takescreenshot("Unable to click on Services tab")));
			}
		} catch (Exception e) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Unable to click on Services tab" + TestResultUtils.logger
					.addScreenCapture(library.takescreenshot("Unable to click on Services tab")));
		}

		library.gClick(objects.M_Services);

		/**
		 * I click Documents
		 */
		try {
			if (library.gClick(objects.M_Doc) == true) {

				System.out.println("Successfully Clicked on Documents tab : Passed");
				TestResultUtils.logger.log(LogStatus.PASS,
						"Successfully Clicked on Documents tab : Passed" + TestResultUtils.logger
								.addScreenCapture(library.takescreenshot("Successfully Clicked on Documents tab")));
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL, "Unable to click on Documents tab" + TestResultUtils.logger
						.addScreenCapture(library.takescreenshot("Unable to click on Documents tab")));
			}
		} catch (Exception e) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Unable to click on Documents tab" + TestResultUtils.logger
					.addScreenCapture(library.takescreenshot("Unable to click on Documents tab")));
		}
		library.gClick(objects.M_Doc);

		/**
		 * I click Users
		 */
		try {
			if (library.gClick(objects.M_Users) == true) {

				System.out.println("Successfully Clicked on Users tab : Passed");
				TestResultUtils.logger.log(LogStatus.PASS,
						"Successfully Clicked on Users tab : Passed" + TestResultUtils.logger
								.addScreenCapture(library.takescreenshot("Successfully Clicked on Users tab")));
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL, "Unable to click on Users tab" + TestResultUtils.logger
						.addScreenCapture(library.takescreenshot("Unable to click on Users tab")));
			}
		} catch (Exception e) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Unable to click on Users tab"
					+ TestResultUtils.logger.addScreenCapture(library.takescreenshot("Unable to click on Users tab")));
		}

		// Verifying the User Name
		try {
			String UserName = library.gWebElementGetText(objects.M_UserName);
			System.out.println("UI User Name: " + UserName);

			if (library.gVerifyContainsText(Ex_UserName, UserName) == true) {
				System.out.println("User Name inserted as per the uploaded sheet");
				TestResultUtils.logger.log(LogStatus.PASS, "User Name inserted as per the uploaded sheet");
			} else {
				System.out.println("User name is not inserted as per the sheet. Please check the sheet and the UI");
				TestResultUtils.logger.log(LogStatus.FAIL,
						"User name is not inserted as per the sheet. Please check the sheet and the UI"
								+ TestResultUtils.logger.addScreenCapture(library.takescreenshot(
										"User name is not inserted as per the sheet. Please check the sheet and the UI")));
			}
		} catch (Exception e) {
			System.out.println("User name is not inserted as per the sheet. Please check the sheet and the UI");
			TestResultUtils.logger.log(LogStatus.FAIL,
					"User name is not inserted as per the sheet. Please check the sheet and the UI"
							+ TestResultUtils.logger.addScreenCapture(library.takescreenshot(
									"User name is not inserted as per the sheet. Please check the sheet and the UI")));
		}

		// Verifying the User Email Id
		try {
			String UserID = library.gWebElementGetText(objects.M_UserID);
			System.out.println("UI User ID: " + UserID);

			if (library.gVerifyContainsText(Ex_Email, UserID) == true) {
				System.out.println("User ID inserted as per the uploaded sheet");
				TestResultUtils.logger.log(LogStatus.PASS, "User ID(Email) inserted as per the uploaded sheet");
			} else {
				System.out.println("User ID is not inserted as per the sheet. Please check the sheet and the UI");
				TestResultUtils.logger.log(LogStatus.FAIL,
						"User Name is not inserted as per the sheet. Please check the sheet and the UI"
								+ TestResultUtils.logger.addScreenCapture(library.takescreenshot(
										"User Name is not inserted as per the sheet. Please check the sheet and the UI")));
			}
		} catch (Exception e) {
			System.out.println("User ID is not inserted as per the sheet. Please check the sheet and the UI");
			TestResultUtils.logger.log(LogStatus.FAIL,
					"User Name is not inserted as per the sheet. Please check the sheet and the UI"
							+ TestResultUtils.logger.addScreenCapture(library.takescreenshot(
									"User Name is not inserted as per the sheet. Please check the sheet and the UI")));
		}

		// Verifying the Mobile Number

		/*
		 * String UserMob = library.gWebElementGetText(objects.M_UserID);
		 * System.out.println("UI User Mob: " + UserMob);
		 * 
		 * 
		 * if (library.gVerifyContainsText(S_Mobile, UserMob) == true) {
		 * System.out.println("User Mobile Number inserted as per the uploaded sheet");
		 * TestResultUtils.logger.log(LogStatus.PASS,
		 * "User Mobile Number inserted as per the uploaded sheet"); } else {
		 * System.out.
		 * println("User Mobile Number is not inserted as per the sheet. Please check the sheet and the UI"
		 * ); TestResultUtils.logger.log(LogStatus.FAIL,
		 * "User Mobile Number is not inserted as per the sheet. Please check the sheet and the UI"
		 * + TestResultUtils.logger.addScreenCapture(library.takescreenshot(
		 * "User Mobile Number is not inserted as per the sheet. Please check the sheet and the UI"
		 * ))); }
		 */

		// Verifying the User Status
		try {
			String UserStatus = library.gWebElementGetText(objects.M_UserStatus);
			System.out.println("UI User Status: " + UserStatus);

			if (library.gVerifyContainsText(UserStatus, "Active") == true) {
				System.out.println("User Status is Active");
				TestResultUtils.logger.log(LogStatus.PASS, "User Status is Active");
			} else {
				System.out.println("User is not in Active");
				TestResultUtils.logger.log(LogStatus.FAIL, "User is not in Active"
						+ TestResultUtils.logger.addScreenCapture(library.takescreenshot("User is not in Active")));
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		library.gClick(objects.M_Users);

		/**
		 * I click AddInfo
		 */
		try {
			if (library.gClick(objects.M_AddInfo) == true) {

				System.out.println("Successfully Clicked on AddInfo tab : Passed");
				TestResultUtils.logger.log(LogStatus.PASS,
						"Successfully Clicked on AddInfo tab : Passed" + TestResultUtils.logger
								.addScreenCapture(library.takescreenshot("Successfully Clicked on AddInfo tab")));
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL, "Unable to click on AddInfo tab" + TestResultUtils.logger
						.addScreenCapture(library.takescreenshot("Unable to click on AddInfo tab")));
			}
		} catch (Exception e) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Unable to click on AddInfo tab" + TestResultUtils.logger
					.addScreenCapture(library.takescreenshot("Unable to click on AddInfo tab")));
		}

		// Verifying the Address
		try {
			String UserAdd = library.gWebElementGetText(objects.M_Useradd);
			System.out.println("UI User Add: " + UserAdd);

			if (library.gVerifyContainsText(Ex_Address, UserAdd) == true) {
				System.out.println("User Address inserted as per the uploaded sheet");
				TestResultUtils.logger.log(LogStatus.PASS, "User Address inserted as per the uploaded sheet");
			} else {
				System.out.println("User Address is not inserted as per the sheet. Please check the sheet and the UI");
				TestResultUtils.logger.log(LogStatus.FAIL,
						"User Address is not inserted as per the sheet. Please check the sheet and the UI"
								+ TestResultUtils.logger.addScreenCapture(library.takescreenshot(
										"User Address is not inserted as per the sheet. Please check the sheet and the UI")));
			}
		} catch (Exception e) {
			System.out.println("User Address is not inserted as per the sheet. Please check the sheet and the UI");
			TestResultUtils.logger.log(LogStatus.FAIL,
					"User Address is not inserted as per the sheet. Please check the sheet and the UI"
							+ TestResultUtils.logger.addScreenCapture(library.takescreenshot(
									"User Address is not inserted as per the sheet. Please check the sheet and the UI")));
		}

		// Verifying the User City
		try {
			String UserCity = library.gWebElementGetText(objects.M_UserCity);
			System.out.println("UI User City: " + UserCity);

			if (library.gVerifyContainsText(Ex_City, UserCity) == true) {
				System.out.println("User City inserted as per the uploaded sheet");
				TestResultUtils.logger.log(LogStatus.PASS, "User City inserted as per the uploaded sheet");
			} else {
				System.out.println("User City is not inserted as per the sheet. Please check the sheet and the UI");
				TestResultUtils.logger.log(LogStatus.FAIL,
						"User City is not inserted as per the sheet. Please check the sheet and the UI"
								+ TestResultUtils.logger.addScreenCapture(library.takescreenshot(
										"User City is not inserted as per the sheet. Please check the sheet and the UI")));
			}
		} catch (Exception e) {
			System.out.println("User City is not inserted as per the sheet. Please check the sheet and the UI");
			TestResultUtils.logger.log(LogStatus.FAIL,
					"User City is not inserted as per the sheet. Please check the sheet and the UI"
							+ TestResultUtils.logger.addScreenCapture(library.takescreenshot(
									"User City is not inserted as per the sheet. Please check the sheet and the UI")));
		}

		// Verifying the User Region
		try {
			String UserReg = library.gWebElementGetText(objects.M_UserReg);
			System.out.println("UI User State: " + UserReg);

			if (library.gVerifyContainsText(Ex_Region, UserReg) == true) {
				System.out.println("User Region inserted as per the uploaded sheet");
				TestResultUtils.logger.log(LogStatus.PASS, "User Region inserted as per the uploaded sheet");
			} else {
				System.out.println("User Region is not inserted as per the sheet. Please check the sheet and the UI");
				TestResultUtils.logger.log(LogStatus.FAIL,
						"User Region is not inserted as per the sheet. Please check the sheet and the UI"
								+ TestResultUtils.logger.addScreenCapture(library.takescreenshot(
										"User Region is not inserted as per the sheet. Please check the sheet and the UI")));
			}
		} catch (Exception e) {
			System.out.println("User Region is not inserted as per the sheet. Please check the sheet and the UI");
			TestResultUtils.logger.log(LogStatus.FAIL,
					"User Region is not inserted as per the sheet. Please check the sheet and the UI"
							+ TestResultUtils.logger.addScreenCapture(library.takescreenshot(
									"User Region is not inserted as per the sheet. Please check the sheet and the UI")));
		}

		// Verifying the User LandMark
		try {
			String UserLMArk = library.gWebElementGetText(objects.M_UserLMark);
			System.out.println("UI User LMark: " + UserLMArk);

			if (library.gVerifyContainsText(Ex_LMark, UserLMArk) == true) {
				System.out.println("User LandMark inserted as per the uploaded sheet");
				TestResultUtils.logger.log(LogStatus.PASS, "User LandMark inserted as per the uploaded sheet");
			} else {
				System.out.println("User LandMark is not inserted as per the sheet. Please check the sheet and the UI");
				TestResultUtils.logger.log(LogStatus.FAIL,
						"User LandMark is not inserted as per the sheet. Please check the sheet and the UI"
								+ TestResultUtils.logger.addScreenCapture(library.takescreenshot(
										"User LandMark is not inserted as per the sheet. Please check the sheet and the UI")));
			}
		} catch (Exception e) {
			System.out.println("User LandMark is not inserted as per the sheet. Please check the sheet and the UI");
			TestResultUtils.logger.log(LogStatus.FAIL,
					"User LandMark is not inserted as per the sheet. Please check the sheet and the UI"
							+ TestResultUtils.logger.addScreenCapture(library.takescreenshot(
									"User LandMark is not inserted as per the sheet. Please check the sheet and the UI")));
		}

		// Verifying the User Address Status
		try {
			String UserAdd_Status = library.gWebElementGetText(objects.M_UserAddStatus);
			System.out.println("UI User Address Status: " + UserAdd_Status);

			if (library.gVerifyContainsText(UserAdd_Status, "Active") == true) {
				System.out.println("User Address Status is Active");
				TestResultUtils.logger.log(LogStatus.PASS, "User Address Status is Active");
			} else {
				System.out.println("User Address is not in Active");
				TestResultUtils.logger.log(LogStatus.FAIL, "User Address is not in Active" + TestResultUtils.logger
						.addScreenCapture(library.takescreenshot("User Address is not in Active")));
			}
		} catch (Exception e) {
			System.out.println("User Address is not in Active");
			TestResultUtils.logger.log(LogStatus.FAIL, "User Address is not in Active"
					+ TestResultUtils.logger.addScreenCapture(library.takescreenshot("User Address is not in Active")));
		}

		library.gClick(objects.M_AddInfo);

		/**
		 * I click ContInfo
		 */
		try {
			if (library.gClick(objects.M_ContInfo) == true) {

				System.out.println("Successfully Clicked on ContInfo tab : Passed");
				TestResultUtils.logger.log(LogStatus.PASS,
						"Successfully Clicked on ContInfo tab : Passed" + TestResultUtils.logger
								.addScreenCapture(library.takescreenshot("Successfully Clicked on ContInfo tab")));
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL, "Unable to click on ContInfo tab" + TestResultUtils.logger
						.addScreenCapture(library.takescreenshot("Unable to click on ContInfo tab")));
			}
		} catch (Exception e) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Unable to click on ContInfo tab" + TestResultUtils.logger
					.addScreenCapture(library.takescreenshot("Unable to click on ContInfo tab")));
		}

		// Verifying the User Name in Contact info tab
		try {
			String UserName = library.gWebElementGetText(objects.M_UserName_Cont);
			System.out.println("UI User Name: " + UserName);

			if (library.gVerifyContainsText(Ex_UserName, UserName) == true) {
				System.out.println("User Name inserted as per the uploaded sheet");
				TestResultUtils.logger.log(LogStatus.PASS,
						"User Name inserted in contact info tab as per the uploaded sheet");
			} else {
				System.out.println("User name is not inserted as per the sheet. Please check the sheet and the UI");
				TestResultUtils.logger.log(LogStatus.FAIL,
						"User name is not inserted as per the sheet. Please check the sheet and the UI"
								+ TestResultUtils.logger.addScreenCapture(library.takescreenshot(
										"User name is not inserted as per the sheet. Please check the sheet and the UI")));
			}
		} catch (Exception e) {
			System.out.println("User name is not inserted as per the sheet. Please check the sheet and the UI");
			TestResultUtils.logger.log(LogStatus.FAIL,
					"User name is not inserted as per the sheet. Please check the sheet and the UI"
							+ TestResultUtils.logger.addScreenCapture(library.takescreenshot(
									"User name is not inserted as per the sheet. Please check the sheet and the UI")));
		}

		// Verifying the User Email Id in Contact info tab
		try {
			String UserID = library.gWebElementGetText(objects.M_UserEmail_Cont);
			System.out.println("UI User ID: " + UserID);

			if (library.gVerifyContainsText(Ex_Email, UserID) == true) {
				System.out.println("User ID inserted as per the uploaded sheet");
				TestResultUtils.logger.log(LogStatus.PASS,
						"User ID(Email) inserted  in contact info tab as per the uploaded sheet");
			} else {
				System.out.println("User ID is not inserted as per the sheet. Please check the sheet and the UI");
				TestResultUtils.logger.log(LogStatus.FAIL,
						"User Name is not inserted as per the sheet. Please check the sheet and the UI"
								+ TestResultUtils.logger.addScreenCapture(library.takescreenshot(
										"User Name is not inserted as per the sheet. Please check the sheet and the UI")));
			}
		} catch (Exception e) {
			System.out.println("User ID is not inserted as per the sheet. Please check the sheet and the UI");
			TestResultUtils.logger.log(LogStatus.FAIL,
					"User Name is not inserted as per the sheet. Please check the sheet and the UI"
							+ TestResultUtils.logger.addScreenCapture(library.takescreenshot(
									"User Name is not inserted as per the sheet. Please check the sheet and the UI")));
		}

		// Verifying the User Designation in Contact info tab
		try {
			String UserDesg = library.gWebElementGetText(objects.M_Desig);
			System.out.println("UI User Desg: " + UserDesg);

			if (library.gVerifyContainsText(Ex_Desg, UserDesg) == true) {
				System.out.println("User Desg inserted as per the uploaded sheet");
				TestResultUtils.logger.log(LogStatus.PASS,
						"User Designation inserted in contact info tab  as per the uploaded sheet");
			} else {
				System.out.println("User Desg is not inserted as per the sheet. Please check the sheet and the UI");
				TestResultUtils.logger.log(LogStatus.FAIL,
						"User Desg is not inserted as per the sheet. Please check the sheet and the UI"
								+ TestResultUtils.logger.addScreenCapture(library.takescreenshot(
										"User Desg is not inserted as per the sheet. Please check the sheet and the UI")));
			}
		} catch (Exception e) {
			System.out.println("User Desg is not inserted as per the sheet. Please check the sheet and the UI");
			TestResultUtils.logger.log(LogStatus.FAIL,
					"User Desg is not inserted as per the sheet. Please check the sheet and the UI"
							+ TestResultUtils.logger.addScreenCapture(library.takescreenshot(
									"User Desg is not inserted as per the sheet. Please check the sheet and the UI")));
		}
		try {
			// Verifying the User Address Status
			String UserContact_Status = library.gWebElementGetText(objects.M_Cont_Status);
			System.out.println("UI User Contact Status: " + UserContact_Status);

			if (library.gVerifyContainsText(UserContact_Status, "Active") == true) {
				System.out.println("User Contact Status is Active");
				TestResultUtils.logger.log(LogStatus.PASS, "User Contact Status is Active  in contact info tab");
			} else {
				System.out.println("User Contact is not in Active");
				TestResultUtils.logger.log(LogStatus.FAIL, "User Contact is not in Active" + TestResultUtils.logger
						.addScreenCapture(library.takescreenshot("User Contact is not in Active")));
			}
		} catch (Exception e) {
			System.out.println("User Contact is not in Active");
			TestResultUtils.logger.log(LogStatus.FAIL, "User Contact is not in Active"
					+ TestResultUtils.logger.addScreenCapture(library.takescreenshot("User Contact is not in Active")));
		}

		library.gClick(objects.M_ContInfo);

		/**
		 * I click BanknInfo
		 */
		try {
			if (library.gClick(objects.M_BankInfo) == true) {

				Thread.sleep(3000);
				System.out.println("Successfully Clicked on BankInfo tab : Passed");
				TestResultUtils.logger.log(LogStatus.PASS,
						"Successfully Clicked on BankInfo tab : Passed" + TestResultUtils.logger
								.addScreenCapture(library.takescreenshot("Successfully Clicked on BankInfo tab")));
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL, "Unable to click on BankInfo tab" + TestResultUtils.logger
						.addScreenCapture(library.takescreenshot("Unable to click on BankInfo tab")));
			}
		} catch (Exception e) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Unable to click on BankInfo tab" + TestResultUtils.logger
					.addScreenCapture(library.takescreenshot("Unable to click on BankInfo tab")));
		}
		library.gClick(objects.M_BankInfo);

		/**
		 * I click GateWaystab
		 */
		try {
			if (library.gClick(objects.M_Gateway) == true) {

				System.out.println("Successfully Clicked on GateWaystab tab : Passed");
				TestResultUtils.logger.log(LogStatus.PASS,
						"Successfully Clicked on GateWaystab tab : Passed" + TestResultUtils.logger
								.addScreenCapture(library.takescreenshot("Successfully Clicked on GateWaystab tab")));
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL, "Unable to click on GateWaystab tab" + TestResultUtils.logger
						.addScreenCapture(library.takescreenshot("Unable to click on GateWaystab tab")));
			}
		} catch (Exception e) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Unable to click on GateWaystab tab" + TestResultUtils.logger
					.addScreenCapture(library.takescreenshot("Unable to click on GateWaystab tab")));
		}
		library.gClick(objects.M_Gateway);

		/**
		 * I click POS MID TID
		 */
		try {
			if (library.gClick(objects.M_POSMID) == true) {

				System.out.println("Successfully Clicked on POSMIDTID tab : Passed");
				TestResultUtils.logger.log(LogStatus.PASS,
						"Successfully Clicked on POSMIDTID tab : Passed" + TestResultUtils.logger
								.addScreenCapture(library.takescreenshot("Successfully Clicked on POSMIDTID tab")));
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL, "Unable to click on POSMIDTID tab" + TestResultUtils.logger
						.addScreenCapture(library.takescreenshot("Unable to click on POSMIDTID tab")));
			}
		} catch (Exception e) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Unable to click on POSMIDTID tab" + TestResultUtils.logger
					.addScreenCapture(library.takescreenshot("Unable to click on POSMIDTID tab")));
		}

		try {
			String AcqProcessr = library.gWebElementGetText(objects.M_AcqProcr);
			System.out.println("Acq Processor: " + AcqProcessr);

			if (library.gVerifyContainsText(AcqProcessr, "Axis-Prizm") == true) {
				System.out.println("Processor is Axis Prizm which is expected");
				TestResultUtils.logger.log(LogStatus.PASS, "Processor is Axis Prizm which is expected");
			} else {
				System.out.println("Processor is not as of selected drop down");
				TestResultUtils.logger.log(LogStatus.FAIL,
						"Processor is not as of selected drop down" + TestResultUtils.logger
								.addScreenCapture(library.takescreenshot("Processor is not as of selected drop down")));
			}
		} catch (Exception e) {
			System.out.println("Processor is not as of selected drop down");
			TestResultUtils.logger.log(LogStatus.FAIL,
					"Processor is not as of selected drop down" + TestResultUtils.logger
							.addScreenCapture(library.takescreenshot("Processor is not as of selected drop down")));
		}

		try {
			String MIDSts = library.gWebElementGetText(objects.M_MidStatus);
			System.out.println("MID Status: " + MIDSts);

			if (library.gVerifyContainsText(MIDSts, "APPROVED") == true) {
				System.out.println("MID TID are in Approved Status");
				TestResultUtils.logger.log(LogStatus.PASS, "MID TID are in Approved Status");
			} else {
				System.out.println("MID TID are not in Approved Status. Please upload POS MID Approval Sheet");
				TestResultUtils.logger.log(LogStatus.FAIL,
						"MID TID are not in Approved Status. Please upload POS MID Approval Sheet"
								+ TestResultUtils.logger.addScreenCapture(
										library.takescreenshot("MID TID are not in Approved Status.")));
			}
		} catch (Exception e) {
			System.out.println("MID TID are not in Approved Status. Please upload POS MID Approval Sheet");
			TestResultUtils.logger.log(LogStatus.FAIL,
					"MID TID are not in Approved Status. Please upload POS MID Approval Sheet" + TestResultUtils.logger
							.addScreenCapture(library.takescreenshot("MID TID are not in Approved Status.")));
		}
		library.gClick(objects.M_POSMID);

		/**
		 * I click Devices
		 */
		try {
			if (library.gClick(objects.M_Devices) == true) {

				System.out.println("Successfully Clicked on Devices tab : Passed");
				TestResultUtils.logger.log(LogStatus.PASS,
						"Successfully Clicked on Devices tab : Passed" + TestResultUtils.logger
								.addScreenCapture(library.takescreenshot("Successfully Clicked on Devices tab")));
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL, "Unable to click on Devices tab" + TestResultUtils.logger
						.addScreenCapture(library.takescreenshot("Unable to click on Devices tab")));
			}
		} catch (Exception e) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Unable to click on Devices tab" + TestResultUtils.logger
					.addScreenCapture(library.takescreenshot("Unable to click on Devices tab")));
		}

		WebDriverWait EleWait = new WebDriverWait(testSuite.driver, 2);
		EleWait.until(ExpectedConditions.visibilityOfElementLocated(objects.FT_AsssigneNewDevice));

		/**
		 * I click Assign New Device
		 */
		try {
			if (library.gClick(objects.FT_AsssigneNewDevice) == true) {

				System.out.println("Successfully Clicked on Assign New Device tab: Passed");
				// TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on Assign
				// New Device tab : Passed");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL,
						"Successfully Clicked on Assign New Device tab : Failed"
								+ TestResultUtils.logger.addScreenCapture(
										library.takescreenshot("Successfully Clicked on Assign New Device tab")));
			}
		} catch (Exception e) {
			TestResultUtils.logger.log(LogStatus.FAIL,
					"Successfully Clicked on Assign New Device tab : Failed" + TestResultUtils.logger
							.addScreenCapture(library.takescreenshot("Successfully Clicked on Assign New Device tab")));
		}

		/**
		 * I select Device Model from Drop Down
		 */
		try {
			if (library.gListSelectByisibleText(objects.FT_DeviceModel, SeleniumNGSuite.Dev_Sel) == true) {

				System.out.println("Successfully selected the device from drop down: Passed");
				// TestResultUtils.logger.log(LogStatus.PASS, "Successfully selected the device
				// from drop down: Passed");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL,
						"Successfully selected the device from drop down: Failed"
								+ TestResultUtils.logger.addScreenCapture(
										library.takescreenshot("Successfully selected the device from drop down")));

			}
		} catch (Exception e) {
			TestResultUtils.logger.log(LogStatus.FAIL,
					"Successfully selected the device from drop down: Failed" + TestResultUtils.logger.addScreenCapture(
							library.takescreenshot("Successfully selected the device from drop down")));
		}

		/**
		 * I assign the number of devices in the field
		 */
		try {
			if (library.sendText(objects.FT_Dev2BAssigned, String.valueOf(2)) == true) {

				System.out.println("Successfully entered the number : Passed");
				// TestResultUtils.logger.log(LogStatus.PASS, "Successfully entered the number :
				// Passed");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL,
						"Successfully entered the number : Failed" + TestResultUtils.logger
								.addScreenCapture(library.takescreenshot("Successfully entered the number")));

			}
		} catch (Exception e) {
			TestResultUtils.logger.log(LogStatus.FAIL,
					"Successfully entered the number : Failed" + TestResultUtils.logger
							.addScreenCapture(library.takescreenshot("Successfully entered the number")));
		}

		/**
		 * I click on Show Button
		 */
		try {
			if (library.gClick(objects.FT_Show) == true) {

				System.out.println("Successfully clicked on Show button : Passed");

			} else {
				System.out.println("Successfully clicked on Show button : Failed");

			}
		} catch (Exception e) {
			System.out.println("Successfully clicked on Show button : Failed");
			TestResultUtils.logger.log(LogStatus.FAIL,
					"Successfully clicked on Show button : Failed" + TestResultUtils.logger
							.addScreenCapture(library.takescreenshot("Successfully clicked on Show button : Failed")));
		}

		// To handle the no devices case- After enhancement in the application
		try {

			if (library.gClick(objects.FT_Show) == true) {

				// Getting text from confirmation window pop-up
				String ConfText = library.gWebElementGetText(By.xpath("html/body/div[6]/p"));

				System.out.println("Insufficient Devices" + ConfText);
				TestResultUtils.logger.log(LogStatus.FAIL, "Insufficient Devices For Device Model"
						+ TestResultUtils.logger.addScreenCapture(library.takescreenshot("Insufficient Devices")));

				// Clicking on OK button
				library.gClick(By.xpath("html/body/div[7]/div[7]/button[2]"));
				library.gClick(By.xpath(".//*[@id='assignTerminalsNew']/div/div/div[1]/button"));
				System.out.println("Closed the Device Assignement Panel");

				System.out.println("Successfully clicked on Show button : Passed");
				TestResultUtils.logger.log(LogStatus.PASS, "Successfully clicked on Show button : Passed");
			} else {
				System.out.println("Successfully Device has been Selected");
				TestResultUtils.logger.log(LogStatus.PASS, "Successfully Selected the Devices");

			}

		} catch (Exception e) {
			System.out.println("Successfully Device has been Selected");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully Selected the Devices");

		}

		/**
		 * I click on Assign Button
		 */
		try {
			if (library.gClick(objects.FT_Assign) == true) {

				System.out.println("Successfully clicked on Assign button : Passed");

			} else {
				TestResultUtils.logger.log(LogStatus.FAIL,
						"Successfully clicked on Assign button : Failed" + TestResultUtils.logger
								.addScreenCapture(library.takescreenshot("Successfully clicked on Assign button")));

			}
		} catch (Exception e) {
			TestResultUtils.logger.log(LogStatus.FAIL,
					"Successfully clicked on Assign button : Failed" + TestResultUtils.logger
							.addScreenCapture(library.takescreenshot("Successfully clicked on Assign button")));

		}

		/**
		 * I click on OK Button
		 */
		try {

			WebDriverWait wait = new WebDriverWait(testSuite.driver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(objects.OK_Text));
			library.gClick(objects.FT_TerOK);

		} catch (Exception exception) {
			System.out.println("Popup is not displayed: ReCheck");
			TestResultUtils.logger.log(LogStatus.FAIL, "Popup is not displayed: ReCheck");
		}

		/**
		 * I click on Auto Config Button
		 */
		try {
			if (library.gClick(objects.FT_AutoConfig) == true) {

				System.out.println("Successfully clicked on Auto Config button : Passed");
				TestResultUtils.logger.log(LogStatus.PASS, "Successfully clicked on Auto Config button : Passed");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL,
						"Successfully clicked on Auto Config button : Failed" + TestResultUtils.logger.addScreenCapture(
								library.takescreenshot("Successfully clicked on Auto Config button")));

			}
		} catch (Exception e) {
			TestResultUtils.logger.log(LogStatus.FAIL,
					"Successfully clicked on Auto Config button : Failed" + TestResultUtils.logger
							.addScreenCapture(library.takescreenshot("Successfully clicked on Auto Config button")));

		}

		/**
		 * I select processor from auto config popup
		 */
		/**
		 * I select the value from Drop Down
		 */
		try {
			if (library.gClick(objects.Auto_Proc) == true) {
				System.out.println("Clicked on Auto Config");
			} else {
				System.out.println("Unable to click Auto Config");
			}
		} catch (Exception e) {
			System.out.println("Unable to click Auto Config");
			TestResultUtils.logger.log(LogStatus.FAIL, "User Contact is not in Active"
					+ TestResultUtils.logger.addScreenCapture(library.takescreenshot("User Contact is not in Active")));
		}

		try {
			if (library.sendText(objects.Auto_VProc, SeleniumNGSuite.Bank_DP) == true) {
				System.out.println("Selected Bank Drop Down");
			} else {
				System.out.println("Unable to select the Bank DP");
			}
		} catch (Exception e) {
			System.out.println("Unable to select the Bank DP");
			TestResultUtils.logger.log(LogStatus.FAIL, "Unable to select the Bank DP"
					+ TestResultUtils.logger.addScreenCapture(library.takescreenshot("Unable to select the Bank DP")));
		}

		try {
			if (library.gClick(objects.Auto_SelRes) == true) {

			} else {
				System.out.println("Unable to select the Auto Select Result");
			}
		} catch (Exception e) {
			System.out.println("Unable to select the Auto Select Result");
			TestResultUtils.logger.log(LogStatus.FAIL,
					"Unable to select the Auto Select Result" + TestResultUtils.logger
							.addScreenCapture(library.takescreenshot("Unable to select the Auto Select Result")));
		}

		try {

			if (library.gClick(objects.Auto_Submit) == true) {
				System.out.println("Successfully clickec Auto Submit");
			} else {
				System.out.println("Unable to click Auto Submit");
			}
		} catch (Exception exception) {
			System.out.println("Unable to click Auto Submit");
			TestResultUtils.logger.log(LogStatus.FAIL, "Unable to click Auto Submit"
					+ TestResultUtils.logger.addScreenCapture(library.takescreenshot("Unable to click Auto Submit")));

		}
		/**
		 * I click on Success Button
		 */
		try {
			if (library.gClick(objects.Auto_SuccessOK) == true) {

				System.out.println("Successfully clicked on SuccessOK button : Passed");
				TestResultUtils.logger.log(LogStatus.PASS, "AutoConfig and Merchant is Live: Passed");
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL,
						"Successfully clicked on SuccessOK button : Failed" + TestResultUtils.logger
								.addScreenCapture(library.takescreenshot("Successfully clicked on SuccessOK button")));

			}
		} catch (Exception e) {
			TestResultUtils.logger.log(LogStatus.FAIL,
					"Successfully clicked on SuccessOK button : Failed" + TestResultUtils.logger
							.addScreenCapture(library.takescreenshot("Successfully clicked on SuccessOK button")));
		}

		DeviceNum = library.gWebElementGetText(objects.Device1);
		System.out.println("Deivce Number: " + DeviceNum);

		try {
			String DeviceStatus = library.gWebElementGetText(objects.Dev_Status);
			System.out.println("Device Status: " + DeviceStatus);

			if (library.gVerifyContainsText(DeviceStatus, "Live") == true) {
				System.out.println("Device Status is LIVE");
				TestResultUtils.logger.log(LogStatus.PASS, "Device Status is LIVE");
			} else {
				System.out.println("Device Status is not LIVE. Please check the Terminal and POS MID Status");
				TestResultUtils.logger.log(LogStatus.FAIL,
						"Device Status is not LIVE. Please check the Terminal and POS MID Status"
								+ TestResultUtils.logger
										.addScreenCapture(library.takescreenshot("Device Status is not LIVE.")));
			}
		} catch (Exception e) {

			System.out.println("Device Status is not LIVE. Please check the Terminal and POS MID Status");
			TestResultUtils.logger.log(LogStatus.FAIL,
					"Device Status is not LIVE. Please check the Terminal and POS MID Status" + TestResultUtils.logger
							.addScreenCapture(library.takescreenshot("Device Status is not LIVE.")));
		}
		try {
			if (library.gClick(objects.M_Devices) == true) {
				System.out.println("Clicked on Devices");
			} else {
				System.out.println("Unable to click on Devices");
			}
		} catch (Exception e) {
			System.out.println("Unable to click on Devices");
			TestResultUtils.logger.log(LogStatus.FAIL, "Unable to click on Devices"
					+ TestResultUtils.logger.addScreenCapture(library.takescreenshot("Unable to click on Devices")));
		}

		/**
		 * I click Terminals
		 */
		try {
			if (library.gClick(objects.M_Terminals) == true) {

				System.out.println("Successfully Clicked on Terminals tab : Passed");
				TestResultUtils.logger.log(LogStatus.PASS,
						"Successfully Clicked on Terminals tab : Passed" + TestResultUtils.logger
								.addScreenCapture(library.takescreenshot("Successfully Clicked on Terminals tab")));
			} else {
				TestResultUtils.logger.log(LogStatus.FAIL, "Unable to click on Terminals tab" + TestResultUtils.logger
						.addScreenCapture(library.takescreenshot("Unable to click on Terminals tab")));
			}
		} catch (Exception e) {

			TestResultUtils.logger.log(LogStatus.FAIL, "Unable to click on Terminals tab" + TestResultUtils.logger
					.addScreenCapture(library.takescreenshot("Unable to click on Terminals tab")));
		}

		try {
			String Terminal_Dev = library.gWebElementGetText(objects.terminal1);
			System.out.println("Terminal Device Number: " + Terminal_Dev);

			if (library.gVerifyContainsText(DeviceNum, Terminal_Dev)) {

				System.out.println("Device inserted in Terminal tab as expected");
				TestResultUtils.logger.log(LogStatus.PASS, "Device inserted in Terminal tab as expected");
			} else {
				System.out.println(
						"Device not inserted in Terminal tab or device in terminal tab is not the correct device");
				TestResultUtils.logger.log(LogStatus.FAIL,
						"Device not inserted in Terminal tab or device in terminal tab is not the correct device"
								+ TestResultUtils.logger.addScreenCapture(
										library.takescreenshot("Device not inserted in Terminal tab")));
			}
		} catch (Exception e) {
			System.out
					.println("Device not inserted in Terminal tab or device in terminal tab is not the correct device");
			TestResultUtils.logger.log(LogStatus.FAIL,
					"Device not inserted in Terminal tab or device in terminal tab is not the correct device"
							+ TestResultUtils.logger
									.addScreenCapture(library.takescreenshot("Device not inserted in Terminal tab")));
		}

		library.gClick(objects.M_Terminals);

		// I click on Devices side menu
		try {
			if (library.gClick(objects.SDevices) == true) {
				System.out.println("Clicked on Devices tab");

			} else {
				System.out.println("Unable to click on Devices tab");
				TestResultUtils.logger.log(LogStatus.FAIL, "Unable to click on Devices tab" + TestResultUtils.logger
						.addScreenCapture(library.takescreenshot("Unable to click on Devices tab")));
			}
		} catch (Exception e) {
			System.out.println("Unable to click on Devices tab");
			TestResultUtils.logger.log(LogStatus.FAIL, "Unable to click on Devices tab" + TestResultUtils.logger
					.addScreenCapture(library.takescreenshot("Unable to click on Devices tab")));
		}

		try {
			if (library.gListSelectByisibleText(objects.Device_DD, "Serial No.") == true) {
				System.out.println("Successfully selected from Drop Down");
			} else {
				System.out.println("Unable to select from the drop down");
				TestResultUtils.logger.log(LogStatus.FAIL,
						"Unable to select from the drop down" + TestResultUtils.logger
								.addScreenCapture(library.takescreenshot("Unable to select from the drop down")));
			}
		} catch (Exception e) {
			System.out.println("Unable to select from the drop down");
			TestResultUtils.logger.log(LogStatus.FAIL, "Unable to select from the drop down" + TestResultUtils.logger
					.addScreenCapture(library.takescreenshot("Unable to select from the drop down")));
		}

		try {
			if (library.sendText(objects.D_Text, DeviceNum) == true) {
				System.out.println("Sucessfully enterted the device serial number in the search field");

			} else {
				System.out.println("Unable to enter the device number");
				TestResultUtils.logger.log(LogStatus.FAIL, "Unable to enter the device number" + TestResultUtils.logger
						.addScreenCapture(library.takescreenshot("Unable to enter the device number")));
			}
		} catch (Exception e) {
			System.out.println("Unable to enter the device number");
			TestResultUtils.logger.log(LogStatus.FAIL, "Unable to enter the device number" + TestResultUtils.logger
					.addScreenCapture(library.takescreenshot("Unable to enter the device number")));
		}

		try {
			if (library.gClick(objects.D_Go) == true) {
				System.out.println("Sucessfully clicked on GO button from Devices Screen");

			} else {
				System.out.println("Unable to click GO from the Devices Screen");
				TestResultUtils.logger.log(LogStatus.FAIL,
						"Unable to click GO from the Devices Screen" + TestResultUtils.logger.addScreenCapture(
								library.takescreenshot("Unable to click GO from the Devices Screen")));
			}
		} catch (Exception e) {
			System.out.println("Unable to click GO from the Devices Screen");
			TestResultUtils.logger.log(LogStatus.FAIL,
					"Unable to click GO from the Devices Screen" + TestResultUtils.logger
							.addScreenCapture(library.takescreenshot("Unable to click GO from the Devices Screen")));
		}

		try {
			String InvStatus = library.gWebElementGetText(objects.D_InvStatus);
			System.out.println("Device Inventory Status: " + InvStatus);

			if (library.gVerifyContainsText(InvStatus, "Installation Pending")) {

				System.out.println("Device updated to Installation Pending");
				TestResultUtils.logger.log(LogStatus.PASS,
						"Device status updated to Installation Pending" + TestResultUtils.logger
								.addScreenCapture(library.takescreenshot("Device status- Installation Pending.")));
			} else {
				System.out.println("Device status not updated.");
				TestResultUtils.logger.log(LogStatus.FAIL, "Device status not updated." + TestResultUtils.logger
						.addScreenCapture(library.takescreenshot("Device status not updated.")));
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
