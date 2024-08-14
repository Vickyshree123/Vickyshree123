package SceenShort;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class DateTime {

	public static void main(String[] args) throws IOException {
		
		
		String timeStamp=new SimpleDateFormat("yyyyMMddHHmmss").format(new Date(0));

			System.out.println(timeStamp);
			
			WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.co.in/");		
	
  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  
  File dest=new File("C:\\SeliniumScreenshort\\Test.png");
  
  FileHandler.copy(src, dest);
	}

}
