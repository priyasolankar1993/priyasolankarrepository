package pageObjectModelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Homepage {
	@FindBy(xpath="//a[@id='loginButton']")private WebElement button;
	@FindBy(xpath="//a[.='Logout']") private WebElement logoutLink;
	@FindBy(xpath="//A[@class='content users']/IMG[@class='sizer']") private WebElement Users;
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public WebElement Users() {
		return Users;
		
	}
	public void UsersMethod()
	{
		Users.click();
	}
	public void logOutMethod() {
		// TODO Auto-generated method stub
	logoutLink.click();
	}
	public void loginMethod()
	{
		button.click();
	}

}
