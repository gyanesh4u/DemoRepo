package brokenlinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrokenLink 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links are"+links.size());
		for(int i=0;i<links.size();i++)
		{
			WebElement element=links.get(i);
			String url=element.getAttribute("href");
			verifyLinkActive(url);
		}
	}
	public static void verifyLinkActive(String linkUrl)
	{
		try{
			URL url=new URL(linkUrl);
			HttpURLConnection http=(HttpURLConnection) url.openConnection();
			http.setConnectTimeout(3000);
			http.connect();
			if(http.getResponseCode()==200)
			{
				System.out.println(linkUrl+" - "+http.getResponseMessage());
			}
			if(http.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
	           {
	               System.out.println(linkUrl+" - "+http.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
	            }
		}
		catch(Exception e){
			
		}
	}
	
}
