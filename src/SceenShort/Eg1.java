package SceenShort;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Eg1 {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jio.com/selfcare/recharge/mobility/");
		
		File Myfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println(Myfile);
		
		String str=RandomString.make(3);
		
		File Destination = new File("C:\\SeliniumScreenshort\\Test1.png");
		FileHandler.copy(Myfile, Destination);

	}

}
