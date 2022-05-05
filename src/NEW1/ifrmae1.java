package NEW1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ifrmae1 {
public static void main(String[] args) {
		
		WebDriver driver=Browser.OpenBrowser("http://demo.automationtesting.in/Frames.html");
		
		WebElement iframe =driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(iframe);//by webelement
		//driver.switchTo().frame(0);//by index
		//driver.switchTo().frame("singleframe");//by id
		
		
		WebElement input=driver.findElement(By.xpath("//input[@type='text']"));
		input.sendKeys("sahil");
	}



}
