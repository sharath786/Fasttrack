import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;


public class gmaillogin {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		//5 manage()
		
		driver.manage().window().maximize();
		
		//2 findElement() method
		//3 sendkeys()  method
		//1.    id()  locator
		
		driver.findElement(By.id("Email")).sendKeys("gandesharath");
		
		//2nd locator name()
		// 4  click()
		driver.findElement(By.name("signIn")).click();
		
		//wait statement
		Sleeper.sleepTightInSeconds(5);
		
		//cssselector locator
		driver.findElement(By.cssSelector("#Passwd")).sendKeys("123456789");
		
		// xpath locator
		driver.findElement(By.xpath(".//*[@id='signIn']")).click();
		

	}

}
