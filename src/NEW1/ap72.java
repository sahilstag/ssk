package NEW1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ap72 {
	public static void ss( WebDriver driver ,String name) throws IOException {
		String daa=dateandtime.datetime();
		File sa= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File da=new File("C:\\\\Users\\\\Dell\\\\Desktop\\\\cam\\\\"+name,daa+".jpg");
		FileHandler.copy(sa, da);
	}

}
