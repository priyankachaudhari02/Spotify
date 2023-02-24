package Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut_Header {
	
			@FindBy (xpath = "(//button[@type='button'])[1]")
			private WebElement goToButton;
			
			@FindBy (xpath = "//span[text()='Log out']")
			private WebElement logOutClick;
			
			private WebDriver driver;
			
			public LogOut_Header(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
				this.driver=driver;
			}
			
			//Methods
			
			
			public void clickOngoToButton()
			{
				goToButton.click();
			}
			
			public void clickOnLogOut()
			{
				Actions act1 = new Actions(driver);
				act1.moveToElement(logOutClick).click().build().perform();
			}



}
