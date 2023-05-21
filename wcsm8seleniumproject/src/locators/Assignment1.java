package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment1 {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(co);
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Admin/Desktop/Selenium%20Data/html/dropdown(single).html");
	Thread.sleep(2000);
	driver.findElement(By.id("i1")).click();
	driver.navigate().to("https://www.netflix.com/in/login");
	Thread.sleep(2000);
	driver.findElement(By.id("id_userLoginId")).sendKeys("asd123@");
	Thread.sleep(2000);
	driver.findElement(By.id("id_password")).sendKeys("asdert");
	driver.navigate().to("https://www.linkedin.com/login");
	Thread.sleep(2000);
	driver.findElement(By.id("username")).sendKeys("asd123@");
	Thread.sleep(2000);
	driver.findElement(By.id("password")).sendKeys("asdert");
	driver.navigate().to("https://in.pinterest.com/");
	Thread.sleep(2000);
	driver.findElement(By.id("email")).sendKeys("asd123@");
	Thread.sleep(2000);
	driver.findElement(By.id("password")).sendKeys("asdert");
	driver.navigate().to("https://www.upwork.com/ab/account-security/login");
	Thread.sleep(2000);
	driver.findElement(By.id("login_username")).sendKeys("asd123@");
	Thread.sleep(2000);
	driver.navigate().to("https://www.naukri.com/nlogin/login");
	Thread.sleep(2000);
	driver.findElement(By.id("usernameField")).sendKeys("asd123@");
	Thread.sleep(2000);
	driver.findElement(By.id("passwordField")).sendKeys("asdert");
	
	
	
	
	
	
	
	
	
	
	
}

}


