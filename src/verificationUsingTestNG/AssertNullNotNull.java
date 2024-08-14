package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNullNotNull {
  @Test
  public void f() {
	  
	  String a="abc";
	  String d=null;
	  //Assert.assertNull(a,"Value is not null,TC failed");
	  Assert.assertNotNull(a,"Value is null,TC is failed");
	  Assert.fail(); 
  }
}
