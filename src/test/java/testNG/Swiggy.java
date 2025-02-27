package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Swiggy {
	
	@Parameters("browser")
	@Test (groups = "smoke")
	public void navigateToSwiggy(String BROWSER)
	{
		WebDriver driver= null;
		if(BROWSER.equals("chrome"))
		{
			 driver= new ChromeDriver();
		}
		else if(BROWSER.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.swiggy.com");
		Reporter.log("Navigated to swiggy",true);
		//driver.quit();
	}

}
