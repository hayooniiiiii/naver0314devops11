package day0315;
import java.util.Scanner;
public class Ex8oprator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("두개의 숫자 입력");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println("더하기:"+(n1+n2));
		System.out.println("빼기:"+(n1-n2));
		System.out.println("곱하기:"+(n1*n2));
		System.out.println("나누기:"+(n1/(double)n2));
		System.out.println("나머지"+(n1%n2));

	}

}
