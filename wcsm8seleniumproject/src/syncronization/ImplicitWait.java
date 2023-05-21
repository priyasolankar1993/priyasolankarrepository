package syncronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class ImplicitWait {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.drive", "./drivers/msedgedriver.exe");
		EdgeOptions eo=new EdgeOptions();
		eo.addArguments("--remote-allow-origins=*");
		WebDriver driver=new EdgeDriver(eo);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));		
				driver.get("https://www.instagram.com/");
		
		driver.findElement(By.name("username")).sendKeys("bnmmg7786");
		
		driver.findElement(By.name("password")).sendKeys("bnmb678595");
		driver.findElement(By.cssSelector("button[class^='_acan _acap']")).click();
		
		
	}

}



