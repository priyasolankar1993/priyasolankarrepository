package selectClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AirIndiaDropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.airindia.in/");
		WebElement dropDown = driver.findElement(By.xpath("//select[@name='ddladult1']"));
		Select sel = new Select(dropDown);
		Thread.sleep(2000);
		sel.selectByIndex(3);
		Thread.sleep(2000);
		WebElement dropDown1 = driver.findElement(By.xpath("//select[@name='ddlinfants1']"));
		Select sel1=new Select(dropDown1);
		Thread.sleep(2000);
		sel1.selectByIndex(1);
		WebElement dropDown2 = driver.findElement(By.xpath("//select[@name='_classType1']"));
		Select sel2=new Select(dropDown2);
		Thread.sleep(2000);
		sel2.selectByVisibleText("Business");
		WebElement dropDown3 = driver.findElement(By.xpath("//select[@name='concessionaryType1']"));
		Select sel3=new Select(dropDown3);
		Thread.sleep(2000);
		sel3.selectByVisibleText("Student");
	}

}
