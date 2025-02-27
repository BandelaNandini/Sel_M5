package assertions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UsingSoftAssert {

	@Test
	public void SoftAssert()
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com");
		String title = driver.getTitle();
		
		//SoftAssert
		SoftAssert soft =new SoftAssert();
		
		soft.assertEquals(title, "Facebk – log in or sign up");
		
		System.out.println("verification passed");
		driver.quit();
		
		soft.assertAll();
	}

}
