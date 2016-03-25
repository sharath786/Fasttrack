package Day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Calendar {

	public static void main(String[] args) 
	{
		String date="18/December/2017";
		String[] datesplit=date.split("/");
		String year=datesplit[2];
		String month=datesplit[1];
		String day=datesplit[0];
		boolean flag = false;
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://cleartrip.com");
		Sleeper.sleepTightInSeconds(10);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("DepartDate")).click();
		//year selection
		
		String calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		
		while(!year.equals(calyear))
		{
			driver.findElement(By.className("nextMonth ")).click();
			calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
			
		}
		//month selection
		
		String calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		
		while (!month.equalsIgnoreCase(calmonth)) 
		{
			driver.findElement(By.className("nextMonth ")).click();
			calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
			if (driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/div/span[1]")).getText().equals(month)) 
			{
				System.out.println(calmonth);
				calmonth=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/div/span[1]")).getText();
				String next=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a")).getAttribute("class");
				System.out.println(next);
				if (!next.equalsIgnoreCase("nextMonth disabled")) 
				{
					List<WebElement> rows=driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr"));
					for (int i = 0; i < rows.size(); i++) 
					{
						List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
						for (int j = 0; j < cols.size(); j++) 
						{
							String calday=cols.get(j).getText();
							if (day.equals(calday)) 
							{
								cols.get(j).click();
								flag=true;
								break;
							}
							
						}
						if (flag) 
						{
							break;
							
						}
						
					}
					
				}
				else
				{
					List<WebElement> rows=driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr"));
					for (int i = 0; i < rows.size(); i++) 
					{
						List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
						for (int j = 0; j < cols.size(); j++) 
						{
							String calday=cols.get(j).getText();
							if (day.equals(calday)) 
							{
								cols.get(j).click();
								flag=true;
								break;
							}
							
						}
						if (flag) 
						{
							break;
							
						}
						
					}
				}
			}
		}
		
		
		//date selection

		
		
		

	}

}
