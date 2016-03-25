package Day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowntesting {

	public static void main(String[] args) {
		String from,to; 
		int tccount;
		boolean flag=false;
		WebDriver driver=new FirefoxDriver();
		 driver.get("http://khuranatravel.com");
		 
		 driver.manage().window().maximize();
		 WebElement fc=driver.findElement(By.id("fromCity"));
		 Select fromcity=new Select(fc);
		 List<WebElement> fclist=fromcity.getOptions();
		 System.out.println(fclist.size());
		 for (int i = 0; i < fclist.size(); i++)
		 {
			fromcity.selectByIndex(i);
			from=fclist.get(i).getText();
			System.out.println(from);
			
			WebElement tc=driver.findElement(By.id("toCity"));
			Select tocity=new Select(tc);
			List<WebElement> tclist=tocity.getOptions();
			tccount=tclist.size();
			System.out.println(tccount);
			for (int j = 0; j < tccount; j++)
			{
				tocity.selectByIndex(j);
				to=tclist.get(j).getText();
				System.out.println(to);
				if(from==to)
				{
//					System.out.println("from city is exist in tocity list");
					flag=true;
					break;
				}
				else
				{
					flag=false;
				}
				
			}
			if (flag)
			{
				System.out.println(" fromciry is available in to city list ");
				
			}
		}

	}

}
