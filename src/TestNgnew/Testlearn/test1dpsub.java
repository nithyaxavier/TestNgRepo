package Testlearn;
//this data will be used in dpparent class
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class test1dpsub {
@DataProvider(name = "dpclass")
	public static String[][] getdata (Method m) {
		
		
		String [][] data = null;
		if(m.getName().equals("test1")) {
			data= new String[2][2];
			data[0][0] = "nisha";
			data[0][1] ="sweety";
			data[1][0]="smiley";
			data[1][1]="key";
		}
		else 	if(m.getName().equals("test2")) {
			data= new String[2][2];
			data[0][0] = "n";
			data[0][1] ="g";
			data[1][0]="t";
			data[1][1]="f";
		}
		
		return data;
	}
	
	
}
