package upstxlibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class upstoxutilityclass 
{
	static Actions act;
	static Select sel;

	public static String initialise(int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Shree\\Desktop\\Screenshot\\Student-Database.xlsx");
		  Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
		   String value = sh.getRow(row).getCell(cell).getStringCellValue();
		return value;
		
	}
	public static void screenshotimg(WebDriver driver,int testid) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File desti=new File("C:\\Users\\Shree\\eclipse-workspace\\selenium4\\screenshot\\testid"+testid+".jpg");
		FileHandler.copy(source, desti);
	}
	public static String getdatafromproperties(String key) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Shree\\eclipse-workspace\\selenium4\\upstoxfile.properties");
		
		Properties p=new Properties();
		p.load(file);
		String value = p.getProperty(key);
		return value;
		
	}
	
	

	public static  void perfomaction(WebDriver driver)
	{
		 act =new Actions(driver);
	
	}
	public static void selectbox(WebElement clickpt)
	{
		sel=new Select(clickpt);
	}
	

}
