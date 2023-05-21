package selectClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/Admin/Desktop/Selenium%20Data/html/dropdown(single).html");
	//select single option from single select dropdown
	WebElement dropDown = driver.findElement(By.name("menu"));
	Select sel = new Select(dropDown);
	sel.selectByIndex(3);
	Thread.sleep(2000);

	//select multiple option from multi select dropdown
	for(int i=0;i<=4;i++)
	{
		Thread.sleep(2000);
	sel.selectByIndex(i);
	
		
	}
	}
}
