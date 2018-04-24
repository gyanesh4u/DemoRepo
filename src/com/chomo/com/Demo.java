package com.chomo.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo {
	
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://www.amazon.com");
	
	//String title = driver.getTitle();
	System.out.println(driver.getCurrentUrl());
	driver.quit();
	
	}

}
