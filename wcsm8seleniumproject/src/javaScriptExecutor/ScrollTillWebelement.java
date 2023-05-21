package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollTillWebelement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/");
		WebElement v1 = driver.findElement(By.xpath("//a[@class='selenium-button selenium-white-cyan text-uppercase font-weight-bold']"));
		Point point = v1.getLocation();
		int xaxis = point.getX();
		int yaxis = point.getY();
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-200)+")");
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(v1)).click();
	 Thread.sleep(2000);
	 driver.quit();
	}
}
