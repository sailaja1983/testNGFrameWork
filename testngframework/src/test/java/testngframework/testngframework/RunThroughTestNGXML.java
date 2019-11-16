package testngframework.testngframework;

import org.testng.annotations.Test;

public class RunThroughTestNGXML {
	
	@Test(groups={"sanity"},priority=1) 
	public void test()
	{
		System.out.println("sanity");
	}

	@Test(groups= {"sanity","regression"},priority=4)
	public void test1()
	{
		System.out.println("sanityreg");
	}
	@Test(groups= {"regression"},priority=2)
	public void test2()
	{
		System.out.println("reg");
	}
		
	@Test(groups= {"sanity"},priority=3)
	public void test3()
	{
		System.out.println("system");
	}
		
}
