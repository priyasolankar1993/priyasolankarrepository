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
import org.testng.internal.annotations.ITest;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest extends Flib implements IAutoConstant{
	protected static WebDriver driver;
	@BeforeMethod
	public void setUp() throws IOException
	{
		Flib flib = new Flib();
		String browserValue = flib.readPropertyData(PROP_PATH, "browser");
		String url = flib.readPropertyData(PROP_PATH, "url");
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get(url);
				
		}
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.chromedriver().setup();
		 driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);	
		}
		else if(browserValue.equalsIgnoreCase("edge"))
		{
			WebDriverManager.chromedriver().setup();
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
	public void onTestFailure(ITest result) {
		// TODO Auto-generated method stub
		
	}
	

}
