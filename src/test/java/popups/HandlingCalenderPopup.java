package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalenderPopup {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigating to make my trip application
		driver.get("https://www.makemytrip.com/");
		// close the popup
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
		Thread.sleep(3000);
		// Identifying from text field and selecting Hyderbad
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Hyd");
		driver.findElement(By.xpath("(//span[contains(text(),'Hyd')])[1]")).click();
		Thread.sleep(3000);

		// Identifying to text field and selecting bengaluru
		driver.findElement(By.id("toCity")).sendKeys("Benga");
		driver.findElement(By.xpath("//span[text()='Bengaluru']")).click();
		Thread.sleep(3000);

		// Selecting date from the calender popup
		WebElement date = driver.findElement(By.xpath
				("//div[text()='January 2025']/../../descendant::p[text()='23']"));

		date.click();
	}

}
