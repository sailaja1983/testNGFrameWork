package testngframework.testngframework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvideTestNG {
	
@Test(dataProvider="logintestdata")
public void test(String un, String pwd)
{
	System.out.println(un);
	System.out.println(pwd);
	System.out.println("first test passed");
	
}

@Test(dataProvider="regtestdata")
public void test1(String uname, String password)
{
	System.out.println(uname);
	System.out.println(password);
	System.out.println("second test passed");
	
}
//if we have multiple data providers are there then we differentiate with name
@DataProvider(name="logintestdata")
public Object[][] testData()
{
	String data[][]= {{"sailaja","sibyala"},{"testusername","testpassword"}};
	return data;
		 

	}
@DataProvider(name="regtestdata")
public Object[][] testData1()
{
	String data[][]= {{"xx","yy"},{"zz","gg"}};
	return data;
		 

	}


}


