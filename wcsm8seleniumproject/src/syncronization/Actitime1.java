package syncronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitime1 {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeOptions co = new ChromeOptions();
		 co.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(co);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

driver.navigate().to("http://desktop-h9h9ujc/login.do");
String welcomePage=driver.getTitle();
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
if(wait.until(ExpectedConditions.titleContains(welcomePage)))
{
	
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	System.out.println("Welcomepage matched!!Test case passed");
}
	else
	{
		System.out.println("Test case failed");

	}
driver.navigate().to("http://desktop-h9h9ujc/user/submit_tt.do");
String homePage=driver.getTitle();

if(wait.until(ExpectedConditions.titleContains(homePage)))
{
	
	
	System.out.println("homepage matched!!Test case passed");
}
	else
	{
		System.out.println("Test case failed");
	}

}
	}



