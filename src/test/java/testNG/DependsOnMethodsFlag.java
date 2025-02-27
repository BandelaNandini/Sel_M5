package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodsFlag {

	@Test(dependsOnMethods = "Register")
	public void Login() {
		Reporter.log("Login",true);
	}

	@Test
	public void Register() {
		Reporter.log("Register",true);
	}

	@Test(dependsOnMethods = "Login")
	public void Create() {
		Reporter.log("create",true);
	}
}
