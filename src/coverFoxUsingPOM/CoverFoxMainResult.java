package coverFoxUsingPOM;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CoverFoxMainResult {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.coverfox.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		
		
		
		
		//create object of home page
		 CoverFoxHomePage homePage = new CoverFoxHomePage(driver);
		 homePage.clickOnGenderButton();
		 
		CoverFoxHelthPlanPage helthPlanPage = new CoverFoxHelthPlanPage(driver);
		helthPlanPage.clickOnNextButton();
		
		CoverFoxMemberDetailsPage memberDetailsPage = new CoverFoxMemberDetailsPage(driver);
		
		memberDetailsPage.helthAgeDropDown();
		memberDetailsPage.clickNextButton();
		
		CoverFoxAddressDetailsPage addressDetailsPage = new CoverFoxAddressDetailsPage(driver);
		addressDetailsPage.enterPinCode();
		addressDetailsPage.enterMobileNumber();
		addressDetailsPage.clickOnNextButton();
		
		Thread.sleep(2000);
		 CoverFoxResultPage resultPage = new CoverFoxResultPage( driver);
		resultPage.validateBanners();
		
		}

}
