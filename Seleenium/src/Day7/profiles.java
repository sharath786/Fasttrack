package Day7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class profiles {

	public static void main(String[] args) 
	{
		ProfilesIni pr=new ProfilesIni();
		
		FirefoxProfile fp=pr.getProfile("Praveen");
		
		WebDriver driver=new FirefoxDriver(fp);
		
		driver.get("http://gmail.com");

	}

}
