package UsingListeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(Listeners_Utility.Listeners.class)
public class ListernersScenario {

	@Test
	public void demo()
	{
		System.out.println("Test Execution");
		Assert.fail();
	}
}
