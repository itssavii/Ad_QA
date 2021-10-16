package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sign_money_rediff_pom 
{
	WebDriver localdriver;
	public sign_money_rediff_pom(WebDriver driver)
	{
		this.localdriver = driver;
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Sign In')]")
	public WebElement signbt;
	
	
	@FindBy(xpath="//input[@id='useremail']")
	public WebElement email;
	
	@FindBy(xpath="//input[@id='userpass']")
	public WebElement pass;
	
	@FindBy(xpath="//input[@id='loginsubmit']")
	public WebElement submitbtn;
	
	
	public void enteremailid( String emailid)
	{
		email.sendKeys(emailid);
	}
	
	public void enterpass(String passwd)
	{
		pass.sendKeys(passwd);
	}
	
	public money_next_page clickNext() 
	{
		submitbtn.click();
		
		//Signin_pwd_page signinpwd = new Signin_pwd_page(localdriver);
		money_next_page mnp = new money_next_page(localdriver);
		PageFactory.initElements(localdriver, mnp);
		return mnp;
	}


}
