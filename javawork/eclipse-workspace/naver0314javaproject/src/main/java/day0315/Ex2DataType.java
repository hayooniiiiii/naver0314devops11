package day0315;

public class Ex2DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수타입
		byte a=127;
		System.out.println(a);
		int b=200; //byte오류일때 int로 변환
		System.out.println(b);
		byte c= (byte)200; //200을 byte형 변환, (byte)->cast연산자:강제로 형변환, 값손실발생
		System.out.println(c);//값손실이 발생할경우 엉뚱한 값이 출력(내부적으로는 2의보수)
		
		//실수타입(정밀도가 중요)
		float f1=123.567891234f;//f를 붙여야 4바이트 float으로 저장
		double f2=123.567891234;
		System.out.println(f1);//정밀도가 보통 8자리까지 정확히 나온다
		System.out.println(f2);//정밀도가 보통 15자리까지 정확히 나온다.
		
		char c1='t';//한글자가능,char는 보통 '',string은보통 ""(sting은 문자열 객체타입)
		System.out.println(c1);
		char c2='가';//2바이트라 한글 한글자도 가능
		System.out.println(c2); 
		
		String str1=new String("happy");//방법1
		String str2="hello";
		System.out.println(str1);
		System.out.println(str2);
		//긴 문자열을 지정하는 경우(db같은거 할때)
		String str3="N개의 정수로 이루어진 배열 A가 주어진다\n." 
					+"이때, 배열에 들어있는 정수의 순서를 적절히 바꿔서 다음 식의 최댓값을 구하는 프로그램을 작성하시오\n";
		System.out.println(str3);
		String str4="""
				N개의 정수로 이루어진 배열 A가 주어진다. 
				이때, 배열에 들어있는 정수의 순서를 적절히 바꿔서 다음 식의 최댓값을 구하는 프로그램을 작성하시오.
				""";
		System.out.println(str4);
		
	}

}