package Day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links {

	public static void main(String[] args) {
		int j = 0;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		//locator tagName()
		//method findElements()
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++)
		{
			//getText()
			
			if (links.get(i).getText().equals(""))
			{
				System.out.println(links.get(i).getText());
				j=j+1;
			}
			
		}
		System.out.println(j);
		
	}

}
