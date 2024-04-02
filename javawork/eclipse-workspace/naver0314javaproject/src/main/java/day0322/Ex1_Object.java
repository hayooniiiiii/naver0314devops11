package day0322;

class Apple{
	static String message="오늘은 금요일";
	String msg="Happy Day!!";
	
	
}

class Banana{
	static int kor=100;
	static int eng=80;
	String name="마이클";
}

public class Ex1_Object{
	String name="홍길동";
	final static int Max=100;//static변수,final:상수 지정,값이 변경 안된다.
	
	public static void main(String[] args) {
		
		/* static 멤버 메서드는 static 멤버 변수나 static멤버메서드만 
		 * 접근이 가능하다.
		 * 일반 인스턴스 메서드나 변수에 접근하기위해서는 new로 생성후 
		 * 그 변수를 이용해서 호출해야한다.
		 */
		System.out.println(Ex1_Object.Max);//static변수는 클래스명.변수명
		System.out.println(Max);//같은 클래스일경우에는 앞에 클래스명이 생략 가능하다.
		//name을 출력하려면 new로 생성한 인스턴스 변수가 필요하다.
		Ex1_Object ex=new Ex1_Object();
		//ex가 인스턴스 변수이다. 이 변수를 이용해야만 name 이 접근이 가능하다
		System.out.println(ex.name);
		System.out.println();
		
		//Apple 이 가진 2개의 멤버변수를 출력해보세요
		System.out.println(Apple.message);
		Apple apple=new Apple();
		System.out.println(apple.msg);

		//Banana 출력
		System.out.println(Banana.eng);
		System.out.println(Banana.kor);
		Banana ba=new Banana();
		System.out.println(ba.name);
		
	}
	
}
