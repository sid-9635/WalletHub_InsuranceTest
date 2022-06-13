package testClasses;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import base.BaseClass;
import pageClasses.LoginPage;
import pageClasses.ReviewPage;
import pageClasses.VerifyReviewPage;
import pageClasses.WriteReviewPage;

public class VerifyReviewPageTest extends BaseClass{

	ReviewPage reviewPage;
	WriteReviewPage writeReviewPage;
	LoginPage loginPage;
	VerifyReviewPage verifyReviewPage;
	
	public VerifyReviewPageTest() {
	
		super();// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		initBrowser();
		reviewPage = new ReviewPage();
		writeReviewPage = new WriteReviewPage();
		loginPage = new LoginPage();
		verifyReviewPage = new VerifyReviewPage();
		
		reviewPage.clickOnStar();
		writeReviewPage.selectOptionAndWriteReview();
		loginPage.loginIntoApp();
	}
	
	@Test
	public void verifyMyReviewTextTest()
	{
		String st = verifyReviewPage.verifyMyReviewText();
		Assert.assertEquals(st, "Your Review");

	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
