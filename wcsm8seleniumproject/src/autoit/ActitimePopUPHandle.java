package autoit;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActitimePopUPHandle {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-h9h9ujc/login.do");
	driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	
		driver.findElement(By.xpath("//div[text()='Settings']/following-sibling::img")).click();
		driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
		driver.findElement(By.xpath("//input[@id='uploadNewLogoOption']")).click();
		WebElement target = driver.findElement(By.xpath("//input[@name='formCustomInterfaceLogo.logo']"));
	Actions act = new Actions(driver);
		act.doubleClick(target).perform();
		//To handle fileupload PopUP
		File file = new File("./Autoit/Fileup1.exe");
		String absolutePath = file.getAbsolutePath();
		//Thread.sleep(4000);
		Runtime.getRuntime().exec(absolutePath);
		Thread.sleep(6000);
		Runtime.getRuntime().exec(absolutePath);
		
		
		
}
}