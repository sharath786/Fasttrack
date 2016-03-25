package Day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class linkstest {

	
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://seleniumhq.org");
		
		Sleeper.sleepTightInSeconds(10);
		driver.navigate().to("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		//getPageSource()
		System.out.println(driver.getPageSource());
		//getAttribute()
		
		System.out.println(driver.findElement(By.name("userName")).getAttribute("size"));
		
		List<WebElement> links=driver.findElements(By.xpath("html/body/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/a"));
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++)
		{
			System.out.println(links.get(i).getText());
			
			links.get(i).click();
			
			System.out.println(driver.getCurrentUrl());
			
			System.out.println(driver.getTitle());
			Sleeper.sleepTightInSeconds(5);
			//navigate()
			driver.navigate().back();
			
			links=driver.findElements(By.xpath("html/body/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/a"));
			
		}
	}

}
