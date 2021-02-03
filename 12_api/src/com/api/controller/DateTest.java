package com.api.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

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
	}

}
