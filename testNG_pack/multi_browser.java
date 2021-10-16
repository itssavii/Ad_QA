package testNG_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class multi_browser 
{
	public WebDriver driver;
	
	@Parameters("Browser")
	@BeforeClass
	
	public void firsttest(String browser)
	{
		if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","E:\\thinkQ\\firefox_driver\\geckodriver.exe");
			driver = new FirefoxDriver(); 
		}
		else if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","E:\\thinkQ\\chromedriver.exe");	
			driver=new ChromeDriver();
		}
		/*else if(browser.equalsIgnoreCase("IDE"))
		{
			System.setProperty("webdriver.ie.driver","E:\\thinkQ\\IED\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}*/
		
		driver.get("https://www.google.co.in/");
		
	}
	
	@Test
	public void check() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[contain(text(),'Gmail')]")).click();
		System.out.println("Browser open");
		Thread.sleep(3000);
	}
	
	@AfterClass
	public void end()
	{
		driver.quit();
	}
	

}
