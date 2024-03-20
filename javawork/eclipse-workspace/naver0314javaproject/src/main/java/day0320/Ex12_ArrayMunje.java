package day0320;

import java.util.Scanner;

public class Ex12_ArrayMunje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int inwon;
		System.out.println("인원수 입력");
		inwon=sc.nextInt();
		sc.nextLine();
		String []name=new String[inwon];
		int []kor=new int[inwon];
		int []eng=new int[inwon];
		int []tot=new int[inwon];
		int []rank=new int[inwon];
		
		for(int i=0;i<inwon;i++) {
			System.out.println("이름입력");
			name[i]=sc.nextLine();
			System.out.println("국어입력");
			kor[i]=sc.nextInt();
			System.out.println("영어입력");
			sc.nextLine();
			eng[i]=sc.nextInt();
			sc.nextLine();
			tot[i]=kor[i]+eng[i];
		}
		for(int i=0;i<inwon;i++) {
			rank[i]=1;
			for(int j=0;j<inwon;j++) {
				if(tot[i]<tot[j]) {
					rank[i]++;
				}
			}
		}
		System.out.println("=".repeat(60));
		System.out.println("번호"+"\t"+"이름"+"\t"+"국어"+"\t"+"영어"+"\t"+"총점"+"\t"+"등수");
		System.out.println("=".repeat(60));
		for(int i=0;i<inwon;i++) {
			System.out.printf("%d %7s %7d %7d %7d %7d",i+1,name[i],kor[i],eng[i],tot[i],rank[i]);
			System.out.println();
		}
	}

}
