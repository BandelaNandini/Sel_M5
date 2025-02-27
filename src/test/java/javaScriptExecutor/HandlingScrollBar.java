package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBar {

	public static void main(String[] args) throws InterruptedException {

		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// Maximize the window
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to an application
		driver.get("https://www.ajio.com/");

		// Handle scroll bar using hardcoded co_ordinates
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(3000);

		// Handle scroll bar using element coordinates
		WebElement ele = driver.findElement(By.xpath("//img[@alt='Kidswear str']"));
//		int xaxis = ele.getRect().getX();
//		int yaxis = ele.getRect().getY();
//		js.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
		
		//Handle scroll bar using element reference
		js.executeScript("arguments[0].scrollIntoView(true)",ele);
		Thread.sleep(3000);
		
		//scroll till bottom of the webpage
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		
		//scroll till top of the webpage
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		// close the browser
		driver.quit();

	}

}
