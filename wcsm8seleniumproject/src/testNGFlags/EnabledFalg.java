package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledFalg {
  @Test(enabled = true,description = "login")
  public void f() {
	  Reporter.log("login performed",true);
  }
  @Test(enabled = false,description = "logout")//Not passed testcase because of false
  public void g() {
	  Reporter.log("logout performed",true);
  }
}
