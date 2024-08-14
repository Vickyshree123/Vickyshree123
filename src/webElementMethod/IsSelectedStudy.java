package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedStudy {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		WebElement radioButton =driver.findElement(By.cssSelector("input[value='radio1']"));
		radioButton.click();
		
		//System.out.println(radioButton.isSelected());
		if(radioButton.isSelected())
		{
			System.out.println("Radio button is already selected,Thank you");
		}
		else
		{
			radioButton.click();
			System.out.println("Radio button is already selected");
		}
		
		
	}

}
