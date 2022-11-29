package upstxlogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upstoxlogin3page
{
	@FindBy(xpath = "//div[text()='No, I’m good']")private WebElement click;
	
	public upstoxlogin3page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void goodclick()
	{
		click.click();
	}

}
