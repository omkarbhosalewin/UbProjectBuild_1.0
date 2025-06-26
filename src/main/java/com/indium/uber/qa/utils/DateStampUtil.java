package com.indium.uber.qa.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateStampUtil 
{
	public static String GetDateStamp()
	{
		Date date = new Date();
		DateFormat d = new SimpleDateFormat("yyyyMMdd_hhmmss");
		String newdate=  d.format(date);
		
		return newdate;
	}

}
