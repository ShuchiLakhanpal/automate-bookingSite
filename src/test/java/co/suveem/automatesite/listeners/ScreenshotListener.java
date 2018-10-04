package co.suveem.automatesite.listeners;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import co.suveem.automatesite.drivermanager.DriverManager;
import co.suveem.automatesite.utils.Utils;

public class ScreenshotListener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		WebDriver driver = DriverManager.getDriverInstance();
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Path pathScreenshot = Paths.get("target","screenshot");
		try {
			Files.createDirectories(pathScreenshot.toAbsolutePath());
			FileUtils.copyFile(screenshot,new File(pathScreenshot.toString()+"/" + Utils.getFileName(result.getName())));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
