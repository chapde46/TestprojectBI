package upstxlogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upstoxhome1page
{
	@FindBy(xpath = "//span[text()='akshay d.']") private WebElement tex;
	
	public upstoxhome1page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void upstoxhome1page(String texnm)
	{
	String nm = tex.getText();
	System.out.println(nm);
	
	if (nm==texnm)
	{
		System.out.println("sentence get match");
	}
	else
	{
		System.out.println("sentence doesnot get match");
	}
	}
}
