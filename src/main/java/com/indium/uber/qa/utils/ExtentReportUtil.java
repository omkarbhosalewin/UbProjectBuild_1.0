package com.indium.uber.qa.utils;

import java.io.File;
import java.util.Properties;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportUtil 
{
	static String configpath ="/src/main/java/com/indium/uber/qa/config/reportconfig.properties" ;
	
	public static ExtentReports generateEreport()
	{
	
	File ERfile = new File(System.getProperty("user.dir")+"/test-output/UberExtentReport.html");
	ExtentSparkReporter Sreport = new ExtentSparkReporter(ERfile);
	
	Sreport.config().setDocumentTitle("UberExtentReport");
	Sreport.config().setReportName("UberTestReport");
	Sreport.config().setTheme(Theme.DARK);
	Sreport.config().setTimeStampFormat("dd/MM/yyyy hh:mm:ss");
	
	ExtentReports Ereport = new ExtentReports();
	Ereport.attachReporter(Sreport);
	
    Properties reportprop = PropertiesUtil.GetPropertyFile(configpath);
	
	Ereport.setSystemInfo("Application URL", reportprop.getProperty("url"));
	Ereport.setSystemInfo("Operating System", reportprop.getProperty("OS"));
	Ereport.setSystemInfo("Browser", reportprop.getProperty("browser"));
	Ereport.setSystemInfo("tester username", reportprop.getProperty("username"));
	
	return Ereport;
	}

}
