package tasks;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import methodsOfWebDriver.GetWindowHandle;

public class Task8 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://omayo.blogspot.com/");
		 driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
		 Thread.sleep(2000);
		 //close all the browsers
		 //driver.quit();
		 //close parent browser
		 //driver.close();
		 //close all the browser without quit method
//	   Set<String> allHandles = driver. getWindowHandles();
//		 for(String wh:allHandles)
//		 {
//			 Thread.sleep(2000);
//			 driver.switchTo().window(wh).close();
//		 }
		String parentHandle = driver.getWindowHandle();
		 //handle all the windows
		Set<String> allHandles = driver.getWindowHandles();
		//to maximize child browser
		 for(String wh:allHandles)
			 {
			 if(!parentHandle.equals(wh))
			 {
			 Thread.sleep(2000);
			 driver.switchTo().window(wh).manage().window().maximize();
			
			 }
			 else
			 {
				 driver.close();
			 }
		
		
		
			 } 
		 
	}

}
