package com.indium.uber.qa.tests;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.indium.uber.qa.base.BaseClass;
import com.indium.uber.qa.pages.homePage;
import com.indium.uber.qa.utils.PropertiesUtil;

public class HomePageHeadingsTest extends BaseClass
{
WebDriver driver;
	
	String Testpath ="/src/main/java/com/indium/uber/qa/config/testconfig.properties";
	String headingtext ="Go anywhere with Uber";
	String WayOfRidingheadingtext ="Suggestions";
	String Loginheadingtext ="Log in to see your recent activity";
	String PlanLaterheadingtext ="Plan for later";
	String scheduleRidesheadingtext ="Drive when you want, make what you need";
	String BusinessWithUberheadingtext ="The Uber you know, reimagined for business";
	String CarRentheadingtext ="Make money by renting out your car";
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
	public void Cheak_Heading() throws InterruptedException
	{ 
		homePage Hp = new homePage(driver);
		String Heading = Hp.getheadingtext();
		Assert.assertEquals(Heading, headingtext, "mainheading is not matched");
	}
	
	@Test
	public void get_ways_of_rides_headingtext()
	{
		homePage Hp = new homePage(driver);
		String Heading = Hp.getWayOfRidingheadingtext();
		Assert.assertEquals(Heading, WayOfRidingheadingtext, "heading is not matched");
	}
	@Test
	public void get_Login_headingtext()
	{
		homePage Hp = new homePage(driver);
		String Heading = Hp.getLoginheadingtext();
		Assert.assertEquals(Heading, Loginheadingtext, "heading is not matched");
	}
	
	
	@Test
	public void get_Plan_Later_headingtext()
	{
		homePage Hp = new homePage(driver);
		String Heading = Hp.getPlanLaterheadingtext();
		Assert.assertEquals(Heading, PlanLaterheadingtext, "heading is not matched");
	}
	
	@Test
	public void get_schedule_Rides_headingtext()
	{
		homePage Hp = new homePage(driver);
		String Heading = Hp.getscheduleRidesheadingtext();
		Assert.assertEquals(Heading, scheduleRidesheadingtext, "heading is not matched");
	}
	
	@Test
	public void get_Business_With_Uber_headingtext()
	{
		homePage Hp = new homePage(driver);
		String Heading = Hp.getBusinessWithUberheadingtext();
		Assert.assertEquals(Heading, BusinessWithUberheadingtext, "heading is not matched");
	}
	
	@Test
	public void get_Car_Rent_headingtext()
	{
		homePage Hp = new homePage(driver);
		String Heading = Hp.getCarRentheadingtext();
		Assert.assertEquals(Heading, CarRentheadingtext, " heading is not matched");
	}
	
	

	@AfterMethod
	public void teardown()
	{
		driver.close();
	}


}
