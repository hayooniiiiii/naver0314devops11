package day0321;

import java.util.Scanner;

public class Book199_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		int num;
		int m=0;
		double avg=0.0;
		int su=0;
		int[] scores = null;
		Scanner sc=new Scanner(System.in);
		loop:
		while(true) {
			System.out.println("=".repeat(60));
			System.out.println(" 1. 학생수| 2.점수 입력 | 3.점수리스트 | 4. 분석 | 5.종료 ");
			System.out.println("=".repeat(60));
			System.out.println("선택하세요.");
			num=sc.nextInt();
			switch(num) {
			case 1:
				System.out.println("학생수를 입력하세요.");
				su=sc.nextInt();
				scores=new int[su]; 
				break;
			case 2:
				for(int i=0;i<su;i++) {
					System.out.printf("scores[%d]",i);
			
					scores[i]=sc.nextInt();
				}
				break;
			case 3:
				System.out.println("점수 리스트");
				
				for(int i=0;i<su;i++) {
					System.out.printf("scores[%d]:%d",i,scores[i]);
					System.out.println();
				}
				break;
			case 4:
				for(int i=0;i<su;i++) {
					if (m<scores[i]) {
						m=scores[i];
					}
					avg=avg+scores[i];
				}
				avg=avg/su;
				System.out.printf("최고 점수:%d 평균 점수:%.1f", m,avg);
				System.out.println();
				break;
			case 5:
				System.out.println("프로그램 종료");
				break loop;
				
			}
		}
	}

}
