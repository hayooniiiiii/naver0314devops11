package day0318;

import java.util.Scanner;

public class Ex5_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int year,month,days;
		boolean flag;
		System.out.println("년도를 입력하세요");
		year=sc.nextInt();
		if(year%4==0&&year%100!=0||year%400==0) {
			flag=true;
			System.out.println(year+"년은 윤년입니다.");
		}
		else {
			flag=false;
			System.out.println(year+"년은 평년입니다.");
		}
		System.out.println("월을 입력하세요");
		month=sc.nextInt();
		if (month<1 || month>12) {
			System.out.println("잘못 입력했어요");
			return;
		}

	}

}
