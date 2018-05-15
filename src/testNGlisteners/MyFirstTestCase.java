package testNGlisteners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//@Listeners(testNGlisteners.TestNGListeners.class)
public class MyFirstTestCase
{
	
	@Test
public void GoogleTitleVerify()
{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.google.com");
	//Assert.assertTrue(false);
	System.out.println(driver.getTitle());
	driver.quit();
}
}
