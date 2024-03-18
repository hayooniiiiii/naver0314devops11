package day0318;
import java.util.Scanner;
public class Ex14_Formunje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int score=0;
		int count=0;
		int sum=0;
		for (int i=0;i<5;i++) {
			System.out.println("점수는?");
			score=sc.nextInt();
			if(score<1||score>100) {
				continue;
			}
			count=count+1;
			sum+=score;
		}
		System.out.printf("입력한 점수 갯수: %d",count);
		System.out.printf("입력한 점수 합:%d",sum);
	}

}
