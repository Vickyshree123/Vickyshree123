package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdEnbled {

	private static char[] result;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
		Thread.sleep(2000);
		
		
		WebElement mobileNumberField=driver.findElement(By.xpath("//input[@id='Mobile Number']"));
		mobileNumberField.sendKeys("8888888888");
		
		WebElement getOtpButton=driver.findElement(By.xpath("//button[text()='Get OTP']"));
		
		//getotpButton.click();
		System.out.println(result);
		
	}

}
