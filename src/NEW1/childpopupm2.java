package NEW1;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class childpopupm2 {
	private static final String Array = null;

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=Browser.OpenBrowser("https://vctcpune.com/");
		WebElement childtab=driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
		childtab.click();
		Thread.sleep(6000);
		childtab.click();
		Thread.sleep(6000);
		childtab.click();
		
		Set<String>address=driver.getWindowHandles();
		ArrayList <String> list =new ArrayList(address);
		System.out.println(list.get(0));//main page address
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		driver.switchTo().window(list.get(1));
		  WebElement radio1click= driver.findElement(By.xpath("//input[@value='Radio1']"));
	   		radio1click.click();
	       
//screnshot.screenshot(driver, "sahil");
				
		//Iterator<String> i= address.iterator();
		//while(i.hasNext())
//		{
//			driver.switchTo().window(i.next());
//	
//		}
		
	}

}
