package coverFoxUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxAddressDetailsPage {

	@FindBy(className = "mp-input-text")private WebElement pincodeField;
	@FindBy(id="want-expert")private WebElement mobNumberField;
	@FindBy(className="next-btn")private WebElement continueButton;
	
	public CoverFoxAddressDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterPinCode()
	{
		pincodeField.sendKeys("413106");
	}
	public void enterMobileNumber()
	{
		mobNumberField.sendKeys("9975596396");
	}
	public void clickOnNextButton()
	{
		continueButton.click();
	}
	
	
}
