package Testlearn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Tparalel {
	WebDriver driver;
	@Test	
	@Parameters({"browser"})
	public void chromeBrowser(String browser)
					
	{
		
	if(browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","C:\\Webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		}
	}
	
	@Test
	@Parameters({"browser"})
	
	public void IEBrowser(String browser)
	{
		
		if(browser.equalsIgnoreCase("IE"))
	
		
		{
		  System.setProperty("webdriver.ie.driver","C:\\Webdriver\\IEDriverServer.exe");
				driver= new InternetExplorerDriver();
			driver.get("https://www.google.com/?gws_rd=ssl#spf=1589123415105");
		}
			}
}
	
	
		




	


