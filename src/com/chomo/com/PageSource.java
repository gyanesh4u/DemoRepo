package com.chomo.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSource {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		String ps = driver.getPageSource();
		System.out.println(ps);
	}

}
