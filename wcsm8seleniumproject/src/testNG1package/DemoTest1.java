package testNG1package;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest1 {
  @Test
  public void g() {
	  Reporter.log("g method from DemoTest1",true);
  }
  @Test
  public void g1() {
	  Reporter.log("g1 method from DemoTest1",true);
  }
  @Test
  public void g2() {
	  Reporter.log("g2 method from DemoTest1",true);
  }
}
