package com.indium.uber.qa.listners;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.indium.uber.qa.base.BaseClass;
import com.indium.uber.qa.utils.ExtentReportUtil;
import com.indium.uber.qa.utils.ScreenshotUtil;

public class mylistener implements ITestListener
{
	ExtentReports Exreport;
	ExtentTest extenttest;
	@Override
	public void onStart(ITestContext context)
	{
		Exreport =ExtentReportUtil.generateEreport();
		System.out.println(" start execution");
	}
	
	@Override
	public void onTestStart(ITestResult result) 
	{
		String Testname = result.getName();
	   // extenttest = Exreport.createTest(Testname);
	    //extenttest.log(Status.INFO, Testname+"test is start executing");
		
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
		String Testname = result.getName();
	    extenttest = Exreport.createTest(Testname);
	    extenttest.log(Status.PASS, Testname+" test is succesfully executed");
	}
	
	@Override
	public void onTestFailure(ITestResult result) 
	{ 
	    try {
	    	String Testname = result.getName();
	    	extenttest =	Exreport.createTest(Testname);
	    	
	    	//getting log on failure
	    	extenttest.log(Status.FAIL, Testname+"test is failed");
	    	
	    	//getting screenshot on failure
			File EScreenShot = ScreenshotUtil.GetScreenshot(BaseClass.driver,Testname);
			String path = EScreenShot.getAbsolutePath();
			extenttest.addScreenCaptureFromPath(path);		
			
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
	       
	}
	
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		String Testname = result.getName();
	    extenttest =Exreport.createTest(Testname);
	    extenttest.log(Status.SKIP, Testname+"test is skipped");
	}
	
	@Override
	public void onFinish(ITestContext context)
	{
		System.out.println("Test Execution completed");
		 if (Exreport != null) 
		 {
	            Exreport.flush();
	      }
	}

}
