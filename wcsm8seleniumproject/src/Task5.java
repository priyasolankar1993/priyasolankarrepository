import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task5 {
	//Xpath using dependent , independent & index
public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 ChromeOptions co = new ChromeOptions();
	 co.addArguments("--remote-allow-origins=*");
WebDriver driver = new ChromeDriver(co);
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	 driver.get("https://www.flipkart.com/");
	 
	 driver.findElement(By.xpath("//button[text()='✕']")).click();
	 driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("hp laptop");
	 
	 driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	 
	 
	
	 driver.findElement(By.xpath("//div[@class='_3879cV' and  (text()='Core i7')]")).click();
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Brand']"))).click();
	
	 driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='HP']")).click();
	 
	 driver.findElement(By.xpath("//div[text()='Operating System']")).click();
	 
	 driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='Windows 11']")).click();
	 
	 driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='4★ & above']")).click();
	
	 //driver.findElement(By.xpath("//div[text()='Type']")).click();
	 //Thread.sleep(2000);

	// driver.findElement(By.xpath("//div['_3879cV']/following-sibling::div[text()='Gaming Laptop']")).click();
	 
	String firstSuggestion = driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[2]")).getText();
	System.out.println(firstSuggestion);
}
}
