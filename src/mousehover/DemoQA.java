package mousehover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoQA {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://store.demoqa.com/");
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.linkText("Product Category"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Accessories")).click();
		driver.close();
}
}