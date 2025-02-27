package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnAnElement {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to an url
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.location=arguments[0]", "https://demoapp.skillrary.com/");

		WebElement login = driver.findElement(By.linkText("LOGIN"));

		// Click on an element
		js.executeScript("arguments[0].click()", login);
		Thread.sleep(3000);

		// Refresh the webpage
		js.executeScript("history.go(0)");
		Thread.sleep(3000);

		// Fetch the title
		System.out.println(js.executeScript("return document.title"));

		// Fetch the url
		System.out.println(js.executeScript("return document.URL"));

		driver.quit();
	}

}
