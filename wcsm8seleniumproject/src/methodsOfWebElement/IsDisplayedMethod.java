package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.netflix.com/in/login");
	  WebElement usnTB = driver.findElement(By.name("userLoginId"));
	  WebElement pwdTB = driver.findElement(By.name("password"));
	  WebElement button = driver.findElement(By.xpath("//button[@class='btn login-button btn-submit btn-small']"));
	  if(usnTB.isDisplayed())
	  {
		  usnTB.sendKeys("hgjkfk");
		  boolean verify = usnTB.isDisplayed();
		  System.out.println(verify);
	  }
	  else
	  {
		  System.out.println("Will occur Exception");
	  }
	  if(pwdTB.isDisplayed())
	  {
		  pwdTB.sendKeys("383fkfkfkf");
		  
	  }
	  else
	  {
		  System.out.println("Will occur Exception");
	  }
		if(button.isDisplayed())
		{
			button.click();
		}
		else
		  {
			  System.out.println("Will occur Exception");
		  }
	}

}
