package co.suveem.automatesite.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import co.suveem.automatesite.driverconfig.DriverConfig;
import co.suveem.automatesite.drivermanager.DriverManager;
import co.suveem.automatesite.listeners.ScreenshotListener;

@Listeners(ScreenshotListener.class)
public class LaunchSite {
	
	WebDriver driver = DriverManager.getDriverInstance();
	
	@BeforeSuite
	public void setUp() {
		driver.get(DriverConfig.getProperty("url"));
	}
	
	@Test
	public void launchBrowser() {
		Assert.fail();
		System.out.println("Failed");
	}
	
	@Test
	public void browserTest() {
		
		System.out.println("Passed");
	}
	
	@AfterSuite
	public void closeBrowser() {
		driver.close();
	}
}
