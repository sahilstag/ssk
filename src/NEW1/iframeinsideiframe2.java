package NEW1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class iframeinsideiframe2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=Browser.OpenBrowser("http://demo.automationtesting.in/Frames.html");
		
		WebElement ifm=driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		ifm.click();
		
		WebElement outerifm=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerifm);
		
		WebElement innerfrm=driver.findElement(By.xpath("(//iframe[@src='SingleFrame.html'])[1]"));
		driver.switchTo().frame(innerfrm);
		
		WebElement input=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		input.sendKeys("sahil");
		
		Thread.sleep(3000);
		 driver.switchTo().defaultContent();// main page var part ante
		 
		 WebElement home=driver.findElement(By.xpath("//a[text()='Home']"));
		 home.click();
		
	}



}
