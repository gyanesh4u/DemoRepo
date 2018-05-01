package com.chomo.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCalanderByJS {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // launch chrome

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("http://spicejet.com/"); // enter URL
		
		WebElement date = driver.findElement(By.id("ctl00_mainContent_txt_Fromdate"));
		String dateVal = "02-05-2018";
		
		selectDateByJS(driver, date, dateVal);
		
	}
	
	
	public static void selectDateByJS(WebDriver driver, WebElement element, String dateVal){
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');", element);
		
	}
}
