package logicInvoice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectTest {
	WebDriver driver;
	@BeforeMethod
	public void openApplicartion()
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("http://localhost/logic/admin/");
	driver.findElement(By.id("input-username")).sendKeys("admin");
	driver.findElement(By.id("input-password")).sendKeys("123456");
	driver.findElement(By.xpath("//button[.='Login']")).click();
	Actions actions=new Actions(driver);
	actions.moveToElement(driver.findElement(By.xpath("//i[@class='fa fa-usd fa-fw']"))).build().perform();
	driver.findElement(By.xpath("//span[contains(text(),'Customers')]")).click();
	driver.findElement(By.xpath("//i[@class='fa fa-plus']")).click();
	}
	
	@Test(priority=1)
	public void selectEnabled()
	{
		
		Select select=new Select(driver.findElement(By.xpath("//select[@id='input-status']")));
	//	select.selectByIndex(0);
		select.selectByVisibleText("Enabled");
	}
	
	@Test(priority=2)
	public void selectDisabled()
	{
		Select select=new Select(driver.findElement(By.xpath("//select[@id='input-status']")));
		//	select.selectByIndex(0);
			select.selectByVisibleText("Disabled");
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
}
