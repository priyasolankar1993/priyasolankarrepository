package pageObjectModelPackage;

import java.io.IOException;

public class InvalidLoginTestCase extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		 BaseTest bt = new BaseTest();
		 bt.Setup();
		 Thread.sleep(2000);
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		int rc = flib.rowCount(EXCEL_PATH,"invalidcreds");
		for(int i=1;i<=rc;i++)
		{
		String invalidUsername = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 0);
		String invalidPassword = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 1);
		Thread.sleep(2000);
		lp.invalidLogin(invalidUsername, invalidPassword);
		}
		Thread.sleep(2000);
		bt.tearDown();
	}

}
