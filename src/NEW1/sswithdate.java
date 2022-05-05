package NEW1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class sswithdate {
	
	public static void screenshot(WebDriver driver, String Name ) throws IOException  {
		String dt=	dateandtime.datetime();
		File sa = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE );
		File da = new File("C:\\Users\\Dell\\Desktop\\cam\\"+Name+dt+".jpg");
		FileHandler.copy(sa, da);
		
	}
public static void main(String[] args) throws IOException {
	WebDriver driver= Browser.OpenBrowser("https://kite.zerodha.com/");
	sswithdate.screenshot(driver, "vicky");
	
}
}
