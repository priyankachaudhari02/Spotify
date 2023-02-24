package PomClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SpotifyYourLibrary {
	

	//Variable : WebElement
	
	@FindBy (xpath = "//span[text()='Podcasts'] ")
	private WebElement podcastsClick ;

	@FindBy (xpath = "//span[text()='Find podcasts']")
	private WebElement findPodcast ;
	
	//Constructor
	
	private WebDriver driver ;
	
	public SpotifyYourLibrary(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	//Methods
	
	public void clickOnPodcastsClick()
	{
		podcastsClick.click();
	}
	
	public void clickOnFindPodcast() throws InterruptedException
	{
		  Actions act1 = new Actions(driver);
	      act1.moveToElement(findPodcast).perform();
	      Thread.sleep(3000);
	      act1.click().build().perform();
		
	   	//findPodcast.click();
	   
	}
	

	

}
