package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@id='opentab']")).click();
		Thread.sleep(1000);
		
		//driver.close();
		//driver.quit();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		
		driver.navigate().to("https://www.redbus.in/");
		
		
		

	}
	

}
