package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	Thread.sleep(1000);
	
	driver.switchTo().frame("iframe-name");
		
		
		
		WebElement myText=driver.findElement(By.xpath("//strong[text()=' Learn Earn & Shine']"));
		
		String result = myText.getText();
		
		System.out.println(result);
		
		
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("checkBoxOption2"));
		

	}
	
	

}
