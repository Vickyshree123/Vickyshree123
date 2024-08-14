package webElementMethod;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethod {

	public static void main(String[] args) throws  InterruptedException  {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[contains(@id,'u_0_b_Ao')]")).sendKeys("Velocity");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[contains(@id,'u_0_b_Ao')]")).sendKeys("class");
		driver.findElement(By.xpath("//input[contains(@id,'u_0_b_Ao')]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath(null)).click();
		
		String myText=driver.findElement(By.xpath("")).getText();
		System.out.println(myText);
		
	
	}

}
