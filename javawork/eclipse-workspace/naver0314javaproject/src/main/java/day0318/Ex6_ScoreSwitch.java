package day0318;

import java.util.Scanner;

public class Ex6_ScoreSwitch {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score=sc.nextInt();
		char grade;
		if(score<1||score>100) {
			System.out.println("잘못된 점수 입니다.");
			return;
		}
		switch(score/10) {
		case 10:
		case 9:
			grade='A';
			break;
		case 8:
			grade='B';
			break;
		case 7:
			grade='C';
			break;
		case 6:
			grade='D';
			break;
		default:
			grade='F';
			
			
		}
		System.out.println(score+"점은"+grade+"학점입니다");
	}
}