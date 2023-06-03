package PagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(xpath="//a[.='Logout']") private WebElement logoutLink;
@FindBy(xpath="//A[@class='content tt_selected selected']/DIV[2]/IMG") private WebElement timeTrackModule;
@FindBy(xpath="//A[@class='content tasks']/IMG[@class='sizer']") private WebElement taskModule;
@FindBy(xpath="//A[@class='content reports']/IMG[@class='sizer']") private WebElement reportModule;
@FindBy(xpath="//A[@class='content users']/IMG[@class='sizer']") private WebElement userModule;
@FindBy(xpath="//div[text()='Work Schedule']/following-sibling::img") private WebElement workScheduleModule;

//Initilization
public HomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
//Utilization

public WebElement getLogoutLink() {
	return logoutLink;
}

public WebElement getTimeTrackModule() {
	return timeTrackModule;
}

public WebElement getTaskModule() {
	return taskModule;
}

public WebElement getReportModule() {
	return reportModule;
}

public WebElement getUserModule() {
	return userModule;
}

public WebElement getWorkScheduleModule() {
	return workScheduleModule;
}
//operational Methods
public void logOutMethod ()
{
	logoutLink.click();
}
public void userModuleMethod()
{
	userModule.click();
}
public void taskModuleMethod()
{
	taskModule.click();
}}

