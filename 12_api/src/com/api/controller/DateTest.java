package com.api.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	
	public static void main(String[] args) {
		//���ڸ� ó���ϴ� DateŬ����
		Date today = new Date();//���� ��¥�� ������
		System.out.println(today);
		
		//��¥�� long Ÿ���� ���ڷ� ǥ����
		System.out.println(today.getTime());//longŸ���� ��¥�� ����
		Date day = new Date(1234578945123L);//date �Ű������� longŸ�� ���� ������
		System.out.println(day);//��¥�� ��µǾ� ����
		
		//��¥�� ���ϴ� ��Ĵ�� ����ϱ�
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� hh�� mm�� ss��");
		String dayStr = sdf.format(day);
		System.out.println(dayStr);
	}

}
