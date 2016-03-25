package day13;

import org.openqa.selenium.server.browserlaunchers.Sleeper;

import day12.functions;

public class callfunctions {

	@SuppressWarnings("static-access")
	public static void main(String[] args) 
	{
		functions f=new functions();
		//admin login test
		f.launch_App(f.url);
		Sleeper.sleepTightInSeconds(5);
		f.login_App(f.u, f.p);
		Sleeper.sleepTightInSeconds(5);
		f.logout();
		f.driver.quit();
		//empreg test 
		f.launch_App(f.url);
		Sleeper.sleepTightInSeconds(5);
		f.login_App(f.u, f.p);
		Sleeper.sleepTightInSeconds(5);
		f.empreg("Selenium", "Testing");
		Sleeper.sleepTightInSeconds(5);
		f.logout();
		f.driver.quit();

	}

}
