package commonMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

import net.bytebuddy.asm.Advice.Argument;

public class Utility {
	         //excelData
			//screenshort
			//click
			//scroll
			//wait-->implicit
	public static void scrollIntoViwe(WebDriver driver,WebElement element) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoViwe(true)",element);
	
	}
	public static void takeScreenShot(WebDriver driver,String fileName) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\dhanshri-Data"+fileName+"png");
		FileHandler.copy(src, dest);
	}
	
	public static String readDataFromExcel(String filePath,String sheetName,int rowNum,int cellNum) throws EncryptedDocumentException, IOException
	{
	
	FileInputStream myFile = new FileInputStream(filePath);
	 String value = WorkbookFactory.create(myFile).getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
	return value;

	}
	public static void clickOnElement(WebDriver driver,WebElement element)
	{
		scrollIntoViwe(driver, element);
		
	}
	public static String readDataFromProertyFile(String Key) throws IOException
    {
	 String filePath = System.getProperty("user.dir")+"//FBData.properties";
	 FileInputStream myfile=new FileInputStream(filePath);	
	 Properties prop=new Properties();
    	prop.load(myfile);
    	String value = prop.getProperty(Key);
    	Reporter.log("Reading data from Property file",true);
    	return value;
    }
	}
