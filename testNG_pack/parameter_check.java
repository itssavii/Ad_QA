
package testNG_pack;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class parameter_check 
{
	@Parameters({"URL"})
	@Test
	public void check_url(String p)
	{
		System.out.println("Test - Parameters");
		System.out.println(p);
		
	}

}
