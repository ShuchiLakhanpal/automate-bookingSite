package co.suveem.automatesite.drivermanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import co.suveem.automatesite.driverconfig.DriverConfig;

public class DriverManager {
	
	private static WebDriver driver;
	
	private DriverManager() {
		System.setProperty("webdriver.chrome.driver",DriverConfig.getProperty("path"));
		if(DriverConfig.getProperty("type").equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
	}
	
	public static WebDriver getDriverInstance() {
		if(driver==null) {
			new DriverManager();
		}
		return driver;
	}
}
