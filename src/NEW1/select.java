package NEW1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class select {
	public static void main(String[] args) {
		WebDriver driver=Browser.OpenBrowser("https://vctcpune.com/selenium/practice.html");
		WebElement list=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
	 Select sel= new Select(list);
	 sel.selectByIndex(2);
	 //sel.selectByValue("option2");
	
	 
	}

}
