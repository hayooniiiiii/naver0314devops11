package day0315;

public class Ex10Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		//증감연산자
		//전치일 경우는1순위, 후치일 경우는 끝순위
		int m=5,n=5;
		int a=10,b=10;
		m++;
		++n;
		System.out.println("m="+m);
		System.out.println("n="+n);
		a+=m++;//a=a+m,m=m+1 후치는 제일 마지막에 증가
		System.out.println("a="+a);
		System.out.println("m="+m);
		b+=++n;//n=n+1,b=b+n, 먼저 증가후 b에 더해진다
		System.out.println("b="+b);
		System.out.println("n="+n);
		m=5;
		System.out.println(m++);//먼저 출력후 증가,5
		n=5;
		System.out.println(++n);//먼저 증가후 출력,6
		System.out.println("m="+m+",n="+n);//66
	}

}
