package testNG1package;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test2 {
  @Test
  public void f() {
	  System.setProperty("webdriver.firefox.driver", "./drivers/geckodriver.exe");
			FirefoxDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.google.com/");
			driver.switchTo().activeElement().sendKeys("SQL",Keys.ENTER);
			driver.quit();
	  }
  }

