package day0320;

import java.util.Scanner;

public class Ex10_ArraySarchStartWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []members= {"강호동","한가인","유재석","이승민","강하나","손미나","이영자","박남정","한지혜","손창민"};
		String name;
		int count;
		Scanner sc=new Scanner(System.in);
		int index;
		while(true) {
			count=1;
			index=-1;
			System.out.println("검색할 이름은?");
			name=sc.nextLine();	
			if (name.equals("q")||name.equals("Q")) {
				break;
			}
			for (String a:members) {
				count++;
				if (a.startsWith(name)) {
					index=0;
					System.out.println(count+"번째"+a);
				}
			}
			if (index==-1) {
				System.out.println("데이터에 없습니다.");
			}
		}
	}

}