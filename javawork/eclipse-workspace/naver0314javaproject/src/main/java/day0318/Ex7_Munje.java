package day0318;

import java.util.Scanner;

public class Ex7_Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name;
		System.out.println("이름입력");
		name=sc.nextLine();
		System.out.println("기본급입력");
		int gibon=sc.nextInt();
		int totpay;
		System.out.println("가족수입력");
		int familysu;
		familysu=sc.nextInt();
		if(familysu>=3) {
			totpay=gibon+(familysu*50000);
		}
		else {
			totpay=gibon+30000;
		}
		System.out.println("이름"+name+"기본급"+gibon+"가족수"+familysu+"실수령액"+totpay);
		
		}
}
