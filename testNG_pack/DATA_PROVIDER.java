package testNG_pack;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DATA_PROVIDER 
{	
	@Test(dataProvider="SearchProvider")
	public void method(String name,String state) throws InterruptedException
	{
		System.out.println("Welcome::"+name+"   he is from::"+state);
		Thread.sleep(2000);
	}
	@DataProvider(name="SearchProvider")
	public Object[][]getDataFromDataProvider()
	{
		return new Object[][]
		{
			{"Suraj","Maharashtra"},
			{"Satish","Maharashtra"},
			{"Anant","Uttarparadesh"}
		};
	}

}
