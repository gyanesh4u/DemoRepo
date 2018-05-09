package loggingReport;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Log4jTutorial 
{
		WebDriver driver;
		Logger l;
		@BeforeMethod
		public void setup()
		{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		l=Logger.getLogger(this.getClass());
		driver=new ChromeDriver();
		l.info("launching chrome browser");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.get("http://www.freecrm.com");
		l.info("entering URL");
		l.warn("this is a warning message");
		l.fatal("this is fatal message");
		l.debug("this is debug message");
		}
		@Test(priority=1,description="This is the test for title")
		public void freeCRMTitleTest()
		{
			l.info("****************************** starting test case *****************************************");
			l.info("****************************** freeCrmTitleTest *****************************************");
			String title = driver.getTitle();
			System.out.println(title);
			l.info("login page title is--->"+title);
			Assert.assertEquals(title,"Free CRM software in the cloud powers sales and customer service");
			
			l.info("****************************** ending test case *****************************************");
			l.info("****************************** freeCrmTitleTest *****************************************");
		
	}
		@Test(priority=2,description="This is test for Logo")
		public void freeCRMLogoTest()
		{
			l.info("****************************** starting test case *****************************************");
			l.info("****************************** freemCRMLogoTest *****************************************");

			boolean b = driver.findElement(By.xpath("//img[@class='img-responsive']")).isDisplayed();
			Assert.assertTrue(b);
			
			l.info("****************************** ending test case *****************************************");
			l.info("****************************** freemCRMLogoTest *****************************************");
		}
		
		@AfterMethod
		public void tearDown()
		{
			driver.quit();
			l.info("****************************** Browser is closed *****************************************");

		}
}
