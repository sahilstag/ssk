package NEW2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

public class cls2 {
	public static void main(String[] args)  {
	WebDriver driver =brow.opn("https://vctcpune.com/selenium/practice.html");
		driver.navigate().to("https://facebook.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.manage().window().minimize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Dimension d= new Dimension(1000, 500);
		driver.manage().window().setSize(d);
		Point p =new Point(100, 100);
		driver.manage().window().setPosition(p);
//		//Thread.sleep(1000);
//		
	}

}
