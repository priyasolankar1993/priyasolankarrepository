package pageObjectModelPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(" http://desktop-h9h9ujc/login.do");
		WebElement unTB = driver.findElement(By.name("username"));
		unTB.sendKeys("admin");
		WebElement pTB = driver.findElement(By.name("pwd"));
		pTB.sendKeys("manager");
		WebElement button = driver.findElement(By.id("loginButton"));
		button.click();
		driver.navigate().refresh();
		Thread.sleep(2000);
		unTB.clear();
		unTB.sendKeys("admin");
	}

}
