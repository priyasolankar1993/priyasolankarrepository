package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.netflix.com/in/login");
	WebElement button = driver.findElement(By.xpath("//button[@class='btn login-button btn-submit btn-small']"));
	Rectangle value = button.getRect();
	//get x axis and y axis of webelement on webpage
	int xaxis = value.getX();
	int yaxis = value.getY();
	System.out.println("X axis= "+xaxis+ ", Y axis= "+yaxis);
	//get height and width of webelement on webpage
	int height = value.getHeight();
	int width = value.getWidth();
	System.out.println("Height="+height+", Width="+width);
	Dimension d = value.getDimension();
	System.out.println("Dimension "+d);
	Point p = value.getPoint();
	System.out.println("Point "+p);

}
}