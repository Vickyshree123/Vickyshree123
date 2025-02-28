package coverFoxUsingPOM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxResultPage {

	
	@FindBy(xpath="//div[contains(text(),'Insurance Plans')]") private WebElement resultText;;
	@FindBy(className="plan-card-container") private List<WebElement> banners;
	
	public  CoverFoxResultPage(  WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void validateBanners()
	{
		
		String[] ar=resultText.getText().split(" ");
		int result=Integer.parseInt(ar[0]);
		
		
		if(result==banners.size())
		{
			System.out.println("Test case Passed");
		}
		else
		{
			System.out.println("Test Case Failed");
		}
		
		
	}
}
