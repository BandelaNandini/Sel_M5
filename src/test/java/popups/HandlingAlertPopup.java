package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertPopup {

	public static void main(String[] args) throws InterruptedException {

		//Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to an application
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//Identify Alert element and click on it
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		
		//Handle alert popup and click on ok button
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);

		//verify success message
		WebElement result = driver.findElement(By.id("result"));
		
		if(result.getText().contains("You successfully clicked an alert"))
		{
			System.out.println("Alert popup handled");
		}
		else {
			System.out.println("Alert popup unhandled");
		}
		
		driver.quit();
	}

}
