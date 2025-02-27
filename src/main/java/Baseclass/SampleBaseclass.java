package Baseclass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SampleBaseclass {
	
	@BeforeSuite
	public void bs()
	{
		System.out.println("Database conn");
	}

	@BeforeTest
	public void bt()
	{
		System.out.println("parallel exe");
	}
	
	@BeforeClass
	public void bc()
	{
		System.out.println("open the browser");
	}
	
	@BeforeMethod
	public void bm()
	{
		System.out.println("login");
	}
	@AfterSuite
	public void as()
	{
		System.out.println("closing Database conn");
	}

	@AfterTest
	public void at()
	{
		System.out.println("closing parallel exe");
	}
	
	@AfterClass
	public void ac()
	{
		System.out.println("close the browser");
	}
	
	@AfterMethod
	public void am()
	{
		System.out.println("logout");
	}
}

