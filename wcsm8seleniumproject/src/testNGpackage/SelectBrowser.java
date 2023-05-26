package testNGpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SelectBrowser {
	 @Test
  @Parameters({"browser","url","Vusername","Vpassword"})
  
  public void method1(String browser,String url,String usn,String pass) {
	  if(browser.equals("chrome"))
	  {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=  new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get(url);
	driver.findElement(By.name("username")).sendKeys(usn);
	driver.findElement(By.name("pwd")).sendKeys(pass);
	driver.findElement(By.id("loginButton")).click();
  }
	  else if(browser.equals("edge"))
	  {
	  System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
	WebDriver driver=  new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get(url);
	driver.findElement(By.name("username")).sendKeys(usn);
	driver.findElement(By.name("pwd")).sendKeys(pass);
	driver.findElement(By.id("loginButton")).click();
  }

	  
  else
  {
	  System.out.println("invalid browser");
  }
}
}
