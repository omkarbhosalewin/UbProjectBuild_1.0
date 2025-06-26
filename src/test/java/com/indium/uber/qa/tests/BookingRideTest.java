package com.indium.uber.qa.tests;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.indium.uber.qa.base.BaseClass;
import com.indium.uber.qa.utils.PropertiesUtil;

public class BookingRideTest extends BaseClass
{
	WebDriver driver;
	
	String Testpath ="/src/main/java/com/indium/uber/qa/config/testconfig.properties";
	@BeforeMethod
	public void start()
	{
		Properties testprop = PropertiesUtil.GetPropertyFile(Testpath);
		
		//WebDriver driver = new Chromedriver();
		driver = getbrowser(testprop.getProperty("browsername"));
		
		//driver.get(www.uber.com);
		driver.get(testprop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
	}
	
	@Test
	public void test1()
	{
		System.out.println("test1 run");
	}
	
	@Test
	public void test2()
	{
		Assert.fail();
	}
	

	@AfterMethod
	public void teardown()
	{
		driver.close();
	}

}
