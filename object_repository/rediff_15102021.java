package object_repository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff_15102021 
{
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\thinkQ\\chrome_driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			
		WebElement signIn = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
		signIn.click();
		WebElement email = driver.findElement(By.xpath("//input[@id='login1']"));
		email.sendKeys("saviy21");
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("Raj@1234");
		WebElement submitbtn = driver.findElement(By.xpath("//input[@name='proceed']"));
		submitbtn.click();
		WebElement writemail = driver.findElement(By.xpath("//b[contains(text(),'Write mail')]"));
		writemail.click();
		WebElement tomail = driver.findElement(By.xpath("//input[starts-with(@id,'TO_ID')]"));
		//WebElement tomail = driver.findElement(By.xpath("//ul[starts-with(@class,'as-selections ui-droppable')]"));
		tomail.sendKeys("saviy21@rediffmail.com");
		
		WebElement sub1 = driver.findElement(By.xpath("//input[starts-with(@class,'rd_inp_sub rd_subject_datacmp2')]"));
		sub1.sendKeys("Welcome");
	
		//WebElement outbtn = driver.findElement(By.xpath("//b[contains(text(),'Write mail')]"));
		
		driver.switchTo().frame("cke_rdMailEditorcmp3 ");	
		WebElement msg = driver.findElement(By.xpath("//body"));
		msg.sendKeys("hello java programming");
		System.out.println("Done");
		
		driver.switchTo().defaultContent();
		
		WebElement sendbtn = driver.findElement(By.xpath("//a[@class='send_ng_compo rd_btn_cmp_send']"));
		sendbtn.click();
		
		Thread.sleep(2000);
			
		System.out.println("****E****N****D****");
			
		driver.close();
	}
			

}



