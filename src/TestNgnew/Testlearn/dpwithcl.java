package Testlearn;
//Parameterization using dataprovider method which means for a single test case we are using mulitple test data.
//Dp is a two dimensional array
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dpwithcl {

	@Test(dataProvider = "dpname")//call that dataprovider here
	public void loginer(String user, String pwd)
	{
	System.out.println("testcase1");
		System.out.println("username:"+user);
		System.out.println("password:"+pwd);
}
	@DataProvider(name ="dpname")
	public String[][] gdata() {
	
		String[][] data = new String[3][2];//3 rows and 2 columns
		//1st row
		data[0][0] = "u1";
		data[0][1] = "p1";
		//2nd row
		data[1][0] = "u2";
		data[1][1] = "p2";
		//3rd row
		data[2][0] = "u3";
		data[2][1] = "p3";
		return data;
}
	
	
	
}
