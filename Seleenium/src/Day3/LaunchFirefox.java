package Day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		//get()   to open application
		
		driver.get("http://auth.mbenablers.com/admin");

	}

}
