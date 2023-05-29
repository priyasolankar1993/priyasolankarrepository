package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupsFlag {
	//use to perform group execution
  @Test(groups="Functional Testing")
  public void ft1() {
	  Reporter.log("FTC1",true);
	  }
  @Test(groups="smoke Testing")
  public void st1() {
	  Reporter.log("STC1",true);
	  }
  @Test(groups="Integration Testing")
  public void it1() {
	  Reporter.log("ITC1",true);
	  }
  //------------------------------------------------------------------------------------------
  @Test(groups="Functional Testing")
  public void ft2() {
	  Reporter.log("FTC2",true);
	  }
  @Test(groups="Smoke Testing")
  public void st2() {
	  Reporter.log("STC2",true);
	  }
  @Test(groups="Integration Testing")
  public void it2() {
	  Reporter.log("ITC2",true);
	  }
  //----------------------------------------------------------------------------------------------
  @Test(groups="Functional Testing")
  public void ft3() {
	  Reporter.log("FTC3",true);
	  }
  @Test(groups="Smoke Testing")
  public void st3() {
	  Reporter.log("STC3",true);
	  }
  @Test(groups="Integration Testing")
  public void it3() {
	  Reporter.log("ITC3",true);
	  }
}