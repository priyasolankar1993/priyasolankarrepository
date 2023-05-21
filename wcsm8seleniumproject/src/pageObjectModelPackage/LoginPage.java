package pageObjectModelPackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage { 
	//Store all the webelement of login page
	@FindBy(name="username") private WebElement usernameTB;
	@FindBy(name="pwd") private WebElement passwordTB;
	@FindBy(id="loginButton")private WebElement loginButton;
	@FindBy(xpath = "//input[@name='remember']") private WebElement checkBox;
	@FindBy(xpath = "//a[text()='Actimind Inc.']") private WebElement actimindLink;
//initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
	//Utilization
	public WebElement getUsernameTB() {
		return usernameTB;
	}
	public WebElement getPasswordTB() {
		return passwordTB;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public WebElement getCheckBox() {
		return checkBox;
	}
	public WebElement getActimindLink() {
		return actimindLink;
	}
	
	//Operational Methods
	public void validLogin(String validUsername,String validPassword) throws InterruptedException
	{
	usernameTB.sendKeys(validUsername);	
	Thread.sleep(2000);
	passwordTB.sendKeys(validPassword);
	Thread.sleep(2000);
	loginButton.click();
	}
	public void invalidLogin(String invalidUsername,String invalidPassword) throws InterruptedException
	{
		usernameTB.sendKeys(invalidUsername);
		passwordTB.sendKeys(invalidPassword);
		loginButton.click();
		Thread.sleep(2000);
		usernameTB.clear();
	}
}

