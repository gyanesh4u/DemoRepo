package logicInvoice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogout {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/logic/admin/");
		String atitle = driver.getTitle();
		driver.findElement(By.id("input-username")).sendKeys("admin");
		driver.findElement(By.id("input-password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[.='Login']")).click();
		driver.findElement(By.xpath("//a[.='admin']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		String etitle = driver.getTitle();
		if(atitle.equals(etitle))
		{
			System.out.println("title is matching");
		}
		else
		{
			System.out.println("title is not matching");
		}
		driver.close();
	}
	
	
	
	
}
