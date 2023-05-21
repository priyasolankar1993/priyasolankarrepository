package pageObjectModelPackage;

import java.io.IOException;

public class ActitimeUsersTestCase extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {


		BaseTest bt = new BaseTest();
		bt.Setup();

		Flib flib = new Flib();

		LoginPage lp = new LoginPage(driver);

		lp.validLogin(flib.readPropertyData(PROP_PATH, "username"),flib.readPropertyData(PROP_PATH, "password"));
          
		Thread.sleep(1000);
		
		Homepage hp = new Homepage(driver);
		Thread.sleep(2000);
		hp.UsersMethod();
		
		Thread.sleep(2000);
		ActitimeUsers au= new ActitimeUsers(driver);
		Thread.sleep(2000);
		String usn = flib.readExcelData(EXCEL_PATH,"userlist",1, 0);
		String pass = flib.readExcelData(EXCEL_PATH,"userlist",1, 1);
		String Fn = flib.readExcelData(EXCEL_PATH,"userlist",1, 2);
		String Ln = flib.readExcelData(EXCEL_PATH,"userlist",1,3);
		
		Thread.sleep(2000);
		au.createUserMethod(usn, pass, Fn, Ln);
		Thread.sleep(2000);
		au.deleteUserMethod();
	}

}