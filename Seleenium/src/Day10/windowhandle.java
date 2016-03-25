package Day10;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class windowhandle 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("");
		Sleeper.sleepTightInSeconds(20);
		driver.findElement(By.id("username")).sendKeys("");
		driver.findElement(By.id("password")).sendKeys("");
		driver.findElement(By.xpath("//*[@id='master-component']/span[1]/main/form/button")).click();
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.xpath("//*[@id='master-component']/header/nav/button[1]")).click();
		driver.findElement(By.xpath(".//*[@id='master-component']/span[4]/main/table/tbody/tr[10]/td[1]/b")).click();
		driver.findElement(By.xpath("//*[@id='master-component']/span[6]/main/form/div[6]/button[2]")).click();
		Sleeper.sleepTightInSeconds(5);
		Alert alt=driver.switchTo().alert();
		
		String text=alt.getText();
		System.out.println(text);
		alt.accept();

	}

}
