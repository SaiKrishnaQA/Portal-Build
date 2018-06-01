/*
 * @author Sai G
 * 
 */
package com.payswiff.config;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ThreadGuard;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.payswiff.constants.*;
import com.payswiff.util.PropertyUtils;

public class DriverConfig {

	/** The driver. */
	// private static ChromeDriverService service;
	public WebDriver driver = null;
	
	public static String appiumURL = "";

	/** The base project path. */
	public static String baseProjectPath = System.getProperty(Constants.USER_DIR);

	/** The configprops. */
	public static PropertyUtils configprops = new PropertyUtils(baseProjectPath.concat(Constants.CONFIG_PROPERTY));

	/** The handle popups. */
	public static String handlePopups = configprops.getProperty(Constants.HANDLE_POPUP);

	/** The logger. */
	private static final Logger LOG = LoggerFactory.getLogger(DriverConfig.class);
	
	public static String orientation = configprops.getProperty("Orientation");
	
	
	String OSName;

	

	// TODO remotesysname
	public WebDriver setUp(String browserType, String url, String remoteSysName) throws Throwable {
		try {
			LOG.info("Setting up the driver::" + browserType);
			
			switch (browserType) {
			case Constants.MOZILLA_FIREFOX:
				try {
					
					System.setProperty(Constants.GEKO_DRIVER, baseProjectPath.concat(Constants.GEKO_DRIVER_PATH));
					//ProfilesIni profile=new ProfilesIni();
					//FirefoxProfile myprofile=profile.getProfile("AutomationProfile");
					/*FirefoxProfile profile = new FirefoxProfile();
					profile.setPreference("browser.tabs.remote.autostart", false);
					profile.setPreference("browser.tabs.remote.autostart.1", false);
					profile.setPreference("browser.tabs.remote.autostart.2", false);
					profile.setPreference("browser.tabs.remote.force-enable", "false");*/
					//driver = ThreadGuard.protect(new FirefoxDriver(myprofile));
					driver = ThreadGuard.protect(new FirefoxDriver());
					
				} catch (Exception exception) {
					exception.printStackTrace();
					LOG.error("Error while loading Firefox driver::{}", exception.getMessage());
				} catch (Throwable throwable) {
					LOG.error("Error while loading Firefox driver::{}", throwable.getMessage());
				}
				break;
				
				
			case Constants.CHROME:
				try{
				
					System.setProperty(Constants.CHROME_WEBDRIVER,
					baseProjectPath.concat(Constants.CHROME_DRIVER_PATH));
					driver = ThreadGuard.protect(new ChromeDriver());
					driver.manage().window().maximize();
					
				}
					catch (Exception exception) {
					LOG.error("Error while loading Chrome driver::{}", exception.getMessage());
					exception.printStackTrace();
					} 
					catch (Throwable throwable) {
					LOG.error("Error while loading Chrome driver::{}", throwable.getMessage());
					}
				break;

			case Constants.IE:
				try {
					System.setProperty(Constants.IE_DRIVER, baseProjectPath.concat(Constants.IE_DRIVER_PATH));
					DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
					caps.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
					caps.setCapability(InternetExplorerDriver.ENABLE_ELEMENT_CACHE_CLEANUP, true);
					caps.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
					caps.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
					caps.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, true);
					caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
					caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
					driver = ThreadGuard.protect(new InternetExplorerDriver(caps));
					
				} catch (Exception exception) {
					LOG.error("Error while loading Internet Explorer driver::{}", exception.getMessage());
				} catch (Throwable throwable) {
					LOG.error("Error while loading Internet Explorer driver::{}", throwable.getMessage());
				}

				break;
			}
			Thread.sleep(1000);

			driver.get(url);
			if (browserType.equals(Constants.IE)) {
				driver.navigate()
						.to("javascript:document.getElementById('overridelink').click()");
			} 
		} catch (TimeoutException timeOutException) {
			LOG.error("Driver Timeout Exception occured::{}", timeOutException.getMessage());
			timeOutException.printStackTrace();
			driver.manage().window().maximize();
			Actions action = new Actions(driver);
			action.sendKeys(Keys.ESCAPE);
		} catch (Exception exception) {
			LOG.error("Exception occured in getting the driver::{}", exception.getMessage());
			throw new Exception(exception);
		} catch (Throwable throwable) {
			LOG.error("Error Occured in Getting the driver object ::{}", throwable.getMessage());
			throw new Exception(throwable);
		}
		return driver;

	}

}
