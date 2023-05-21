package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("http://desktop-h9h9ujc/login.do");
WebElement verify = driver.findElement(By.name("remember"));
boolean v1 = verify.isSelected();
System.out.println(v1);
verify.click();
boolean v2 = verify.isSelected();
System.out.println(v2);

	}

}
