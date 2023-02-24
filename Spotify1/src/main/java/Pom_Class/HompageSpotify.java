package Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HompageSpotify {
	
			@FindBy (xpath = " (//li[@class='eNs6P3JYpf2LScgTDHc6 InvalidDropTarget'])[2]")
			private WebElement searchClick;
			
			public HompageSpotify(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			//Methods
			
			public void clickOnSearchClick()
			{
				searchClick.click();
			}


}
