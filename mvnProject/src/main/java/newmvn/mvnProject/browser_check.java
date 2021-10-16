package newmvn.mvnProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class browser_check 
{
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() 
	{
		System.setProperty("webdriver.chrome.driver","E:\\thinkQ\\chrome_driver\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/");
	}
	
	// Test1
		@Test
		public void RediffTitleTest() 
		{
		
			String title = driver.getTitle();
			System.out.println(title);
			
			
		}
		
		@AfterMethod
		public void end()
		{
			driver.quit();
		}


}
