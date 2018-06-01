/*
 * @author Sai G
 * 
 */
package com.payswiff.config;

import org.openqa.selenium.WebDriver;

/**
 * The Class LocalDriverManager.
 *
 * @author skumargoureshetty
 * @author nigoyal
 */
public class LocalDriverManager {

	/** The web driver. */
	private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();

	/**
	 * Gets the driver.
	 *
	 * @return the driver
	 */
	public static WebDriver getDriver() {
		return webDriver.get();
	}

	/**
	 * Sets the web driver.
	 *
	 * @param driver
	 *            the new web driver
	 */
	static void setWebDriver(WebDriver driver) {
		webDriver.set(driver);
	}
}