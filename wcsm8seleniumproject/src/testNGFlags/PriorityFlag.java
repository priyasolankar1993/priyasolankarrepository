package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityFlag {
  @Test
  public void a() {
	  Reporter.log("Method a",true);
	  
  }
  @Test
  public void b() {
	  Reporter.log("Method b",true);
	  
  }
  @Test
  public void c() {
	  Reporter.log("Method c",true);
	  
  }
  @Test
  public void d() {
	  Reporter.log("Method d",true);
	  
  }
  @Test
  public void e() {
	  Reporter.log("Method e",true);
	  
  }
  @Test(priority = 1)
  public void f() {
	  Reporter.log("Method f",true);
	  
  }
  
  @Test
  public void g() {
	  Reporter.log("Method a",true);
	  
  }
}
