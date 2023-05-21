import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathUsingText {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.driver", "./drivers/geckodriver.exe");
		
		
  WebDriver driver=new FirefoxDriver();
Thread.sleep(2000);
driver.manage().window().maximize();
driver.get("https://in.puma.com/in/en/mens");
Thread.sleep(2000);
driver.findElement(By.xpath("//span[.='Women']")).click();

	}
	

}
