package PagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import genericPackage.WorkLib;

public class MgrPage {
 @FindBy(xpath="//input[@value='Create New Tasks']") private WebElement createTaskButton;
 @FindBy(xpath="//*[@name='customerId']") private WebElement dropDownCustomer;
 @FindBy(xpath="//*[@name='projectId']") private WebElement dropDownProject;
// @FindBy(xpath="//*[@name='projectName']") private WebElement projectName;
 
 @FindBy(xpath="//TD[@id='task0.cell']/INPUT[@class='text']") private WebElement taskName;
 @FindBy(xpath="//DIV[@id='bt0']/SELECT[.='Non-Billable") private WebElement dropDownBillingType;
 @FindBy(xpath="//TABLE[@cellpadding='4']/TBODY/TR[2]/TD[4]/INPUT[@value='on']") private WebElement checkBox;
 @FindBy(xpath="//TD[@id='task0.cell']/INPUT[@class='text']") private WebElement createTask;

public MgrPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public WebElement getCreateTaskButton() {
	return createTaskButton;
}

public WebElement getDropDownCustomer() {
	return dropDownCustomer;
}


public WebElement getDropDownProject() {
	return dropDownProject;
}

public WebElement getTaskName() {
	return taskName;
}

public WebElement getDropDownBillingType() {
	return dropDownBillingType;
}

public WebElement getCheckBox() {
	return checkBox;
}

public WebElement getCreateTask() {
	return createTask;
}
public void taskCreateMethod(int index,String taskName)
{
createTaskButton.click();
WorkLib wb = new WorkLib();
wb.dropDownSelect(dropDownCustomer, index);
wb.dropDownSelect(dropDownProject, index);
getTaskName().sendKeys(taskName);
wb.dropDownSelect(dropDownBillingType, index);
getCheckBox().click();
getCreateTask().click();
}}