package methodsOfWebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://omayo.blogspot.com/");
		WebElement link = driver.findElement(By.xpath("//a[text()='Open a popup window']"));
		Point point = link.getLocation();
		int xaxis = point.getX();
		int yaxis = point.getY();
		//Scrolling Operations
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-250)+")");
		//handle or address of current window/parent window
		String parentHandle = driver.getWindowHandle();
		Thread.sleep(2000);
		System.out.println("Handleof parent window:" +parentHandle);
		//click on link and get child window
		link.click();
	
	}

}
