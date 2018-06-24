package Javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//driver.findElement("document.getElementById('lst-ib').value=('selenium')");
		js.executeScript("document.getElementById('lst-ib').value=('selenium')");
		Thread.sleep(5000);
		driver.close();
	}
	
	
}
