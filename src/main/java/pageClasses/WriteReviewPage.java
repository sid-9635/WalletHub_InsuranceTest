package pageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;
import testData.ReadStringFromText;

public class WriteReviewPage extends BaseClass {
	
	@FindBy (xpath = "//*[@class='dropdown second']/span") WebElement dropdown;
	
	@FindBy(xpath = "(//*[@role='listbox'])[5]/li[2]") WebElement healthInsuranceOption;
	
	@FindBy(xpath = "//*[@class='android textarea-user']/textarea") WebElement reviewTextbox;
	
	@FindBy(xpath = "//*[contains(text(),\" Submit \")]") WebElement submitButton;
	
	public static String text = ReadStringFromText.ReadTextFile();
	
	public WriteReviewPage() {
		PageFactory.initElements(driver,this);
	}

	
	public LoginPage selectOptionAndWriteReview() 
	{
		dropdown.click();
		healthInsuranceOption.click();
		reviewTextbox.sendKeys(text);
		submitButton.click();
		
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		return new LoginPage();
	}
}
