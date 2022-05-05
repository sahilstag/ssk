package mouseactionp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import NEW1.Browser;

public class MArightclick {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver=	Browser.OpenBrowser("https://demo.guru99.com/test/simple_context_menu.html");
	
	WebElement doubleclick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	Actions a= new Actions(driver);
	a.doubleClick(doubleclick);
	a.perform();
	
	
	Alert al= driver.switchTo().alert();
	al.accept();
//	WebElement rightcl=driver.findElement(By.xpath("//span[text()='right click me']"));
//	Actions act= new Actions(driver);
//	act.contextClick(rightcl);
//	act.perform();
//	
//	Thread.sleep(2000);
//	WebElement edit= driver.findElement(By.xpath("//li[contains(@class,'context-menu-item context-menu-icon context-menu-icon-e')]"));
//	edit.click();
//	Thread.sleep(2000);
//	Alert a=driver.switchTo().alert();
//	a.accept();
	
	
	}

}
