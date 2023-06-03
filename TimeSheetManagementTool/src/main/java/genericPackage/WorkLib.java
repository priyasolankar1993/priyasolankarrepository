package genericPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WorkLib extends BaseTest {
	//Handle PopUp Methods
	public void acceptAlert()
	{
		driver.switchTo().alert().accept();
	}
	public void dissmissAlert()
	{
	driver.switchTo().alert().dismiss();
	}
	public void acceptConfirmation()
	{
		driver.switchTo().alert().accept();
	}
	public void dissmissConfirmation()
	{
		driver.switchTo().alert().dismiss();
	}
	//Handle Mouse Actions
	public void rightClick(WebElement target)
	{
		Actions act=new Actions(driver);
				act.contextClick(target).perform();
	}
	public void doubleClick(WebElement target)
	{
		Actions act=new Actions(driver);
				act.doubleClick().perform();
	}
	public void mouseHoverMethod(WebElement target)
	{
		Actions act=new Actions(driver);
				act.moveToElement(target).perform();
	}
	public void dragAndDropMethod(WebElement src,WebElement target)
	{
		Actions act = new Actions(driver);
		act.dragAndDrop(src, target).perform();
	}
	//Handle Frame
	public void handleFrameByIndex(int index)
	{
		driver.switchTo().frame(index);
	}
	public void handleFrameByNameOrId(String NameOrId)
	{
		driver.switchTo().frame(NameOrId);
	}
	public void handleFrameByFrameElement(WebElement frame)
	{
		driver.switchTo().frame(frame);
	}
	//HandleDropDown
	public void dropDownSelect(WebElement element, int index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	
		
	

}
