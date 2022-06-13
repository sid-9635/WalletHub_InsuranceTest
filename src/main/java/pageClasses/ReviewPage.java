package pageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;
import utilities.Waits;

public class ReviewPage extends BaseClass  {

	BaseClass baseclass;
	//Actions action;
	@FindBy(xpath = "(//*[@class='rating-box-wrapper'])[3]//*[local-name()='svg'][1]") WebElement firstStar;
	@FindBy(xpath = "(//*[@class='rating-box-wrapper'])[3]//*[local-name()='svg'][2]") WebElement secondStar;
	@FindBy(xpath = "(//*[@class='rating-box-wrapper'])[3]//*[local-name()='svg'][3]") WebElement thirdStar;
	@FindBy(xpath = "(//*[@class='rating-box-wrapper'])[3]//*[local-name()='svg'][4]") WebElement fourthStar;
	

	
	public ReviewPage() {
		PageFactory.initElements(driver,this);
	
	}
	
	
	public WriteReviewPage clickOnStar()
	{
	Actions action = new Actions(driver);
	
	Waits.waits(20).until(ExpectedConditions.elementToBeClickable(fourthStar));
	action.moveToElement(fourthStar);
		if(fourthStar.getAttribute("aria-checked").equalsIgnoreCase("true") )
		{
			fourthStar.click();
			
		}
		
		fourthStar.click();
		return new WriteReviewPage();
	}
	
}
