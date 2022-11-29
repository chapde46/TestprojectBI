package upstxlibrary;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class upstoxbaseclass 
{
	public WebDriver driver;
	
	public void browseropen()
	{
  		System.setProperty("webdriver.chrome.driver", "C:\\Users\\selenium\\chromedriver.exe");
  		driver=new ChromeDriver();
		driver.get("https://login-v2.upstox.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


	}

}
