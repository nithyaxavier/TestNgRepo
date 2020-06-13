package Testlearn;
import org.testng.annotations.Test;
import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
public class TestNgtwo {
	
	@Test (priority =2)//priority is used for execution in order wise
	public void dashboard2() {
		System.out.println("Test3 - Dashboard");
		}
	
	@Test (enabled= false)//skipping
	public void incomplete() {
		System.out.println("incomplete test");
		}
	@Test (priority =1)//priority is used for execution in order wise
	public void g_dashboard1() {
		System.out.println("Test4 -Home");
		throw new SkipException("skipping testcase");//another way to skip test case
		
		}
		@Test 
	public void a_leftpanel() {
		System.out.println("Test5 - leftsidebar");
		
	}
	//	@Test (dependsOnMethods = "a_leftpanel")//this test case is depends on the previous test case a_leftpanel 
	//public void rightpanel() {
	//	System.out.println("Test6 - leftsidebar");
	//}
			
		
}
