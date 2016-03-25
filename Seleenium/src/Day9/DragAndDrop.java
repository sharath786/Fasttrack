package Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class DragAndDrop {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://snapdeal.com");
		
		driver.manage().window().maximize();
		
		WebElement l1=driver.findElement(By.partialLinkText("Mobiles"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(l1).build().perform();
		
		Sleeper.sleepTightInSeconds(5);
		
		WebElement l2=driver.findElement(By.xpath(".//*[@id='leftNavMenuRevamp']/div/div/ul/li[5]/div/div[1]/div/div/p[4]/a/span"));
//		act.moveToElement(l2).build().perform();
//		
//		act.sendKeys(Keys.ENTER).sendKeys(Keys.ENTER).build().perform();
		
		l2.click();
		
		Sleeper.sleepTightInSeconds(5);
		WebElement l3=driver.findElement(By.xpath(".//*[@id='content_wrapper']/div[2]/div[3]/div[1]/div/div[2]/div[8]/div[3]/div/div[1]/a[1]"));
		act.dragAndDropBy(l3,300,0).build().perform();
//		act.dragAndDrop(source, target);

	}

}
