package Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class upload {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrm.com");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.linkText("PIM")).click();
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.linkText("Add Employee")).click();
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.id("photofile")).click();
		
	}

}
