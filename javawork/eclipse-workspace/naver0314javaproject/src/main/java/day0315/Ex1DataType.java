package day0315;

public class Ex1DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//기본자료형 공부
		//구역({}) 안에서 선언하는 변수들은 자동 초기화가 되지 않으므로
		//초기값을 지정하거나 나중에 값에 값을 전달해야 출력이 가능하다
		boolean flag=true; 
		boolean flag2;
		flag2=false;
		System.out.println(flag);
		System.out.println(flag2);
		System.out.println(!flag); //!(not):반대로 출력
		System.out.println(!flag2);
		System.out.println(flag||flag2);//||논리합: 하나라도 true면 true
		System.out.println(flag&&flag2);//&&논리곱: 두개가 모두 true일때만 true
		System.out.println(flag&&(!flag2));
		
	}

}
