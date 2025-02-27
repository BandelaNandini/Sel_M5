package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPage {

	// Declare
	@FindBy(id = "email")
	private WebElement username;

	@FindBy(name = "pass")
	private WebElement password;

	@FindBy(name = "login")
	private WebElement login_btn;
	// Utilize
	public void getUsername(String user) {
		username.sendKeys(user);
	}

	public WebElement getPassword() {
		return password;
	}

	public void getLogin_btn() {
		login_btn.click();

	}

	// Initialize
	public FbLoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

}
