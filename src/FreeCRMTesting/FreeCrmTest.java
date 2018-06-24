package FreeCRMTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FreeCrmTest {

	WebDriver driver;
	public String credentials;
	public String credentialsInfo[];
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.freecrm.com");
	}
	
	@Test(priority=1)
	public void loginWithAdminTest() throws InterruptedException
	{
		credentials = Data.getuserLoginInfo().get("admin");
		credentialsInfo=credentials.split("_");
		
		driver.findElement(By.name("username")).sendKeys(credentialsInfo[0]);
		driver.findElement(By.name("password")).sendKeys(credentialsInfo[1]);
		WebElement loginBtn=driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",loginBtn);
		Thread.sleep(3000);
		driver.switchTo().frame("mainpanel");
		Select select=new Select(driver.findElement(By.name("slctMonth")));
		select.selectByVisibleText(Data.monthMap().get(10));
	}
	
	@Test(priority=2)
	public void loginWithCustomerTest()
	{
		credentials = Data.getuserLoginInfo().get("customer");
		credentialsInfo=credentials.split("_");
		
		driver.findElement(By.name("username")).sendKeys(credentialsInfo[0]);
		driver.findElement(By.name("password")).sendKeys(credentialsInfo[1]);
		WebElement loginBtn=driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",loginBtn);	
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
