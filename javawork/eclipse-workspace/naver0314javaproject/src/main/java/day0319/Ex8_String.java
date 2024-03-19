package day0319;

import java.util.StringTokenizer;

public class Ex8_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***String 객체의 method 공부하기 ***");
		String str1="Have a Nice day";
		String str2="apple";
		String str3="Apple";
		
		System.out.println(str1.charAt(7));//7번의 인덱스 문자:N
		System.out.println(str1.charAt(0));//0번의 인덱스 문자:H
		System.out.println(str1.indexOf('a'));//첫번째 a의 위치 1
		System.out.println(str1.indexOf('X'));//첫번째 x의 위치:-1
		System.out.println(str1.lastIndexOf('a'));//마지막 'a'의 위치:13
		System.out.println(str1.length());//str1의 총길이
		System.out.println(str2.concat("***"));//str2 문자에 *** 추가 반환
		System.out.println(str2+"***");//str2 문자에 *** 추가 반환
		System.out.println(str1.toLowerCase());// 모든 소문자 변환 반환
		System.out.println(str1.toUpperCase());// 모든 대문자 변환 반환
		//문자열 비교시(값으로 비교시 equal 사용)
		System.out.println("apple".equals(str2));//true
		System.out.println("apple".equals(str3));//false
		System.out.println(str2.equals(str3));//대소문자 구분하여 비교:false
		System.out.println(str2.equalsIgnoreCase(str3));//대소문자 상관없이 비교: true
		System.out.println(str2==str3);//객체시 주소를 비교, 주소가 다르므로 false(==동등연산자는 기본값 비교시에만 사용)
		//문자열 추출"Have a nice day"
		System.out.println(str1.substring(7));//7번 인덱스부터 끝까지 추출
		System.out.println(str1.substring(7,10));//7번 부터 9까지 추출
		
		//문자열 비교
		System.out.println(str1.startsWith("Have"));//str1이 Have로 시작하면 true
		System.out.println(str1.startsWith("Nice"));//nice로 시작 안하니 false
		System.out.println(str1.endsWith("Day"));//str1이 Day로 끝날경우 true
		System.out.println(str1.endsWith("day"));//str1이 Day로 끝나지 않으니 false
		System.out.println(str1.toLowerCase().endsWith("day"));//str1을 소문자로 반환후 day로 끝나는지 비교 true
		//compare to 비교
		System.out.println("apple".compareTo("append"));//'l','e':7(양수: 첫문자열이 더크다), 첫문자열이 작을경우 음수
		System.out.println("apple".compareTo("banana"));//'a','b'비교:-1
		System.out.println("apple".compareTo("apple"));//완전히 같을때 0
		
		//반복
		System.out.println(str2.repeat(3));
		System.out.println("*".repeat(3));
		
		//일부 변경
		System.out.println(str1.replace('a','*'));
		System.out.println(str1.replace("Nice", "Good"));//Have a Good day
		
		//문자열 분리(결과값이 배열 타입)
		String colors="red,blue,green,yellow,pink";
		System.out.println(colors);
		String []a1=colors.split(",");
		System.out.println("분리된 배열의 갯수:"+a1.length);
		System.out.println(a1[0]+","+a1[4]);
		//분리하는 또다른 방법
		StringTokenizer st=new StringTokenizer(colors,",");
		System.out.println("분리할 토큰수:"+st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());//다음 토큰 꺼내서 출력
		}
		String msg="    hello   ";
		System.out.println(msg.length());
		System.out.println(msg.trim().length());//양쪽 공백 제거후 5글자
		
		//valueof: 어떤 타입의 데이터든지 모두 string변환
		System.out.println(String.valueOf(3));
		System.out.println(3+"");

	}

}
