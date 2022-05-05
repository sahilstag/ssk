package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dlt1pom {
	
	
	
	@FindBy(xpath = "//input[@type='text']")private WebElement usnm;
	@FindBy(xpath = "//input[@type='password']")private WebElement pass;
	@FindBy(xpath = "//button[@type='submit']")private WebElement sub;
	
	public dlt1pom(WebDriver driver) {//call all the xpath elements
		PageFactory.initElements(driver, this);
		}
	
	
	public void username(String username) {
		usnm.sendKeys(username);
	}
	

	public void password(String passs) {
		pass.sendKeys(passs);
	}


	public void submit() {
		sub.click();
	}

	
 	
	

}
