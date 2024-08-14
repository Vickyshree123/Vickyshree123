package readPropertiesFile;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import commonMethod.Utility;

public class FBSingUpUsingProprties {
  @Test
  public void f() throws IOException, InterruptedException {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  String url = Utility.readDataFromProertyFile("url");
		driver.get(url);
		driver.findElement(By.name("firstname")).sendKeys(Utility.readDataFromProertyFile("firstName"));
		driver.findElement(By.name("lastname")).sendKeys(Utility.readDataFromProertyFile("lastName"));
		driver.findElement(By.name("reg_email__")).sendKeys(Utility.readDataFromProertyFile("mobNum"));
		Thread.sleep(2000);
  }
  
}
