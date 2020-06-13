package Testlearn;


import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNgbasic{

	@BeforeSuite
	public void configuration() {
		System.out.println("Env config");
	}
	@BeforeTest
		public void DBconnect() {
			System.out.println("connect to DB");
		
		}
	@BeforeMethod
	public void launchbrowser() {
		System.out.println("launch browser");
	
	}
	@Test( description ="My fist testcase",groups ="smoke")//description is used for heading
	public void displaylogin()
	{
		System.out.println("login");
		
	}
		
	@Test(groups = "smoke")
	public void registerpage1() {
		System.out.println("Register1");
	}
	@Test(groups = "sanity")
	
	public void registerpage2() {
		System.out.println("Register2");
	}

	@AfterMethod
	public void quit() {
		System.out.println("close webpage");
	}
	
	@AfterTest (alwaysRun=true)// when we use groups filter while running test, then the before/after 
	//annotation will not work. in order to run the method always we are using this.
	
	public void closedb() {
			System.out.println("closedb");
	}
	
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("Reset sevcies");
	}
}
