package NEW1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class titelmaxminL3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\\\slenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		System.out.println(driver.getTitle());
		String url= driver.getCurrentUrl();
		System.out.println(url);
		driver.manage().window().maximize();
		driver.manage().window().minimize();
	}

}
