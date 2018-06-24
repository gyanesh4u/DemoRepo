package mousehover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:www.google.com");
		driver.findElement(By.xpath("//a[@title='Google apps']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("YouTube")).click();
		
		
		
		
		
		
	}

}
