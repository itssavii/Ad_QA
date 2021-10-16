package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class money_next_page 
{
	
	WebDriver localdriver;


	public money_next_page(WebDriver driver)
	{
		this.localdriver = driver;
		
	}
	
	@FindBy(xpath="//a[contains(text(),'My Portfolio')]")
	public WebElement portf;
	
	
	@FindBy(linkText="Sign Out")
	public WebElement sigout;
	
	public void clickportf() 
	{
		portf.click();
	}
	
	public void clickout() 
	{
		sigout.click();
	}


}
