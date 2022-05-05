package NEW2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import NEW1.Browser;

public class alertpopup {
public static void main(String[] args) {
	WebDriver driver=Browser.OpenBrowser("https://vctcpune.com/selenium/practice.html");
	
	WebElement alertn=driver.findElement(By.xpath("//input[@id='alertbtn']"));
	alertn.click();
	
	Alert a =driver.switchTo().alert();
	a.accept();
	
}
}
