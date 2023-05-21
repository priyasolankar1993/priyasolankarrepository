package tasks;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import methodsOfWebDriver.GetTitleMethod;

public class Task9 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("samsung s23 ultra");
	Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		
	 WebElement link = driver.findElement(By.xpath("//div[@class='_4rR01T' and(text()='SAMSUNG Galaxy S23 Ultra 5G (Green, 256 GB)')]"));
	 String parentHandle = driver.getWindowHandle();
	 
	link.click();
	Thread.sleep(2000);
	Set<String> allHandles = driver.getWindowHandles();
	
	
	for(String wh:allHandles)
	{
		if(!parentHandle.equals(wh))
		{
			Thread.sleep(2000);
			//transfer control to child window
			driver.switchTo().window(wh);
		}
		else
		{
	}
	}
	String actualTitle = driver.getTitle();
	
	if(actualTitle.equals("SAMSUNG Galaxy S23 Ultra 5G ( 256 GB Storage, 12 GB RAM ) Online at Best Price On Flipkart.com"))
	{
		System.out.println("Its child browser");
	}
	else
	{
		System.out.println("Not child browser");
	}
	WebElement scrollTillWebElement = driver.findElement(By.xpath("//span[text()='View Details']"));
	
	Point point = scrollTillWebElement.getLocation();
	
	int xaxis = point.getX();
	int yaxis = point.getY();
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-250)+")");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='_2C41yO']/ancestor::li[@id='swatch-0-color']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='512 GB' and(@class='_1fGeJ5')]")).click();
	driver.findElement(By.xpath("//input[@placeholder='Enter Delivery Pincode']")).sendKeys("411033");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
   Thread.sleep(2000);
	WebElement removeButton = driver.findElement(By.xpath("//div[text()='Remove']"));
	Point point1 = removeButton.getLocation();
	int xaxis1 = point1.getX();
	int yaxis1 = point1.getY();
	jse.executeScript("window.scrollBy("+xaxis1+","+yaxis1+")");
	removeButton.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Remove' and(@class='_3dsJAO _24d-qY FhkMJZ')]")).click();
}
}
