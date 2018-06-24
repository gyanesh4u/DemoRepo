package fileupload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUploadTesrt 
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
	driver.get("http://www.globalsqa.com/samplepagetest/");
}
	@Test
	public void testUpload()
	{
		driver.findElement(By.name("file-553")).sendKeys("C:\\Users\\gyanesh\\Desktop\\selenium 3 years experience resume _ Selenium tool.doc");
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}