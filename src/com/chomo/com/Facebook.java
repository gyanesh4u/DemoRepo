package com.chomo.com;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook 
{
public static ArrayList<String>getAllTextFromListBox(WebElement ListBox)
{
	Select select=new Select(ListBox);
	List<WebElement> allOptions = select.getOptions();
	ArrayList<String>allText=new ArrayList<String>();
	for(WebElement option:allOptions)
	{
		String text=option.getText();
		allText.add(text);
	}
	return allText;
}
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.facebook.com");
	WebElement listBox = driver.findElement(By.id("month"));
	ArrayList<String>allText=getAllTextFromListBox(listBox);
	String eValue="Nov";
	if(allText.contains(eValue))
	{
		System.out.println("Present");
	}
	else
	{
		System.out.println("Not Present");
	}
}
}
