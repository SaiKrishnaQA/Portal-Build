/*
 * @author Sai G
 * 
 */
package com.payswiff.config;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.payswiff.constants.Constants;
import com.payswiff.util.PropertyUtils;


public class SeleniumNGSuite {

	//public JavascriptExecutor jse = (JavascriptExecutor)driver;
	
	/** The logger. */
	private static final Logger LOG = LoggerFactory.getLogger(SeleniumNGSuite.class);

	/** The base project path. */
	public static String baseProjectPath = System.getProperty(Constants.USER_DIR);

	/** The configprops. */
	public static PropertyUtils configprops = new PropertyUtils(baseProjectPath.concat(Constants.CONFIG_PROPERTY));

	/** The config prop file for merchant ID **/
	public static PropertyUtils configprops2 = new PropertyUtils(baseProjectPath.concat(Constants.CONFIG_PROPERTY2));
	
	/** The browser type. */
	public static String browserType = configprops.getProperty("browser_name");

	/** The url. */
	public static String url = configprops.getProperty(Constants.URL);

	/** The remote sys name. */
	public static String remoteSysName = configprops.getProperty("remoteSystemname");

	/** The current suite. */
	public static String currentSuite = "";
	
	public static WebDriver driver = null;
	
	/** Fetching Merch ID from the config file */
	public static String Merch_ID = configprops2.getProperty("Merchant_ID");
	
	//To select the package while uploading the bulk merchants
	public static String Merch_Package = configprops.getProperty("package");
	
	//To select the package while uploading the bulk merchants
	public static String Bank_DP = configprops.getProperty("Bank_DP");
	
	//To select the Payment Mode in POS MID TID Approvals
	public static String Pay_Mode = configprops.getProperty("PayMode");
	
	//To select the device from the assign device panel
	public static String Dev_Sel = configprops.getProperty("Device_Sel");
	
	//To Select UserName
	public static String UName = configprops.getProperty("userName");
	
	//To Select Password
	public static String Pwd = configprops.getProperty("Password");
	
	//To Select UserName
	public static String A_UName = configprops.getProperty("Act_userName");
		
	//To Select Password
	public static String A_Pwd = configprops.getProperty("Act_Password");

	//To Select Password
	public static String Bank_Processor = configprops.getProperty("Processor");

	/** The config. */
	public DriverConfig config = new DriverConfig();

	/**
	 * Sets the up suite.
	 *
	 * @throws Throwable
	 *             the throwable
	 */
	
	
	public void setUpSuite() throws Throwable {
		driver=config.setUp(browserType, url, remoteSysName);
	}

	/**
	 * Tear down.
	 *
	 * @throws Exception
	 *             the  exception
	 */
	public void tearDown() throws Exception {

		try {

			if (LocalDriverManager.getDriver() != null) {
				LocalDriverManager.getDriver().close();
			}
			if (LocalDriverManager.getDriver() != null) {
				LocalDriverManager.getDriver().quit();
			}
			LOG.info("Successfully closed the browser ");
		} catch (Exception exception) {
			LOG.error("Error in closing the browser:: {}", exception.getMessage());
			exception.printStackTrace();
			throw new Exception(exception);
		}

	}
	
	public void JavaScriptExec() throws Exception {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		js.executeScript("window.scrollBy(0,1500)");
	}
	

}