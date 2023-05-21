package tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task4 {
public static void main(String[] args) throws InterruptedException {
	//automate 5 xpath on firefox browser.
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.netflix.com/in/login");
		
		driver.findElement(By.xpath("//input[@name='userLoginId']")).sendKeys("ghfjutyrf");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ghfjutyrf678");
		
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[contains(@class,'oxd-')]")).click();
	
		//driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Admin");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("admin123");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[@id='loginbutton]")).click();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='loginbutton]"))).click();
		driver.get("https://www.flipkart.com/");
	
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("shoes");
	
		driver.get("https://www.amazon.in/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics");
		
		driver.findElement(By.xpath("//a[text()=' Electronics ']")).click();
	
		
		
		
		
		
		
		
}
}