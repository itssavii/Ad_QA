package testNG_pack;

import org.testng.annotations.Test;

public class test_paraMethod 
{
	@Test
    public void Method1() 
	{
        long id = Thread.currentThread().getId();
        System.out.println("method 1. Thread id is: " + id);
    }
 
    @Test
    public void Method2() 
    {
        long id = Thread.currentThread().getId();
        System.out.println("method 2. Thread id is: " + id);
    }
 
    @Test
    public void Methods3() 
    {
        long id = Thread.currentThread().getId();
        System.out.println("method 3. Thread id is: " + id);
    }
 
   @Test
    public void Method4() 
   	{
        long id = Thread.currentThread().getId();
        System.out.println("method 4. Thread id is: " + id);
    }
}
