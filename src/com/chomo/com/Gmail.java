package com.chomo.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail 
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();//launch chrome browser
	driver.get("http://www.gmail.com");//enter URL
	
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.id("identifierId")).sendKeys("kamal.gyanesh8");//email id
	driver.findElement(By.xpath("//span[text()='Next']")).click();//next button
	WebDriverWait wait=new WebDriverWait(driver,20);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");//entering password
}
	}

