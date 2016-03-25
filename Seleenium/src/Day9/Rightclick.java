package Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Rightclick {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		Sleeper.sleepTightInSeconds(5);
		WebElement gmail=driver.findElement(By.linkText("Gmail"));
		Actions act=new Actions(driver);
		//focusing on the gmail 
		act.moveToElement(gmail).build().perform();
		Sleeper.sleepTightInSeconds(5);
		//rightclick 
		act.contextClick().build().perform();
		Sleeper.sleepTightInSeconds(5);
		
		act.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).build().perform();
		Sleeper.sleepTightInSeconds(5);
		act.sendKeys(Keys.ENTER).build().perform();
		
		
		
		
		
	
	}

}
