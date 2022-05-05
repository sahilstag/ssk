package NEW2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class cls4 {
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=brow.opn("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
//	WebElement hide=driver.findElement(By.xpath("//input[@id='hide-textbox']"));
//		hide.click();
		WebElement show=driver.findElement(By.xpath("//input[@id='displayed-text']"));
		
		System.out.println(show.isDisplayed());		
	}

}
