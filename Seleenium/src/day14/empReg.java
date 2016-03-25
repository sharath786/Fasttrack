package day14;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class empReg extends orangehrmmaster
{
	@Test
	public void empregtest()
	{
		String f="Praveen";
		String l="S";
		Expval=f+" "+l;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys(f);
		driver.findElement(By.id("lastName")).sendKeys(l);
		
		driver.findElement(By.id("btnSave")).click();
		Actval=driver.findElement(By.xpath("//*[@id='profile-pic']/h1")).getText();
		Assert.assertEquals(Actval, Expval,"Emp reg failed");
		
	}

}
