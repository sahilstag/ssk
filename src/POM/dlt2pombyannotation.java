package POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import NEW1.Browser;
import NEW1.sswithdate;

public class dlt2pombyannotation {
	WebDriver driver;
	
	@Test
	public void validcred() {
		dlt1pom obj= new dlt1pom(driver);
		obj.username("sahil");
		obj.password("123");
		obj.submit();
		
	}

	@Test
	public void blanksub() {
		dlt1pom obj= new dlt1pom(driver);
		obj.submit();
		
	}
	
	
	@BeforeMethod
	public void openfacebbok() {
		driver=Browser.OpenBrowser("https://www.facebook.com");
		
	}
	
	@AfterMethod
	public void ss() throws IOException, InterruptedException {
		Thread.sleep(1000);
		sswithdate.screenshot(driver, "fab");
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}
}
