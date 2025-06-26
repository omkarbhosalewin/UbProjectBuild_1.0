package com.indium.uber.qa.utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtil 
{ 
	
	public static File GetScreenshot(WebDriver driver,String name) throws Throwable
	{
		
		File Src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String datestamp = DateStampUtil.GetDateStamp();
		String destPath = System.getProperty("user.dir")+"//ScreenShots//"+name+"__"+datestamp+".jpg";
		File dest = new File(destPath);
		try {
			FileHandler.copy(Src, dest);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return dest;		
	}

}
