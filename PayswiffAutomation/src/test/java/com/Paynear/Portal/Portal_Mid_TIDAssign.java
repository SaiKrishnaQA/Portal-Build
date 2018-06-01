/*
 * @author Sai G
 * 
 */
package com.Paynear.Portal;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Portal.Panel.Merchants_D_Panel;
import com.payswiff.config.SeleniumNGSuite;
import com.payswiff.constants.Constants;
import com.payswiff.util.DriverUtilsImpl;
import com.payswiff.util.FT_GenricUtily;
import com.payswiff.util.TestResultUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Portal_Mid_TIDAssign {

	/** The base project path. */
	public static String baseProjectPath = System.getProperty(Constants.USER_DIR);

	SeleniumNGSuite testSuite = new SeleniumNGSuite();
	DriverUtilsImpl library = new DriverUtilsImpl();
	Merchants_D_Panel objects= new Merchants_D_Panel();

	@Test(priority= 3)
	public void FT_MIDUpload() throws Exception {

		TestResultUtils.logger= TestResultUtils.extent.startTest("MID & TID Assign to merchants");

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
		 * I click MID TID Assign tab 
		 */
		try {
			if(library.gClick(objects.FT_MIDUpload) == true) 

				System.out.println("Successfully Clicked on POS File upload tab : Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on POS File upload tab : Passed");
		}catch(Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully Clicked on POS File upload tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on POS File upload tab")));

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
		 * I click MID TID Assign tab 
		 */
		try {
			if(library.gClick(objects.FT_MIDSelTab) == true) 

				System.out.println("Successfully Clicked on select File tab : Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on select File tab : Passed");
		}catch(Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully Clicked on select File tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on select File tab")));

		}


		// Selecting POS template
		Thread.sleep(1000);

		String FileName= SeleniumNGSuite.Bank_Processor;

		switch (FileName) {
		case Constants.Axis:
			try {

				FT_GenricUtily.Robotchoosfile(baseProjectPath.concat(Constants.AxisFile));
				//FT_GenricUtily.Robotchoosfile("/home/itadmin/Desktop/sai/workspace/PayswiffAutomation/src/main/resources/Upload_Scripts/POS_Req_Templete.xls");
				System.out.println("File is selected");

			} catch (Exception exception) {
				exception.printStackTrace();
			}
			break;


		case Constants.RBL:
			try{

				FT_GenricUtily.Robotchoosfile(baseProjectPath.concat(Constants.RBLFile));
				//FT_GenricUtily.Robotchoosfile("/home/itadmin/Desktop/sai/workspace/PayswiffAutomation/src/main/resources/Upload_Scripts/RBL files/RBL Request.xls");
				System.out.println("File is selected");

			} catch (Exception exception) {
				exception.printStackTrace();
			}
		}

		Thread.sleep(2000);


		/**
		 * I click Upload tab 
		 */
		try {
			if(library.gClick(objects.FT_Upload) == true) 

				System.out.println("Successfully Clicked on upload button : Passed");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on Upload button : Passed");
		}catch(Exception exception) {
			TestResultUtils.logger.log(LogStatus.FAIL, "Successfully Clicked on Upload button : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Upload button")));


		}


		try {
			//Thread.sleep(1000);

			// Getting text from confirmation window pop-up
			String ConfText = library.gWebElementGetText(objects.FT_MIDConfirmation);
			System.out.println("Confirmation Text: " +ConfText);
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully Onboarded all the MID's and TID's");

			// Clicking on OK button
			library.gClick(objects.FT_OK);
			//Elements_LeadCreate.BtnOk.click();
			System.out.println("Clicked on OK button");
			TestResultUtils.logger.log(LogStatus.PASS, "Successfully Onboarded all the MID's and TID's" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully assigned MID and TID to the Merchant")));

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