package com.indium.uber.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage 
{
	WebDriver driver;
	public homePage(WebDriver driver)
	{
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[@class='container-inner css-fVLpfI']/descendant::h1")
	private WebElement heading;
	
	@FindBy(xpath="(//h2[@class='css-fXLKki'])[1]")
	private WebElement WayOfRidingheading;
	
	@FindBy(xpath="(//h2[@class='css-jmnQxd'])[1]")
	private WebElement Login;
	
	@FindBy(xpath="(//h1[@class='css-ksGtNz'])")
	private WebElement PlanLater;
	
	@FindBy(xpath="(//h2[@class='css-jmnQxd'])[2]")
	private WebElement scheduleRides;
	
	@FindBy(xpath="(//h2[@class='css-lgwuSa'])")
	private WebElement BusinessWithUber;
	
	@FindBy(xpath="(//h2[@class='css-jmnQxd'])[3]")
	private WebElement CarRent;

	
	public String getheadingtext()
	{
		String headingText = heading.getText();
		return headingText;
		
	}
	
	public String getWayOfRidingheadingtext()
	{
		String headingText = WayOfRidingheading.getText();
		return headingText;
		
	}
	public String getLoginheadingtext()
	{
		String headingText = Login.getText();
		return headingText;
	
	}
	
	public String getPlanLaterheadingtext()
	{
		String headingText = PlanLater.getText();
		return headingText;
		
	}
	
	public String getscheduleRidesheadingtext()
	{
		String headingText = scheduleRides.getText();
		return headingText;
		
	}
	
	public String getBusinessWithUberheadingtext()
	{
		String headingText = BusinessWithUber.getText();
		return headingText;
		
	}
	public String getCarRentheadingtext()
	{
		String headingText = CarRent.getText();
		return headingText;
		
	}
	
}
