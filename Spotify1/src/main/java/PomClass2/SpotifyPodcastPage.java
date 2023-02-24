package PomClass2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpotifyPodcastPage {
	
	
			//Variable : WebElement
			
			@FindBy (xpath = "//a[text()='Categories']")
			private WebElement categories ;
		
			@FindBy (xpath = "//div[text()='Crime & Thriller']")
			private WebElement crimeAndThriller ;
			
			//Constructor
			
			private WebDriver driver ;
			
			public SpotifyPodcastPage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
				this.driver = driver;
			}
			
			//Methods
			
			public void getTextOfCategories()
			{
				 categories.getText();	
			
			}
			
			public void clickOnCrimeAndThrillerClicK() throws InterruptedException 
			{
				
				 JavascriptExecutor js =(JavascriptExecutor) driver;
		         js.executeScript("arguments[0].scrollIntoView(true)", crimeAndThriller);
		         Thread.sleep(3000);
		         crimeAndThriller.click();

		
	      }
	


}
