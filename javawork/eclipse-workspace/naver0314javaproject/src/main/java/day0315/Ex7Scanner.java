package day0315;
import java.util.Scanner;
public class Ex7Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int kor,eng;
		String name;
		System.out.println("국어점수는?");
		kor=Integer.parseInt(sc.nextLine());
		System.out.println("영어점수는?");
		eng=Integer.parseInt(sc.nextLine());
		System.out.println("이름은?");
		//name=sc.nextLine()//점수 뒤에 엔터를 읽어온다.
		name=sc.nextLine();//버퍼의 엔터를 읽어서 소멸
;
		System.out.println("이름:"+name);
		System.out.printf("국어점수:%d점, 영어점수:%d점\n",kor,eng);
		System.out.printf("총점:%d점,평균:%d점",kor+eng,(kor+eng)/2);
		System.out.printf("총점:%d점,평균:%3.1f점",kor+eng,(kor+eng)/2.0);//결과가 double일경우 수식중 한개라도 double타입이 있어야한다.

	}

}