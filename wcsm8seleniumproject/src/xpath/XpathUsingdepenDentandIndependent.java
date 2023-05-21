package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class XpathUsingdepenDentandIndependent {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.driver","./drivers/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	driver.get("https://www.flipkart.com/");

	driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("iphone 14 pro max");
	//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));
	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='L0Z3Pu']"))).click();
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	
	driver.findElement(By.xpath("//div[text()='APPLE']")).click();

	driver.findElement(By.xpath("//div[text()='Screen Size']")).click();
	
	driver.findElement(By.xpath("//div[text()='6.4 inch & Above']")).click();
	
	driver.findElement(By.xpath("//div[text()='1GB and Below']")).click();
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Primary Camera']"))).click();
	//driver.findElement(By.xpath("//div[text()='Primary Camera'])")).click();
	
driver.findElement(By.xpath("//div[@class='_3879cV'and (text()='48 - 63.9 MP')]")).click();
	
	String firstSuggestion = driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[3]")).getText();
	System.out.println(firstSuggestion);
	String name=driver.findElement(By.xpath("(//div[@class='_4rR01T'])[3]")).getText();
	System.out.println(name);
	}

}
