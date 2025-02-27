package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFileUploadPopupUsingSendkeys {

	public static void main(String[] args) throws InterruptedException {

		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// Maximize the window
		driver.manage().window().maximize();

		// Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to an url
		driver.get("https://the-internet.herokuapp.com/upload");

		// Handling FileUpload popup using sendkeys
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\LENOVO_PUNJAGUTTA\\Desktop\\SQL.TXT");
		Thread.sleep(3000);

		// Click on upload button
		driver.findElement(By.id("file-submit")).click();
		Thread.sleep(3000);

		// Close the browser
		driver.quit();

	}

}
