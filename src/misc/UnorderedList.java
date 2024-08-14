package misc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderedList {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("Vlocity");
		Thread.sleep(100);
		
	 List<WebElement> results = driver.findElements(By.xpath(""));
		
		System.out.println(results.size());
		
		//for each
		
		for(WebElement r:results)
		{
			System.out.println(r.getText());
		}
	}

}
