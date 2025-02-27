package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleNotificationPopup {
	public static void main(String[] args) {
		
		//Disable Notifications
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		//Launch the browser
		WebDriver driver= new ChromeDriver(opt);
		//Maximize the window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to an application
		driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
		
		driver.findElement(By.id("browNotButton")).click();
		
		driver.quit();
	}

}
