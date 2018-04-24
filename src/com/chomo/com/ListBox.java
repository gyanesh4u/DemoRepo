package com.chomo.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox 
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///E:/Miscellaneous/hotel.html");
	WebElement listbox = driver.findElement(By.id("slv"));
	Select select=new Select(listbox);
	select.selectByIndex(2);
	select.selectByValue("b");
	select.selectByVisibleText("Coffee");
}
}
