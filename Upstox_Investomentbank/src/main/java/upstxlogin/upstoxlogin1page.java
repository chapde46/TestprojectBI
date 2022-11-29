package upstxlogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upstoxlogin1page 
{
	@FindBy(xpath = "//input[@id='userCode']")private WebElement UN;
	@FindBy(xpath = "//input[@id='password']")private WebElement PWD;
	@FindBy(xpath = "//div[text()='Sign into Upstox']")private WebElement sinbtn;
	
	public upstoxlogin1page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setupstoxlogin1pageuserid(String user)
	{
		UN.sendKeys(user);
	}
	public void setupstoxlogin1pagepassword (String pass)
	{
		PWD.sendKeys(pass);
	}
	public void setupstoxlogin1pageclickbtn()
	{
		sinbtn.click();
	}

}
