package com.chomo.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logic {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/logic/admin/index.php?load=report/invoice&token=9e86270f6e9f9648ab0299e15d5a56e7");
		driver.findElement(By.xpath("//input[@id='input-date-issued-start']")).click();
	}

}
