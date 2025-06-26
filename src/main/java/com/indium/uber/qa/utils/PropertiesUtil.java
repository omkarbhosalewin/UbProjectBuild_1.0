package com.indium.uber.qa.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesUtil 
{ 
	
	public static Properties GetPropertyFile(String Path)
	{  
		Properties prop = new Properties();
		File file = new File(System.getProperty("user.dir")+ Path);
		try 
		{
		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);
		}
		catch(Throwable e)
		{
			e.printStackTrace();
		}
		return prop;
		
		
	}

	
}
