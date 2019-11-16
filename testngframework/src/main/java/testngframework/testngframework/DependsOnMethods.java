package testngframework.testngframework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {
	
	@Test
	public void test()
	{
		Assert.assertTrue(true);
	}
	
	@Test(dependsOnMethods={"test"})
	public void test1()
	{
		System.out.println("test1 pass");
	}
	
	@Test
	public void test2() {
		Assert.assertTrue(false);
		System.out.println("test2 pass");
	}
	//above assertions fails hence below test will be skipped since its depending on failed script
	
	@Test(dependsOnMethods={"test","test2"}, alwaysRun=true)
	public void test3()
	{
		System.out.println("test3 pass");
	}

}
