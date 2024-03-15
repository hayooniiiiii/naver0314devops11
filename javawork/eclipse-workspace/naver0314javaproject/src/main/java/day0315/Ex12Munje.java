package day0315;
import java.util.Scanner;

public class Ex12Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String msg="";
		int score;
		System.out.println("점수를 입력하세요");
		score=sc.nextInt();
		
		msg=score>=90?"참 잘했어요!":
			score>=80?"수고했어요!":
			score>=70?"조금 더 노력하세요!":"재시험 입니다!";
			
		System.out.println(msg);
	}

}
