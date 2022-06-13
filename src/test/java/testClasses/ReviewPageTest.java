package testClasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import pageClasses.ReviewPage;
import pageClasses.WriteReviewPage;

public class ReviewPageTest extends BaseClass{

	ReviewPage reviewPage;
	WriteReviewPage writeReviewPage;
	
	public ReviewPageTest() {
	
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setUp()
	{
		
		initBrowser();
		reviewPage = new ReviewPage();
	}
	
	@Test
	public void clickOnStarTest() throws InterruptedException
	
	{
		
		writeReviewPage = reviewPage.clickOnStar();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}
