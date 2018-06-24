package logicInvoice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddArtcles 
{
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
	actions.moveToElement(driver.findElement(By.xpath("//i[@class='fa fa-newspaper-o fa-fw']"))).build().perform();
	driver.findElement(By.xpath("//span[contains(text(),'Articles')]")).click();
	}
	
	@Test(priority=1)
	public void createArticles()
	{
		driver.findElement(By.xpath("//i[@class='fa fa-plus']")).click();
		driver.findElement(By.xpath("//input[@id='input-title-1']")).sendKeys("Google");
		driver.findElement(By.xpath("//div[@class='note-editable panel-body']")).sendKeys("This project is done for google");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Test(priority=2)
	public void deleteArticles()
	{
		driver.findElement(By.xpath("//input[@value='6']")).click();
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	
}
