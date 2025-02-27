package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTheDataFromPropertyFile {

	public static void main(String[] args) throws IOException {

		// Convert physical file into Java object
		FileInputStream fis = new FileInputStream("./src/test/resources/CommonData.properties");

		// Create an object of properties
		Properties p = new Properties();

		// Load the property object
		p.load(fis);

		// Fetch the data from property file
		String data = p.getProperty("url");
		String time=p.getProperty("timeouts");
		
	long timeouts = Long.parseLong(time);
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeouts));
		
		
		
		System.out.println(data);

		
	}

}
