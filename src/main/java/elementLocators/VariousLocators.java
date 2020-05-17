package elementLocators;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VariousLocators {
	
	@Test
	public void Locators() throws InterruptedException {
		//set chrome driver as your default driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mandira\\selenium\\selenium\\Drivers\\chromedriver.exe");
		//Instantiate ChromeDriver object
		WebDriver driver = new ChromeDriver();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//delete cookies or history
		driver.manage().deleteAllCookies();
		//maximize browsers
		driver.manage().window().maximize();
		
		//Go to a site
		driver.get("http://objectspy.space/");
		
		
		//click on radio button male
				driver.findElement(By.id("sex-0")).click();
		//Slow down java 1000milisecond= 1 second
		Thread.sleep(3000);
		//Type something in file
		driver.findElement(By.name("firstname")).sendKeys("Mandira");
		Thread.sleep(3000);
		
		//click on link text
		/*
		 * driver.findElement(By.linkText("Link Test : New Page")).click();
		 * Thread.sleep(3000);
		 */
		
		
		//click on partial link
		driver.findElement(By.partialLinkText("OS-API Product FrontEnd")).click();
		
		
		//close the browser
		driver.close();
		//Quit the driver
		driver.quit();
	}

}
