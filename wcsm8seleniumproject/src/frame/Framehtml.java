package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framehtml {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/Admin/Desktop/Selenium%20Data/html/frame.html");
	Thread.sleep(2000);
	WebElement userBox = driver.findElement(By.name("n1"));
	userBox.sendKeys("admin");
	Thread.sleep(2000);
	//switch frame using index
	//driver.switchTo().frame(0);
	//switch frame using name attribute
	driver.switchTo().frame("frname");
	WebElement pwdBox = driver.findElement(By.name("n2"));
	Thread.sleep(2000);
	pwdBox.sendKeys("manager");
	Thread.sleep(2000);
	pwdBox.clear();
	Thread.sleep(2000);
	//switch to    default browseror parent browser
	//driver.switchTo().defaultContent();
	driver.switchTo().parentFrame();
	userBox.clear();
	
	
}
}
