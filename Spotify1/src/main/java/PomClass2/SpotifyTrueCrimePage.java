package PomClass2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpotifyTrueCrimePage {
	
				//Variable : WebElement
				
				@FindBy (xpath = "(//div[@class='LunqxlFIupJw_Dkx6mNx'])[2]")
				private WebElement selectPodcast ;
			
				@FindBy (xpath = "(//button[@data-testid='play-button'])[2]")
				private WebElement playPodcastEp ;
				
				//Constructor
				
				private WebDriver driver ;
				
				public SpotifyTrueCrimePage(WebDriver driver)
				{
					PageFactory.initElements(driver, this);
					this.driver = driver;
				}
				
				//Methods
				
				public void clickOnSelectPodcast()
				{
				      selectPodcast.click();
				
				}
				
				public void clickOnPlayPodcastEp() throws InterruptedException
				{
					  Actions act = new Actions(driver);
					  act.moveToElement(playPodcastEp).perform();
				     
				       Thread.sleep(3000);
				       act.click().perform();
				      
	      
             	}
	


}
