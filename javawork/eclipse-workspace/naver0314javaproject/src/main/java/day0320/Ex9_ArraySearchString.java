package day0320;

import java.util.Scanner;

public class Ex9_ArraySearchString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []members= {"강호동","한가인","유재석","이승민","강하나","손미나","이영자","박남정","한지혜","손창민"};
		String name;
		Scanner sc=new Scanner(System.in);
		int index;
		while(true) {
			index=-1;
			System.out.println("이름을 입력하세요.");
			name=sc.nextLine();	
			
			if (name.equals("q")||name.equals("Q")) {
				break;
			}
			for(int i=0;i<members.length;i++) {

				if (name.equals(members[i])) {
				
					index=i;
				}
				
			}
			if (index==-1) {
				System.out.println("members에 없는 이름이에요.");
			}
			else {
				System.out.println(name+" 은 "+(index+1)+" 번째에 있어요");
			}
		}
		
	}

}