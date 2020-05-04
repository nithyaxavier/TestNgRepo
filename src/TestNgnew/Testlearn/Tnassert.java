package Testlearn;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



import org.testng.Assert;

public class Tnassert {
	
	@Test
	@Parameters({"browser"})
	public void browser()
	{
		System.out.println("display chrome browser");
	}
	@Test
	public void asserthard()
	{
		System.out.println("Display text before assert");
		Assert.assertEquals("Hai", "Hai");//if both strings are equal then test case will pass
		System.out.println("Display text after hardassert");
	}
	
	@Test
	public void asserthard1()
	{
		System.out.println("Display text before assert");
		Assert.assertTrue(6<5);//here 6 is greater than 5 but the expectation is true, hence it is failing the tc is alos failing.
		System.out.println("Display text after hardassert1");
	}
	@Test
	public void softassert1() {
					
		System.out.println("STarting softassert");
		SoftAssert st = new SoftAssert();//create obj for the inbuild softassert class in java
		st.assertEquals("st", "string");//both are not equal eventhen it is prinetd and we are seeing the details becas we used asserall function
		System.out.println("bot are equal");
		st.assertAll();
		
		
}
}
