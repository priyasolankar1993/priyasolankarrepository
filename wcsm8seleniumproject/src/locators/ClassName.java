package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class ClassName {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("chandler bing",Keys.ENTER);
		driver.findElement(By.className("lNPNe")).click();
		
		//driver.get("https://www.instagram.com");
		//driver.findElement(By.className("_aa4b _add6 _ac4d")).click();
		driver.navigate().to("http://omayo.blogspot.com/");
		
		driver.findElement(By.className("gsc-input")).click();
driver.navigate().to("https://www.netflix.com/in/login");
		
		driver.findElement(By.id("id_password")).sendKeys("vbgtk455");
driver.navigate().to("http://omayo.blogspot.com/");
		
		driver.findElement(By.className("classone")).click();
		
		
		
	}

}
