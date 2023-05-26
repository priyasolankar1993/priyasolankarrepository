package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DescriptionFlag {
  @Test(description = "Login performed")
  public void f() {
	  Reporter.log("Login Test Case",true);
  }
}
