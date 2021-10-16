package testNG_pack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class beforafterTest 
{
	@BeforeTest
	public void Login() 
	{
		System.out.println("Welcome to Login page");
		
	}
	@Test
	public void verifyLogin() 
	{
		System.out.println("Login Done");
	}
	@AfterTest
	public void Logout()
	{
		System.out.println("Logout Done");
	}

}
