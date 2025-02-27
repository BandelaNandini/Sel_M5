package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassTheTextIntoTF {

	public static void main(String[] args) throws InterruptedException {

		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// Maximize the window
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to an application
		driver.get("https://demoapp.skillrary.com/");

		// Identify enabled element
		WebElement ele = driver.findElement(By.id("navbar-search-input"));

//		ele.sendKeys("selenium");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value=arguments[1]",ele,"selenium");
		
		Thread.sleep(3000);
		
	
		driver.quit();

	}
	
}

