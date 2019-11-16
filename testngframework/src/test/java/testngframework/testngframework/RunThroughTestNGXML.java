package testngframework.testngframework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RunThroughTestNGXML {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before sute");
	}

	@BeforeGroups(groups = "sanity")
	public void beforeGrouping() {
		System.out.println("before grouping");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("beofre Test");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("before class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method");
	}

	@Test(priority = 0, invocationCount = 3)
	public void test1() {
		System.out.println("test1 running");
	}

	@Test(priority = 0)
	public void test2() {
		System.out.println("test2 running");
	}
	
	 @Test(groups= {"sanity","regression"})
	 public void testSanity() {
	 System.out.println("testsanity"); }

	@AfterMethod
	public void afterMethod() {
		System.out.println("after method");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("after class");
	}

	@AfterTest
	public void afterSuite() {
		System.out.println("after suite");
	}

	@AfterGroups(groups = "regression")
	public void aftergrouping() {
		System.out.println("after grouping");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("after suite");
	}

	/*
	 * @Test(groups={"sanity"}) public void test() { System.out.println("sanity"); }
	 * 
	 * 
	 * @Test(groups= {"sanity","regression"}) public void test1() {
	 * System.out.println("sanityreg"); }
	 * 
	 * @Test(groups= {"regression"}) public void test2() {
	 * System.out.println("reg"); }
	 */

}
