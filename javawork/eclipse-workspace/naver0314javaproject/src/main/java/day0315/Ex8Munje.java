package day0315;
import java.util.Scanner;
public class Ex8Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name="";
		String hp="";
		int birthYear;
		System.out.println("이름은?");
		name=sc.nextLine();	
		System.out.println("번호는?");
		hp=sc.nextLine();
		System.out.println("나이는?"); 
		birthYear=sc.nextInt();
		
		System.out.println("이름은"+name);
		System.out.println("번호는"+hp);
		System.out.printf("나이는%d",2024-birthYear);
		
				
	}

}