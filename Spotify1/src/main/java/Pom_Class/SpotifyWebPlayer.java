package Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpotifyWebPlayer {
	
	
			//Variable : WebElement
			
			@FindBy (xpath = "//span[text()='Log in'] ")
			private WebElement loginButton;
						
//			@FindBy (xpath = " //input[@data-testid='search-input'] ")
//			private WebElement searchInput ;
//			
//			@FindBy (xpath = "  (//section[@data-testid='component-shelf'])[1] ")
//			private WebElement btsPlaylist ;
			
			//Constructor
			
			public SpotifyWebPlayer(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			//Methods
			
			public void clickOnLoginButton()
			{
				loginButton.click();
			}
			
			
}
