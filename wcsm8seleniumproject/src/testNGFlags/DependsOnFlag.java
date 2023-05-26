package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnFlag {
  @Test(description = "Login Method")
  public void loginMethod() {
	  Reporter.log("Login Performed",true);
  }
  @Test(description = "User Created",dependsOnMethods = "loginMethod")
  public void userCreateMethod() {
	  Reporter.log("User created",true);
  }
  @Test(description = "Logout Method",dependsOnMethods = "userCreateMethod")
  public void logoutMethod() {
	  Reporter.log("Logout Performed",true);
  }
}
