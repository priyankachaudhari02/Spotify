package Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginSpotify {
	

	//Variable : WebElement
	
		@FindBy (xpath = "//input[@id='login-username'] ")
		private WebElement emailAddrOrUsername;
		
		@FindBy (xpath = "//input[@type='password']")
		private WebElement password;
			
		@FindBy (xpath = "//span[@class='Indicator-sc-1airx73-0 kHTWAk']")
		private WebElement rememberMeCheckbox;

		@FindBy (xpath = " //button[@id='login-button']")
		private WebElement loginButton;
		
		//Constructor
		
		public LoginSpotify(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//Methods
		
		public void sendEmailAddrOrUsername()
		{
			emailAddrOrUsername.clear();
			emailAddrOrUsername.sendKeys("priyankachaudhari0717@gmail.com");
			//emailAddrOrUsername.clear();
		}
         
		public void sendPassword()
		{
			 password.sendKeys("priyanka@02");		
	     
		}
         
		
		public void clickOnRememberCheckbox()
		{
			rememberMeCheckbox.click();
			boolean result = rememberMeCheckbox.isSelected();
		      System.out.println(result);
		      
		      if(result== false)// condition true
		      {  
		    	  System.out.println("Element is not selected");
		    	  rememberMeCheckbox.click();
		    	  
		      }
		      else
		      {
		    	  System.out.println("Element is Deselected");
		      }
		}

		public void clickOnLoginButton()
		{
			loginButton.click();
		}
		
	
}
