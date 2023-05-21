package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		WebElement target = driver.findElement(By.xpath("//a[@title='Watch Jewellery']"));
		Actions act = new Actions(driver);
		act.contextClick(target).perform();
		driver.findElement(By.xpath("//a[text()='Band']")).click();
		WebElement target1 = driver.findElement(By.xpath("//a[@title='Coins']"));
		act.contextClick(target1).perform();
		driver.findElement(By.xpath("//span[text()='1 gram' and(@data-p='gold-coins-weight-1gms,m')]")).click();
		WebElement v = driver.findElement(By.xpath("//div[@class='mousetrap']/preceding-sibling::a"));
		if(v.isEnabled())
		{
			System.out.println("coin is displayed");
			
		}
		else
		{
			System.out.println("Exception");
		}
	}

}
