package testNG_pack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class testsuite_prog2
{
	@Test  
	 public void del()  
	 {  
	     System.out.println("delete data");  
	 }  
	 @AfterSuite  
	 public void after_suite()  
	 {  
	     System.out.println("After Suite: Close file");  
	 }  
}
