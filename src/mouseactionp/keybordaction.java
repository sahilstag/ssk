package mouseactionp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import NEW1.Browser;

public class keybordaction {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver=	Browser.OpenBrowser("https://demoqa.com/text-box");
	WebElement username=driver.findElement(By.xpath("//input[@id='userName']"));
	username.sendKeys("Sahil");
	
	Actions act= new Actions(driver);
	act.sendKeys(Keys.TAB);
	act.perform();
	
	
	act.sendKeys("Sahilkatariya144@gamil.com");
	act.perform();
	
	act.sendKeys(Keys.TAB);
	act.perform();
	
	act.sendKeys("pune");
	act.perform();

	Thread.sleep(2000);
	
	act.keyDown(Keys.CONTROL);
	act.sendKeys("a");
	act.keyUp(Keys.CONTROL);
	act.build().perform();
	
	
	
	act.keyDown(Keys.CONTROL);
	act.sendKeys("c");
	act.keyUp(Keys.CONTROL);
	act.build().perform();

	Thread.sleep(2000);
	
	
	act.sendKeys(Keys.TAB);
	act.perform();
	
	act.keyDown(Keys.CONTROL);
	act.sendKeys("v");
	act.keyUp(Keys.CONTROL);
	act.build().perform();
	
	Thread.sleep(3000);
	
	act.keyDown(Keys.SHIFT);//shift+tab se piche ke tab per jata(reverse)
	act.sendKeys(Keys.TAB);
	act.keyUp(Keys.SHIFT);
	act.build().perform();
	
	}

}
