package selectClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByVisibleText {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Admin/Desktop/Selenium%20Data/html/dropdown(multiple).html");
	WebElement dropDown = driver.findElement(By.name("menu"));
	Select sel = new Select(dropDown);
sel.selectByVisibleText("poha");
Thread.sleep(2000);
sel.selectByVisibleText("dosa");
Thread.sleep(2000);
sel.deselectByVisibleText("dosa");
Thread.sleep(2000);
sel.deselectByVisibleText("poha");
		
	}

}
