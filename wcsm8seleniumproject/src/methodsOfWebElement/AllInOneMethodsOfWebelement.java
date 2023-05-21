package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllInOneMethodsOfWebelement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.netflix.com/in/login");
		WebElement v1 = driver.findElement(By.name("userLoginId"));
		v1.sendKeys("hfjjf");
		v1.clear();
		WebElement v2 = driver.findElement(By.xpath("//button[.='Sign In']"));
		v2.click();
		v2.submit();
		v2.sendKeys("fjf758686");
		boolean button = v2.isEnabled();
		System.out.println(button);
		WebElement b1 = driver.findElement(By.xpath("//a[@class='login-help-link link']"));
		String b2 = b1.getText();
		String b3 = b1.getTagName();
		System.out.println(b2);
		System.out.println(b3);
		String b4 = b1.getAttribute("class");
		System.out.println(b4);
		WebElement a1 = driver.findElement(By.xpath("//span[@class='login-remember-me-label-text']"));
		boolean a2 = a1.isSelected();
		System.out.println(a2);
		a1.click();
		boolean a3 = a1.isSelected();
		System.out.println(a3);
		WebElement s1 = driver.findElement(By.name("password"));
		if(s1.isDisplayed())
		{
			s1.sendKeys("fjf7586");
			boolean s2 = s1.isDisplayed();
			System.out.println(s2);
		}
		else
		{
			System.out.println("exception occur");
		}
		String s3 = s1.getCssValue("color");
		System.out.println(s3);
		Rectangle c1 = b1.getRect();
		int d1 = c1.getX();
		int d2 = c1.getY();
		System.out.println("Xaxis:"+d1+ "Yaxis:"+d2);
		Point f1 = a1.getLocation();
		int g1 = f1.getX();
		int g2 = f1.getY();
		System.out.println("xaxis:"+g1+"Yaxis:"+g2);
		
		
	}
	

}
