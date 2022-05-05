package mouseactionp;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import NEW1.Browser;

public class MAbyfindelements {
				// drag all elements one by one and move to trash 
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=Browser.OpenBrowser("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement iframe=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);
		
		List<WebElement> source=driver.findElements(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle']"));
		
		WebElement destination=driver.findElement(By.xpath("//div[@id='trash']"));
		
		System.out.println(source.size());//index chalu hoto zero pasun pan source size 1pasun start hote
		for (int i=0;i<source.size(); i++) {
		Actions act=new Actions(driver);
		act.dragAndDrop(source.get(i), destination);
		act.perform();
		Thread.sleep(1000);
		}
		
		
	}

}
