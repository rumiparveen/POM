package pageobjectmodel;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends Baseclass{
	@Test (priority=2)
	public void loginTest() throws Exception
	{
		driver.get(baseURL);
		
		
		loginpage lp=new loginpage(driver);
		Thread.sleep(4000);
		lp.setUname("rumi@tekarch.com");
		
	    lp.setPassword("Rahish@123");
		driver=lp.setlogin();
		Thread.sleep(4000);
		
	
		}
		
		
	
	@Test (priority=1)
	public void error_login() throws Exception
	
	{
		//driver.get(baseURL);
		String expected="Please enter your password.";
		
		loginpage lp=new loginpage(driver);
		Thread.sleep(4000);
		lp.setUname("rumi@tekarch.com");
		lp.setPassword("");
		driver=lp.setlogin();
		Thread.sleep(4000);
		String actual=lp.error();
		System.out.println("======="+actual);
		Assert.assertEquals(actual, expected);
		
		}
	@Test
	public void remeberMe() throws Exception
	{
    

		loginpage lp=new loginpage(driver);
		Thread.sleep(4000);
		lp.setUname("rumi@tekarch.com");
		
	    lp.setPassword("Rahish@123");
		driver=lp.setlogin();
		Thread.sleep(5000);
		lp.userMenu();
		Thread.sleep(5000);
		lp.setlogout();
		Thread.sleep(5000);
		Assert.assertTrue(driver.findElement(By.xpath("//label[@class='label usernamelabel']")).isDisplayed());
	}
	@Test
	public void forGotpassword() throws Exception 
	{

	 loginpage lp=new loginpage(driver); 
     Thread.sleep(4000);                   
     lp.setforgotpassword();
     lp.setUn("rumi@tekarch.com");
     Thread.sleep(4000);
     lp.setcontinue();
     Thread.sleep(4000);
     lp.returnToLogin();
     
	}
	@Test
	public void validateErrorLogin() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUname("123");
		Thread.sleep(4000);
		lp.setPassword("22131");
		driver=lp.setlogin();
	}
	}

