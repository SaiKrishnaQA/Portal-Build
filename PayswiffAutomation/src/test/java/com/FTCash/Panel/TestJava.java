/*
 * @author Sai G
 * 
 */
package com.FTCash.Panel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.server.Authentication.User;
import org.testng.annotations.Test;

import com.payswiff.constants.Constants;

public class TestJava {

	/** The base project path. */
	public static String baseProjectPath = System.getProperty(Constants.USER_DIR);

	File file;
	FileInputStream fsIP;
	HSSFWorkbook workbook;
	HSSFSheet sheet;
	FileOutputStream output_file;
	Cell cell = null; 

	String fileLoc = Constants.AxisFile;
	public void SelFile(String fileLoc) {

		try {
			file = new File(fileLoc);
			fsIP= new FileInputStream(file);
			workbook = new HSSFWorkbook(fsIP);
			sheet = workbook.getSheetAt(0); 

		} catch (FileNotFoundException e)

		{
			System.out.println("Could not read the Excel");
			e.printStackTrace();
		}
		catch (IOException e)
		{
			System.out.println("Could not read the Excel sheet");
			e.printStackTrace();
		}
	}

	public void WriteData(int RowNum, int CellNum) {

		cell = sheet.getRow(RowNum).getCell(CellNum);
		cell.setCellValue(Fetch_MerchID.S);
	}

	public void CloseFile() throws IOException {
		fsIP.close(); 
		output_file =new FileOutputStream(file);
		workbook.write(output_file);
		output_file.close();
	}
}


