package NEW1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

//
//
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.Point;
//import org.openqa.selenium.WebDriver;

//import java.io.File;
//import java.io.IOException;
//import java.util.Iterator;
//import java.util.Set;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.io.FileHandler;
//import org.openqa.selenium.support.ui.Select;
//
//import com.google.common.graph.ElementOrder.Type;
//
public class prac {
	public static void main(String[] args) throws InterruptedException, IOException  {
	
	WebDriver driver=Browser.OpenBrowser("https://www.vctcpune.com");
	WebElement childpop=driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
      childpop.click();
      childpop.click();
      Set<String>address=driver.getWindowHandles();
      ArrayList<String> list=new ArrayList(address);
      driver.switchTo().window(list.get(2));
//      Set<String> adress=driver.getWindowHandles();
//      ArrayList<String> list =new ArrayList(adress);
//      System.out.println(list.get(1));
//      driver.switchTo().window(list.get(2));
      
//	
//	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	File destination=new File("C:\\Users\\Dell\\Desktop\\cam\\sahil.jpg");
//	FileHandler.copy(source, destination);
	//Point p =new Point(500, 400);
	//driver.manage().window().setPosition(p);
	
//		WebElement childpop=driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
//		childpop.click();
//		Set<String>adress=driver.getWindowHandles();
//	Iterator<String>i=	adress.iterator();
//	while(i.hasNext()) {
//		driver.switchTo().window(i.next());
//		String atitle=driver.getTitle();
//		
//		String extitle="Practice page";
//		if (atitle.equals(extitle)) {
//			  WebElement radio1click= driver.findElement(By.xpath("//input[@value='Radio1']"));
//		   		radio1click.click();
//		}
//	}
		
		
//File sa =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//File de = new File("C:\\Users\\Dell\\Desktop\\cam\\hg.jpg");
//FileHandler.copy(sa, de);
//		//  File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//  File des=new File("C:\\Users\\Dell\\Desktop\\cam\\va.jpg");
//  FileHandler.copy(source, des);
		
		
		
		//	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//      
//		File desti= new File("C:\\Users\\Dell\\Desktop\\cam\\sahil.jpg");
//         FileHandler.copy(source, desti);
         
         
              
         
//       WebElement username=  driver.findElement(By.id("email"));
//       username.sendKeys("sahil");
//      WebElement pass= driver.findElement(By.id("pass"));
//         pass.sendKeys("sahil");
//         Thread.sleep(1000);
//         WebElement butt=driver.findElement(By.tagName("button"));
//         butt.click();
//	
	
	}
	
	

	
	
	
	
	
	
	
	//	Thread.sleep(1000);
//	driver.navigate().to("https://www.youtube.com/");
//	driver.navigate().back();
//	Thread.sleep(1000);
//	driver.navigate().forward();
//	driver.navigate().refresh();
//	System.out.println(driver.getTitle());
//	String title=driver.getTitle();
//	System.out.println(title);
//String url=	driver.getCurrentUrl();
//System.out.println(url);
//driver.manage().window().maximize();
////driver.manage().window().minimize();
//Dimension d =new Dimension(1000, 700);
//
//driver.manage().window().setSize(d);
//Point p =new Point(100, 100);
//driver.manage().window().setPosition(p);


}

