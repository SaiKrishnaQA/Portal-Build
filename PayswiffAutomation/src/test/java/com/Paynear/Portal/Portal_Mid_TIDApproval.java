/*
 * @author Sai G
 * 
 */
package com.Paynear.Portal;

import org.testng.annotations.Test;

import com.Portal.Panel.Merchants_D_Panel;
import com.payswiff.config.SeleniumNGSuite;
import com.payswiff.constants.Constants;
import com.payswiff.util.DriverUtilsImpl;
import com.payswiff.util.FT_GenricUtily;
import com.payswiff.util.TestResultUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Portal_Mid_TIDApproval {

	/** The base project path. */
	public static String baseProjectPath = System.getProperty(Constants.USER_DIR);
	
	SeleniumNGSuite testSuite = new SeleniumNGSuite();
	DriverUtilsImpl library = new DriverUtilsImpl();
	Merchants_D_Panel objects= new Merchants_D_Panel();

	@Test(priority = 4)
	public void FT_MidApproval() throws Exception {
		TestResultUtils.logger= TestResultUtils.extent.startTest("MID_TID Approaval");

		/**
		 * I click Merchants tab 
		 */
		try {
			if(library.gClick(objects.FT_LMerchant) == true) 

				System.out.println("Successfully Clicked on Merchants tab : Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on Merchants tab : Passed");
		}catch(Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully Clicked on Merchants tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Merchants tab")));

		}

		/**
		 * I click MID TID Approval tab 
		 */
		try {
			if(library.gClick(objects.FT_MIDApproval) == true) 

				System.out.println("Successfully Clicked on POS Approvals tab : Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on POS Approvals tab : Passed");
		}catch(Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully Clicked on POS Approvals tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on POS Approvals tab")));

		}


		/**
		 * I select the value from Drop Down 
		 */
		try {
			library.gClick(objects.SM_SProc);

			library.sendText(objects.SM_VProc, SeleniumNGSuite.Bank_DP);

			library.gClick(objects.SM_SelRes);

			TestResultUtils.logger.log(LogStatus.PASS, "Successfully Selected from the Drop Down: Passed");
		}catch(Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL, "SSuccessfully Selected from the Drop Down : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Selected from the Drop Down")));

		}

		/**
		 * I click MID TID Approval tab 
		 */
		try {
			if(library.gClick(objects.FT_MerchAppSelectF) == true) 

				System.out.println("Successfully Clicked on Select File tab : Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on Select File tab : Passed");
		}catch(Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully Clicked on Select File tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Select File tab")));

		}

		// Selecting POS template
		Thread.sleep(1000);

		String FileName= SeleniumNGSuite.Bank_Processor;

		switch (FileName) {
		case Constants.Axis:
			try {

				FT_GenricUtily.Robotchoosfile(baseProjectPath.concat(Constants.Axis_Approval_File));
				//FT_GenricUtily.Robotchoosfile("/home/itadmin/Desktop/sai/workspace/PayswiffAutomation/src/main/resources/Upload_Scripts/POS Res Templete.xls");
				System.out.println("File is selected");

			} catch (Exception exception) {
				exception.printStackTrace();
			}
			break;

		case Constants.RBL:
			try{

				FT_GenricUtily.Robotchoosfile(baseProjectPath.concat(Constants.RBL_Approval_File));
				//FT_GenricUtily.Robotchoosfile("/home/itadmin/Desktop/sai/workspace/PayswiffAutomation/src/main/resources/Upload_Scripts/RBL files/POS RBL Res Templete.xls");
				System.out.println("File is selected");

			} catch (Exception exception) {
				exception.printStackTrace();
			}
		}

		// Selecting POS template
		Thread.sleep(1000);

		FT_GenricUtily.Robotchoosfile(FT_GenricUtily.RobotFlpath("POS Res Templete"));
		System.out.println("File is selected");

		Thread.sleep(2000);
		//click on Upload
		library.gClick(objects.FT_MerchAppUpload);
		System.out.println("Clicked on upload button");

		try {
			//Thread.sleep(1000);

			// Getting text from confirmation window pop-up
			String ConfText = library.gWebElementGetText(objects.FT_MerchApprovalText);
			System.out.println("Confirmation Text: " +ConfText);
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully Approved all the MID's and TID's");

			// Clicking on OK button
			library.gClick(objects.FT_MerchApprovalOK);
			//Elements_LeadCreate.BtnOk.click();
			System.out.println("Clicked on OK button");
			Thread.sleep(2000);
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully Approved all the MID's and TID's" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Approved all the MID's and TID's")));

		} catch (Exception e) {
			System.out.println("File already exist");
			TestResultUtils.logger.log(LogStatus.FAIL, "Unable to OnBoard the MIDs and TIDs. Please Verify the File and retry" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("POS Files Upload")));
			library.gClick(objects.FT_OK);
			//Elements_LeadCreate.BtnOk.click();

			library.gClick(objects.FT_CloseIcon);
			//Elements_MIDTID.Closeicon.click();
			System.out.println("Clicked on close icon");
		}

	}

}
