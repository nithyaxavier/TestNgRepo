package Testlearn;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class externaldp {

	@DataProvider(name ="extdp")
	//static keyword is used so that the method is global
	//Method m is called reflect method in java
	public static String[][] getdata(Method m) 
	{
	
		String[][] data = null;//here we are using the string in common for all the test data no create it as null
//m.getName()- used for assigning which test case to run
		//below line TEstcase1 is the testcase id
		if(m.getName().equals("Testcase1")) {
			//2 rows 2 cols
			data = new String[2][2];
	
		data[0][0] = "u1";
		data[0][1] = "p1";	
		data[1][0] = "u2";
		data[1][1] = "p2";
		}
		else if(m.getName().equals("Testcase2")){
		//2 rows 3 cols
			data = new String[2][3];
		
		data[0][0] = "u1";
		data[0][1] = "p1";
		data[0][2] = "e1";
		data[1][0] = "u2";
		data[1][1] = "p2";
		data[1][2] = "e2";
		
		
}
		return data;
}
}
