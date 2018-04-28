package com.chomo.com;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class PhantomJS {

	public static void main(String[] args) {
		File file=new File("C://Program Files/phantomjs-2.1.1-windows/phantomjs.exe");
		System.setProperty("phantomjs.binary.path",file.getAbsolutePath());
		WebDriver driver=new PhantomJSDriver();
		driver.get("http://www.google.co.in");
		String title = driver.getTitle();
		System.out.println(title);
		
	}

}
