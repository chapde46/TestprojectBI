package upstxlogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upstoxlogin2page
{
	@FindBy(xpath = "//input[@name='yob']")private WebElement PIN;
	
	public upstoxlogin2page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setupstoxlogin2pagepin(String pin)
	{
		PIN.sendKeys(pin);
	}

}
