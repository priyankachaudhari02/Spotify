package test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pom_Class.HompageSpotify;
import Pom_Class.LogOut_Header;
import Pom_Class.LoginSpotify;
import Pom_Class.SpotifyArtistPage;
import Pom_Class.SpotifySearch;
import Pom_Class.SpotifyWebPlayer;

public class TestClass_Spotify {
	
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
      
      HompageSpotify hompageSpotify = new HompageSpotify(driverTest);
      hompageSpotify.clickOnSearchClick();
      
      SpotifySearch spotifySearch = new SpotifySearch(driverTest);
      
      spotifySearch.sendSearchInput();
    //  Thread.sleep(3000);
      spotifySearch.clickOnBtsPlaylist();
      
      SpotifyArtistPage spotifyArtistPage = new SpotifyArtistPage(driverTest);
      
     // spotifyArtistPage.clickOnSaveToLibrary();
      spotifyArtistPage.clickOnFirstSong();
      
      Thread.sleep(7000);
      LogOut_Header logOut_Header = new LogOut_Header(driverTest);
      logOut_Header.clickOngoToButton();
      logOut_Header.clickOnLogOut();
      
      
      
      
      
      
      
      
      
      
      

}}
