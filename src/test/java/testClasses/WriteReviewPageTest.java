package testClasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import pageClasses.LoginPage;
import pageClasses.ReviewPage;
import pageClasses.WriteReviewPage;

public class WriteReviewPageTest extends BaseClass {

	ReviewPage reviewPage;
	WriteReviewPage writeReviewPage;
	LoginPage loginPage;
	
	public WriteReviewPageTest() {
	
		super();// TODO Auto-generated constructor stub
	}
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		initBrowser();
		reviewPage = new ReviewPage();
		writeReviewPage = new WriteReviewPage();
		reviewPage.clickOnStar();
		
	}
	
	@Test
	public void selectOptionAndWriteReviewTest() throws InterruptedException
	{
		loginPage = writeReviewPage.selectOptionAndWriteReview();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	

	
}
