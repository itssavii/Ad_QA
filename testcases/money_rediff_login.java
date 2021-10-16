package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import object_repository.money_next_page;
import object_repository.sign_money_rediff_pom;

public class money_rediff_login 
{
	money_next_page mnp;
	@Test
	public void Login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\thinkQ\\chrome_driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/");
		
		sign_money_rediff_pom  emailpage=new sign_money_rediff_pom (driver);
		
		PageFactory.initElements(driver, emailpage);
		emailpage.signbt.click();
		emailpage.enteremailid("saviy21");
		emailpage.enterpass("Raj@1234");
		mnp = emailpage.clickNext();
		
		Thread.sleep(5000);
		mnp.clickportf();
		Thread.sleep(5000);
		mnp.clickout();

		System.out.println("End of code");
		
		driver.close();
		
	}
	@Test
	public void logout()
	{
		System.out.println("done ");
	}
}
