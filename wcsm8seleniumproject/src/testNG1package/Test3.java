package testNG1package;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

import org.testng.annotations.Test;

public class Test3 {
  @Test
  public void f() {
	  System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
	EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("Automation",Keys.ENTER);
		driver.quit();

  }
}
