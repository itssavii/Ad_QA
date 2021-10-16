package testNG_pack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Ng_prog1 
{
	@Test
	public void print()
	{
		System.out.println("Hello");
	}
	@Test
	public void add()
	{
		System.out.println("Add");
	}
	@Test
	public void out()
	{
		System.out.println("");
	}
	@AfterMethod
	public void am()
	{
		System.out.println("After method");
	}
	@BeforeMethod
	public void bm()
	{
		System.out.println("Before method");
	}

}
