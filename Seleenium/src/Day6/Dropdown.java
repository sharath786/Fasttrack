package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Dell/Desktop/cars.html");
		
		driver.manage().window().maximize();
		 
		WebElement drop=driver.findElement(By.tagName("select"));
		
		
		Select sel=new Select(drop);
		
		sel.selectByIndex(2);
		
		sel.selectByVisibleText("audi");
		
		sel.selectByValue("saab");

	}

}
