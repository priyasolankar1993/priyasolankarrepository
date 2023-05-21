package tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task3 {
	//automate hotstar login page
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeOptions co = new ChromeOptions();
		 co.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(co);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		 
		 driver.get("https://www.hotstar.com/in/subscribe/sign-in?returnURL=/in/subscribe/my-account");
		 
		 driver.findElement(By.xpath("//button[@class='email-or-fb-signin']")).click();
		 
		 driver.findElement(By.xpath("//input[@id='emailID']")).sendKeys("abc2334");
		
		 driver.findElement(By.xpath("//button[@class='submit-button']")).click();
		 
		 
		 
	}

}
