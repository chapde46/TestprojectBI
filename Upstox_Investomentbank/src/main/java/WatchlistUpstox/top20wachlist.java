package WatchlistUpstox;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class top20wachlist
{
	@FindBy(xpath = "//div[@id='watchlistTestId']//div[@data-type='container']") private List<WebElement>watchlist;
	@FindBy(xpath = "") private WebElement sel;
	public top20wachlist (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void settop20wachlist(WebDriver driver)
	{
		Actions act =new Actions(driver);
		for(int i=0;i<=watchlist.size()-1;i++)
		{
			watchlist.get(i).getText().replaceAll("[^a-zA-z]", "").contains("TATAMOTORS");
//			String company = watchlist.get(i).getText();
//			System.out.println(company);
		}
		
	}

}
