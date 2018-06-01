/*
 * @author Sai G
 * 
 */
package com.payswiff.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.payswiff.config.SeleniumNGSuite;
import com.payswiff.constants.Constants;

/**
 * The Class DriverUtilsImpl.
 *
 * @author skumargoureshetty
 * @author nigoyal
 */

/** The base project path. */
public class DriverUtilsImpl extends SeleniumNGSuite implements DriverUtils {
	public static String baseProjectPath = System.getProperty(Constants.USER_DIR);
	
	
	public static final java.net.URL scriptUrl = DriverUtilsImpl.class.getResource("/executables/axe.min.js");
	
	
	/** The logger. */
	private static final Logger LOG = LoggerFactory.getLogger(DriverUtilsImpl.class);

	/** The configprops. */
	public static PropertyUtils configprops = new PropertyUtils(baseProjectPath.concat(Constants.CONFIG_PROPERTY));

	/** The url. */
	private String URL;

	/** The handle popups. */
	public static String handlePopups = configprops.getProperty(Constants.HANDLE_POPUP);

	/*
	 * (non-Javadoc)
	 *
	 * @see com.payswiff.util.DriverUtils#isPageLoaded()
	 */
	@Override
	public boolean isPageLoaded() throws Exception {
		try {
			return (driver.getTitle().contains(pageTitle));
		} catch (Exception exception) {
			throw new Exception(exception);
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.payswiff.util.DriverUtils#openPage(java.lang.String)
	 */
	@Override
	public void openPage(String webSiteUrl) throws Exception {
		try {
			URL = webSiteUrl;
			addPageLoadTimeout();
			driver.manage().timeouts().pageLoadTimeout(
					Integer.parseInt(configprops.getProperty(Constants.TIME_OUT_DURATION)), TimeUnit.SECONDS);

			driver.get(webSiteUrl);
		} catch (TimeoutException timeout) {
			hitEscapeKeyForPopups();
		} catch (Exception exception) {
			exception.printStackTrace();
			throw new Exception(exception);
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.payswiff.util.DriverUtils#getTitle()
	 */
	@Override
	public String getTitle() {
		return driver.getTitle();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.payswiff.util.DriverUtils#getURL()
	 */
	@Override
	public String getURL() {
		return driver.getCurrentUrl();
	}

	/**
	 * Send text keys to the element that finds by cssSelector. It shortens
	 * "driver.findElement(By.cssSelector()).sendKeys()".
	 *
	 * @param idSelector
	 *            the id selector
	 * @param text
	 *            the text
	 * @return true, if successful
	 * @throws Exception
	 *             the payswiff exception
	 */
	@Override
	public boolean sendText(By idSelector, String text) throws Exception {
		try {
			driver.findElement(idSelector).clear();
			Actions actions = new Actions(driver);
			WebElement element = driver.findElement(idSelector);
			actions.moveToElement(element).doubleClick().sendKeys(Keys.BACK_SPACE).build().perform();
			driver.findElement(idSelector).sendKeys(text);
			Thread.sleep(2000);
			return true;
		} catch (NoSuchElementException | InterruptedException exception) {
			throw new Exception(exception);
		}

	}

	/**
	 * Send text keys to the element that finds by cssSelector. It shortens
	 * "driver.findElement(By.cssSelector()).sendKeys()".
	 *
	 * @param by
	 *            the by
	 * @return true, if is element present
	 * @throws Exception
	 */

	/** Is the Element in page. */
	@Override
	public boolean isElementPresent(By by) throws Exception {
		try {
			WebElement element = driver.findElement(by);
			return true;
		} catch (Exception exception) {
			return false;
		}
	}

	/**
	 * Number of elements present.
	 *
	 * @param by
	 *            the by
	 * @return the int
	 * @throws Exception
	 *             the payswiff exception
	 */
	@Override
	public int numberOfElementsPresent(By by) throws Exception {
		try {
			return driver.findElements(by).size();
		} catch (Exception exception) {
			throw new Exception(exception);
		}
	}

	/**
	 * Send text keys to the element that finds by cssSelector. It shortens
	 * "driver.findElement if the element is not present
	 * on the page then returns true
	 *
	 * @param by
	 *            the by
	 * @return true, if is element not present
	 * @throws Exception
	 *             the payswiff exception
	 */

	/** Is the Element in page. */
	@Override
	public boolean isElementNotPresent(By by) throws Exception {
		// if it does not find the element then
		try {
			if (driver.findElements(by).size() < 1) {
				return true;
			} else {
				return false;
			}

		} catch (Exception exception) {
			LOG.error("Not Entered");
			return false;
		}
	}

	/**
	 * Is the Element present in the DOM.
	 *
	 * @param _cssSelector
	 *            element locater
	 * @return WebElement
	 * @throws Exception
	 *             the payswiff exception
	 */

	@Override
	public boolean isElementPresent(String _cssSelector) throws Exception {
		try {
			driver.findElement(By.cssSelector(_cssSelector));
			return true;

		} catch (NoSuchElementException exception) {
			throw new Exception(exception);
		}
	}

	/**
	 * Checks if the element is in the DOM and displayed.
	 *
	 * @param by
	 *            - selector to find the element
	 * @return true or false
	 * @throws Exception
	 *             the payswiff exception
	 */
	@Override
	public boolean isElementPresentAndDisplayed(By by) throws Exception {
		try {
			return driver.findElement(by).isDisplayed();
		} catch (NoSuchElementException exception) {
			throw new Exception(exception);
		}
	}

	/**
	 * Returns the first WebElement using the given method. It shortens
	 * "driver.findElement(By)".
	 *
	 * @param by
	 *            element locater.
	 * @return the first WebElement
	 * @throws Exception
	 *             the payswiff exception
	 */
	@Override
	public WebElement getWebElement(By by) throws Exception {
		try {
			return driver.findElement(by);
		} catch (Exception exception) {
			throw new Exception(exception);
		}
	}

	// ***********************************************************************************************************************
	// 'Function Name : gGetLlist
	// 'Script Description : Returns the List of a given WebElement
	// 'Input Parameters :
	// 'Return Value :

	/*
	 * (non-Javadoc)
	 *
	 * @see com.payswiff.util.DriverUtils#gGetLlist(org.openqa.selenium.By)
	 */
	@Override
	public List<WebElement> gGetLlist(By wElement) throws Exception {

		try {
			List<WebElement> strList = driver.findElements(wElement);
			return strList;

		} catch (Exception exception) {

			throw new Exception(exception);
		}

	}

	/**
	 * Gets the web elements count.
	 *
	 * @param wElement
	 *            the w element
	 * @return the web elements count
	 * @throws Exception
	 *             the payswiff exception
	 */
	public int getWebElementsCount(By wElement) throws Exception {

		try {
			int count = driver.findElements(wElement).size();
			return count;

		} catch (Exception exception) {

			throw new Exception(exception);
		}

	}

	// ***********************************************************************************************************************
	// 'Function Name : gExplictWait
	// 'Script Description : To wait for a webelement in a application
	// 'Input Parameters : 1. elementLocator - Locator(By) of Element to be wait
	// for
	// 2. maxTimeOut - Integer value of max time out in second
	// 3. strConditionMode - Condition mode to apply on wait (possible values
	// are ,VISIBILITY,INVISIBILITY ,FRAME ,PRESENCE )
	// 4. strFrameLocator - Frame ID(String) , when strConditionMode selected as
	// FRAME
	// 'Return Value :

	/**
	 * The Enum conditionalWait.
	 */
	public enum conditionalWait {

		/** The visibility. */
		VISIBILITY,
		/** The invisibility. */
		INVISIBILITY,
		/** The frame. */
		FRAME,
		/** The presence. */
		PRESENCE,
		/** The popupalert. */
		POPUPALERT;
	}

	// (non-Javadoc)

	// @see
	// com.payswiff.util.DriverUtils#gExplicitWait(org.openqa.selenium.By,*
	// int, java.lang.String, java.lang.String)

	public void gExplicitWait(By elementLocator, int maxTimeOut, String strConditionMode) throws Exception {
		try {
			conditionalWait mode = conditionalWait.valueOf(strConditionMode.toUpperCase()); //
			switch (mode) {
			case VISIBILITY:
				(new WebDriverWait(driver, maxTimeOut))
						.until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
				break;

			case INVISIBILITY:
				(new WebDriverWait(driver, maxTimeOut))
						.until(ExpectedConditions.invisibilityOfElementLocated(elementLocator));
				break;

			}
		} catch (Exception exception) {
			throw new Exception(exception);
		}
	}

	public void gImplicitWait(int maxTimeOut) throws Exception {
		try {
			driver.manage().timeouts().implicitlyWait(maxTimeOut, TimeUnit.MILLISECONDS);
		} catch (Exception exception) {
			throw new Exception(exception);
		}
	}

	public void gExplicitWait(By elementLocator, int maxTimeOut, String strConditionMode, String strName)
			throws Exception {
		try {
			conditionalWait mode = conditionalWait.valueOf(strConditionMode.toUpperCase()); //
			switch (mode) {

			case FRAME:
				(new WebDriverWait(driver, maxTimeOut))
						.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(strName));
				new WebDriverWait(driver, 10)
						.until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
				break;

			case PRESENCE:
				(new WebDriverWait(driver, maxTimeOut))
						.until(ExpectedConditions.presenceOfElementLocated(elementLocator));
				break;

			case POPUPALERT:
				List<WebElement> popupElements = driver.findElements(elementLocator);
				int count = popupElements.size();
				if (count > 0) {
					(new WebDriverWait(driver, maxTimeOut))
							.until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
					for (int j = 0; j < count; j++) {
						popupElements.get(j).click();
						Thread.sleep(1500);
					}
					break;
				}
			}
		} catch (Exception exception) {
			throw new Exception(exception);
		}
	}

	// '**************************************************************************************************************
	// 'Function Name : gElementFocus
	// 'Script Description : To Focus on a particular Element
	// 'Input Parameters : strXpath - Xpath of the Element to be focused.
	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.payswiff.util.DriverUtils#gElementFocus(org.openqa.selenium.By)
	 */
	// 'Return Value : true/false
	@Override
	public boolean gElementFocus(By wElement) throws Exception {

		try {
			// create a WebElement for a given object using it's Xpath/Id
			WebElement strElement = driver.findElement(wElement);

			// Focus on given element
			new Actions(driver).moveToElement(strElement).perform();

			return true;

		} catch (Exception exception) {

			throw new Exception(exception);
		}
	}

	// '***********************************************************************************************************************
	// 'Function Name : gClickLinkOrButton
	// 'Script Description : To perform link click based on class name and text
	// properties
	// 'Input Parameters :
	// ' 1. strLink - Id/Name/linktext/Xpath of the link/button
	// 2. index - position of the link that you want to click(Ex: 0,1)
	// 'Return Value : true

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.payswiff.util.DriverUtils#gClickLinkOrButton(org.openqa.selenium.
	 * By, int)
	 */
	@Override
	public boolean gClickLinkOrButton(By strLink, int index) throws Exception {

		try {
			List<WebElement> lstLinks = driver.findElements(strLink);
			addPageLoadTimeout();
			lstLinks.get(index).click();
			Thread.sleep(2000);
			return true;

		} catch (Exception exception) {
			hitEscapeKeyForPopups();
			throw new Exception(exception);
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.payswiff.util.DriverUtils#gClick(org.openqa.selenium.By)
	 */
	/*
	 * *************************************************************************
	 * *********************************************** Function Name: click on
	 * any element
	 *
	 * Description : To perform click operation on button or link and etc
	 */
	@Override
	public boolean gClick(By elementLocator) throws Exception {
		/*try {
			LOG.info("in gclick ::{}", elementLocator);
			
			 * if (driver.findElement(elementLocator).
			 * isEnabled()) {
			 
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
			driver.findElement(elementLocator).click();
			Thread.sleep(5000);
			hitEscapeKeyForPopups();
			LOG.info("after escape");

			return true;
			
			 * } else { LOG.info("Element is not enabled::{}", elementLocator);
			 * return false; }
			 
		} catch (Exception exception) {
			throw new Exception(exception);
		}
		*/
		
		try {
			LOG.info("in gclick ::{}", elementLocator);
			//boolean b= driver.findElement(elementLocator).isDisplayed()
			//System.out.println(driver.findElement(elementLocator).isEnabled());
			
			if (driver.findElement(elementLocator) != null && driver.findElement(elementLocator).isDisplayed()) {
			// if (driver.findElement(elementLocator).isEnabled()) {
			 
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
			driver.findElement(elementLocator).click();
			Thread.sleep(5000);
			hitEscapeKeyForPopups();
			LOG.info("after escape");

			return true;
			
			 } else { LOG.info("Element is not enabled::{}", elementLocator);
			  return false; }
			
		} catch (Exception exception) {
			exception.printStackTrace();
			throw new Exception(exception);
		}
	}

	/*
	 * *************************************************************************
	 * *********************************************** Function Name: click on
	 * any element using javascript executor
	 *
	 * Description : To perform click operation on button or link and etc
	 */
	public boolean jClick(By elementLocator) throws Exception {
		try {
			if (driver.findElement(elementLocator).isEnabled()) {
				LOG.info(driver.findElement(elementLocator).getText());
				WebElement element = driver.findElement(elementLocator);
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("arguments[0].click();", element);
				return true;
			} else {
				return false;
			}
		} catch (Exception exception) {
			throw new Exception(exception);
		}
	}

	/**
	 * G click.
	 *
	 * @param elementLocator
	 *            the element locator
	 * @param text
	 *            the text
	 * @return true, if successful
	 * @throws Exception
	 *             the payswiff exception
	 */
	public boolean gClick(By elementLocator, String text) throws Exception {
		try {
			String xPath = elementLocator.toString();
			if (xPath.contains("element")) {
				xPath = buildXpath(xPath, text);
			} else {
				return false;
			}
			By element = By.xpath(xPath);
			if (driver.findElement(element).isEnabled()) {
				driver.findElement(element).click();
				Thread.sleep(5000);
				hitEscapeKeyForPopups();
				LOG.info("after escape");
				return true;
			} else {
				return false;
			}
		} catch (Exception exception) {
			throw new Exception(exception);
		}
	}

	/**
	 * J click.
	 *
	 * @param elementLocator
	 *            the element locator
	 * @param text
	 *            the text
	 * @return true, if successful
	 * @throws Exception
	 *             the payswiff exception
	 */
	public boolean jClick(By elementLocator, String text) throws Exception {
		try {
			String xPath = elementLocator.toString();
			if (xPath.contains("element")) {
				xPath = buildXpath(xPath, text);
			} else {
				return false;
			}
			By element = By.xpath(xPath);
			LOG.info("element" + element);
			if (driver.findElement(element).isEnabled()) {
				WebElement jelement = driver.findElement(element);
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("arguments[0].click();", jelement);
				return true;
			} else {
				return false;
			}
		} catch (Exception exception) {
			throw new Exception(exception);
		}
	}

	// '**********************************************************************************************************************
	// 'Function Name : gEditTextbox
	// 'Script Description : To perform enter text in a textbox based on name
	// property
	// 'Input Parameters :
	// ' 1. strName - Name of the Textbox
	// 2. strValue - Value of the Textbox
	/*
	 * (non-Javadoc)
	 *
	 * @see com.payswiff.util.DriverUtils#gEditTextbox(org.openqa.selenium.By,
	 * java.lang.String, int)
	 */
	// 'Return Value : true
	@Override
	public boolean gEditTextbox(By txtKeywords, String strValue, int index) throws Exception {

		try {
			List<WebElement> ls = driver.findElements(txtKeywords);
			ls.get(index).clear();
			ls.get(index).sendKeys(strValue);
			return true;

		} catch (Exception exception) {

			throw new Exception(exception);
		}

	}

	// '**************************************************************************************************************
	// 'Function Name : gRadioSelectValue
	// 'Script Description : To set the value of a Radio Button
	// 'Input Parameters : 1. strName 2. strRadioValue - Value to be selected in
	// the Radiobutton(Ex: 0,1, etc...)
	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.payswiff.util.DriverUtils#gRadioSelectValue(org.openqa.selenium.By,
	 * java.lang.String)
	 */
	// 'Return Value : true
	@Override
	public boolean gRadioSelectValue(By strName, String strRadioValue) throws Exception {

		try {
			// List<WebElement> strRadioList =
			// driver.findElements(By.name(strName));
			addPageLoadTimeout();
			List<WebElement> strRadioList = driver.findElements(strName);
			for (WebElement indRadio : strRadioList) {
				if (strRadioValue.equalsIgnoreCase(indRadio.getAttribute("value"))) {
					indRadio.click();
					break;
				}
			}
			return true;
		} catch (TimeoutException timeout) {
			hitEscapeKeyForPopups();
			return true;
		} catch (Exception exception) {

			throw new Exception(exception);
		}
	}

	// '**************************************************************************************************************
	// 'Function Name : gListGetValue
	// 'Script Description : To Get the value in a List box
	// 'Input Parameters : strId - Id property of the List Box
	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.payswiff.util.DriverUtils#gListGetValue(org.openqa.selenium.By)
	 */
	// 'Return Value : strText - Value(Text) of the list box which is selected
	@Override
	public String gListGetValue(By strId) throws Exception {
		try {
			String strText = null;
			Select selectListBox = new Select(driver.findElement(strId));
			strText = selectListBox.getFirstSelectedOption().getText();
			return strText;
		} catch (Exception exception) {

			throw new Exception(exception);
		}
	}

	public void jRadioClick(By strId) throws Exception {
		try {
			WebElement radioBtn1 = driver.findElement(strId);
			((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;",
					radioBtn1);
		} catch (Exception exception) {

			throw new Exception(exception);
		}
	}

	// '**************************************************************************************************************
	// 'Function Name : gRadioGetValue
	// 'Script Description : To Get the value of a Radio Button
	// 'Input Parameters : strName - Name property of the Radiobutton
	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.payswiff.util.DriverUtils#gRadioGetValue(org.openqa.selenium.By)
	 */
	// 'Return Value : strText - Value of the Radiobutton(Ex: 0,1, etc..)
	@Override
	public String gRadioGetValue(By strName) throws Exception {
		try {
			String strText = null;
			List<WebElement> radiostrDocHeader = driver.findElements(strName);
			for (WebElement indRadioradiostrDocHeader : radiostrDocHeader) {
				if (indRadioradiostrDocHeader.isSelected() == true) {
					strText = indRadioradiostrDocHeader.getAttribute("value");
					break;
				}
			}

			return strText;

		} catch (Exception exception) {

			throw new Exception(exception);
		}
	}

	// '**************************************************************************************************************
	// 'Function Name : gCheckBoxSelect
	// 'Script Description : To Set a value in a CheckBox (On/OFF)
	// 'Input Parameters : 1. strId - ID property of the list box to be selected
	// 2. strChkBoxValue - Value to be selected (ON/OFF)
	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.payswiff.util.DriverUtils#gCheckBoxSelect(org.openqa.selenium.By,
	 * java.lang.String)
	 */
	// 'Return Value : boolean(true/false)
	@Override
	public boolean gCheckBoxSelect(By strId, String strChkBoxValue) throws Exception {

		try {

			boolean strFlag = driver.findElement(strId).isSelected();
			if ((strFlag == false && strChkBoxValue == "ON") || (strFlag == true && strChkBoxValue == "OFF")) {
				driver.findElement(strId).click();
				Thread.sleep(1000);
			}
			return true;

		} catch (Exception exception) {

			throw new Exception(exception);
		}
	}

	// '**************************************************************************************************************
	// 'Function Name : gMouseHover
	// 'Script Description : To Hover the Mouse on a given link
	// 'Input Parameters : 1. strXpath - ID property of the link to hover
	// 'Return Value : boolean(true/false)

	/*
	 * (non-Javadoc)
	 *
	 * @see com.payswiff.util.DriverUtils#gMouseHover(org.openqa.selenium.By)
	 */
	@Override
	public boolean gMouseHover(By strXpath) throws Exception {
		try {
			Actions builder = new Actions(driver);
			WebElement MenuElement = driver.findElement(strXpath);
			builder.moveToElement(MenuElement).build().perform();
			Thread.sleep(2000);
			return true;
		} catch (Exception exception) {
			throw new Exception(exception);
		}
	}

	// '**************************************************************************************************************
	// 'Function Name : gIsDisplayed
	// 'Script Description : To Verfiy the Object is Displayed or not
	// 'Input Parameters : WebElement (Object)
	// 'Return Value :

	/*
	 * (non-Javadoc)
	 *
	 * @see com.payswiff.util.DriverUtils#gIsDisplayed(org.openqa.selenium.By)
	 */
	@Override
	public void gIsDisplayed(By wElement) throws Exception {

		try {
			driver.findElement(wElement).isDisplayed();
		} catch (Exception exception) {
			throw new Exception(exception);

		}

	}

	// '**************************************************************************************************************
	// 'Function Name : gWebElementGetText
	// 'Script Description : To Get the Text of any web element (ex: link, Page
	// title)
	// 'Input Parameters : WebElement (Object)
	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.payswiff.util.DriverUtils#gWebElementGetTexts(org.openqa.selenium.
	 * By, int)
	 */
	// 'Return Value : true/false
	@Override
	public String gWebElementGetTexts(By wElement, int index) throws Exception {
		// TODO check
		try {
			List<WebElement> lstWebElement = driver.findElements(wElement);
			if (lstWebElement.size() > 0) {
				String strText = lstWebElement.get(index).getText();
				return strText;
			} else {
				throw new Exception();
			}

		} catch (Exception exception) {

			throw new Exception(exception);
		}

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.payswiff.util.DriverUtils#gWebElementGetText(org.openqa.selenium.
	 * By)
	 */
	@Override
	public String gWebElementGetText(By wElement) throws Exception {
		try {
			WebElement element = driver.findElement(wElement);
			String text = element.getText();
			return text;
		} catch (Exception exception) {
			throw new Exception(exception);
		}

	}

	// '**************************************************************************************************************
	// 'Function Name : gListSelect
	// 'Script Description : Select the given value from a list box
	// 'Input Parameters : listName(Name of the list box), listValue(Value to be
	// selected)
	// 'Return Value : true/false

	/*
	 * (non-Javadoc)
	 *
	 * @see com.payswiff.util.DriverUtils#gListSelect(org.openqa.selenium.By,
	 * java.lang.String)
	 */
	@Override
	public boolean gListSelect(By lstPracArea, String lstValue) throws Exception {

		try {
			new Select(driver.findElement(lstPracArea)).selectByVisibleText(lstValue);
			Thread.sleep(3000);
			return true;

		} catch (Exception exception) {
			throw new Exception(exception);
		}
	}

	// ******************************************************************************************************************
	// 'Function Name : gVerifyText
	// 'Script Description : To Verify the Text is present or not in a page.
	// 'Input Parameters : 1. wElement - WebElement of a page to get the text.
	// 2. strVerifyText - Text to be validated.
	// 'Return Value :

	/*
	 * (non-Javadoc)
	 *
	 * @see com.payswiff.util.DriverUtils#gVerifyText(org.openqa.selenium.By,
	 * java.lang.String)
	 */
	@Override
	public void gVerifyText(By wElement, String strVerifyText) throws Exception {

		try {
			if (!driver.findElement(wElement).getText().trim().contains(strVerifyText)) {
				throw new Exception();
			}

		} catch (Exception exception) {
			throw new Exception(exception);
		}
	}

	// ******************************************************************************************************************
	// 'Function Name : gVerifyContainsText
	// 'Script Description : To Verify the Text is present or not in a page.
	// 'Input Parameters : 1. strToCompare - Text to compare.
	// 2. strVerifyText - Text to be validated.
	// 'Return Value :

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.payswiff.util.DriverUtils#gVerifyContainsText(java.lang.String,
	 * java.lang.String)
	 */
	/*public boolean gVerifyContainsText(String strToCompare, String strVerifyText) throws Exception {
		try {
			if (strToCompare.equals(strVerifyText)) {
				System.out.println("Elements Matched");
			}else {
				throw new Exception();
			}

		} catch (Exception exception) {

			throw new Exception(exception);
		}
		return true;
	}*/
	
	public boolean gVerifyContainsText(String strToCompare, String strVerifyText) throws Exception {
		try {
			if (strToCompare.equals(strVerifyText)) {
				//System.out.println("Elements Matched");
				return true;
			} else {
				return false;
			}

		} catch (Exception exception) {

			throw new Exception(exception);
		}

	}
	

	// ******************************************************************************************************************
	// 'Function Name : gVerifyAttributeValue
	// 'Script Description : To Verify the Tool Tip of a given Object
	// 'Input Parameters : 1. webElement - Object property
	// 2.strProperty - Property value (Ex: alt, title)
	// 3. strText - Expected Tool Tip
	// 'Return Value :
	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.payswiff.util.DriverUtils#gVerifyAttributeValue(org.openqa.selenium
	 * .By, java.lang.String, java.lang.String)
	 */
	// TODO check
	@Override
	public Boolean gVerifyAttributeValue(By webElement, String strProperty, String strText) throws Exception {

		Boolean isAttributePresent = false;
		try {
			String attributevalue = driver.findElement(webElement).getAttribute(strProperty);
			if (!attributevalue.trim().equalsIgnoreCase(strText)) {
				throw new Exception();
			} else {
				isAttributePresent = true;
			}

		} catch (Exception exception) {

			throw new Exception(exception);
		}
		return isAttributePresent;
	}

	// ***********************************************************************************************************************
	// 'Function Name : gVerifySelectedOrDeselected
	// 'Script Description : To verify webelement/s is selected or deselected
	// 'Input Parameters : wel - WebElement name
	// strSelect - possible parameters("selected", "deselected")
	// 'Return Value : true
	/*
	 * (non-Javadoc)
	 *
	 * @see com.payswiff.util.DriverUtils#isSelected(org.openqa.selenium.By,
	 * java.lang.String)
	 */
	// TODO check
	@Override
	public boolean isSelected(By wel, String strSelection) throws Exception {

		try {
			if (strSelection.equalsIgnoreCase("selected")) {
				List<WebElement> lstTaxTypes = gGetLlist(wel);
				for (int i = 0; i <= lstTaxTypes.size() - 1; i++) {
					if (!lstTaxTypes.get(i).isSelected()) {
						throw new Exception();
					}

				}

			}
			if (strSelection.equalsIgnoreCase("deselected")) {
				List<WebElement> lstTaxTypes = gGetLlist(wel);
				for (int i = 0; i <= lstTaxTypes.size() - 1; i++) {
					if (lstTaxTypes.get(i).isSelected()) {
						throw new Exception();
					}

				}
			}

		} catch (Exception exception) {

			throw new Exception(exception);
		}
		return true;
	}

	// ***********************************************************************************************************************
	// 'Function Name : gVerifyEnabledOrDisabled
	// 'Script Description : To verify webelement/s is enabled or disabled
	// 'Input Parameters : wel - WebElement name
	// strSelect - possible parameters("enabled", "disabled")
	// 'Return Value : true
	/*
	 * (non-Javadoc)
	 *
	 * @see com.payswiff.util.DriverUtils#isEnabled(org.openqa.selenium.By,
	 * java.lang.String)
	 */
	// TODO check
	@Override

	public boolean isEnabled(By wel, String strSelection) throws Exception {

		try {
			if (strSelection.equalsIgnoreCase("enabled")) {
				List<WebElement> lstTaxTypes = gGetLlist(wel);
				for (int i = 0; i <= lstTaxTypes.size() - 1; i++) {
					if (!lstTaxTypes.get(i).isEnabled()) {
						throw new Exception();
					}

				}

			}
			if (strSelection.equalsIgnoreCase("disabled")) {
				List<WebElement> lstTaxTypes = gGetLlist(wel);
				for (int i = 0; i <= lstTaxTypes.size() - 1; i++) {
					if (lstTaxTypes.get(i).isEnabled()) {
						throw new Exception();
					}

				}
			}

		} catch (Exception exception) {

			throw new Exception(exception);
		}
		return true;
	}

	// '**************************************************************************************************************
	// 'Function Name : gSwitchFrame
	// 'Script Description : To switch one frame to other frame
	// 'Input Parameters : 1. strFrameid-Property of the frame /Id(or) Name of
	// the frame 2. strFrameType -
	/*
	 * (non-Javadoc)
	 *
	 * @see com.payswiff.util.DriverUtils#gSwitchFrame(java.lang.String,
	 * java.lang.String)
	 */
	// 'Return Value : true
	@Override
	public boolean gSwitchFrame(String strFrameid, String strFrameType) throws Exception {

		try {
			String srtUpperCase = String.valueOf(strFrameType.toUpperCase());
			switch (srtUpperCase) {
			case "INT": // To handle if entered frame Id is number
				int typeInt = Integer.parseInt(strFrameid);
				driver.switchTo().frame(typeInt);
				break;
			case "STRING": // To handle if entered frame Id is string
				driver.switchTo().frame(strFrameid);
				break;
			case "WEBELEMENT": // To handle if entered frame Id is webelement
				driver.switchTo().frame(strFrameid);
				break;
			case "DEFAULT": // To switch default frame
				driver.switchTo().defaultContent();
				break;
			}
			return true;
		} catch (Exception exception) {
			throw new Exception(exception);
		}

	}

	// **************************************************************************************************************
	// 'Function Name : gVerifyCloseWindow
	// 'Script Description : Click on the element in nested iframe.
	// 'Input Parameters : searchText - Search Text
	// searchFlag - Flag to indicate for searching the text
	/*
	 * (non-Javadoc)
	 *
	 * @see com.payswiff.util.DriverUtils#gVerifyCloseWindow(java.lang.String,
	 * java.lang.String)
	 */
	// 'Return Value :
	@Override
	public void gVerifyCloseWindow(String searchText, String searchFlag) throws Exception {

		try {
			Set<String> winID = driver.getWindowHandles();
			Iterator<String> it = winID.iterator();
			String mainWin = it.next();
			String popUpWin = it.next();

			driver.switchTo().window(popUpWin);
			Thread.sleep(2000);
			if (searchFlag.equalsIgnoreCase("yes")) {
				// driver.findElement(By.xpath("//*[contains(text(),'"+searchText+"')]")).isDisplayed();
				gIsDisplayed(By.xpath("//*[contains(text(),'" + searchText + "')]"));
			}

			driver.close();
			driver.switchTo().window(mainWin);

		} catch (InterruptedException exception) {

			throw new Exception(exception);
		}
	}

	// ******************************************************************************************************************
	// 'Function Name : gGetAttributeValue
	// 'Script Description : To get text from attribute
	// 'Input Parameters : 1. webElement - Object property
	// 2.strProperty - Property value (Ex: alt, title)
	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.payswiff.util.DriverUtils#gGetAttributeValue(org.openqa.selenium.
	 * By, java.lang.String)
	 */
	// 'Return Value :
	@Override
	public String gGetAttributeValue(By webElement, String strProperty) throws Exception {

		try {
			List<WebElement> lstWebElement = driver.findElements(webElement);
			if (lstWebElement.size() > 0) {
				String strAttributeValue = driver.findElement(webElement)
						.getAttribute(strProperty);
				/*
				 * if(!strAppToolTip.trim().equalsIgnoreCase(strText)){ throw
				 * new Exception();
				 */
				return strAttributeValue;
			} else {
				throw new Exception();
			}

		} catch (Exception exception) {

			throw new Exception(exception);
		}

	}

	// '***********************************************************************************************************************
	// 'Function Name : gEditTextboxWithOutClear
	// 'Script Description : To perform enter text in a textbox based on name
	// property
	// 'Input Parameters :
	// ' 1. strName - Name of the Textbox
	// 2. strValue - Value of the Textbox
	/*
	 * (non-Javadoc)
	 *
	 * @see com.payswiff.util.DriverUtils#gEditTextboxWithOutClear(org.openqa.
	 * selenium.By, java.lang.String, int)
	 */
	// 'Return Value : true
	@Override
	public boolean gEditTextboxWithOutClear(By txtKeywords, String strValue, int index) throws Exception {

		try {
			List<WebElement> ls = driver.findElements(txtKeywords);
			ls.get(index).sendKeys(strValue);
			return true;

		} catch (Exception exception) {

			throw new Exception(exception);
		}

	}

	// '**************************************************************************************************************
	// 'Function Name : gGetAllOptions
	// 'Script Description : to get all Options from list box.
	// 'Input Parameters : By lstofOptions (Web element)
	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.payswiff.util.DriverUtils#gGetAllOptions(org.openqa.selenium.By)
	 */
	// 'Return Value : true
	@Override
	public List<WebElement> gGetAllOptions(By strWebElement) throws Exception {

		try {
			Select strList = new Select(driver.findElement(strWebElement));
			List<WebElement> lstOptions = strList.getOptions();
			return lstOptions;
		} catch (Exception exception) {

			throw new Exception(exception);
		}

	}

	// **************************************************************************************************************
	// 'Function Name : gScrollPageDown
	// 'Script Description : Scrolling the page down
	// 'Input Parameters : None
	/*
	 * (non-Javadoc)
	 *
	 * @see com.payswiff.util.DriverUtils#gScrollPage(int, int)
	 */
	// 'Return Value :

	@Override
	public void gScrollPageDown() throws Exception {

		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,250)", "");
			jse.executeScript("scroll(0, 250);");

		} catch (Exception exception) {

			throw new Exception(exception);
		}
	}

	// **************************************************************************************************************
	// 'Function Name : gScrollPageUp
	// 'Script Description : Scrolling the page down
	// 'Input Parameters : None
	/*
	 * (non-Javadoc)
	 *
	 * @see com.payswiff.util.DriverUtils#gScrollPage(int, int)
	 */
	// 'Return Value :

	public void gScrollPageUp() throws Exception {

		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,-250)", "");
			jse.executeScript("scroll(0, -250);");

		} catch (Exception exception) {

			throw new Exception(exception);
		}
	}

	// ******************************************************************************************************************
	// 'Function Name : gValidateTextAndReutrn
	// 'Script Description : To Verify the Text is present or not in a page and
	// return boolean value.
	// 'Input Parameters : 1. wElement - WebElement of a page to get the text.
	// 2. strVerifyText - Text to be validated.
	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.payswiff.util.DriverUtils#gVerifyTextAndReturn(org.openqa.selenium.
	 * By, java.lang.String)
	 */
	// 'Return Value :
	@Override
	public boolean gVerifyTextAndReturn(By by, String strVerifyText) throws Exception {

		try {

			List<WebElement> list = driver.findElements(by);
			if (list.size() > 0 && list.get(0).getText().trim().contains(strVerifyText)) {
				return true;
			} else {
				return false;
			}

		} catch (Exception exception) {

			throw new Exception(exception);
		}
	}

	// ******************************************************************************************************************
	// 'Function Name : gNavBackBrowser
	// 'Script Description : To navigate back browser
	// 'Input Parameters :
	/*
	 * (non-Javadoc)
	 *
	 * @see com.payswiff.util.DriverUtils#gNavBackBrowser()
	 */
	// 'Return Value :
	@Override
	public void gNavBackBrowser() throws Exception {
		try {
			addPageLoadTimeout();
			driver.navigate().back();

		} catch (TimeoutException timeout) {
			hitEscapeKeyForPopups();
		} catch (Exception exception) {
			throw new Exception(exception);
		}
	}

	// **************************************************************************************************************
	// 'Function Name : gPageReload
	// 'Script Description : Reload the Page.
	// 'Input Parameters :
	//
	/*
	 * (non-Javadoc)
	 *
	 * @see com.payswiff.util.DriverUtils#gPageReload()
	 */
	// 'Return Value :
	@Override

	public void gPageReload() throws Exception {

		try {
			driver.switchTo().defaultContent();

			addPageLoadTimeout();
			driver.navigate().refresh();
			// (or)((JavascriptExecutor)
			// driver).executeScript("location.reload();");

		} catch (TimeoutException timeout) {
			hitEscapeKeyForPopups();
		} catch (Exception exception) {
			throw new Exception(exception);
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.payswiff.util.DriverUtils#gListOfValues(org.openqa.selenium.By)
	 */
	/*
	 * Function Name:gListOfValues
	 *
	 * Description: This will return the values of checkbox/radio buttons/links
	 * and etc
	 */
	@Override
	public List<String> gListOfValues(By elementLocator) throws Exception {
		List<String> values = new ArrayList<String>();
		try {
			for (int i = 0; i < driver.findElements(elementLocator).size(); i++) {
				values.add(driver.findElements(elementLocator).get(i).getText().trim());
			}
		} catch (Exception exception) {
			throw new Exception(exception);
		}
		return values;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.payswiff.util.DriverUtils#getTableData(org.openqa.selenium.By,
	 * org.openqa.selenium.By, org.openqa.selenium.By)
	 */
	/*
	 * Function Name=getTableData
	 *
	 * Description:Used to get the data from html table
	 */
	@Override
	public String[] getTableData(By tableElementLocator, By tableRowLocator, By tableDataLocator)
			throws Exception {
		String[] tableData = null;
		try {
			// Get All Items from Cart
			WebElement table_element = driver.findElement(tableElementLocator);
			List<WebElement> tr_collection = table_element.findElements(tableRowLocator);
			for (WebElement trElement : tr_collection) {
				List<WebElement> td_collection = trElement.findElements(tableDataLocator);
				for (WebElement tdElement : td_collection) {
					LOG.info("{}", tdElement.getText().split("[\\r\\n]+"));
					tableData = tdElement.getText().split("[\\r\\n]+");
				}
			}
		} catch (Exception exception) {
			throw new Exception(exception);
		}
		return tableData;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.payswiff.util.DriverUtils#getHtmlTableData(org.openqa.selenium.By)
	 */
	/*
	 * Function Name: getHtmlTableData
	 *
	 * Description: Used to get the table data with single parameter
	 */
	@Override

	public List<String> getHtmlTableData(By tableLocator) throws Exception {
		List<String> tableData = new ArrayList<>();
		try {
			List<WebElement> tbl_element = driver.findElements(tableLocator);

			for (int i = 0; i < tbl_element.size(); i++) {
				tableData.add(tbl_element.get(i).getText());
			}
		} catch (Exception exception) {
			throw new Exception();
		}
		return tableData;
	}

	/*
	 * Function Name=getListOfWindows
	 *
	 * Description:It will return the list of windows as set object
	 */

	/*
	 * (non-Javadoc)
	 *
	 * @see com.payswiff.util.DriverUtils#getListWindows()
	 */
	@Override
	public Set<String> getListWindows() {
		return driver.getWindowHandles();
	}

	/*
	 * Function Name=switchToNewWindow
	 *
	 * Description:It will return the list of windows as set object
	 */

	/*
	 * (non-Javadoc)
	 *
	 * @see com.payswiff.util.DriverUtils#switchToNewWindow()
	 */
	@Override
	public boolean switchToNewWindow() throws Exception {
		try {
			addPageLoadTimeout();

			ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(windows.get(1));
			return true;
		} catch (TimeoutException timeout) {
			hitEscapeKeyForPopups();
			return true;
		} catch (Exception exception) {
			throw new Exception();
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.payswiff.util.DriverUtils#switchToNewWindow(java.lang.String)
	 */
	/*
	 * Function Name=switchToNewWindow
	 *
	 * Description:It will return the list of windows as set object
	 *
	 */
	@Override
	public boolean switchToNewWindow(String newWindowHandle) throws Exception {
		try {
			addPageLoadTimeout();
			driver.switchTo().window(newWindowHandle);
			return true;
		} catch (TimeoutException timeout) {
			hitEscapeKeyForPopups();
			return true;
		} catch (Exception exception) {
			throw new Exception(exception);
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.payswiff.util.DriverUtils#takescreenshot(java.lang.String)
	 */
	@Override
	public String takescreenshot(String scenario) throws Exception {
		try {
			String startedAt = "";
			String screenshotPath = "";
			String s = FileUtilities.timeStamp().split(Constants.SPACE)[1];
			s = s.replaceAll(":", " ");
			startedAt = s.split("\\.")[0];

			/*
			 * LOG.info(Arrays.toString(s)); for (int i = 0; i < s.length - 1;
			 * i++) { startedAt = startedAt + "-" + s[i]; }
			 */

			// startedAt = startedAt.substring(1, startedAt.length());
			// startedAt = startedAt.replace(" ", Constants.UNDERSCORE);

			File srcfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcfile, new File(baseProjectPath.concat("/TestResults/") + SeleniumNGSuite.browserType + "/" + TestResultUtils.executionStartDate + "/" + TestResultUtils.executionStartTime + "/" +"screenshots"+ "/" + scenario+".png"));
			screenshotPath = baseProjectPath.concat("/TestResults/") + SeleniumNGSuite.browserType + "/" + TestResultUtils.executionStartDate + "/" + TestResultUtils.executionStartTime + "/" + "screenshots" + "/" + scenario+".png";
			
			return screenshotPath;
			/*FileUtils.copyFile(srcfile, new File(TestResultUtils.screenshotDirectory));
			return TestResultUtils.screenshotDirectory;*/

		} catch (IOException exception) {
			throw new Exception(exception);
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.payswiff.applnlibrary.ReusableMethods#sendKeysAction(org.openqa.
	 * selenium.Keys)
	 *
	 */
	@Override
	public void sendKeysAction(Keys Key) throws Exception {
		try {
			Actions action = new Actions(driver);
			action.sendKeys(Key);
		} catch (Exception exception) {
			throw new Exception(exception);
		}

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.payswiff.applnlibrary.ReusableMethods#sendKeysAction(org.openqa.
	 * selenium.Keys)
	 *
	 */
	@Override
	public boolean doubleClick(By idSelector) throws Exception {
		try {
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(idSelector)).doubleClick().perform();
			return true;
		} catch (Exception exception) {
			return false;
		}

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.payswiff.applnlibrary.ReusableMethods#addPageLoadTimeout()
	 * This Method is to override the default pageload timeout of selenium
	 */
	@Override
	public void addPageLoadTimeout() {
		try {
			if (Boolean.valueOf(handlePopups)) {
				driver.manage().timeouts().pageLoadTimeout(
						Integer.parseInt(configprops.getProperty(Constants.TIME_OUT_DURATION)), TimeUnit.SECONDS);
			}
		} catch (NumberFormatException exception) {
			LOG.info("Error while resetting the pageload timeout");
		}

	}

	/**
	 * Builds the xpath.
	 *
	 * @param xPath
	 *            the x path
	 * @param text
	 *            the text
	 * @return the string
	 */
	public String buildXpath(String xPath, String text) {
		if (xPath.contains("element")) {
			xPath = xPath.replace("element", text);
		}
		return xPath;
	}

	/**
	 * Builds the xpath.
	 *
	 * @param xPath
	 *            the x path
	 * @param text
	 *            the text
	 * @return the string
	 */
	public String buildxpath(By elementlocator, String text1, String text2, String text3) {
		String xPath = elementlocator.toString();
		if (!text1.isEmpty()) {
			if (xPath.contains("element1")) {
				xPath = xPath.replace("element1", text1);
			}
		}
		if (!text2.isEmpty()) {
			if (xPath.contains("element2")) {
				xPath = xPath.replace("element2", text2);
			}
		}
		if (!text3.isEmpty()) {
			if (xPath.contains("element3")) {
				xPath = xPath.replace("element3", text3);
			}
		}
		xPath = xPath.split("By.xpath:")[1].trim();
		return xPath;
	}

	/**
	 * Builds the xpath.
	 *
	 * @param elemlocator
	 *            the elemlocator
	 * @param text
	 *            the text
	 * @return the string
	 */
	public String buildXpath(By elemlocator, String text) {
		String xPath = elemlocator.toString();
		if (xPath.contains("element")) {
			xPath = xPath.replace("element", text);
		}
		xPath = xPath.split("By.xpath:")[1].trim();
		LOG.info("After split" + xPath);
		return xPath;
	}

	/**
	 * Sort price results.
	 *
	 * @return the array list
	 * @throws Exception
	 *             the payswiff exception
	 */

	/**
	 * Sort product name results.
	 *
	 * @return the array list
	 * @throws Exception
	 *             the payswiff exception
	 */
	/*
	 * (non-Javadoc)
	 *
	 * @see com.payswiff.applnlibrary.ReusableMethods#hitEscapeKeyForPopups()
	 * This method is used to hit escape key for the Windows popup
	 */
	@Override
	public void hitEscapeKeyForPopups() {
		try {
			if (Boolean.valueOf(handlePopups)) {
				sendKeysAction(Keys.ESCAPE);
			}
		} catch (Exception exception) {
			LOG.error("Error in hitting Escape key for pupup");
		}

	}

	/*
	 * This methods performs an action on a particular element. Parameter passed
	 * are : key like Enter and xpath of any element
	 */

	public void sendKeysAction(Keys Key, By element) throws Exception {
		try {
			Actions actions = new Actions(driver);
			Action action = actions.moveToElement(driver.findElement(element)).sendKeys(Key)
					.build();
			action.perform();
		} catch (Exception exception) {
			throw new Exception(exception);
		}

	}

	/*
	 * This method closes the browser
	 *
	 */
	public void closeTheBrowser() throws Exception {
		try {
			driver.close();
		} catch (Exception exception) {
			throw new Exception(exception);
		}

	}

	/*
	 * Function Name : gDropdownGetValues Script Description Input Parameters :
	 * WebElement Return Value : List
	 */

	public List<String> gDropdownGetValues(By strWebElement) throws Exception {

		try {
			Select strList = new Select(driver.findElement(strWebElement));
			List<WebElement> lstOptions = strList.getOptions();
			System.out.println("Size of page dropdown: " + lstOptions.size());
			List<String> dropDownValues = new ArrayList<>();
			for (int i = 0; i < lstOptions.size(); i++) {
				dropDownValues.add(lstOptions.get(i).getText());
			}
			return dropDownValues;
		} catch (Exception exception) {

			throw new Exception(exception);
		}

	}

	/****
	 * This method takes the input as list of expected values, reads the actual
	 * values send true / false
	 **/
	public boolean verifyWebElementsText(By Element, List<String> expectedvalues) {
		List<WebElement> list = driver.findElements(Element);
		ArrayList<String> actualvalues = new ArrayList<String>();
		for (int i = 0; i < list.size(); i++) {
			String element = list.get(i).getText();
			actualvalues.add(element);
			System.out.println(element);
		}
		if (expectedvalues.size() == actualvalues.size()) {
			@SuppressWarnings("rawtypes")
			Collection diff = CollectionUtils.subtract(expectedvalues, actualvalues);
			if (diff.isEmpty()) {
				LOG.info("Scenario::{} - Expected values are equal to Actual values");
			} else {
				LOG.info("Scenario::{} - Expected values are not equal to Actual values::{}",
						 diff);
				return false;
			}
		} else {
			return false;
		}
		return true;
	}

	public void sendKeyAction(Keys Key, By element) throws Exception {
		try {
			Actions actions = new Actions(driver);
			//Action action = actions.moveToElement(driver.findElement(element)).sendKeys(Key).build();
			
			Action action = actions.moveToElement(driver.findElement(element)).click()
					.build();
			
			action.perform();
		} catch (Exception exception) {
			throw new Exception(exception);
		}

	}

	@Override
	public boolean gClickWithoutCheckingEnabled(By elementLocator, String text) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean acceptBrowserPopUp() throws Exception {
		try {
			driver.switchTo().alert().accept();
			return true;

		} catch (NoSuchElementException exception) {
			throw new Exception(exception);
		}
	}

	public boolean gListSelectByIndex(By lstPracArea, int lstValue) throws Exception {

		try {
			new Select(driver.findElement(lstPracArea)).selectByIndex(lstValue);
			Thread.sleep(3000);
			return true;

		} catch (Exception exception) {
			throw new Exception(exception);
		}
	}
	
	//Select by visible text
	public boolean gListSelectByisibleText(By lstPracArea, String lstValue) throws Exception {

		try {
			new Select(driver.findElement(lstPracArea)).selectByVisibleText(lstValue);
			Thread.sleep(3000);
			return true;

		} catch (Exception exception) {
			throw new Exception(exception);
		}
	}
	
	//First Selected Option
	public boolean gListFirstSelectedOption(By lstPracArea) throws Exception {

		try {
			new Select(driver.findElement(lstPracArea)).getFirstSelectedOption();
			Thread.sleep(3000);
			return true;
		} catch (Exception exception) {
			throw new Exception(exception);
		}
	}

	@Override
	public void gNavToBrowser(String url) throws Exception {
		driver.navigate().to(url);

	}

	
	/**
	 * Send Value keys to the element that finds by cssSelector. It shortens
	 * "driver.findElement(By.cssSelector()).sendKeys()".
	 *
	 * @param idSelector
	 *            the id selector
	 * @param text
	 *            the text
	 * @return true, if successful
	 * @throws Exception
	 *             the payswiff exception
	 */
	@Override
	public boolean sendText(By idSelector, CharSequence[] value) throws Exception {
		try {
			driver.findElement(idSelector).clear();
			Actions actions = new Actions(driver);
			WebElement element = driver.findElement(idSelector);
			actions.moveToElement(element).doubleClick().sendKeys(Keys.BACK_SPACE).build().perform();
			driver.findElement(idSelector).sendKeys(value);
			Thread.sleep(2000);
			return true;
		} catch (NoSuchElementException | InterruptedException exception) {
			throw new Exception(exception);
		}

	}

}
