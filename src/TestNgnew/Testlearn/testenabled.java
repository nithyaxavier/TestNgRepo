package Testlearn;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class testenabled {
	
		@Test 
	public void search() {
		System.out.println("Test6 - searchpage");
	
	}

		@Test                       
	public void search2() throws Exception {   //this method will show in failure counts
			System.out.println("Test7-first line");
			throw new Exception();
			System.out.println("Test7-hai");//this code will not execute 
	
	}
		@Test (enabled = false)//this test case will not show in report
		public void search3() {
			System.out.println("Test8 - searchpage3");
		
		}
}
