package com.partnerPortal.PageValidations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.FTCash.Panel.testClassMerch_panel;
import com.payswiff.config.SeleniumNGSuite;
import com.payswiff.constants.Constants;
import com.payswiff.util.DriverUtilsImpl;
import com.payswiff.util.TestDataUtils;

public class Test_Sel {
	
	SeleniumNGSuite testSuite = new SeleniumNGSuite();
	DriverUtilsImpl library = new DriverUtilsImpl();
	testClassMerch_panel objects= new testClassMerch_panel();
	TestDataUtils utils= new TestDataUtils();
	Read_Excel ex= new Read_Excel();
	
	/** The base project path. */
	public static String baseProjectPath = System.getProperty(Constants.USER_DIR);

	/*public static void main(String args[]) {
	
	System.setProperty(Constants.CHROME_WEBDRIVER,	baseProjectPath.concat(Constants.CHROME_DRIVER_PATH));
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		//To Minimize the browser
		//driver.manage().window().setPosition(new Point(-2000, 0));
		
		driver.get("http://192.168.1.236:8765/pPortal/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("html/body/div[1]/div/form/div[1]/input")).sendKeys(" ftcash.activationmanager@ftcash.com");
		
		boolean exists= driver.findElements(By.xpath(".//*[@id='j_password']")).size()!= 0;
		
		System.out.println("Exists: " +exists);
		
		driver.findElement(By.xpath(".//*[@id='j_password']")).sendKeys("Paynear@123");
		driver.findElement(By.xpath(".//*[@id='login']/input[2]")).click();		
		
		//Click on Merchant
		driver.findElement(By.xpath(".//*[@id='merchantsSlider']/a")).click();
		
			
	}*/
	
	@Test
	public void testExcel() throws IOException {
		
		/*try {
			ex.readTestFile("/home/itadmin/Desktop/sai/mystuff/final_PortalBuild/PayswiffAutomation/src/test/resources/test data/Bulk_upload.xls");
			//utils.readTestData(baseProjectPath.concat(Constants.TEST_DATA_PATH));
			//utils.readFromFile(baseProjectPath.concat(Constants.TEST_DATA_PATH));
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getMessage();
		}*/
		
		//ex.readColumn("/home/itadmin/Desktop/sai/mystuff/final_PortalBuild/PayswiffAutomation/src/test/resources/test data/Bulk_upload.xls", 1, 8);
		System.out.println(ex.readColumn("/home/itadmin/Desktop/sai/mystuff/final_PortalBuild/PayswiffAutomation/src/test/resources/test data/Bulk_upload.xls", 1, 8));
	}
	
	
	/*public static void main(String args[]) throws IOException {
		
		 FileInputStream file = new FileInputStream(new File("/home/itadmin/Desktop/sai/mystuff/final_PortalBuild/PayswiffAutomation/src/test/resources/test data/Bulk_upload.xls"));
		 
			//Create Workbook instance holding reference to .xlsx file
         HSSFWorkbook workbook = new HSSFWorkbook(file);

         //Get first/desired sheet from the workbook
         HSSFSheet sheet = workbook.getSheetAt(0);

			
         String value= sheet.getRow(1).getCell(8).getStringCellValue();
         System.out.println("value is: " +value);
	}*/
}