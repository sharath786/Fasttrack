package Day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IELaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Dell\\Downloads\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://google.com");
	}

}
