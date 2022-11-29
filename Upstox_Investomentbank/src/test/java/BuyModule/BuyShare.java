package BuyModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyShare 
{

	@FindBy(xpath = "//div[@id='watchlistTestId']/div[@id='NSE_EQ-3787']") private WebElement searchwatch;
	@FindBy(xpath = "(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[1]") private WebElement buy1;
	@FindBy(xpath = "(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[1]") private WebElement buy2;
	@FindBy(xpath = "(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[1]") private WebElement buy3;
	
	public BuyShare(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setsearch()
	{
		searchwatch.sendKeys("");
	}

}
