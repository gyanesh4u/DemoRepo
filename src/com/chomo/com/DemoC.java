package com.chomo.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoC 
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/gyanesh/Documents/G.html");
	List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	int count = allLinks.size();
	System.out.println(count);//2
	WebElement link = allLinks.get(1);
	String text = link.getText();
	System.out.println(text);
	driver.quit();
	
	
}
}
