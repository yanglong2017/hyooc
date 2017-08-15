package com.hyooc.base;

import java.util.Calendar;
import java.util.Date;

public class DateDiffTest {
	
	
	public static void main(String[] args) {
		Date date0 = new Date("2016/12/30");
		Date date1 = new Date("2017/1/12");
		Calendar cal = Calendar.getInstance(); 
		cal.setTime(date0);
		long t1 = cal.getTimeInMillis();
		cal.setTime(date1);
		long t2 = cal.getTimeInMillis();
		
		long diff = (t2-t1)/(1000*3600*24);
		System.out.println(diff);
	}

}
