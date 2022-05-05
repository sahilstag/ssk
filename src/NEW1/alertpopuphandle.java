package NEW1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class alertpopuphandle {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=Browser.OpenBrowser("https://nxtgenaiacademy.com/alertandpopup/");
		
		WebElement alertbox= driver.findElement(By.xpath("//button[@name='alertbox']"));
		
		WebElement confirmalert= driver.findElement(By.xpath("//button[@name='confirmalertbox']"));
		
		WebElement propmtalert= driver.findElement(By.xpath("//button [@name='promptalertbox1234']"));
		
		
		
		alertbox.click();
		Alert a=driver.switchTo().alert();
		a.accept();
////		
//		confirmalert.click();
//		Alert a=driver.switchTo().alert();
//		String text=a.getText();
//		System.out.println(text);
//		Thread.sleep(1000);
//		a.accept();
		
		
//		propmtalert.click();
//		
//		Alert a= driver.switchTo().alert();
//		Thread.sleep(1000);
//		a.sendKeys("sahil");
//		a.accept();
		
	}

}
