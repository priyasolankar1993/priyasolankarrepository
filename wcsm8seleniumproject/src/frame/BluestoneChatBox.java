package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BluestoneChatBox {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.bluestone.com/");
	driver.findElement(By.id("denyBtn")).click();
	driver.switchTo().frame("fc_widget");//By writing //iframe we get fc_widget
	Thread.sleep(2000);
	WebElement chatBox = driver.findElement(By.xpath("//div[@id='chat-icon']"));
	chatBox.click();
	driver.switchTo().defaultContent();
	driver.findElement(By.id("chat-fc-name")).sendKeys("admin");
	Thread.sleep(2000);
	driver.findElement(By.id("chat-fc-email")).sendKeys("abc123@gmail");
	Thread.sleep(2000);
	driver.findElement(By.id("chat-fc-phone")).sendKeys("0123456789");
}
}
