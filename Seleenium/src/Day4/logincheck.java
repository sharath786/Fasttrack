package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class logincheck {

	public static void main(String[] args) {
		 WebDriver driver=new FirefoxDriver();
		 driver.get("http://opensource.demo.orangehrm.com/index.php/auth/login");
		 driver.manage().window().maximize();
		 
		 if (driver.findElement(By.id("btnLogin")).isDisplayed()) {
			 System.out.println("Pass");
		}
		 else
		 {
			 System.out.println("Fail");
		 }
		 
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 driver.findElement(By.id("txtPassword")).sendKeys("admin");
		 driver.findElement(By.id("btnLogin")).click();
		 //linkText()
		 //isDisplayed()
		 if (driver.findElement(By.linkText("Welcome Admin")).isDisplayed())
		 {
			 System.out.println("Pass");
			
		}
		 else
		 {
			 System.out.println("Fail");
		 }

	}

}
