package NEW2;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import NEW1.Browser;

public class sss {
	public static void main(String[] args) throws IOException {
		WebDriver driver=Browser.OpenBrowser("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
	File sa=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File da=new File("C:\\Users\\Dell\\Desktop\\cam\\sahil.jpg");
		FileHandler.copy(sa, da);
	}

}
