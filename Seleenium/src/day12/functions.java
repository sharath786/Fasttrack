package day12;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class functions 
{
	public static WebDriver driver;
	public static String url="http://opensource.demo.orangehrm.com";
	public static String u="Admin";
	public static String p="admin";
	public static void main(String[] args) 
	{
		String res;
		launch_App(url);
		res=login_App(u, p);
		System.out.println(res);
		functions f=new functions();
		
		res=f.empreg("Qedge", "Tech");
		f.logout();
	}
	//static function without returning any value
	public static void launch_App(String url)
	{
		driver=new FirefoxDriver();
		driver.get(url);
		if (driver.findElement(By.id("btnLogin")).isDisplayed())
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	//static function with returning value
	public static String login_App(String u,String p)
	{
		driver.findElement(By.id("txtUsername")).sendKeys(u);
		driver.findElement(By.id("txtPassword")).sendKeys(p);
		driver.findElement(By.id("btnLogin")).click();
		if (driver.findElement(By.partialLinkText("Welcome")).isDisplayed())
		{
			return "Pass";
		}
		else
		{
			return "fail";
		}
	}
	//non static function without returning any value
	public void logout()
	{
		driver.findElement(By.linkText("Welcome Admin")).click();
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.linkText("Logout")).click();
		if (driver.findElement(By.id("btnLogin")).isDisplayed())
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	//non static function with returning  value
	public String empreg(String f,String l)
	{
		String Expval=f+" "+l;
		driver.findElement(By.linkText("PIM")).click();
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.linkText("Add Employee")).click();
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.id("firstName")).sendKeys(f);
		driver.findElement(By.id("lastName")).sendKeys(l);
		driver.findElement(By.id("btnSave")).click();
		String Actval=driver.findElement(By.xpath("//*[@id='profile-pic']/h1")).getText();
		if (Expval.equals(Actval))
		{
			return "Pass";
			
		}
		else
		{
			return "fail";
		}
		
		
	}

}
