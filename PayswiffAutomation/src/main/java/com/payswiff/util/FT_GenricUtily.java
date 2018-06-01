/*
 * @author Sai G
 * 
 */
package com.payswiff.util;

import java.awt.AWTException;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

public class FT_GenricUtily {
	
	static java.awt.Robot robot;
	
	
	// RobotKey Method for selecting Image
	public static java.awt.Robot Robot() throws InterruptedException, AWTException {
		StringSelection AddressProof = new StringSelection(
				"/home/thulasi/Pictures/Screenshot from 2018-01-24 16-29-18.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(AddressProof, null);
		robot = new java.awt.Robot();
		robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
		robot.keyPress(java.awt.event.KeyEvent.VK_L);
		robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
		robot.keyRelease(java.awt.event.KeyEvent.VK_L);
		robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
		robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
		robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
		robot.keyPress(java.awt.event.KeyEvent.VK_V);
		robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
		robot.keyRelease(java.awt.event.KeyEvent.VK_V);
		return robot;
	}
	
	
	// File Path Method
	public static String RobotFlpath(String filename) {
		String flPath1 = "/home/itadmin/Desktop/sai/workspace/PayswiffAutomation/src/main/resources/Upload_Scripts/"+filename+".xls";
		return flPath1;


		
	}

// RobotKey Method for selecting Image
	public static java.awt.Robot Robotchoosfile(String filename) throws InterruptedException, AWTException {
		StringSelection AddressProof = new StringSelection(filename);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(AddressProof, null);
		
		try {  

			//Setting clipboard with file location  setClipboardData(fileLocation); 
			 //native key strokes for CTRL, V and ENTER keys 
		robot = new java.awt.Robot();
		
		 robot.keyPress(KeyEvent.VK_CONTROL);  
		 robot.keyPress(KeyEvent.VK_V);  
		 robot.keyRelease(KeyEvent.VK_V);  
		 robot.keyRelease(KeyEvent.VK_CONTROL);  
		 robot.keyPress(KeyEvent.VK_ENTER); 
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		} catch (Exception exp) { 

			 exp.printStackTrace(); 
			 }  
/*		robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
		robot.keyPress(java.awt.event.KeyEvent.VK_L);
		robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
		robot.keyRelease(java.awt.event.KeyEvent.VK_L);
		robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
		robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
		robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
		robot.keyPress(java.awt.event.KeyEvent.VK_V);
		robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
		robot.keyRelease(java.awt.event.KeyEvent.VK_V);*/
		return robot;
	}
	
	
}

