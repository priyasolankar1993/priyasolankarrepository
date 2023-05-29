package testNGFlags;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AlwaysRun {
	  @Test(description = "Login Method")
	  public void loginMethod() {
		  Reporter.log("Login Performed",true);
	  }
	  @Test(description = "User Created",dependsOnMethods = "loginMethod")
	  public void userCreateMethod() {
		  Assert.fail();
		  Reporter.log("User created",true);
	  }
	  @Test(description = "Logout Method",dependsOnMethods = "userCreateMethod")
	  public void logoutMethod() {
		  Reporter.log("Logout Performed",true);
	  
  }
}
