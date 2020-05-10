package Testlearn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class dpparalel {


WebDriver driver;//Webdriver is a interface and i have created a object for it so that we can call it through out test case.

@Test(dataProvider = "Testdata")	
public void dbrowser(String browser)
	
{
if(browser.equalsIgnoreCase("Chrome"))
{
System.setProperty("webdriver.chrome.driver","C:\\Webdriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.google.co.in/");
	
}
if(browser.equalsIgnoreCase("IE"))
{
	
	System.setProperty("webdriver.ie.driver", "C:\\Webdriver\\IEDriverServer.exe");
	
	driver = new InternetExplorerDriver();
	driver.get("https://mail.google.com/mail/u/0/");
	
}
}
@DataProvider(name ="Testdata", parallel =true)
// this parallel execution using DP method, using this we can provide two test data for a single test case.

public String[] senddata()
{
	return new String[] {"Chrome","IE"};
}
}
