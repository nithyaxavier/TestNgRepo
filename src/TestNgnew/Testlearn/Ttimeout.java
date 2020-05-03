package Testlearn;

import org.testng.annotations.Test;
public class Ttimeout {

	@Test (timeOut = 100)//if TC takes more time to execute then we can fail it thru this method
	public void timeoutmed() throws InterruptedException {
	
		Thread.sleep(200);
		System.out.println("Test9 - on clicking help button");
	
	}
		@Test 
public void quicklaunch() {
	System.out.println("Test10 - Items searched");

}
}
