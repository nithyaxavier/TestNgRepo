package Testlearn;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Tparamter{

@Test
@Parameters({"user","pass"})//passing test data through xml file
	public void login1(String username ,String password)
	{
	
		
		System.out.println("username:"  +username);
				
		System.out.println("password:"  +password);
	}

@Test
@Parameters({"user","pass"})
	public void login2(String userid ,String pwd)
	{
	
		System.out.println("diff sce");
		System.out.println("username:" +userid);
				
		System.out.println("password:"+pwd);
	}
}
