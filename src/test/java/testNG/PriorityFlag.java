package testNG;

import org.testng.annotations.Test;

public class PriorityFlag {
	
	@Test (priority = -9)
	public void cat() {
		
		System.out.println("summit");
	}
	@Test (priority = 2,invocationCount = 3)
	public void dog() {
		
		System.out.println("dathu");
	}
	@Test (priority = -2,enabled = false)
	public void ant() {
		
		System.out.println("ajay");
	}
	@Test (priority = 0)
	public void snake() {
		
		System.out.println("sridhar");
	}

}
