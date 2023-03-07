package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public String baseURL="https://login.salesforce.com/";
	public String username="rumi@tekarch.com";
	public String password="Rahish@123";
	public static WebDriver driver;
	
	
	@BeforeTest
	public void launch()
	{

		WebDriverManager.chromedriver().setup();
		
		 driver= new ChromeDriver();
		 driver.get(baseURL);
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	

}
