package fireflink;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Puma {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.get("https://in.puma.com/");
//		Thread.sleep(2000);
//	driver.findElement(By.xpath("//a[text()='MEN' and(@class='tw-nn2ieg tw-1safon7 pointer-events-auto whitespace-normal')]")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//A[@aria-label=\"Go to Scorch Runner V2 Men's Shoes Cool Mid Gray-Cool Dark Gray-Yellow Sizzle\"]/DIV/DIV[1]/DIV/DIV[1]/IMG[@loading='lazy']")).click();
		driver.get("https://www.bluestone.com/");
		Actions act = new Actions(driver);
		WebElement target = driver.findElement(By.xpath("//a[text()='Rings ']"));
		act.moveToElement(target).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/HTML/BODY/HEADER/DIV/DIV[2]/DIV/NAV/UL/LI[3]/DIV/UL/LI[1]/DIV/UL/LI[2]/A")).click();
	}

}
