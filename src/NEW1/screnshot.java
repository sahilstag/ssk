package NEW1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class screnshot {
	public static void screenshot(WebDriver driver, String Name ) throws IOException  {
		//WebDriver driver=Browser.OpenBrowser("https://vctcpune.com/selenium/practice.html");
		File sa = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE );
		File da = new File("C:\\Users\\Dell\\Desktop\\cam\\"+Name+".jpg");
		FileHandler.copy(sa, da);
		
	
	}}


