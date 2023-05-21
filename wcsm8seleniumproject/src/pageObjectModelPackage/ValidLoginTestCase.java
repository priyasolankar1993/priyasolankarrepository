package pageObjectModelPackage;

import java.io.IOException;



public class ValidLoginTestCase extends BaseTest {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
	
	
		BaseTest bt = new BaseTest();
		bt.Setup();
		
		LoginPage lp = new LoginPage(driver);
		Homepage hp = new Homepage(driver);
		Flib flib = new Flib();
		
		lp.validLogin(flib.readPropertyData(PROP_PATH,"Username"),flib.readPropertyData(PROP_PATH,"Password"));
		
		Thread.sleep(2000);
		hp.loginMethod();
		Thread.sleep(2000);
	  	
		bt.tearDown();
	}

}
