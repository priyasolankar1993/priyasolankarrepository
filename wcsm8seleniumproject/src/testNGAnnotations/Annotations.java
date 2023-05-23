package testNGAnnotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotations {
  @Test
  public void f() {
	  Reporter.log("f method execute",true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("beforeMethod execute",true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("afterMethod execute",true);
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("beforeMethod execute",true);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("afterClass execute",true);
  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("beforeTest execute",true);
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("afterTest execute",true);
  }

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("beforeSuite execute",true);
  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("afterSuite execute",true);
  }
  @Test
  public void g()
  {
	  Reporter.log("g method execute",true);
  }

}
