package com.chomo.com;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calander 
{
public static void main(String[] args) throws InterruptedException {
	Date d=new Date();
	String s = d.toString();
	System.out.println(s);
	String a[]=s.split("");
	String today=a[2];
	System.out.println(today);
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.cleartrip.com");
	driver.findElement(By.id("DepartDate")).click();
	Thread.sleep(1000);
	if(today.startsWith("0"))
	{
		String today1=today.replaceAll("0","");
		WebElement num1=driver.findElement(By.linkText(today1));
		num1.click();
		System.out.println(today1);
	}
	else
	{
		WebElement num=driver.findElement(By.linkText(today));
		Thread.sleep(1000);
		num.click();
		Thread.sleep(1000);
		System.out.println("done correct");
	}

}
}
