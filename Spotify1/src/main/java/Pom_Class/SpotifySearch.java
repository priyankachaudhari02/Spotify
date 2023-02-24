package Pom_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SpotifySearch {
	

	//Variable : WebElement
	
	@FindBy (xpath = " //input[@data-testid='search-input'] ")
	private WebElement searchInput ;

	@FindBy (xpath = "  (//section[@data-testid='component-shelf'])[1] ")
	private WebElement btsPlaylist ;
	
	//Constructor
	
	private WebDriver driver ;
	
	public SpotifySearch(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	//Methods
	
	public void sendSearchInput()
	{
		searchInput.sendKeys("This is BTS");
	}
	
	public void clickOnBtsPlaylist()
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
	    WebElement btsPlaylist= wait.until(ExpectedConditions.elementToBeClickable
	    (By.xpath("(//section[@data-testid='component-shelf'])[1]")));
		    
		btsPlaylist.click();;
	}
	

	
	
	
	
	

}
