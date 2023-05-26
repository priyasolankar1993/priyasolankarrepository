package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCountFlag {
  @Test(invocationCount = 7)
  public void f() {
	  Reporter.log("login Test Case",true);
  }
}
