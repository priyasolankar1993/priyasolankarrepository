package genericPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.ScreenshotException;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;

public class BaseTest extends Flib implements IAutoConstant{
	static WebDriver driver;
	@BeforeMethod
	public void setUp() throws IOException
	{
		Flib flib = new Flib();
		String browserValue = flib.readPropertyData(PROP_PATH, "browser");
		String url = flib.readPropertyData(PROP_PATH, "url");
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_PATH);
			 driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get(url);
				
		}
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
		System.setProperty("webbdriver.firefox.driver", "./drivers/geckoDriver.exe");
		 driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);	
		}
		else if(browserValue.equalsIgnoreCase("edge"))
		{
		System.setProperty("webbdriver.edge.driver", "./drivers/msedgeDriver.exe");
		 driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);	
		}
		
		else
		{
			System.out.println("Enter valid browser");
		}
		
	}
	public void failedMethodToTakeScreenShot(String failedMethod) 
	{
		try
		{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("SCREENSHOT_PATH"+failedMethod+".png");
		Files.copy(src, dest);
		}
		catch(Exception e)
		{
			
		}
	}
	public void tearDown()
	{
		driver.quit();
	}
	

}
