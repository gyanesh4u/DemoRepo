package com.qa.extentreport.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportDemo {

	ExtentTest logger;
	ExtentReports report;
	WebDriver driver;
	@Test
	public void verifyTitle()
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver=new ChromeDriver();
		report=new ExtentReports("./screenshot/extent.html");
		logger=report.startTest("ExtentReportDemo");
		driver.get("http://freecrm.com");
		logger.log(LogStatus.INFO,"Application is up and running");
		String title = driver.getTitle();
		logger.log(LogStatus.INFO,"fetching title");
		Assert.assertTrue(title.contains("Free"));
	}
	
	@AfterMethod
	public void tearDown()
	{
		report.endTest(logger);
		report.flush();
	}
}
