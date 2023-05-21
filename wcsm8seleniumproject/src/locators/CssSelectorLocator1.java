package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CssSelectorLocator1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("sdertg");
		driver.findElement(By.name("password")).sendKeys("stg6784");
		driver.findElement(By.cssSelector("button[class='_acan _acap _acas _aj1-']")).click();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("fghjtuy");
		driver.findElement(By.name("pass")).sendKeys("fghjtuy6788");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[name='login']")).click();
		driver.get("https://www.netflix.com/in/login");
		driver.findElement(By.name("userLoginId")).sendKeys("fghjtuylo");
		driver.findElement(By.name("password")).sendKeys("fghjtuy678890");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class^='btn']")).click();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		

	}




}


