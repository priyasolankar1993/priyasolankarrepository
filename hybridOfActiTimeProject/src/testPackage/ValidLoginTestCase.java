package testPackage;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PagePackage.HomePage;
import PagePackage.LoginPage;
import PagePackage.MgrPage;
import PagePackage.TaskListPage;
import PagePackage.UsersPage;
import genericPackage.BaseTest;
import genericPackage.CustomeListners;
import genericPackage.Flib;

@Listeners(CustomeListners.class)
public class ValidLoginTestCase extends BaseTest {
	@Test
	public void validTestCase() throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.setUp();
		Flib flib = new Flib();
	
	LoginPage lp = new LoginPage(driver);
	lp.validLogin(flib.readPropertyData(PROP_PATH,"username"),flib.readPropertyData(PROP_PATH,"password"));
    Thread.sleep(2000);	
  HomePage hp = new HomePage(driver);
  hp.userModuleMethod();
  Thread.sleep(2000);
UsersPage up = new UsersPage(driver);
up.userMethod(flib.readExcelData(EXCEL_PATH,"mgr",1,0), flib.readExcelData(EXCEL_PATH,"mgr",1,1),flib.readExcelData(EXCEL_PATH,"mgr",1,2),flib.readExcelData(EXCEL_PATH,"mgr",1,3));
up.selectCheckBox();
up.managerCreateMethod();
Thread.sleep(2000);
hp.taskModuleMethod();
TaskListPage task = new TaskListPage(driver);
task.createNewCustomerMethod(flib.readExcelData(EXCEL_PATH,"customerandprojectlist",1,0));
Thread.sleep(2000);
task.createProjectMethod(1,flib.readExcelData(EXCEL_PATH,"customerandprojectlist",1,1));
Thread.sleep(2000);
hp.logOutMethod();
	
//Thread.sleep(2000);
//lp.validMgrLogin(flib.readExcelData(EXCEL_PATH,"mgr",1,0), flib.readExcelData(EXCEL_PATH,"mgr",1,1));
//hp.taskModuleMethod();
//Thread.sleep(2000);
//MgrPage mp = new MgrPage(driver);

		
	}
	

}
