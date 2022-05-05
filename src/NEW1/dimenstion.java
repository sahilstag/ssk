package NEW1;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dimenstion {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\\\\\slenium\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Dimension d =new Dimension(1400, 900);
		driver.manage().window().setSize(d);
		Thread.sleep(3000);
		Point p =new Point(200,300 );
		driver.manage().window().setPosition(p);
		
		
		
//		Dimension d = new Dimension(1400, 900);
//		driver.manage().window().setSize(d);
//		Point p =new Point(200, 300);
//		driver.manage().window().setPosition(p);
//		
	}

}
