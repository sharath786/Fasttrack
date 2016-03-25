package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class orangehrmmaster 
{
	public static WebDriver driver;
	public static String url="http://opensource.demo.orangehrm.com";
	public String Expval,Actval;
	public String u="Admin";
	public String p="admin";
	@BeforeSuite
	public void launch()
	{
		Expval="btnLogin";
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Actval=driver.findElement(By.id("btnLogin")).getAttribute("id");
		Assert.assertEquals(Actval, Expval, "Launch failed");
		
	}
	@BeforeTest
	public void login()
	{
		Expval="Welcome Admin";
		driver.findElement(By.id("txtUsername")).sendKeys(u);
		driver.findElement(By.id("txtPassword")).sendKeys(p);
		driver.findElement(By.id("btnLogin")).click();
		Actval=driver.findElement(By.partialLinkText("Welcome")).getText();
		Assert.assertEquals(Actval, Expval,"login failed");
	}
	@AfterTest
	public void logout()
	{
		Expval="btnLogin";
		driver.findElement(By.linkText("Welcome Admin")).click();
		driver.findElement(By.linkText("Logout")).click();
		Sleeper.sleepTightInSeconds(5);
		Actval=driver.findElement(By.id("btnLogin")).getAttribute("id");
		Assert.assertEquals(Actval, Expval, "Logout failed");
		
	}
	@AfterSuite
	public void close()
	{
		driver.quit();
	}

}
