package day0319;

import java.util.Scanner;

public class Ex7_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int score,sum=0;
		int count=0;
		while(true) {
			System.out.println("점수를 입력하세요.");
			score=sc.nextInt();
			if (score==0) {
				break;
			}
			if(score<0||score>100)
				continue;
			sum=sum+score;
			count=count+1;
		}
		System.out.printf("총 갯수:%d 총합:%d",count,sum);

	}

}
