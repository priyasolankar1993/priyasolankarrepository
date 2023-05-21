package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("http://desktop-h9h9ujc/login.do");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.navigate().to("https://www.netflix.com/in/login");
		Thread.sleep(2000);
		driver.findElement(By.name("userLoginId")).sendKeys("@123tyu");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("23wer5");
		driver.navigate().to("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("@345rte");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("ghftr5768");
		Thread.sleep(2000);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.navigate().to("https://www.linkedin.com/login");
		Thread.sleep(2000);
		driver.findElement(By.name("session_key")).sendKeys("Abgh@123");
		Thread.sleep(2000);
		driver.findElement(By.name("session_password")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.navigate().to("https://in.pinterest.com/login/");
		Thread.sleep(2000);
		driver.findElement(By.name("id")).sendKeys("Abgh@123");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		
		
				
		
				
		
		
	

}

}
