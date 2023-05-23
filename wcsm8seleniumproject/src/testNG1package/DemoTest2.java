package testNG1package;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest2 {
  @Test
  public void f1() {
	  Reporter.log("f1 method from DemoTest1",true);
  }
  public void f2() {
	  Reporter.log("f2 method from DemoTest1",true);
  }
  public void f3() {
	  Reporter.log("f3 method from DemoTest1",true);
  }
}
