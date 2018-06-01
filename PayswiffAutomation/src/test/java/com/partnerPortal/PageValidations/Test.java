package com.partnerPortal.PageValidations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.FTCash.Panel.testClassMerch_panel;
import com.payswiff.config.SeleniumNGSuite;
import com.payswiff.constants.Constants;
import com.payswiff.util.DriverUtilsImpl;
import com.payswiff.util.FT_GenricUtily;
import com.payswiff.util.TestResultUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Test {
	
	SeleniumNGSuite testSuite = new SeleniumNGSuite();
	DriverUtilsImpl library = new DriverUtilsImpl();
	testClassMerch_panel objects= new testClassMerch_panel();
	
	/** The base project path. */
	public static String baseProjectPath = System.getProperty(Constants.USER_DIR);


	@org.testng.annotations.Test
	public void TestMerch() throws Exception {
		
		System.setProperty(Constants.CHROME_WEBDRIVER,	baseProjectPath.concat(Constants.CHROME_DRIVER_PATH));
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("http://192.168.1.236:8765/pPortal/login");
		
		
		driver.findElement(By.xpath("html/body/div[1]/div/form/div[1]/input")).sendKeys(" ftcash.activationmanager@ftcash.com");
		driver.findElement(By.xpath(".//*[@id='j_password']")).sendKeys("Paynear@123");
		System.out.println("Entered pwd");
		
		//System.out.println("Element: "+driver.findElement(By.xpath(".//*[@id='log']/input[2]")));
		
		boolean sub1 = driver.findElement(By.xpath(".//*[@id='log']/input[2]")).isDisplayed();
		System.out.println("Display: "+sub1);
		
		boolean sub = driver.findElement(By.xpath(".//*[@id='log']/input[2]")).isEnabled();
		System.out.println("sub: " +sub);
		
		driver.findElement(By.xpath(".//*[@id='log']/input[2]")).click();
		
		/*
		driver.findElement(By.xpath(".//*[@id='merchantsSlider']/a")).click();
		
		//Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='merchantsList']/tbody/tr[1]/td[1]/a")).click();
		
		//Users tab
		driver.findElement(By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[3]/div[1]/h4/a")).click();
		
		//Fech User Name
		String UName = driver.findElement(By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[3]/div[2]/div/div[2]/div/div/div/table/tbody/tr/td[1]")).getText();
		System.out.println("UName: " +UName);
		
		//UID
		String UID = driver.findElement(By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[3]/div[2]/div/div[2]/div/div/div/table/tbody/tr/td[2]")).getText();
		System.out.println("UId: " +UID);
		
		//Mob Num
		String Mob = driver.findElement(By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[3]/div[2]/div/div[2]/div/div/div/table/tbody/tr/td[3]")).getText();
		System.out.println("UMobile: " +Mob);
		
		//Status
		String UStatus = driver.findElement(By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[3]/div[2]/div/div[2]/div/div/div/table/tbody/tr/td[5]")).getText();
		System.out.println("UStatus: " +UStatus);
		
		//Users tab
		driver.findElement(By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[3]/div[1]/h4/a")).click();*/
		
		
		//To fetch the TIDs from POS MID TID tab
		/*driver.findElement(By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[8]/div[1]/h4/a")).click();
		Thread.sleep(2000);
		
		String Proc= driver.findElement(By.xpath(".//*[@id='DataTables_Table_1']/tbody/tr[1]/td[4]")).getText();
		System.out.println("MID TID proc: " +Proc);
		
		driver.findElement(By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[8]/div[1]/h4/a")).click();
		
		driver.findElement(By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[9]/div[1]/h4/a")).click();
		Thread.sleep(2000);
		
		String Dev= driver.findElement(By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[9]/div[2]/div/div[2]/div/form/div[1]/div/table/tbody/tr[1]/td[1]")).getText();
		System.out.println("MID TID proc: " +Dev);
		*/
		
		/*String TID1= driver.findElement(By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[8]/div[2]/div/div[2]/div/form/div[1]/div/table/tbody/tr[1]/td[2]")).getText();
		String TID2= driver.findElement(By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[8]/div[2]/div/div[2]/div/form/div[1]/div/table/tbody/tr[2]/td[2]")).getText();
		String TID3= driver.findElement(By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[8]/div[2]/div/div[2]/div/form/div[1]/div/table/tbody/tr[3]/td[2]")).getText();
		String TID4= driver.findElement(By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[8]/div[2]/div/div[2]/div/form/div[1]/div/table/tbody/tr[4]/td[2]")).getText();
		
		Collection TIDList = new ArrayList<>(Arrays.asList(TID1, TID2, TID3, TID4));
		System.out.println("TID List: " +TIDList);
		
		//To close the POS MID TID tab
		driver.findElement(By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[8]/div[1]/h4/a")).click();
		
		Thread.sleep(2000);
		
		//Devices Tab fetching the Devices List
		driver.findElement(By.xpath(".//*[@id='headingTerminal']/h4/a")).click();
		Thread.sleep(2000);
	 
		String Device1= driver.findElement(By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[9]/div[2]/div/div[2]/div/form/div[1]/div/table/tbody/tr[1]/td[1]")).getText();
		//System.out.println("Device 1: " +Device1);
		
		String Device2= driver.findElement(By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[9]/div[2]/div/div[2]/div/form/div[1]/div/table/tbody/tr[2]/td[1]")).getText();
		//System.out.println("Device 2: " +Device2);
		
        Collection listDev = new ArrayList(Arrays.asList(Device1, Device2));
        System.out.println("Devices tab lst: " +listDev);

        //to close the Device tab 
        driver.findElement(By.xpath(".//*[@id='headingTerminal']/h4/a")).click();
        
        Thread.sleep(2000);
	
       //Fetching the Devices from the terminal tab
		driver.findElement(By.xpath("//a[contains(@href,'#terminalsMapping')]")).click();
		
		Thread.sleep(2000);
		
		String Terminal1 = driver.findElement(By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[10]/div[2]/div/div[2]/div/form/div[1]/div/table/tbody/tr[1]/td[1]")).getText();
		//System.out.println("Terminal1: " +Terminal1);
		
		String Terminal2= driver.findElement(By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[10]/div[2]/div/div[2]/div/form/div[1]/div/table/tbody/tr[2]/td[1]")).getText();
		//System.out.println("Terminal 2: " +Terminal2);
		
		
		Collection TerDevList = new ArrayList(Arrays.asList(Terminal1, Terminal2));
		System.out.println("Terminal Device List: " +TerDevList);
		
		//Fetching the TIDs from the terminal tab
		String TTID1= driver.findElement(By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[10]/div[2]/div/div[2]/div/form/div[1]/div/table/tbody/tr[1]/td[3]")).getText();
		//System.out.println("TID1: " +TID1);
		
		String TTID2 = driver.findElement(By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[10]/div[2]/div/div[2]/div/form/div[1]/div/table/tbody/tr[2]/td[3]")).getText();
		//System.out.println("TID2: " +TID2);
		
		List<String> TerminalTIDList= new ArrayList<>();
		TerminalTIDList.add(TID1);
		TerminalTIDList.add(TID2);
		Collection TerTIDList = new ArrayList(Arrays.asList(TTID1, TTID2));
		
		System.out.println("Terminals TID List: "+TerTIDList);
		
		DeviceList.retainAll(TerminalsList);
		System.out.println("Devices List: " +DeviceList);
		
		TIDList.retainAll(TerTIDList);
		System.out.println("List Devices: " +TerTIDList);
		
		if(TIDList.size()== 2) {
			System.out.println("All terminals are assigned to Devices: Passed");
		}else {
			System.out.println("Terminals are not assigned to Devices: Failed");
		}
		TIDList.removeAll(TerTIDList);
		System.out.println("After enhac: " +TIDList);
		
		if(TIDList.isEmpty()){
			System.out.println("All terminals are assigned to Devices: Passed");
		}else {
			System.out.println("Terminals are not assigned to Devices: Failed");
		}
		
		
		listDev.removeAll(TerDevList);
		System.out.println("TerDevList: " +listDev);
		
		if(listDev.isEmpty()) {
			System.out.println("Al Devices are Auto Configured");
		}else {
			System.out.println("All devices are not configured. Please check the Devices and Terminals");
		}*/
	
	}
}