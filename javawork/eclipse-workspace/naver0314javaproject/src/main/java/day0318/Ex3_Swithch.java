package day0318;

import java.util.Scanner;

public class Ex3_Swithch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=0;
		System.out.println("숫자1~3을 눌러보세요");
		num=sc.nextInt();
		System.out.println(num+"을 눌렀어요!");
		switch(num) {
		case 1:
			System.out.println("one!");
			break;
		case 2:
			System.out.println("two!");
			break;
		case 3:
			System.out.println("three!");
			break;
		default:
			System.out.println("otehr number!");
			break;
		}

	}

}
