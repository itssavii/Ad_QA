package testNG_pack;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testsuite_prog1 
{
	@Test  
	 public void add()  
	 {  
	     System.out.println("add data");  
	 }  
	 @BeforeSuite  
	 public void before_suite()  
	 {  
	     System.out.println("Before Suite: Open file");  
	 }  
}
