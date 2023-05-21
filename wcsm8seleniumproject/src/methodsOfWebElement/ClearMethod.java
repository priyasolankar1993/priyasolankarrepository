package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-h9h9ujc/login.do");
		WebElement userNameTB = driver.findElement(By.name("username"));
		userNameTB.sendKeys("admin123");
		
		WebElement passwordTB = driver.findElement(By.name("pwd"));
		passwordTB.sendKeys("manager123");
		userNameTB.clear();
		passwordTB.clear();
		
	}

}
