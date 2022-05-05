package NEW1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nevigaL2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\\\slenium\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
	driver.navigate().to("https://www.youtube.com/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
}
}
