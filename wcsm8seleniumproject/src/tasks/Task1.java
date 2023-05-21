package tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Task1 {
	//automate airindia page
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		new EdgeDriver();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		//Thread.sleep(2000);
		driver.get("https://www.airindia.in/");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).click();
		//Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='from']")).sendKeys("Pune, Lohegaon Airport, PNQ, India, IN");
		driver.findElement(By.xpath("//input[@name='to']")).click();
//	Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='to']")).sendKeys("Kochi, Cochin International Airport, COK, India, IN");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@name='_depdateeu1']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@name='_depdateeu1']")).sendKeys("08/04/2023");
		driver.findElement(By.xpath("//select[@name='ddladult1']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='ddladult1']")).sendKeys("2");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='ddlchildren1']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='ddlchildren1']")).sendKeys("2");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='ddlinfants1']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='ddlinfants1']")).sendKeys("1");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='concessionaryType1']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='concessionaryType1']")).sendKeys("student");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='_classType1']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='_classType1']")).sendKeys("First");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pcode1']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.id("btnbooking")).click();

	}

}



