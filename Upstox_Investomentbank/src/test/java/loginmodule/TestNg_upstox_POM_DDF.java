package loginmodule;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import WatchlistUpstox.top20wachlist;
import upstxlibrary.upstoxbaseclass;
import upstxlibrary.upstoxutilityclass;
import upstxlogin.upstoxlogin1page;
import upstxlogin.upstoxlogin2page;
import upstxlogin.upstoxlogin3page;
import upstxlogin.upstoxlogoutpage;

public class TestNg_upstox_POM_DDF extends upstoxbaseclass {
	Actions act;
	Sheet sh;
	upstoxlogin1page obj1;
	upstoxlogin2page obj2;
	upstoxlogin3page obj4;
	upstoxlogoutpage obj5;
	top20wachlist obj6;
	
	int testid;

	@BeforeClass
	public void TC1() {
		browseropen();
	}

	@BeforeMethod
	public void TC2() {
		obj1 = new upstoxlogin1page(driver);
		obj2 = new upstoxlogin2page(driver);
		obj4 = new upstoxlogin3page(driver);
		obj5 = new upstoxlogoutpage(driver);
		obj6=new top20wachlist(driver);

	}

	@Test(priority = 1)
	public void TC3() throws EncryptedDocumentException, IOException {
		testid = 300;
		obj1.setupstoxlogin1pageuserid(upstoxutilityclass.getdatafromproperties("un"));
		obj1.setupstoxlogin1pagepassword(upstoxutilityclass.getdatafromproperties("pwd"));
		obj1.setupstoxlogin1pageclickbtn();
		obj2.setupstoxlogin2pagepin(upstoxutilityclass.getdatafromproperties("pin"));
		obj4.goodclick();
//		obj5.setupstoxlogoutpage(driver);
//		obj6=new upstoxlogoutpage(driver);
	}
	@Test(priority = 2)
	public void TC4()
	{
		obj6.settop20wachlist(driver);
	}

	@Test(priority = 3)
	public void TC5(WebDriver driver) {
		WebElement logbtn = driver.findElement(By.xpath("//div[@data-id='accountDropDown']/div"));
		WebElement logout = driver.findElement(By.xpath("//div[text()='Logout']"));
		act = new Actions(driver);

		act.moveToElement(logbtn).click().build().perform();

//		obj6.setupstoxlogoutpage(driver);

//		upstoxutilityclass.sel.
	}

	@AfterMethod
	public void TC10(ITestResult result) throws IOException {
		if (result.getStatus() == result.FAILURE) {
			upstoxutilityclass.screenshotimg(driver, testid);
		}
	}

	@AfterClass
	public void TC11() {
//		driver.close();
		obj1 = null;
		obj2 = null;
		obj4 = null;
		sh = null;

	}

}
