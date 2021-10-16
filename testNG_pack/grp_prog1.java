package testNG_pack;

import org.testng.annotations.Test;

public class grp_prog1 
{
	@Test(groups= {"SmokeTest"})  
	 public void Welcome()  
	 {  
	     System.out.println("Welcome");  
	 }  
	@Test  
	 public void welcome2()  
	 {  
	     System.out.println("New Joineee");  
	 }  

}
