package testNGAnnotations;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class GoogleSearchTestCase extends BaseTest{
  @Test
  public void f() {
	  driver.switchTo().activeElement().sendKeys("Java",Keys.ENTER);
  }
  @Test
  public void g() {
	  driver.switchTo().activeElement().sendKeys("SQL",Keys.ENTER);
  }
  @Test
  public void h() {
	  driver.switchTo().activeElement().sendKeys("Selenium",Keys.ENTER);
  }
  
}
