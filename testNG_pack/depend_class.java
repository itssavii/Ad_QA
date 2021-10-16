package testNG_pack;

import org.testng.annotations.Test;

public class depend_class 
{
	@Test(dependsOnMethods= {"mthC","mthZ"})
	public void mthA() 
	{
		System.out.println("Method A depends On Method C And Method Z");
	}
	@Test
	public void mthB() 
	{
		System.out.println("Method B");
	}
	@Test
	public void mthC() 
	{
		System.out.println("Method C");
	}
	@Test
	public void mthZ() 
	{
		System.out.println("Method Z");
	}
	@Test(enabled=false)
	public void dependnotrun() 
	{
		System.out.println("Method not run");
	}
}
