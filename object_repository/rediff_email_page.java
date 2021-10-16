
package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class rediff_email_page 
{
		WebDriver localdriver;
		public rediff_email_page(WebDriver driver)
		{
			this.localdriver = driver;
		}
		
		
		@FindBy(xpath="//a[contains(text(),'Sign in')]")
		public WebElement signbt;
		
		
		@FindBy(xpath="//input[@id='login1']")
		public WebElement email;
		
		@FindBy(xpath="//input[@id='password']")
		public WebElement pass;
		
		@FindBy(xpath="//input[@name='proceed']")
		public WebElement submitbtn;
		
		
		public void enteremailid( String emailid)
		{
			email.sendKeys(emailid);
		}
		
		public void enterpass(String passwd)
		{
			pass.sendKeys(passwd);
		}
		
		public rediff_after_page clickNext() 
		{
			submitbtn.click();
			
			//Signin_pwd_page signinpwd = new Signin_pwd_page(localdriver);
			rediff_after_page rnp = new rediff_after_page(localdriver);
			PageFactory.initElements(localdriver, rnp);
			return rnp;
		}


	
}
