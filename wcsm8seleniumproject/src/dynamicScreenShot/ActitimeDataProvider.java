package dynamicScreenShot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ActitimeDataProvider {
	static WebDriver driver;
 @BeforeTest
 public void property()
 {
	 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
 }
 @BeforeMethod
 public void setUp()
 {
	 driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-h9h9ujc/login.do");
 }
 @DataProvider(name="testActiTime")
 public Object[][]dataprovider()
 {
	 Object[][]dataprovider=new Object[5][2];
	 dataprovider[0][0]="Admin";
	 dataprovider[0][1]="Manager";
	 
	 dataprovider[1][0]="Admin123";
	 dataprovider[1][1]="ManagGR";
	 
	 dataprovider[2][0]="Adm@1in";
	 dataprovider[2][1]="Mana";
	 
	 dataprovider[3][0]="Admin678";
	 dataprovider[3][1]="nager";
	 
	 dataprovider[4][0]="Admurin";
	 dataprovider[4][1]="Manager123";
	 return dataprovider;
	 
 }
 @Test(dataProvider ="testActiTime")
 public void loginInvalid(String usn,String pass) throws InterruptedException
 {
	 driver.findElement(By.name("username")).sendKeys("usn");
		driver.findElement(By.name("pwd")).sendKeys("pass");

	  driver.findElement(By.id("loginButton")).click();
	  Thread.sleep(2000);
		 driver.findElement(By.name("username")).clear();
 }
 @AfterMethod
 public void tearDown() throws InterruptedException
 {
	  Thread.sleep(2000);
	 driver.quit();
 }
}
