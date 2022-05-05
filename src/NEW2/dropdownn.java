package NEW2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import NEW1.Browser;

public class dropdownn {
	public static void main(String[] args) {
		
		WebDriver driver= Browser.OpenBrowser("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	
	WebElement dropdow=driver.findElement(By.xpath("//select[@id='first']"));
	
	Select a =new Select(dropdow);
	a.selectByIndex(1);
	
	}

}
