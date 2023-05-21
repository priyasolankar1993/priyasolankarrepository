package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStoneAssignment {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		WebElement target = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		driver.findElement(By.xpath("//a[text()='Band']")).click();
	
     WebElement target1 = driver.findElement(By.xpath("//div[text()='Filter by']"));
  
 
 Thread.sleep(2000);
 for(int i=0;i<=2;i++)
 {
	 
 
		act.clickAndHold(target1).perform();
 }
		
		 Robot robot = new Robot();

	 robot.keyPress(KeyEvent.VK_CONTROL);
	
		 robot.keyPress(KeyEvent.VK_C);
		 
		 Thread.sleep(2000);
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyRelease(KeyEvent.VK_C);
	      driver.findElement(By.xpath("//input[@name='search_query']")).click();
	 
		 Thread.sleep(2000);
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);
		 
		 
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyRelease(KeyEvent.VK_V);
		 driver.findElement(By.name("submit_search")).click();
		 
		
	}

}
