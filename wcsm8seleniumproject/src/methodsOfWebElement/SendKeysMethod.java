package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-h9h9ujc/login.do");
		
		
		
		/*WebElement userNameTB = driver.findElement(By.name("username"));
		userNameTB.sendKeys("admin123");
		 WebElement passwordTB = driver.findElement(By.name("pwd"));
		 passwordTB.sendKeys("manager123");
		 driver.navigate().refresh();
		 userNameTB.sendKeys("admin1234");
		 passwordTB.sendKeys("manager1234");*/
		driver.findElement(By.name("username")).sendKeys("admin123");
		driver.findElement(By.name("pwd")).sendKeys("manager123");
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("123admin");
		driver.findElement(By.name("pwd")).sendKeys("123manager");
		
	}

	
	
	
	
}
