package PomClass2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepageSpotify2 {
	

	@FindBy (xpath = " //span[text()='Your Library']")
	private WebElement yourLibraryClick;
	
	
	//constructor
	public HomepageSpotify2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Methods
	
	
	public void clickOnYourLibrary()
	{
		yourLibraryClick.click();
	}

}
