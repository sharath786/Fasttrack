package Day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromelaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Praveeen\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("http://google.com");
	}

}
