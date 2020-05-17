package elementLocators;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;





@SuppressWarnings("deprecation")
public class XpathLoginTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void HandleXpathElement() throws InterruptedException {
		//set chrome driver as your default driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mandira\\selenium\\selenium\\Drivers\\chromedriver.exe");
		//Instantiate ChromeDriver object
		WebDriver driver = new ChromeDriver();
		
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//delete cookies or history
		driver.manage().deleteAllCookies();
		//maximize browsers
		driver.manage().window().maximize();
		
		//Go to a site
		driver.get("http://techfios.com/test/billing/?ng=admin/");
		Thread.sleep(3000);
		
		//Relative Xpath
		//: //tagname[@attribute='value']
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("techfiosdemo@gmail.com");
		//Xpath* (someday tagname like input may change, in this situation you can use* symbole insdated of tagname)
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("techfiosdemo@gmail.com");
		
		//driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("abc123");
		
		//Xpath contains: //input[contains(@attributes,'value')]
		driver.findElement(By.xpath("//input[contains(@placeholder,'Password')and contains(@class,form-control)]")).sendKeys("abc123");
		
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//button[@class='btn btn-success block full-width']")).click();
		
		//Xpath Text: //tagname[text()='text']
		//driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
		
		////Xpath Text wraping by contains: //tagname[contains(text()='text')]
		driver.findElement(By.xpath("//button[contains(text(),'Sign in')and @name='login']")).click();
		Thread.sleep(3000);
		
		//to verify title is match or not
		String expectedTitle = "Dashboard- Techfios Test Application- Billing";
		String actualtitle = driver.getTitle();
		/*
		 * if(expectedTitle.equalsIgnoreCase(actualtitle)) {
		 * System.out.println("Test pass");} else {
		 * System.out.println("Dashboard page did not displayed"); throw new
		 * RuntimeException("Test is failed"); }
		 */
		
		
		
		
		//Assertion
		//Assert.assertEquals("dashboard is not displayed", expectedTitle, actualtitle);	
		
		//Xpath Axis
		
		//String dashboardTitleXpath= "//div[@id='page-wrapper']//descendant ::h2[contains(text(),'Dashboard')]";
		
		//Initiate Explicit wait
		//WebDriverWait wait = new WebDriverWait(driver,10);
       //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("dashboardTitleXpath")));
	
		
		
		
		
		driver.close();
		driver.quit();

}
	}
