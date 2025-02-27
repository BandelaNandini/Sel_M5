package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingConfirmationAndPromptPopup {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		// Handling confirmation popup
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);

		// verify success message
		WebElement result = driver.findElement(By.id("result"));

		if (result.getText().contains("You clicked: Cancel")) {
			System.out.println("Alert popup handled");
		} else {
			System.out.println("Alert popup unhandled");
		}

		// Handling prompt popup
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert al = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(al.getText());
		al.sendKeys("selenium");
		Thread.sleep(3000);
		al.accept();
		// verify success message

		if (result.getText().contains("You entered: selenium")) {
			System.out.println("Alert PROMPT popup handled");
		} else {
			System.out.println("Alert PROMPT popup unhandled");
		}

		driver.quit();
	}

}
