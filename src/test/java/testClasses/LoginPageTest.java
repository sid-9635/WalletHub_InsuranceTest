package testClasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import pageClasses.LoginPage;
import pageClasses.ReviewPage;
import pageClasses.VerifyReviewPage;
import pageClasses.WriteReviewPage;

public class LoginPageTest extends BaseClass {
	
	ReviewPage reviewPage;
	WriteReviewPage writeReviewPage;
	LoginPage loginPage;
	VerifyReviewPage verifyReviewPage;
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		initBrowser();
		reviewPage = new ReviewPage();
		writeReviewPage = new WriteReviewPage();
		loginPage = new LoginPage();
		reviewPage.clickOnStar();
		writeReviewPage.selectOptionAndWriteReview();
	}
	
	@Test
	public void loginIntoAppTest()
	{
		verifyReviewPage = loginPage.loginIntoApp();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
