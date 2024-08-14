package sliniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliciteWaitEg {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("\"https://www.discoveryplus.in/home");
		
		 WebDriverWait w = new WebDriverWait(driver, Duration.ofMillis(15000));
		 w.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
		 
		 driver.findElement(By.xpath("")).click();
		
		
		
		
	}

}
