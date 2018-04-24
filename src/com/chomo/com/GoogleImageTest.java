package com.chomo.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleImageTest 
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.google.co.in");
	WebElement logo = driver.findElement(By.id("hplogo"));
	boolean b = logo.isDisplayed();
	System.out.println("Logo is dispalyed"+b);
}
}
