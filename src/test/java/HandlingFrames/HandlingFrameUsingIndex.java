package HandlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFrameUsingIndex {

	public static void main(String[] args) throws InterruptedException {

		//Launch the browser
		WebDriver driver= new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Navigate to snapdeal application
		driver.get("https://www.snapdeal.com/");
		//Identify sign in element
		WebElement signin = driver.findElement(By.xpath("//span[text()='Sign In']"));
		//Mouse hover on sign in
		Actions act= new Actions(driver);
		act.moveToElement(signin).perform();
		Thread.sleep(3000);
		//Click on login button
		driver.findElement(By.xpath("//a[text()='login']")).click();
		Thread.sleep(3000);

		//Switch to frame using index
		driver.switchTo().frame(0);
		//enter mobile number and click on quit icon
		driver.findElement(By.id("userName")).sendKeys("9876543210");
		Thread.sleep(3000);

		driver.findElement(By.id("close-pop")).click();
		Thread.sleep(3000);

		//Switch back to Main web page
		driver.switchTo().defaultContent();
		//Search for some product
		driver.findElement(By.id("inputValEnter")).sendKeys("mobile"+Keys.ENTER);
		Thread.sleep(3000);

		//close the browser
		driver.quit();
		
	}

}
