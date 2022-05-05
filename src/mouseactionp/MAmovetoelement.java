package mouseactionp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import NEW1.Browser;

public class MAmovetoelement {
	public static void main(String[] args) {
		WebDriver driver= Browser.OpenBrowser("https://www.amazon.in");
		WebElement mousemove=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions act= new Actions(driver);
		act.moveToElement(mousemove);
		act.perform();
		
		WebElement yourorder= driver.findElement(By.xpath("//span[text()='Your Orders']"));
		yourorder.click();
		
	}

}
