package day0318;

import java.util.Scanner;

public class Ex4_SwitchString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String color;
		color=sc.nextLine();
		switch(color) {
		case "Red":
		case "RED":
		case "red":
			System.out.println("빨강색");
			break;
		case "green":
			System.out.println("초록색");
			break;
		case "pink":
			System.out.println("분홍색");
			break;
		default:
			System.out.println("이외의 색");
		}

	}

}
