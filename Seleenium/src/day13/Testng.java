package day13;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng
{
	@BeforeTest
	public void btest()
	{
		System.out.println("This is before test");
	}
	@AfterTest
	public void atest()
	{
		System.out.println("this is after test");
	}
	@BeforeClass
	public void bclass()
	{
		System.out.println("this is before class");
	}
	@AfterClass
	public void aclass()
	{
		System.out.println("this is after class");
	}
	@BeforeMethod
	public void before()
	{
		System.out.println("this is before method ");
	}
	@AfterMethod
	public void after()
	{
		System.out.println("this is after method");
	}
	@Test(priority=0)
	public void function1()
	{
		System.out.println("this is function1");
	}
	@Test(enabled=false)
	public void function2()
	{
		System.out.println("this is function2");
	}
	@Test(priority=2)
	public void a()
	{
		System.out.println("this is a");
	}

}
