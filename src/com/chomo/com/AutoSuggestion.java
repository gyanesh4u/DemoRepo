package com.chomo.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("selenium");
		List<WebElement> allAST = driver.findElements(By.xpath("//div[@class='sbqs_c']"));
		int count = allAST.size();
		System.out.println(count);
}
}
