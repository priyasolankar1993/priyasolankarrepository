package keyDrivenPackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InvalidLoginTestCase extends BaseTest {
	static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		Thread.sleep(2000);
		Flib flib = new Flib();
		int rc = flib.rowCount(EXCEL_PATH, "invalidcreds");
		for(int i=1;i<rc ;i++)
		{
		String invalidusername = flib.readExcelData(EXCEL_PATH, "invalidcreds" , i,0);
		String invalidpassword = flib.readExcelData(EXCEL_PATH, "invalidcreds" ,i,1);
		Thread.sleep(2000);
		 driver.findElement(By.name("username")).sendKeys(invalidusername);
		  Thread.sleep(2000);
		    driver.findElement(By.name("pwd")).sendKeys(invalidpassword);
		    Thread.sleep(2000);
		    driver.findElement(By.id("loginButton")).click();
	        Thread.sleep(2000);
	}
		bt.closeBrowser();
	}
}
