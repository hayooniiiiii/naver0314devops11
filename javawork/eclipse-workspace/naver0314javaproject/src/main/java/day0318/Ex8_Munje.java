package day0318;
import java.util.Scanner;
public class Ex8_Munje {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int dctotal;
		System.out.println("상품명을 입력하세요");
		String sang=sc.nextLine();
		System.out.println("수량 입력하세요");
		int su=sc.nextInt();
		System.out.println("단가 입력하세요");
		int dan=sc.nextInt();
		int total;
		total=su*dan;
		System.out.println(sang+ su+"개의 총 금액:"+total);
		if (su>=5) {
			System.out.println("10% 할인 입니다");
			dctotal=total*9/10;
			System.out.println("10프로 할인된 금액:"+dctotal);
		}
	}

}
