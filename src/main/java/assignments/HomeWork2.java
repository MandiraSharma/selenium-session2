package assignments;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeWork2 {

	WebDriver driver;

	@Test
	public void LaunchBrowser() throws InterruptedException {
		
		//String browser = "Chrome";
		String browser= "FireFox";
		
		
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Mandira\\selenium\\selenium\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("FireFox")) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Mandira\\selenium\\selenium\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();}
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://techfios.com/test/billing/?ng=admin/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Transactions')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Add Deposit")).click();
		//Creat element library to store dropdown path
		WebElement DROP_DOWN_LOCATOR = driver.findElement(By.xpath("//*[@id=\"account\"]"));
		//Creat select object to put dropdown value
		Select sel = new Select(DROP_DOWN_LOCATOR);
		sel.selectByVisibleText("BDD7");
		
		/*
		 * //driver.findElement(By.id("select2-account-container")).click();
		 * Thread.sleep(2000);
		 * 
		 * // driver.findElement(By.id("select2-account-result-dv7l-Savings //
		 * Account1626")).click();
		 * //driver.findElement(By.xpath("//option[@value='BDD7']")).click();
		 * driver.findElement(By.xpath("//*[@name='description']")).sendKeys("Hello");
		 * driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("2000");
		 * driver.findElement(By.xpath("//button[@id='submit']")).click();
		 * 
		 * // Using ExplictWait to validate String verifyDiposit =
		 * "//a[contains(text(),'Hello')]"; WebDriverWait wait = new
		 * WebDriverWait(driver, 10);
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * verifyDiposit)));
		 * 
		 * // Using Assertion to validate String ExpectedText = "Hello"; String
		 * ActualText =
		 * driver.findElement(By.xpath("//a[contains(text(),'Hello')]")).getText();
		 * Assert.assertEquals("Diposit did not displayed!", ExpectedText, ActualText);
		 */

		driver.close();
		driver.quit();
	}

}
