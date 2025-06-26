package com.indium.uber.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass 
{
	
	public static WebDriver driver;
	public WebDriver getbrowser(String bname)
	{
		if (bname.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();	
		}
		if (bname.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
		}
		if (bname.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();	
		}
		return driver;
		
	}
	
	
	
	

}
