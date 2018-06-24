package com.chomo.com;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots 
{
	public static WebDriver driver;
	public static String folderPath;
	public static void main(String[] args) {
		SimpleDateFormat s=new SimpleDateFormat("MM-dd-yyyy hh-mm-ss");
		String dateTime=s.format(new Date());
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
		TakesScreenshot t=((TakesScreenshot)driver);
		folderPath="./screenshot/";
		File srcFile=t.getScreenshotAs(OutputType.FILE);
		File destFile=new File(folderPath+dateTime+".png");
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

