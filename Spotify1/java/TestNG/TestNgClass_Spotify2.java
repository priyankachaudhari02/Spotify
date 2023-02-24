package TestNG;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PomClass2.HomepageSpotify2;
import PomClass2.SpotifyPodcastPage;
import PomClass2.SpotifyTrueCrimePage;
import PomClass2.SpotifyYourLibrary;
import Pom_Class.HompageSpotify;
import Pom_Class.LogOut_Header;
import Pom_Class.LoginSpotify;
import Pom_Class.SpotifyArtistPage;
import Pom_Class.SpotifySearch;
import Pom_Class.SpotifyWebPlayer;
import utils.UtilityClass;

public class TestNgClass_Spotify2 {
	
	
	  WebDriver driver ;
      
      SpotifyWebPlayer spotifyWebPlayer;
      LoginSpotify loginSpotify ;
      
      
      HomepageSpotify2 hompageSpotify2;
      SpotifyYourLibrary spotifyYourLibrary ;
      SpotifyPodcastPage spotifyPodcastPage;
      SpotifyTrueCrimePage spotifyTrueCrimePage;
      
      
      private String testID;

      @BeforeSuite
		public void beforeSuite()
		{
			System.out.println("Before Suite");
		}

		 @Parameters ("browser")
         @BeforeTest
		
        	public void launchTheBrowser(String browserName)
            {
        	  System.out.println(browserName);
        	if(browserName.equals("Chrome"))
			{
				 System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
				 driver = new ChromeDriver();
			}
        	
            if(browserName.equals("Firefox"))
        	{
        		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
				 driver = new FirefoxDriver();
			}
        	
//        	if(browserName.equals("Edge"))
//	        	{
//	        		System.setProperty("webdriver.Edge.driver", "D:\\Selenium\\msedgedriver.exe");
//				      driver = new EdgeDriver();
//				}
//				
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			   
				 System.out.println("Before Test");
		}

      
		@BeforeClass
		public void createPOMObjects()
		{
			 
			 
			  spotifyWebPlayer = new SpotifyWebPlayer(driver); 
			  loginSpotify = new LoginSpotify(driver);
			 
			  
			  hompageSpotify2 = new HomepageSpotify2(driver);
			  spotifyYourLibrary = new SpotifyYourLibrary(driver);
			   spotifyPodcastPage = new SpotifyPodcastPage(driver);
			   spotifyTrueCrimePage = new SpotifyTrueCrimePage(driver);
			  
			   System.out.println("Before class");
		}
		
		@BeforeMethod
		public void GoToLoginPage()
		{
			
			    driver.get("https://www.spotify.com/");
		      
		      // spotifyWebPlayer = new SpotifyWebPlayer(driver);     
		      
		       spotifyWebPlayer.clickOnLoginButton();
		     
		      // loginSpotify = new LoginSpotify(driver);
		       loginSpotify.sendEmailAddrOrUsername();
		       loginSpotify.sendPassword();
		       loginSpotify.clickOnRememberCheckbox();
		       loginSpotify.clickOnLoginButton();
		       
		      
		       
		       
		      			      
			System.out.println("Before method");
		}
		
		
		@Test (priority = 1)
		public void verifyListenPodcast() throws InterruptedException
		{
			   testID = "TC1023" ;
			   
			   
			  //HomepageSpotify2 hompageSpotify2 = new HomepageSpotify2(driver);
		      hompageSpotify2.clickOnYourLibrary();
		      
		     // SpotifyYourLibrary spotifyYourLibrary = new SpotifyYourLibrary(driver);
		      spotifyYourLibrary.clickOnPodcastsClick();
		      Thread.sleep(5000);
		      spotifyYourLibrary.clickOnFindPodcast();
		      
		      //SpotifyPodcastPage spotifyPodcastPage = new SpotifyPodcastPage(driver);
		      
		      JavascriptExecutor js1 = (JavascriptExecutor)driver;
		      js1.executeScript("window.scrollBy(0, 1000)");
			  
		      Thread.sleep(3000);
		      spotifyPodcastPage.getTextOfCategories();
		      
		      spotifyPodcastPage.clickOnCrimeAndThrillerClicK();
		      
		   //   SpotifyTrueCrimePage spotifyTrueCrimePage = new SpotifyTrueCrimePage(driver);
		      spotifyTrueCrimePage.clickOnSelectPodcast();
		      
		    
		      Thread.sleep(5000);
		      spotifyTrueCrimePage.clickOnPlayPodcastEp();
			
		} 
		
		@AfterMethod
		public void goToLogOut(ITestResult result) throws InterruptedException, IOException
		{
			  Thread.sleep(7000);
		      LogOut_Header logOut_Header = new LogOut_Header(driver);
		      logOut_Header.clickOngoToButton();
		      logOut_Header.clickOnLogOut();
		      
		      if(ITestResult.FAILURE == result.getStatus())
		      {
		    	  UtilityClass.captureScreenShots(testID, driver);
		      }
		      
			System.out.println("After method");
		}
		
		
		@AfterClass
		public void clearPOMObjects()
		{
			spotifyWebPlayer = null ;
			loginSpotify = null; 
			
		    
		    hompageSpotify2 = null;
		    spotifyYourLibrary = null;
		    spotifyPodcastPage = null;
		    spotifyTrueCrimePage = null;
		      
			 
			System.out.println("After class");
		}
		
		@AfterTest
		public void closeBrowser()
		{
			driver.close();
			
			driver = null;
			System.out.println("After Test");
			
			System.gc();
		}
		
		@AfterSuite
		public void afterSuite()
		{
			System.out.println("After Suite");
		}

	
	

}
