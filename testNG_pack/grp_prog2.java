package testNG_pack;

import org.testng.annotations.Test;

public class grp_prog2 
{

	@Test  
	public void data1()  
	{  
	  System.out.println("new data 1");  
	}  
	@Test(groups= {"SmokeTest"})  
	public void data2()  
	{  
	  System.out.println("new data 2");  
	}  
}
