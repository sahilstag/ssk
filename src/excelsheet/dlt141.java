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

public class dlt141 {
	public static String exceldata(int row, int cell) throws EncryptedDocumentException, IOException {
		
		FileInputStream file= new FileInputStream("C:\\\\\\\\Users\\\\\\\\Dell\\\\\\\\Desktop\\\\\\\\cam\\\\\\\\Book1.xlsx");
		String value =WorkbookFactory.create(file).getSheet("cred1").getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		
		WebDriver driver = Browser.OpenBrowser("https://kite.zerodha.com/");
		String Username= dlt141.exceldata(0, 1);
		WebElement uid= driver.findElement(By.xpath("//input[@id='userid']"));
		uid.sendKeys(Username);
		
		String pass1 =dlt141.exceldata(1, 1);
		WebElement pass= driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys(pass1);
		
		WebElement log=driver.findElement(By.xpath("//button[@type='submit']"));
		log.click();
		Thread.sleep(2000);
		
		String pin =dlt141.exceldata(2, 1);
		WebElement pin1=driver.findElement(By.xpath("//input[@type='password']"));
		pin1.sendKeys(pin);
		
		WebElement sub=driver.findElement(By.xpath("//button[@type='submit']"));
		sub.click();
		
		
	}

}
