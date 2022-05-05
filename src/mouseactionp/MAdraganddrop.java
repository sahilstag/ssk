package mouseactionp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import NEW1.Browser;

public class MAdraganddrop {
public static void main(String[] args) throws InterruptedException {
WebDriver driver=	Browser.OpenBrowser("https://www.globalsqa.com/demo-site/draganddrop/");
Thread.sleep(2000);

WebElement iframe=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
driver.switchTo().frame(iframe);


WebElement image =driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'])[4]"));
WebElement target=driver.findElement(By.xpath("//div[@id='trash']"));


Actions a= new Actions(driver);
a.dragAndDrop(image, target);
a.perform();
Thread.sleep(2000);
WebElement restore =driver.findElement(By.xpath("//a[text()='Recycle image']"));
restore.click();

Thread.sleep(2000);
WebElement zoom= driver.findElement(By.xpath("//a[text()='View larger']"));
zoom.click();



}
}
