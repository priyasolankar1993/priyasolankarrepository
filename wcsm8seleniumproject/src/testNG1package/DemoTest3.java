package testNG1package;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest3 {
  @Test
  public void t1() {
	  Reporter.log("t1 method from DemoTest3");
  }
  @Test
  public void t2() {
	  Reporter.log("t2 method from DemoTest3");
  }
  @Test
  public void t3() {
	  int i=10;
	  int j=5;
	  int res=i/j;
	  Reporter.log("t3 method from DemoTest3");
  }
}
