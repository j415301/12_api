package com.api.controller;

import java.util.StringTokenizer;

public class StringApi {
	
	public static void main(String[] args) {
		//���ڿ� ó���� ���� �˾ƺ���
		//String Ŭ������ �Һ��̴�!
		String str = "������";
		System.out.println(str.hashCode());
		str+=" 19��";
		System.out.println(str);
		System.out.println(str.hashCode());//���� �ּҿ� �ٸ�
		
		
		//String Ȱ�� �ֿ� �޼ҵ�
		//1. concat() : ���ڿ��� �����ϰ� ��ȯ�ϴ� �޼ҵ�
		String result = str.concat(" ������");
		//String�� �Һ��̱� ������ ���ο� ������ �����ؼ� �޾���� ��
		System.out.println(result+" "+str);
		
		//2. contains() : ���ڿ� �ȿ� ���Ե� ����, ���ڸ� ã���ִ� �޼ҵ�
		//�Ű������� �ִ� ���ڰ� ������ true, ������ false ��ȯ
		System.out.println(result.contains("19"));//true
		System.out.println(result.contains("180.5"));//false
		if (result.contains("����")) {
			System.out.println("�״� �����̴�.");
		}
		
		//3. indexOf() : (�տ�������) �Ű������� ��ġ�ϴ� ������ �ε��� ��ȣ ��ȯ
		result = "�ȳ��ϼ���";
		System.out.println(result.indexOf("��"));
		//�Ű����� �� ���� ������ -> ����, ���� �ε�����ȣ
		result = "aabcde";
		System.out.println(result.indexOf("a"));//0
		System.out.println(result.indexOf("a",1));//1
		
		//4. lastIndexOf() : (�ڿ�������) �Ű������� ��ġ�ϴ� ������ �ε��� ��ȣ ��ȯ (<->indexOf)
		result = "avdesdfab";
		System.out.println(result.indexOf("a"));//0
		System.out.println(result.lastIndexOf("a"));//7
		
		//5. replace(��ü���, ��ü�� ����) : ���ڿ��� ��ü�ϴ� �� (����(result)�� ������� ����)
		result = "���� ���� ������";
		System.out.println(result.replace("����", "�ʸ�"));//�ʸ� �ʸ� ������
		System.out.println(result);//���� ���� ������
		//replaceFirst()
		System.out.println(result.replaceFirst("����", "�ʸ�"));//�ʸ� ���� ������
		
		//6. split() : ���ڿ��� Ư�� �����ڷ� ���еǾ� ���� �� �� ���ڿ��� �迭�� ��������
		//�,���,����,���� -> ','�� �������� �迭�� ��ȯ
		result = "�,���,����,����";
		String[] hobby = result.split(",");
		for (String h : hobby) {
			System.out.println(h);
		}
		
		//7. join() : static�޼ҵ�, �迭�� Ư�� �����ڷ� �Ѱ� ���ڿ��� ������ (<-> split)
		//static�޼ҵ�: ��ü ���� ���� �׳� ���ٿ����ڷ� ������ ��� ����
		String JoinResult = String.join(",", hobby);
		System.out.println(JoinResult);
		
		//8. substring() : Ư�� ����(�ε��� ����)�� ���ڸ� �߶󳻴� ���
		result = "������ ���� �����ô�!";
		System.out.println(result.substring(7));//�����ô�!
		System.out.println(result.substring(result.indexOf("��")));//�����ô�!
		System.out.println(result.substring(4, 6));//����
		System.out.println(result.substring(result.indexOf("��"), result.lastIndexOf(" ")));//����
		//=System.out.println(result.substring(result.indexOf("��"), result.IndexOf("��")+1));
		System.out.println(result.substring(0, 3).concat(result.substring(7)));//�����������ô�!
		
		//9. toUpperCase() / toLowerCase() : ������ ��ȯ(�빮��<->�ҹ���)
		result = "AAbbCCdd";
		System.out.println(result.toUpperCase());//AABBCCDD
		System.out.println(result.toLowerCase());//aabbccdd
		
		//10. trim() : ����(����) ����(���� ���� ����� �������� ����)
		result = "           ����          ";
		System.out.println(result);//           ����          
		System.out.println(result.trim());//����
		String result2 = "��     ����           ";
		System.out.println(result2);//��     ����           
		System.out.println(result2.trim());//��     ����
		System.out.println(result.replace(" ", ""));//����//�� ���� �������?
		
		
		//11. ValueOf() : static�޼ҵ�, �ٸ� �ڷ����� String���� ����ȯ �ϱ�
		int age = 19;
		//(String)age;//error: �⺻ �ڷ����� ������ �ڷ������� ���� ����ȯ �Ұ���
		String strAge = String.valueOf(age);
		System.out.println(strAge);//19
		boolean flag = true;
		String strboolean = String.valueOf(flag);
		System.out.println(strboolean);//true
		
		
		
		//StringBufferŬ���� �̿��ϱ�
		//���ڿ��� �����ϴ� Ŭ���� -> ����, �����(����)�� �ִ� ������ ���� ����
		//��ü�̹Ƿ� new �����ڷ� �����ؼ� ���� (String�� ���������� �ڷ���ó�� �� �� �ִ� ��)
		//�����͸� �����ϴ� ������ ������ �ȵ� -> StringBuffer�� �����ϴ� �޼ҵ带 ���� �� ����
		StringBuffer sb = new StringBuffer("���� �� ���ɽð�");
		System.out.println(sb);//���� �� ���ɽð�(toString Override ó�� �Ǿ� ����)
		System.out.println(sb.hashCode());
		
		//1. ���� ���ڿ��� ����, ����, �߰�
		//append() : �߰�
		sb.append("���� �� �Ծ�����?");
		System.out.println(sb);//���� �� ���ɽð����� �� �Ծ�����?
		System.out.println(sb.hashCode());//�� hash�� �ּ� ����
		//insert() : ���ڿ� �߰��� ����
		sb.insert(sb.indexOf("��")+1, "��");
		System.out.println(sb);//���� �� ���ɽð����� �߸� �Ծ�����?
		//delete() : ���ڿ� ����
		sb.delete(0, 4);
		System.out.println(sb);// ���ɽð����� �߸� �Ծ�����?
		//reverse() : ���ڿ��� �Ųٷ�
		sb.reverse();
		System.out.println(sb);//?�䳪���� ���� �������ý��� 
		//setCharAt() : ����
		sb.setCharAt(0, '��');//char�� ���� ����ض�!
		System.out.println(sb);//�ȿ䳪���� ���� �������ý��� 
		
		//StringBuffer -> String
		//sb.contains("�ȳ�");//�ȵ�
		String change = new String(sb);
		//=String change = sb.toString();
		change.contains("�ȳ�");
		
		
		
		//StringTokenizerŬ���� Ȱ���ϱ�
		//Ư�� �����ڷ� ���еǾ� �ִ� ���ڿ��� �迭�� ����� ������� �����ؼ� ����ϴ� Ŭ����
		String lang = "java,oracle,html/css,javascript,jquery";
		StringTokenizer st = new StringTokenizer(lang,",/");//���� ���� �����ڷ� ���� ����
		/*
		System.out.println(st.nextToken());//java//nextToken: �ֻ�� ��� �� ����
		System.out.println(st.nextToken());//oracle
		System.out.println(st.nextToken());//html/css
		System.out.println(st.nextToken());//javascript
		System.out.println(st.nextToken());//jquery
		//System.out.println(st.nextToken());//error: NoSuchElementException
		*/
		while(st.hasMoreTokens()) {//hasMoreToken: ��ū �ִ�?
			System.out.println(st.nextToken());
		}
		/*
		while(st.hasMoreTokens()) {//hasMoreToken: ��ū �ִ�?
			System.out.println(st.nextToken());
			System.out.println(st.nextToken());
		}//error: token�� 5���� 2���� 3�� ���ϱ� NoSuchElementException ���� ��
		*/
	}

}
