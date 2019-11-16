package testngframework.testngframework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsInTestNG {
	
	@Test
	public void test(){
		Assert.assertTrue(false);//failed
	}
	@Test
	public void test1()
	{
		Assert.assertTrue(true, "true");//pass
	}
	
	@Test
	public void test2()
	{
		Assert.assertFalse(false, "fasle");//passed
	}
	
	@Test
	public void test3()
	{
	Assert.assertEquals("test","test1");//failed
	
	}
	
	@Test
	public void test4()
	{
	Assert.assertEquals("test","test");//passed
	
	}
	@Test
	public void test5()
	{
	Assert.assertNotEquals("test","test1");//passed
	
	}
	@Test
	public void test6()
	{
	Assert.assertSame("test","test1");//failed
	
	}
	
	@Test
	public void test7()
	{
	Assert.assertNotSame("test","test1");//passed
	
	}
	@Test
	public void test8()
	{
		Assert.assertNull(null, "test");
	}
}
