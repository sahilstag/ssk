package NEW2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class brow {
	public static WebDriver opn (String url) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\slenium\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
		
	}
	
	
	}


