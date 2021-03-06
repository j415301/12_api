package com.api.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTest {
	
	public static void main(String[] args) {
		//날자를 처리하는 Date클래스
		Date today = new Date();//오늘 날짜를 가져옴
		System.out.println(today);
		
		//날짜는 long 타입의 숫자로 표현됨
		System.out.println(today.getTime());//long타입의 날짜가 나옴
		Date day = new Date(1234578945123L);//date 매개변수에 long타입 값을 넣으면
		System.out.println(day);//날짜로 출력되어 나옴
		
		//날짜를 원하는 방식대로 출력하기
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분 ss초");
		String dayStr = sdf.format(day);
		System.out.println(dayStr);
		
		
		
		
		
		//Calender: 날짜를 출력해주는 클래스
		//자체생성이 불가능하게 설계되어 있음 = new 연산자를 통해 생성할 수 있음
		Calendar c = Calendar.getInstance();//getInstance: 오늘 날짜를 기준으로 나옴
		System.out.println(c);
		
		//날짜 출력하기
		//필드에 있는 값을 가져와서 출력
		//get메소드를 이용해서 가져옴
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)+1);//달력을 표시할 때 0부터 시작하므로 +1
		//출력하거나 값을 넣을 때 +1, -1값을 대입해서 처리
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.AM_PM));//0==오전, 1==오후
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
		
		c.getTimeInMillis();//날짜를 long 형태로 바꿔주는 메소드
		day = new Date(c.getTimeInMillis());
		System.out.println(sdf.format(day));
		
		//날짜를 변경해서 출력하기
		c.set(1993, 7-1,10);
		printDate(c);
		c.set(Calendar.YEAR, 1996);
		printDate(c);
		
		//Calender객체를 상속받아 사용 -> GregorianCalendar
		//생성자를 통해 생성할 수 있음
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc);
		printDate(gc);
		gc = new GregorianCalendar(1996,8-1,4);
		printDate(gc);
		
		//SimpleDateformat 이용
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
