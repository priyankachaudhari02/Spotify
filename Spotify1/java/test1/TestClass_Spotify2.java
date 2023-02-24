package test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomClass2.HomepageSpotify2;
import PomClass2.SpotifyPodcastPage;
import PomClass2.SpotifyTrueCrimePage;
import PomClass2.SpotifyYourLibrary;
import Pom_Class.HompageSpotify;
import Pom_Class.LogOut_Header;
import Pom_Class.LoginSpotify;
import Pom_Class.SpotifyWebPlayer;

public class TestClass_Spotify2 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
	     
		  WebDriver driverTest = new ChromeDriver();
		 
		  driverTest.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     
		 driverTest.get("https://www.spotify.com/");
	      
		 
		 SpotifyWebPlayer spotifyWebPlayer = new SpotifyWebPlayer(driverTest);     
	      
	      spotifyWebPlayer.clickOnLoginButton();
	      
	      LoginSpotify loginSpotify = new LoginSpotify(driverTest);
	    
	     // Thread.sleep(3000);
	      loginSpotify.sendEmailAddrOrUsername();
	      loginSpotify.sendPassword();
	      loginSpotify.clickOnRememberCheckbox();
	      loginSpotify.clickOnLoginButton();
	      
	      HomepageSpotify2 hompageSpotify2 = new HomepageSpotify2(driverTest);
	      hompageSpotify2.clickOnYourLibrary();
	      
	      SpotifyYourLibrary spotifyYourLibrary = new SpotifyYourLibrary(driverTest);
	      spotifyYourLibrary.clickOnPodcastsClick();
	      Thread.sleep(5000);
	      spotifyYourLibrary.clickOnFindPodcast();
	      
	      SpotifyPodcastPage spotifyPodcastPage = new SpotifyPodcastPage(driverTest);
	      
	      JavascriptExecutor js1 = (JavascriptExecutor)driverTest;
	      js1.executeScript("window.scrollBy(0, 1000)");
		  Thread.sleep(3000);
	      spotifyPodcastPage.getTextOfCategories();
	      
	      spotifyPodcastPage.clickOnCrimeAndThrillerClicK();
	      
	      SpotifyTrueCrimePage spotifyTrueCrimePage = new SpotifyTrueCrimePage(driverTest);
	      spotifyTrueCrimePage.clickOnSelectPodcast();
	      spotifyTrueCrimePage.clickOnPlayPodcastEp();
	      
	      Thread.sleep(7000);
	      LogOut_Header logOut_Header = new LogOut_Header(driverTest);
	      logOut_Header.clickOngoToButton();
	      logOut_Header.clickOnLogOut();
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	}
}
