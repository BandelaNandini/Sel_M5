package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingChildBrowserPopup {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("mobiles"+Keys.ENTER);
		//Fetching parent window id
		String pwid = driver.getWindowHandle();
		//Clicking on the product
		driver.findElement(By.xpath("//div[text()='REDMI 13c 5G (Starlight Black, 128 GB)']")).click();
		//Fetch the all window ids
		Set<String> wids = driver.getWindowHandles();
		
		for(String s:wids)
		{
			driver.switchTo().window(s);
			System.out.println(driver.getTitle());
			if(driver.getTitle().contains("REDMI 13c 5G ( 128 GB Storage, 6 GB RAM ) Online at Best Price On Flipkart.com"))
			{
				driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
				System.out.println(driver.getTitle());
			}
		}
		 driver.switchTo().window(pwid);
		
		
	
	}

}
