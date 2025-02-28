package pratice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CoverFoxTc {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		//click on gender 
		driver.findElement(By.xpath("//div[text()='Male']")).click();
		
		//click on next button of helth plan page
		driver.findElement(By.className("next-btn")).click();
		//helth -plan/member detials
		//handleing drop down 
		WebElement ageDropDown=driver.findElement(By.id("Age-You"));
		 Select s = new Select(ageDropDown);
		 s.selectByValue("26y");
		 //click on next button of heath-plan /memeber-details
		 driver.findElement(By.className("next-btn")).click();
		 
		 //address details
		// entering pin code
		 driver.findElement(By.className("mp-input-text")).sendKeys("411046");
		 //// entering mobile num
		 driver.findElement(By.id("want-expert")).sendKeys("9595323788");
		 //// click on next button of address-details
		 driver.findElement(By.className("next-btn")).click();
		 //// results/combined/ page
		// fetching text
		 Thread.sleep(3000);
		 String myText = driver.findElement(By.xpath("//div[contains(text(),'Insurance Plans')]")).getText();
		 
		 String[] ar = myText.split(" ");
		 String numberInString = ar[0];
		 int result = Integer.parseInt(numberInString);
		 System.out.println("matching number "+result);
		 List<WebElement> banners =

		 driver.findElements(By.xpath("//div[@class='plan-card-container']"));

		 int NumberOfBanners = banners.size();
		 System.out.println("Total banners "+NumberOfBanners);
		 if (result == NumberOfBanners) {
		 System.out.println("Result is matching TC is passed");
		 } else {
		 System.out.println("Result is not matching TC is failed");
	}

	}
	}

