package pageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BaseClass;
import utilities.Waits;

public class LoginPage extends BaseClass {

	@FindBy(xpath = "//a[text()='Login']") WebElement loginOptionLink;
	@FindBy(xpath = "//input[@name='em']") WebElement emailAddressTextbox;
	@FindBy(xpath = "//input[@name='pw1']") WebElement passwordTextbox;
	@FindBy(xpath = "//div[@class='btns']/button") WebElement loginButton;
	
	public static String email = prop.getProperty("email");
	public static String password = prop.getProperty("password");
	
	
	public LoginPage() {
		PageFactory.initElements(driver,this);	// TODO Auto-generated constructor stub
	}
	
	
	public VerifyReviewPage loginIntoApp()
	{
		
		Waits.waits(20).until(ExpectedConditions.elementToBeClickable(loginOptionLink));
		
		loginOptionLink.click();
		emailAddressTextbox.sendKeys(email);
		passwordTextbox.sendKeys(password);		
		loginButton.click();
		return new VerifyReviewPage();
	}
}
