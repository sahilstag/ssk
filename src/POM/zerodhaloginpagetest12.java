package POM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

import NEW1.Browser;
import excelsheet.exceldatafetch;

public class zerodhaloginpagetest12 {
	
	
	public void loginwithvalidcredential() throws EncryptedDocumentException, IOException {
		
		WebDriver driver =Browser.OpenBrowser("https://kite.zerodha.com/");
		Zerodhaloginpagepom11 zlogin=new Zerodhaloginpagepom11(driver);
	    zlogin.enterusername().sendKeys(exceldatafetch.gettestdata(0, 1, "cred1"));
	    zlogin.enterpassword(exceldatafetch.gettestdata(1, 1, "cred1"));
	    zlogin.clickonsubmite();
	}
	
	public void loginwithblank() {
		WebDriver driver=Browser.OpenBrowser("https://kite.zerodha.com");
		Zerodhaloginpagepom11 z1login=new Zerodhaloginpagepom11(driver);
		z1login.clickonsubmite();
	}
		
		public void forgo() {
			WebDriver driver=Browser.OpenBrowser("https://kite.zerodha.com");
			Zerodhaloginpagepom11 z2login=new Zerodhaloginpagepom11(driver);
			z2login.clickonforgot();
	}
	public void dnthavacc() {
		WebDriver driver=Browser.OpenBrowser("https://kite.zerodha.com");
		Zerodhaloginpagepom11 z2login=new Zerodhaloginpagepom11(driver);
		z2login.clickondonthavaccount();
		driver.quit();
	}
	
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		zerodhaloginpagetest12 p=new zerodhaloginpagetest12();
	   p.loginwithvalidcredential();
		p.loginwithblank();
		p.dnthavacc();
	p.forgo();
	
    
	}
	
}
