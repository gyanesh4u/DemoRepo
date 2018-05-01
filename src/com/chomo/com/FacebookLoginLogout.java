package com.chomo.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class FacebookLoginLogout {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("kamal.gyanesh8@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("worldcup");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
	//	Alert alert=driver.switchTo().alert();
		//System.out.println(alert.getText());
		driver.findElement(By.id("userNavigationLabel")).click();
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//form[@class='_w0d _w0d']"))).build().perform();
		driver.findElement(By.linkText("Log Out")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
		
	}

}
