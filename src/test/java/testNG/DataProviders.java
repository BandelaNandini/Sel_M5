package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
	
	@Test (dataProvider = "data")
	public void sampleTest(String d1,String d2)
	{
		System.out.println(d1 + d2);
	}
	
	@DataProvider
	public Object[][] data()
	{
		Object[][] obj=new Object[2][2];
		obj[0][0]="obj1";
		obj[0][1]="obj2";
		
		obj[1][0]="obj3";
		obj[1][1]="obj4";
		
		return obj;
	}

}
