package Testlearn;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class t1t2 {
//below way we have to call dataprovider in this testcase
	@Test(dataProviderClass=Testlearn.externaldp.class,dataProvider="extdp")
	public void Testcase1(String user, String pass)
	{
		System.out.println("TC1");
		Reporter.log("username entered:" +user);
		Reporter.log("password entered:" +pass);
		Assert.fail();
		System.out.println("username:" +user +  "Password:" +pass);
	}
	@Test(dataProviderClass=Testlearn.externaldp.class,dataProvider="extdp")
	public void Testcase2(String user, String pass,String eid)
	{
		System.out.println("TC2");
		System.out.println("username:" +user +  "Password:" +pass+ "eid:"  +eid);
	}
	
}
