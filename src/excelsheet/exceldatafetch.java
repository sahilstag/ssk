package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import NEW1.Browser;

public class exceldatafetch {

	public static String gettestdata(int row, int cell, String sheet) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\Dell\\Desktop\\cam\\Book1.xlsx");// setup coonection between outer 
																		//excel file and eclips
	String value=WorkbookFactory.create(file).getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	return value;// by using apache POI's wokebookfactory we can fetch the data from excelsheet 
	}

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		WebElement username =driver.findElement(By.xpath("//input[@id='userid']"));
//		username.sendKeys("OKP335");
//		
//		WebElement password =driver.findElement(By.xpath("//input[@id='password']"));
//		
//		password.sendKeys("EDC123456");
//		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
//		login.click();
//		Thread.sleep(4000);
//		WebElement pin=driver.findElement(By.xpath("//input[@type='password']"));
//		pin.sendKeys("654321");
//		
//		WebElement login1 = driver.findElement(By.xpath("//button[@type='submit']"));
//		login1.click();
//	

		
	}


