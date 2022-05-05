 package NEW1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class childpopupm1 {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver=Browser.OpenBrowser("https://vctcpune.com/");
	WebElement childtab=driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));

	
	childtab.click();
	
	Set<String>address=driver.getWindowHandles();//sagle handle string madhe ghete
	Iterator<String> i = address.iterator();//
	while(i.hasNext()) {
		driver.switchTo().window(i.next());
		 String actualtitle=driver.getTitle();
		 System.out.println(actualtitle);
		 String expectedtitle= "Practice Page";
       if (actualtitle.equals(expectedtitle)) {
    	   WebElement radio1click= driver.findElement(By.xpath("//input[@value='Radio1']"));
   		radio1click.click();
       }
	}
	//	Thread.sleep(2000);
//	childtab.click();
//	Thread.sleep(2000);
//	childtab.click();
//	Set<String> address=driver.getWindowHandles();
//	Iterator<String> i =address.iterator();
//	
//	while(i.hasNext()) {
//		driver.switchTo().window(i.next());
//		 String actualtitle=driver.getTitle();
//		//System.out.println(i.next());
//		String expectedtitle= "Practice Page";
//		if (actualtitle.equals(expectedtitle)) 
//		{
//		WebElement radio1click= driver.findElement(By.xpath("//input[@value='Radio1']"));
//		radio1click.click();
//		break;
//		}
		
	}
	
	
	
	}


