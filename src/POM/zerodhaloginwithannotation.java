package POM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import NEW1.Browser;
import NEW1.sswithdate;
import excelsheet.exceldatafetch;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class zerodhaloginwithannotation {
	WebDriver driver;
	
	
	@BeforeMethod
	public void callbrowser() throws InterruptedException {
		Thread.sleep(5000);
		driver=Browser.OpenBrowser("https://kite.zerodha.com");
		
	}
	
	@Test (priority=1)
			public void loginwithcred() throws EncryptedDocumentException, IOException {
		Zerodhaloginpagepom11 obj=new Zerodhaloginpagepom11(driver);
		obj.enterusername().sendKeys(exceldatafetch.gettestdata(0, 1, "cred1"));
		obj.enterpassword(exceldatafetch.gettestdata(1, 1, "cred1"));
		obj.clickonsubmite();
	}
	
	@Test (priority = 2)
	public void blank()  {
		Zerodhaloginpagepom11 obj=new Zerodhaloginpagepom11(driver);
		obj.clickonsubmite();
	}
	
	@AfterMethod
	public void ss() throws IOException, InterruptedException {
	Thread.sleep(1000);
		
		sswithdate.screenshot(driver,"sahil");
	}

}
