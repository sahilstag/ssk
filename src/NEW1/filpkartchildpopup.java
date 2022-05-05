package NEW1;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class filpkartchildpopup {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=Browser.OpenBrowser("https://www.flipkart.com/");
		WebElement cross= driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		cross.click();
		Thread.sleep(3000);
		WebElement se=driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		se.sendKeys("REDMI 10 (Midnight Black, 64 GB)  (4 GB RAM)");
		WebElement enter= driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		enter.click();
		Thread.sleep(2000);
		WebElement mobpop=driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]"));
		mobpop.click();
		Thread.sleep(6000);
		
	Set<String> address	=driver.getWindowHandles();
	Iterator<String> i=address.iterator();
	
	while(i.hasNext()) {
		driver.switchTo().window(i.next());
		String actualtitle=driver.getTitle();
		String expextitle="jnbkf";
				if (actualtitle.equals(expextitle)) {
					WebElement buy=driver.findElement(By.xpath(""));
				}
	}
//		Set<String> address=driver.getWindowHandles();
//		Iterator<String> i= address.iterator();
//		
//		while(i.hasNext()) {
//			driver.switchTo().window(i.next());
//			String ata=driver.getCurrentUrl();
//			String ext="https://www.flipkart.com/redmi-10-midnight-black-64-gb/p/itmd93641e4ebb47?pid=MOBGC9GYEBH3GZ4E&lid=LSTMOBGC9GYEBH3GZ4EOWOH9V&marketplace=FLIPKART&q=REDMI+10+%28Midnight+Black%2C+64+GB%29++%284+GB+RAM%29&store=tyy%2F4io&srno=s_1_1&otracker=search&otracker1=search&fm=Search&iid=fa87d0c9-be29-42b9-8992-ba2e63a5da59.MOBGC9GYEBH3GZ4E.SEARCH&ppt=hp&ppn=homepage&ssid=y6g52vc2og0000001649162295017&qH=803b0b6aa420eae9";
//			Thread.sleep(2000);
//			if(ata.equals(ext)) {
//				WebElement buy=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']"));
//				buy.click();//_2KpZ6l _2U9uOA ihZ75k _3AWRsL
//				
//			}
//		}
//	//String at=driver.getCurrentUrl();
	
	
//REDMI 10 (Midnight Black, 64 GB) (4 GB RAM)- Buy Products Online at Best Price in India - All Categories | Flipkart.com
	
//		File sa = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File da = new File("C:\\Users\\Dell\\Desktop\\cam\\sahil.jpg");
//		FileHandler.copy(sa, da);
		
		
		
		
//	
	}}


