package selectClassMethods;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMethod {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Admin/Desktop/Selenium%20Data/html/dropdown(multiple).html");
		WebElement dropDown = driver.findElement(By.name("menu"));
		Select sel=new Select(dropDown);
		List<WebElement> allOptions = sel.getOptions();
		HashSet<String> hs = new HashSet<String>();
		for(int i=0;i<allOptions.size();i++)
		{
		String op = allOptions.get(i).getText();
		hs.add(op);
		}
		for(String options:hs)
			
		{
			Thread.sleep(2000);
			System.out.println(options);
		}
		
	
		
		
		
	
	
		
	}	

}
