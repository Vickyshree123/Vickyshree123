package SceenShort;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShorteg1 {

	public static void main(String[] args) throws IOException {
	
		
		
		WebDriver driver =new ChromeDriver();
;
		driver.manage().window().maximize();
		
		driver.get("https://www.swiggy.com/");
		
		File destination=new File("C:\\SeliniumScreenshort\\hi\\Test4.png");
		
		String random =RandomString.make(3);
		
		File destination1 = new File("C:\\SeliniumScreenshort\\hi"+random+".png");
		FileHandler.copy(destination, destination1);

	}

}
