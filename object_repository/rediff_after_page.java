package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class rediff_after_page 
{
	WebDriver localdriver;


	public rediff_after_page(WebDriver driver)
	{
		this.localdriver = driver;
		
	}
	
	@FindBy(xpath="//b[contains(text(),'Write mail')]")
	public WebElement writemail;
	
	//@FindBy(xpath="//input[@type='text'][2]")
	@FindBy(xpath="//input[starts-with(@class,'rd_inp_to as-input')]")
	public WebElement tobox;
	
	@FindBy(xpath="//a[@class='send_ng_compo rd_btn_cmp_send']")
	public WebElement senbtn;
	
	public void clickWrite() 
	{
		writemail.click();
	}
	public void toSendbox(String tobox1)
	{
		tobox.sendKeys(tobox1);
	}
	public void clicksendkey() 
	{
		senbtn.click();
	}

}
