package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.netflix.com/in/login");
	WebElement button = driver.findElement(By.xpath("//button[@class='btn login-button btn-submit btn-small']"));
	Point value = button.getLocation();
	int xaxis = value.getX();
	int yaxis = value.getY();
	System.out.println("X axis= "+xaxis+ ",Y axis= "+yaxis);
	}
}
