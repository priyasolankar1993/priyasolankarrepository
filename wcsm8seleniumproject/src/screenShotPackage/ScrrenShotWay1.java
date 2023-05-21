package screenShotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScrrenShotWay1 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 //WebDriver driver=new ChromeDriver();
		ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.selenium.dev/");
		
		 File src = driver.getScreenshotAs(OutputType.FILE);
		 File dest = new File("./ScreenShots/ss2.png");
		 Files.copy(src, dest);
		
}
}