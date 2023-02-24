package Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpotifyArtistPage {
	
	//Variable : WebElement
	
//		@FindBy (xpath = " (//button[@aria-label='Remove from Your Library'])[1] ")
//		private WebElement saveToLibrary ;

		@FindBy (xpath = "(//div[@role='row'])[1]")
		private WebElement firstSongPlay ;
		
		@FindBy (xpath = "(//button[@class='RfidWIoz8FON2WhFoItU'])[1]")
		private WebElement clickSong ;
		
		//Constructor
		
		private WebDriver driver;
		
		public SpotifyArtistPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			this.driver = driver;
		}
		
		//Methods
		
//		public void clickOnSaveToLibrary()
//		{
//			boolean r = saveToLibrary.isSelected();
//			 System.out.println(r);
//			 if(r == false)
//			 {  
//				 System.out.println("Element is not selected");
//				 saveToLibrary.click();
//		     }
//			 else
//			 {
//				 System.out.println("Element is  Deselected");
//			 }
//		     
			
	//	}
		
		public void clickOnFirstSong()
		{
			//MouseAction
  		  
             Actions act = new Actions(driver);
			
		     act.moveToElement(firstSongPlay).perform();
			
		     act.moveToElement(clickSong).perform();
		     
		     act.click().perform();
			 
		}

		

}
