package com.chomo.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoA 
{
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();//open the browser
	driver.manage().window().maximize();//maximize browser
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//implicitly wait
	
	driver.get("http://www.google.co.in");//url pass
	//  driver.findElements(By.className("gb_"));
	  driver.quit();
}
}
