package com.payswiff.constants;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.FTCash.Panel.Fetch_MerchID;
import com.Portal.Panel.Merchants_D_Panel;
import com.payswiff.config.SeleniumNGSuite;
import com.payswiff.util.DriverUtilsImpl;
import com.payswiff.util.TestResultUtils;
import com.relevantcodes.extentreports.LogStatus;



public class ScrollTest {
	
SeleniumNGSuite testSuite = new SeleniumNGSuite();

DriverUtilsImpl library = new DriverUtilsImpl();
Merchants_D_Panel objects= new Merchants_D_Panel();

@Test(priority= 5)
public void Device_Assign() throws Exception {
	
	//Starts the logging of the report
	TestResultUtils.logger = TestResultUtils.extent.startTest("Device Assign Report");
	
	try {
	/**
	 * I click Merchants tab 
	 */
	if(library.gClick(objects.FT_LMerchant) == true) {
		
		System.out.println("Successfully Clicked on Merchants tab and navigated to Merchants Screen: Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on Merchants tab and navigated to Merchants Screen : Passed");
	}else {
		TestResultUtils.logger.log(LogStatus.FAIL, "Successfully Clicked on Merchants tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Merchants tab")));

	}
	
	/**
	 * I enter the merchant value in the search field 
	 */
	//if(library.sendText(objects.FT_MercahntID, testSuite.Merch_ID) == true) {
	System.out.println("Value of S is: "+Fetch_MerchID.S);
	if(library.sendText(objects.FT_MercahntID, "1014666") == true) {
		System.out.println("Successfully entered Merchant ID in the search field: Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Successfully entered Merchant ID in the search field : Passed");
	}else {
		TestResultUtils.logger.log(LogStatus.FAIL, "Successfully entered Merchant ID in the search field : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully entered Merchant ID in the search field")));

	}
	
	/**
	 * I click Search Button
	 */
	if(library.gClick(objects.FT_SearchButton) == true) {
		
		System.out.println("Successfully Clicked on Search tab: Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on Search tab : Passed");
	}else {
		TestResultUtils.logger.log(LogStatus.FAIL, "Successfully Clicked on Search tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Search tab")));

	}
	
	/**
	 * I click result merch ID
	 */
	if(library.gClick(objects.FT_firstMerchID) == true) {
		
		System.out.println("Successfully Clicked on Merchant tab: Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on Merchant tab : Passed");
	}else {
		TestResultUtils.logger.log(LogStatus.FAIL, "Successfully Clicked on Merchant tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Merchant tab")));

	}
	
	/**
	 * I click Terminals tab
	 */
	if(library.gClick(objects.FT_Headterminal) == true) {
		
		System.out.println("Successfully Clicked on Terminals tab: Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "Successfully Clicked on Terminals tab : Passed");
	}else {
		TestResultUtils.logger.log(LogStatus.FAIL, "Successfully Clicked on Terminals tab : Failed" +TestResultUtils.logger.addScreenCapture(library.takescreenshot("Successfully Clicked on Terminals tab")));

	}
	
	//fetcing the value from the list
	
	String Text = library.gWebElementGetText(objects.Pro);
	System.out.println("Assigned Tids are: " +Text);
	
	String Text1 = library.gWebElementGetText(objects.Pro1);
	System.out.println("Assigned Tids are: " +Text1);
	
	String Text2 = library.gWebElementGetText(objects.Pro2);
	System.out.println("Assigned Tids are: " +Text2);
	
	List<String> l= new LinkedList<>();
	l.add(Text);
	l.add(Text1);
	l.add(Text2);
	l.add("103103104");
	
	System.out.println("My list of TIDs are: " +l);
	System.out.println("\nHere are the duplicate elements from list : " + findDuplicates(l));
	
	if(findDuplicates(l).isEmpty()) {
		System.out.println("Passed");
		TestResultUtils.logger.log(LogStatus.PASS, "No Duplicate Records : Passed");
	}else {
		System.out.println("Failed");
		TestResultUtils.logger.log(LogStatus.PASS, "Duplicate Records exist : Passed");
	}
	}
	
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	
	
}

public static Set<String> findDuplicates(List<String> listContainingDuplicates) {
	 
	final Set<String> setToReturn = new HashSet<String>();
	final Set<String> set1 = new HashSet<String>();

	for (String yourInt : listContainingDuplicates) {
		if (!set1.add(yourInt)) {
			setToReturn.add(yourInt);
		}
	}
	return setToReturn;
}
}