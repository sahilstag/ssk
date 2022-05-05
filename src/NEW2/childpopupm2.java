package NEW2;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import NEW1.Browser;

public class childpopupm2 {
public static void main(String[] args) throws InterruptedException  {
	WebDriver driver= Browser.OpenBrowser("https://vctcpune.com/");
	WebElement prx=driver.findElement(By.xpath("//a[text()='Start Selenium Practice']"));
	prx.click();
	
Set<String>address=	driver.getWindowHandles();
ArrayList<String> i= new ArrayList(address);
driver.switchTo().window(i.get(1));
 WebElement clickr=driver.findElement(By.xpath("//input[@value='Radio1']"));
 clickr.click();
 Thread.sleep(2000);
	
	
}
}
