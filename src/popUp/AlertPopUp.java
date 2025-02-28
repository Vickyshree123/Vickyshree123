package popUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(1000);
		driver.findElement(By.name("cusid")).sendKeys("1234");
		driver.findElement(By.cssSelector("//input[name=submit]")).click();
		//need to switch selinium focus from main page to alert popup
		Thread.sleep(1000);
		Alert alt = driver.switchTo().alert();//accept().dismiss().getTExt();
		//alt.dismiss();//clicked on cancle button of alert popup
		alt.accept();
		System.out.println(alt.getText());
		Thread.sleep(2000);
		//there is more popup once we click on ok button,
		//we need to handle newly arrived popup
		//alert alt1=driver.switchto().alert();
		alt.accept();
		String myText=driver.findElement(By.className("barone")).getText();
		System.out.println(myText);
	}

}
