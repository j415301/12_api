package com.api.controller;

public class WrapperTest {
	
	public static void main(String[] args) {
		int age = 19;
		Integer ageObj = age;//autoboxing: 기본 자료형을 객체화
		age = ageObj;//autounboxing: 객체를 기본 자료형으로 변경
		test(age);//Object obj = age; //true
		System.out.println(Integer.MAX_VALUE);
		
		//문자를 숫자로 변경하는 것
		//age = (int)"3";//error
		age = Integer.parseInt("3");//web프로젝트 할 때 많이 사용할 것
		System.out.println(age);
		
		boolean flag = true;
		Boolean flagObj = flag;
		System.out.println(flagObj);
		test(flag);//false
		System.out.println(Boolean.parseBoolean("true"));
		
		double weight = 65.5;
		Double weightObj = weight;
		System.out.println(weightObj);
		weightObj = Double.parseDouble("180.5");
		System.out.println(weightObj);
	}
	
	public static void test(Object obj) {
		System.out.println(obj instanceof Integer);
	}

}
