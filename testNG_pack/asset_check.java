package testNG_pack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class asset_check 
{
	@Test
	public void assertfail()
	{
		String str = "Hello Teams";
		System.out.println("assert would fail::");
		Assert.assertEquals(str, "Google");
	}

}
