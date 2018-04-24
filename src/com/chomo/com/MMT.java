package com.chomo.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MMT 
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.makemytrip.com/");
	driver.findElement(By.xpath("//div[@class='inputM depart_input inputHlp inputDateFilter']")).click();
}
}
