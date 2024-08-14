package testNGKey;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BefoerAfterMethod {
	
	
	@AfterMethod
	public void afterMethod()
		{
		Reporter.log("after method is running",true);
	}
	@BeforeMethod
	
	public void beforeMethod()
	{
		Reporter.log("Before Method is running",true);
	}
	
  @Test
  public void f1() {
	  
	  Reporter.log("Test1 Method is running",true);
  }
  @Test
  public void f2() {
	  
	  Reporter.log("Test2 Method is running",true);
  }
  
  
}
