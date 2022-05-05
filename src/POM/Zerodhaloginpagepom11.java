package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zerodhaloginpagepom11 {
	
	@FindBy(xpath="//input[@id='userid']") private WebElement username;
	@FindBy(xpath = "//input[@id='password']")private WebElement password;
	@FindBy(xpath="//button[@type='submit']")private WebElement submit;
	@FindBy(xpath="//a[text()='Forgot user ID or password?']")private WebElement forgot;
	@FindBy(xpath="(//a[@target='_blank'])[3]")private WebElement dnothaveAccount;
	
	public Zerodhaloginpagepom11(WebDriver driver)
	{
		PageFactory.initElements(driver, this);//pagefactory.iinitelements will find all the elements declared at start
	}
	
	public WebElement enterusername(){
		return username;
	}
	
	public void enterpassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickonsubmite() {
		submit.click();
	}
	public void clickonforgot() {
		forgot.click();
	}
	public void clickondonthavaccount() {
		dnothaveAccount.click();
	}
	}
	


