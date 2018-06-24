package logicInvoice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SystemClick {
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/logic/admin/");
	}
	@Test
	public void clickOnSystem() throws InterruptedException
	{
		driver.findElement(By.id("input-username")).sendKeys("admin");
		driver.findElement(By.id("input-password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[.='Login']")).click();
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//i[@class='fa fa-wrench fa-fw']"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='Languages']")).click();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}
