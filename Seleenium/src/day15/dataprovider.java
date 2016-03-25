package day15;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider 
{
	
	@Test(dataProvider="loginData")
	public void loginTest(String u,String p)
	{
		System.out.println(u+" "+p);
		
	}
	
	
	@DataProvider
	public Object[][] loginData()
	{
		Object[][] data=new Object[2][2];
		
		data[0][0]="Admin";
		data[0][1]="admin";
		
		data[1][0]="Qedge";
		data[1][1]="Selenium";
		return data;
	}

}
