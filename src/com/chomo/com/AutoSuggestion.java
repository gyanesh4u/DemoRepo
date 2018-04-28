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
		driver.manage().deleteAllCookies();
		driver.get("http://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("selenium");
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbqs_c']"));
		//int count = list.size();
		System.out.println("total number of suggestions in search box:::===>" + list.size());
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("selenium")){
				list.get(i).click();
				break;
}
		}
	}
}
