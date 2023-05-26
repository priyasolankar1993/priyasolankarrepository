package tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Task10 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.drive", "./drivers/chromedriver.exe");
		
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[text()='Maria Anders']/ancestor::table[@id='contactList']/descendant::td[text()='5000']")).click();
		
	}

}
