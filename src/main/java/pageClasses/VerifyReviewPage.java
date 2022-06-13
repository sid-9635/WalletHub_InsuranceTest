package pageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;
import utilities.Waits;

public class VerifyReviewPage extends BaseClass {
	
	@FindBy(xpath = "//*[contains(text(),\" Your Review\")]") WebElement yourReview;

	
	public VerifyReviewPage() {
		PageFactory.initElements(driver, this);// TODO Auto-generated constructor stub
	}
	
	public String verifyMyReviewText()
	{
		Waits.waits(20).until(ExpectedConditions.elementToBeClickable(yourReview));
		return yourReview.getText();
		
		
	}
	
	
}
