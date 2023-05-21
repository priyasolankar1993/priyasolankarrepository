package xpath;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


public class FindElementsMethod1 {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		 EdgeOptions eo = new EdgeOptions();
		 eo.addArguments("--remote-allow-origins=*");
	WebDriver driver = new EdgeDriver(eo);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 driver.get("https://www.flipkart.com/");
		 
		 driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		 driver.findElement(By.name("q")).sendKeys("Mobiles");
		 driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		 
		   List<WebElement> options = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		 
		 List<WebElement> allOptions = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
		 
		 for(int i=0;i<options.size();i++)
		 {
			 String nameOfMobiles = options.get(i).getText();
			 for(int j=i;j<=i;j++)
			 {
				 String prizeOfMobiles = allOptions.get(j).getText();
				 System.out.print(nameOfMobiles+  ":"+prizeOfMobiles);
				 
			 }
			 System.out.println();
		 }
		 
		 
	}

}
