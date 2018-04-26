package com.chomo.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jenkins {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8080/login");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("j_username")).sendKeys("gyanesh");
		driver.findElement(By.name("j_password")).sendKeys("gyanesh");
		driver.findElement(By.id("yui-gen1-button")).click();
		Thread.sleep(10000);
		driver.close();
	}

}
