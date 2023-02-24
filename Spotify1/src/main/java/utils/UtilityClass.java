package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.google.common.io.Files;

import okhttp3.internal.Util;

public class UtilityClass{

	
	public static void captureScreenShots( String s , WebDriver driver) throws IOException
	{
		
		    TakesScreenshot takess = (TakesScreenshot)driver;
	      
	         File source = takess.getScreenshotAs(OutputType.FILE);
	      
	       //  File destination = new File("C:\\New folder\\Screenshot.jpg");
	      
	         SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy HH mm ss");  
		      Date date = new Date();  
		      String dateTime =dateformat.format(date);
		      
	         FileHandler.copy(source, new File("D:\\Screenshot Folder\\TestSS"+ dateTime+".jpg"));
	      
	}
	
//	public static void getDataFromExcelSheet()
//	{
//		
//		
//		
//	}
}

