/*
 * @author Sai G
 * 
 */
package com.FTCash.Panel;

import java.io.OutputStream;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

import com.payswiff.config.SeleniumNGSuite;
import com.payswiff.constants.Constants;
import com.payswiff.util.DriverUtilsImpl;
import com.payswiff.util.TestResultUtils;
import com.relevantcodes.extentreports.LogStatus;
import com.payswiff.util.ExcelUtilImpl;
public class Fetch_MerchID {


	SeleniumNGSuite testSuite = new SeleniumNGSuite();
	DriverUtilsImpl library = new DriverUtilsImpl();
	testClassMerch_panel objects= new testClassMerch_panel();
	ExcelUtilImpl ExcelData = new ExcelUtilImpl();

	/** The base project path. */
	public static String baseProjectPath = System.getProperty(Constants.USER_DIR);


	String sheetName = "SmokeCases";
	public static String S;
	Properties prop = new Properties();
	OutputStream output = null;

	//@Test(priority= 3)
	@Test
	public void TestMerch() throws Exception {

		//TestResultUtils.logger= TestResultUtils.extent.startTest("Merchant Selection");

		/**
		 * I click Merchants tab 
		 */
		if(library.gClick(objects.FT_LMerchant) == true) {

			System.out.println("Successfully Clicked on Merchants tab : Passed");
			//TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on Merchants tab : Passed");
		}else {
			//TestResultUtils.logger.log(LogStatus.FAIL, "Successfully Clicked on Merchants tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Merchants tab")));
		}


		/**
		 * I click first Merchant  
		 */
		if(library.gClick(objects.Frst_Mer) == true) {

			System.out.println("Successfully Clicked on first Merchants tab : Passed");
			//TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on first Merchants tab : Passed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Merchants tab")));
		}else {
			//TestResultUtils.logger.log(LogStatus.FAIL, "Successfully Clicked on first Merchants tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on first Merchants tab")));

		}

		/**
		 * Fetching the Merchant ID 
		 */
		String Merchant_ID = library.gWebElementGetText(objects.Frst_MerID);
		System.out.println("Merchant ID: " +Merchant_ID);

		Matcher m = Pattern.compile("\\(([^)]+)\\)").matcher(Merchant_ID);
		while(m.find()) {
			System.out.println(m.group(1));    
			S = m.group(1);
			S= S.trim();
			System.out.println("S Value is: " +S);
		}
		
		
		//To Write the data in to Axis MID TID Sheet by util method
		String Axis_MID_TID_FilePath = baseProjectPath.concat(Constants.AxisFile); 
		ExcelData.SelFile(Axis_MID_TID_FilePath);
		ExcelData.WriteData(1, 1);
		ExcelData.WriteData(1, 4);
		
		ExcelData.WriteData(2, 1);
		ExcelData.WriteData(2, 4);
		
		ExcelData.WriteData(3, 1);
		ExcelData.WriteData(3, 4);
		
		ExcelData.WriteData(4, 1);
		ExcelData.WriteData(4, 4);
		
		ExcelData.CloseFile();
		
		//To Write the data in to Axis MID TID Approval Sheet by util method
		String Axis_ApprSheet = baseProjectPath.concat(Constants.Axis_Approval_File); 
		ExcelData.SelFile(Axis_ApprSheet);
		ExcelData.WriteData(1, 2);
		ExcelData.WriteData(1, 3);
		
		ExcelData.WriteData(2, 2);
		ExcelData.WriteData(2, 3);
		
		ExcelData.WriteData(3, 2);
		ExcelData.WriteData(3, 3);
		
		ExcelData.WriteData(4, 2);
		ExcelData.WriteData(4, 3);
		
		ExcelData.CloseFile();
		
		
		//To Write the data in to RBL MID TID Sheet by util method
		String RBL_MID_TID_FilePath = baseProjectPath.concat(Constants.RBLFile); 
		ExcelData.SelFile(RBL_MID_TID_FilePath);
		ExcelData.WriteData(1, 3);
		ExcelData.WriteData(1, 4);
		
		ExcelData.WriteData(2, 3);
		ExcelData.WriteData(2, 4);
		
		ExcelData.WriteData(3, 3);
		ExcelData.WriteData(3, 4);
		
		ExcelData.WriteData(4, 3);
		ExcelData.WriteData(4, 4);
		
		ExcelData.CloseFile();
		
		
		//To Write the data in to RBL MID TID Approval Sheet by util method
		String RBL_ApprSheet = baseProjectPath.concat(Constants.RBL_Approval_File); 
		ExcelData.SelFile(RBL_ApprSheet);
		ExcelData.WriteData(1, 1);
		ExcelData.WriteData(1, 2);
		
		ExcelData.WriteData(2, 1);
		ExcelData.WriteData(2, 2);
		
		ExcelData.WriteData(3, 1);
		ExcelData.WriteData(3, 2);
		
		ExcelData.WriteData(4, 1);
		ExcelData.WriteData(4, 2);
		
		ExcelData.CloseFile();
		
		//To Write the data in to Merchant Additional Information Sheet by util method
		String Merch_AddInfo = baseProjectPath.concat(Constants.MerchAddInfo); 
		ExcelData.SelFile(Merch_AddInfo);
		ExcelData.WriteData(1, 0);
		ExcelData.CloseFile();
				
	}
}
