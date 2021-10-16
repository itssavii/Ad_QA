package newmvn.mvnProject;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class rediff_check 
{
public WebDriver driver;
	
	public ExtentHtmlReporter htmlReporter;
	
	public ExtentReports extent;
	
	public ExtentTest test;
	
	@BeforeTest
	public void setExtent() 
	{
		
		
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/My_test-output/RedifReport.html");
		
		htmlReporter.config().setDocumentTitle("Oct 7th "); // Tile of report - you can change
		htmlReporter.config().setReportName("Functional Testing"); // Name of the report - you can change
		htmlReporter.config().setTheme(Theme.DARK);

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	
		extent.setSystemInfo("Host name", "localhost");
		extent.setSystemInfo("Environemnt", "QA");
		extent.setSystemInfo("user", "kamath");
		extent.setSystemInfo("OS","Windows 10");
		extent.setSystemInfo("Demo", "Extent Reports");
		extent.setSystemInfo("My Fav movie", "Bahubali 2");
		
	
	}

	@AfterTest
	public void endReport() {
		extent.flush();
	}

	@BeforeMethod
	public void setup() 
	{
		System.setProperty("webdriver.chrome.driver","E:\\thinkQ\\chrome_driver\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com//");
	}
	
	// Test1
		@Test
		public void RediffTitleTest() {
			test = extent.createTest("Rediif Title check");
			String title = driver.getTitle();
			System.out.println(title);
			test.log(Status.INFO, "test.log - INFO - checking title in this test");
			Assert.assertEquals(title, " My Rediff");
			//above assert would fail since title is different
		}

		// Test2
		@Test
		public void RediffLogoTest() {
			test = extent.createTest("Rediif_logo check");
			boolean b = driver.findElement(By.xpath("//div[@class='cell']")).isDisplayed();
			test.log(Status.INFO, "test.log - INFO  - Checking the demo store image");
			Assert.assertTrue(b);
		}

		// Test3
		@Test
		public void RediifLoginTest() {
			test = extent.createTest("rediif_login_check");

			test.createNode("Login with Valid input");
			test.log(Status.INFO, "test.log - INFO - created node");
			
			Assert.assertTrue(true);
			test.createNode("Login with In-valid input");
			Assert.assertTrue(true);
		}
		
		

		@AfterMethod
		public void tearDown(ITestResult result) throws IOException 
		{	
			if (result.getStatus() == ITestResult.FAILURE) 
			{
				test.log(Status.FAIL, "TEST CASE FAILED IS " + result.getName()); 
				test.log(Status.FAIL, "TEST CASE FAILED IS " + result.getThrowable()); 
				String screenshotPath = NopCommerceTest.getScreenshot(driver, result.getName());
				test.addScreenCaptureFromPath(screenshotPath);// adding screen shot
			} 
			else if (result.getStatus() == ITestResult.SKIP) 
			{
				test.log(Status.SKIP, "Test Case SKIPPED IS " + result.getName());
			} 
			else if (result.getStatus() == ITestResult.SUCCESS) 
			{
				test.log(Status.PASS, "Test Case PASSED IS " + result.getName());
			}
			driver.quit();
		}

		public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException {
			String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);

			// after execution, you could see a folder "FailedTestsScreenshots" under src
			// folder
			String destination = System.getProperty("user.dir") + "/Screenshots/" + screenshotName + dateName + ".png";
			File finalDestination = new File(destination);
			FileUtils.copyFile(source, finalDestination);
			return destination;
		}

	

}
