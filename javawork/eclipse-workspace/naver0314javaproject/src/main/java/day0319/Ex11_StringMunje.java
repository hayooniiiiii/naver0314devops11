package day0319;

import java.util.Scanner;

public class Ex11_StringMunje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String msg=sc.nextLine();
		int big = 0,small= 0,num=0;
		for(int i=0;i<msg.length();i++) {
			if (Character.isUpperCase(msg.charAt(i)))//charAt(i)>='a'&&charAt(i)<='z'
				big=big+1;
				
			else if (Character.isLowerCase(msg.charAt(i)))//charAt(i)>='A'&&charAt(i)<='Z'
				{small++;}
			else if (Character.isDigit(msg.charAt(i)))//charAt(i)>='0'&&charAt(i)<='9'
				{num=num+1;}
			
		}
		System.out.printf("대문자 %d 소문자 %d 숫자 %d",big,small,num);
		
		
	}

	

}
