package com.chomo.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLoginLogout {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.actitime.com");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	driver.findElement(By.id("logoutLink")).click();
	String title = driver.getTitle();
	if(title.equals("actiTIME - Login"))
	{
		System.out.println("Title is matching");
	}
	else
	{
		System.out.println("Title is not matching");
	}
	driver.close();
}
}
