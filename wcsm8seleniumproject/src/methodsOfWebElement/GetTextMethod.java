package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String button = driver.findElement(By.xpath("//button[text()=' Login ']")).getText();
		System.out.println("login button text :"+button);
		String pwd = driver.findElement(By.xpath("//p[text()='Forgot your password? ']")).getText();
		System.out.println("Forgot password text:"+pwd);
		driver.get("https://www.netflix.com/in/login");
		String b1 = driver.findElement(By.xpath("//button[@class='btn login-button btn-submit btn-small']")).getText();
		System.out.println("login button text:"+b1);
		String p1 = driver.findElement(By.xpath("//a[@class='login-help-link link']")).getText();
		System.out.println(p1);
	}

}
