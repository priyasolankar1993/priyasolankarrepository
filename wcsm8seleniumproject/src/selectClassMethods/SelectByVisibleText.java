package selectClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByVisibleText {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Admin/Desktop/Selenium%20Data/html/dropdown(multiple).html");
		WebElement dropDown = driver.findElement(By.name("menu"));
		Select sel = new Select(dropDown);
		sel.selectByVisibleText("idli");
		sel.selectByVisibleText("poha");
		sel.selectByVisibleText("dosa");
		sel.selectByVisibleText("biryani");
		Thread.sleep(2000);
		//sel.deselectAll();
		sel.deselectByIndex(1);
		sel.deselectByValue("v3");
		sel.deselectByVisibleText("biryani");
		driver.get("file:///C:/Users/Admin/Desktop/Selenium%20Data/html/dropdown(single).html");
		WebElement dropDown1 = driver.findElement(By.name("menu"));
		sel.selectByVisibleText("poha");
	}

}
