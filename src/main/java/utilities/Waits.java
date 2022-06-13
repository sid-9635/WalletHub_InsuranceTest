package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;

public class Waits extends BaseClass{

	public static WebDriverWait wait;
	
	
	public static WebDriverWait waits(int seconds)
	{
		 wait = new WebDriverWait(driver, seconds);
		 return wait;
	}
}
