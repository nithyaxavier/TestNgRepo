package Testlearn;

import org.testng.annotations.Test;

public class dpparent {
@Test(dataProviderClass = Testlearn.test1dpsub.class, dataProvider= "dpclass")
	public void test1(String name1 , String name2) {
	System.out.println("Test1");
		System.out.println("Name1:" +name1+ "Name2:"+name2);
	}
@Test(dataProviderClass = Testlearn.test1dpsub.class, dataProvider= "dpclass")
public void test2(String name1 , String name2) {
	System.out.println("Test2");
	System.out.println("Name1:" +name1+ "Name2:"+name2);
	}


}
