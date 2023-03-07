package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {

	
		WebDriver driver;
		
		public  loginpage(WebDriver driver)
		{
			this.driver=driver;
			
			PageFactory.initElements(driver,this);

	}
   
		
		@FindBy(id="username")
		WebElement txtusername1;
		
		@FindBy(id="password")
		WebElement txtpassword1;
		
		@FindBy(id="Login")
		WebElement login;
		
		@FindBy(id="error")
		WebElement errormessage;
		
		@FindBy(id="rememberUn")
		WebElement rememberme;
		
		@FindBy(id="userNavLabel")
		WebElement usermenu;
		
		@FindBy(id="forgot_password_link")
		WebElement forgotpassword;
		
		@FindBy(id="continue")
		WebElement Continue;
		
		
		@FindBy(linkText="Logout")
		WebElement logout;
		
		@FindBy(id="un")
		WebElement unload;
		
		@FindBy(linkText="Return to Login")
		WebElement Return;

		
		public void setUname(String name)
		{
			txtusername1.sendKeys(name);
		}
		public void setPassword(String pwd )
		{
			txtpassword1.sendKeys(pwd);
		}
		public WebDriver setlogin()
		{
			login.click();
			return driver;
		}
		public String error()
		{
			return errormessage.getText();
			
		}
		public void RememberMe()
		{
			rememberme.click();
		}
		public void setforgotpassword()
		{
		
			forgotpassword.click();
			
		}
		public void setlogout()
		{
		
			 logout.click();
			
		}
		
		public void userMenu()
		{
			usermenu.click();
		}
		public void  setcontinue()
		{
			Continue.click();
		}

		public void  setUn(String name)
		{
			unload.sendKeys(name);
		}
		public void  returnToLogin()
		{
			 Return.click();
		}
			
		}

		
		
		
		
			
		
		
		
		



