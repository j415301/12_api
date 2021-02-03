package com.api.controller;

import java.util.StringTokenizer;

public class StringApi {
	
	public static void main(String[] args) {
		//문자열 처리에 대해 알아보자
		//String 클래스는 불변이다!
		String str = "유병승";
		System.out.println(str.hashCode());
		str+=" 19살";
		System.out.println(str);
		System.out.println(str.hashCode());//위의 주소와 다름
		
		
		//String 활용 주요 메소드
		//1. concat() : 문자열을 결합하고 반환하는 메소드
		String result = str.concat(" 선생님");
		//String은 불변이기 때문에 새로운 변수를 선언해서 받아줘야 함
		System.out.println(result+" "+str);
		
		//2. contains() : 문자열 안에 포함된 문구, 문자를 찾아주는 메소드
		//매개변수에 있는 문자가 있으면 true, 없으면 false 반환
		System.out.println(result.contains("19"));//true
		System.out.println(result.contains("180.5"));//false
		if (result.contains("선생")) {
			System.out.println("그는 선생이다.");
		}
		
		//3. indexOf() : (앞에서부터) 매개변수와 일치하는 문자의 인덱스 번호 반환
		result = "안녕하세요";
		System.out.println(result.indexOf("하"));
		//매개변수 두 개도 가능함 -> 문자, 시작 인덱스번호
		result = "aabcde";
		System.out.println(result.indexOf("a"));//0
		System.out.println(result.indexOf("a",1));//1
		
		//4. lastIndexOf() : (뒤에서부터) 매개변수와 일치하는 문자의 인덱스 번호 반환 (<->indexOf)
		result = "avdesdfab";
		System.out.println(result.indexOf("a"));//0
		System.out.println(result.lastIndexOf("a"));//7
		
		//5. replace(교체대상, 교체할 문구) : 문자열을 교체하는 것 (원본(result)은 변경되지 않음)
		result = "나를 나를 좋아해";
		System.out.println(result.replace("나를", "너를"));//너를 너를 좋아해
		System.out.println(result);//나를 나를 좋아해
		//replaceFirst()
		System.out.println(result.replaceFirst("나를", "너를"));//너를 나를 좋아해
		
		//6. split() : 문자열이 특정 구분자로 구분되어 있을 때 그 문자열을 배열로 변경해줌
		//운동,등산,독서,게임 -> ','를 기준으로 배열로 변환
		result = "운동,등산,독서,게임";
		String[] hobby = result.split(",");
		for (String h : hobby) {
			System.out.println(h);
		}
		
		//7. join() : static메소드, 배열을 특정 구분자로 한개 문자열로 합쳐줌 (<-> split)
		//static메소드: 객체 생성 없이 그냥 접근연산자로 접근해 사용 가능
		String JoinResult = String.join(",", hobby);
		System.out.println(JoinResult);
		
		//8. substring() : 특정 지역(인덱스 범위)의 문자를 잘라내는 기능
		result = "여러분 오늘 힘냅시다!";
		System.out.println(result.substring(7));//힘냅시다!
		System.out.println(result.substring(result.indexOf("힘")));//힘냅시다!
		System.out.println(result.substring(4, 6));//오늘
		System.out.println(result.substring(result.indexOf("오"), result.lastIndexOf(" ")));//오늘
		//=System.out.println(result.substring(result.indexOf("오"), result.IndexOf("늘")+1));
		System.out.println(result.substring(0, 3).concat(result.substring(7)));//여러분힘냅시다!
		
		//9. toUpperCase() / toLowerCase() : 영문자 변환(대문자<->소문자)
		result = "AAbbCCdd";
		System.out.println(result.toUpperCase());//AABBCCDD
		System.out.println(result.toLowerCase());//aabbccdd
		
		//10. trim() : 공백(띄어쓰기) 제거(글자 사이 띄어쓰기는 제거하지 않음)
		result = "           띄어쓰기          ";
		System.out.println(result);//           띄어쓰기          
		System.out.println(result.trim());//띄어쓰기
		String result2 = "김     띄어쓰기           ";
		System.out.println(result2);//김     띄어쓰기           
		System.out.println(result2.trim());//김     띄어쓰기
		System.out.println(result.replace(" ", ""));//띄어쓰기//왜 김이 사라지쥬?
		
		
		//11. ValueOf() : static메소드, 다른 자료형을 String으로 형변환 하기
		int age = 19;
		//(String)age;//error: 기본 자료형을 참조형 자료형으로 강제 형변환 불가능
		String strAge = String.valueOf(age);
		System.out.println(strAge);//19
		boolean flag = true;
		String strboolean = String.valueOf(flag);
		System.out.println(strboolean);//true
		
		
		
		//StringBuffer클래스 이용하기
		//문자열을 저장하는 클래스 -> 가변, 저장소(원본)에 있는 데이터 수정 가능
		//객체이므로 new 연산자로 생성해서 관리 (String은 예외적으로 자료형처럼 쓸 수 있던 것)
		//데이터를 보관하는 변수에 접근이 안됨 -> StringBuffer가 제공하는 메소드를 통해 값 변경
		StringBuffer sb = new StringBuffer("이제 곧 점심시간");
		System.out.println(sb);//이제 곧 점심시간(toString Override 처리 되어 있음)
		System.out.println(sb.hashCode());
		
		//1. 원본 문자열을 수정, 삭제, 추가
		//append() : 추가
		sb.append("점심 잘 먹었나요?");
		System.out.println(sb);//이제 곧 점심시간점심 잘 먹었나요?
		System.out.println(sb.hashCode());//위 hash와 주소 동일
		//insert() : 문자열 중간에 삽입
		sb.insert(sb.indexOf("잘")+1, "못");
		System.out.println(sb);//이제 곧 점심시간점심 잘못 먹었나요?
		//delete() : 문자열 삭제
		sb.delete(0, 4);
		System.out.println(sb);// 점심시간점심 잘못 먹었나요?
		//reverse() : 문자열을 거꾸로
		sb.reverse();
		System.out.println(sb);//?요나었먹 못잘 심점간시심점 
		//setCharAt() : 수정
		sb.setCharAt(0, '안');//char인 것을 기억해라!
		System.out.println(sb);//안요나었먹 못잘 심점간시심점 
		
		//StringBuffer -> String
		//sb.contains("안녕");//안됨
		String change = new String(sb);
		//=String change = sb.toString();
		change.contains("안녕");
		
		
		
		//StringTokenizer클래스 활용하기
		//특정 구분자로 구분되어 있는 문자열을 배열과 비슷한 방식으로 변경해서 출력하는 클래스
		String lang = "java,oracle,html/css,javascript,jquery";
		StringTokenizer st = new StringTokenizer(lang,",/");//여러 개의 구분자로 구분 가능
		/*
		System.out.println(st.nextToken());//java//nextToken: 최상단 출력 후 삭제
		System.out.println(st.nextToken());//oracle
		System.out.println(st.nextToken());//html/css
		System.out.println(st.nextToken());//javascript
		System.out.println(st.nextToken());//jquery
		//System.out.println(st.nextToken());//error: NoSuchElementException
		*/
		while(st.hasMoreTokens()) {//hasMoreToken: 토큰 있니?
			System.out.println(st.nextToken());
		}
		/*
		while(st.hasMoreTokens()) {//hasMoreToken: 토큰 있니?
			System.out.println(st.nextToken());
			System.out.println(st.nextToken());
		}//error: token은 5갠데 2개씩 3번 도니까 NoSuchElementException 에러 남
		*/
	}

}
