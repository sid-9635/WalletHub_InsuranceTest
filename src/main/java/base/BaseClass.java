package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static Properties prop; 
	public static WebDriver driver; 
	public static FileInputStream fis;
	public BaseClass()
	{
		try
		{
			prop = new Properties();
			fis = new FileInputStream("C:\\Users\\Shree\\wps\\WalletHub_InsuranceTest\\src\\main\\java\\properties\\config.properties");
			prop.load(fis);
		}
		
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void initBrowser()
	{
		String browser = prop.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
			
		}
	
	
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
	}
}
