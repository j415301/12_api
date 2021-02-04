package com.api.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTestp {
	
	public static void main(String[] args) {
		
		Date today = new Date();
		System.out.println(today);
		
		System.out.println(today.getTime());
		Date day = new Date(12345632456L);
		System.out.println(day);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분 ss초");
		String dayStr = sdf.format(day);
		System.out.println(dayStr);
		
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)+1);
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.AM_PM));
		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.MINUTE));
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int date = c.get(Calendar.DATE);
		int hour = c.get(Calendar.HOUR);
		int min = c.get(Calendar.MINUTE);
		int sec = c.get(Calendar.SECOND);
		System.out.println(year+"년 "+month+"월 "+date+"일 "+hour+"시 "+min+"분 "+sec+
				"초");
		
		c.getTimeInMillis();
		day = new Date(c.getTimeInMillis());
		System.out.println(sdf.format(day));
		
		c.set(1993, 7-1, 10);
		printDate(c);
		c.set(Calendar.YEAR, 1996);
		printDate(c);
		
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc);
		printDate(gc);
		gc = new GregorianCalendar(1996,8-1,4,5,24,24);
		printDate(gc);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf2.format(new Date(gc.getTimeInMillis())));
	}
	
	public static void printDate(Calendar c) {
		int year=c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int date = c.get(Calendar.DATE);
		int hour = c.get(Calendar.HOUR);
		int min = c.get(Calendar.MINUTE);
		int sec = c.get(Calendar.SECOND);
		System.out.println(year+"년 "+month+"월 "+date+"일 "+hour+"시 "+min+"분 "+sec+
				"초");
	}

}
