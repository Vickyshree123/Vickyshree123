package listenerStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(coverFoxUtility.Listner.class)
public class MyClass {
	@Test
	public void a()
	{
		Reporter.log(" a is running ",true);
	}
	@Test(dependsOnMethods= {"c"})
	public void b()
	{
		Reporter.log(" b is rnning ",true);
	}
	@Test
	public void c()
	{
		Assert.fail();
		Reporter.log(" c is running ",true);
	}
	@Test
	public void d()
	{
		Reporter.log(" d is running ",true);
	}
}
