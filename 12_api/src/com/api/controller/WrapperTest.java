package com.api.controller;

public class WrapperTest {
	
	public static void main(String[] args) {
		int age = 19;
		Integer ageObj = age;//autoboxing: �⺻ �ڷ����� ��üȭ
		age = ageObj;//autounboxing: ��ü�� �⺻ �ڷ������� ����
		test(age);//Object obj = age; //true
		System.out.println(Integer.MAX_VALUE);
		
		//���ڸ� ���ڷ� �����ϴ� ��
		//age = (int)"3";//error
		age = Integer.parseInt("3");//web������Ʈ �� �� ���� ����� ��
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
