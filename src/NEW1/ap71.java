package NEW1;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class ap71 {
public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver=ap7.opb("https://vctcpune.com/selenium/practice.html");
	 // LocalDateTime myObj = LocalDateTime.now();
	  //  System.out.println(myObj);
	ap72.ss(driver, "sahil");

	
}
}
