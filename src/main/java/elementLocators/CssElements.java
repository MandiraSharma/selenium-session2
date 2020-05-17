package elementLocators;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssElements {
	@Test
public void HandleCSSElement() throws InterruptedException {
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
	Thread.sleep(3000);
	//tagname#ID
	driver.findElement(By.cssSelector("input#sex-0")).click();
	
	Thread.sleep(3000);
	
	//tagname[attribute='value']
	driver.findElement(By.cssSelector("input[value='Female']")).click();
	Thread.sleep(3000);
	
	
	driver.close();
	driver.quit();
}
}
