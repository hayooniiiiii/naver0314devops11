package day0318;
import java.util.Scanner;
public class Ex12_Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num=sc.nextInt();
		if (num<2||num>9) {
			System.out.println("잘못 입력했습니다.");
			return;
		}
		System.out.println("구구단 입니다.");
		for(int i=1;i<10;i++) {
			System.out.printf("%d*%d=%d",i,num,i*num);
			System.out.println();
		}
	}

}