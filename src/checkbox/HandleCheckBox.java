package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBox {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://store.demoqa.com/products-page/your-account/");
		for(int i=0;i<=99;i++)
		{
		driver.findElement(By.id("rememberme")).click();
}
}
}
