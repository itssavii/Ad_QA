/**
 * 
 */
package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import object_repository.rediff_after_page;
import object_repository.rediff_email_page;

/**
 * @author Star
 *
 */
public class PF_rediff_login 
{
	rediff_after_page rnp;
	@Test
	public void Login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\thinkQ\\chrome_driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		
		rediff_email_page emailpage=new rediff_email_page(driver);
		System.out.println("done");
		PageFactory.initElements(driver, emailpage);
		emailpage.signbt.click();
		emailpage.enteremailid("saviy21");
		emailpage.enterpass("Raj@1234");
		rnp = emailpage.clickNext();
		System.out.println("done");
		Thread.sleep(5000);
		
		rnp.clickWrite();
		
		System.out.println("done");
		rnp.toSendbox("saviy21@rediffmail.com");
		rnp.clicksendkey();
		

		System.out.println("End of code");

			
			driver.close();
	
		
		
		
	}

}
