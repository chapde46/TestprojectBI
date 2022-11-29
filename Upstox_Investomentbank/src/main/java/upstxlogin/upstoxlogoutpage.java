package upstxlogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upstoxlogoutpage
{
	Actions act;
	@FindBy(xpath = "(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]") private WebElement logbtn; 
	@FindBy(xpath = "//div[text()='Logout']")private WebElement logout; 
	
	public upstoxlogoutpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setupstoxlogoutpage(WebDriver driver)
	{
		act=new Actions(driver);
		act.moveToElement(logbtn).click().moveToElement(logout).click().build().perform();
		
	}
	
	
	
	
	
	

}
