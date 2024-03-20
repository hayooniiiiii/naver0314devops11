package day0320;

import java.util.Random;
import java.util.Scanner;

public class Ex3_RandomGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1~100 사이 난수를발생한 후 숫자 알아맞추기
		 * 2. 숫자 입력시 앞에 횟수 출력
		 * 3. 숫자n이 난수보다 크면 (n보다 작습니다.)
		 * 4. 드디어 숫자 맞췄을경우, (횟수와 정답을 출력후)
		 * 5. 계속 할지 말지 y,n입력받기 
		 */
//		Scanner sc=new Scanner(System.in);
//		int su, count;
//		String c;
//		Random r=new Random();
//		while(true) {
//			count=0;
//			System.out.println("게임을 시작합니다.");
//			System.out.println("숫자를 입력하세요.");
//			int num=r.nextInt(10)+1;
//			while(true) {
//				su=sc.nextInt();
//				if(su>num)
//					System.out.println("\t"+su+"보다 작습니다.");
//				else if(su<num) {
//					System.out.println("\t"+su+"보다 큽니다.");
//				}
//				else {
//					System.out.printf("정답:%d, 횟수:%d",num,count);
//					System.out.println();
//					break;
//				}
//				count++;
//			}
//			System.out.println("게임을 더 하시나요?");
//			sc.nextLine(); 
//			c=sc.nextLine();
//			if (c=="y"||c=="Y") {
//				break;
//			}		
//			
//			
//		}
		Scanner sc= new Scanner(System.in);
		Random r= new Random();
		int su,count,rnd;
		Exit:
			while(true)
			{
				count=0;
				rnd=r.nextInt(100)+1;
				while(true) {
					System.out.print(++count+"회");
					su=Integer.parseInt(sc.nextLine());
					if(su>rnd)
						System.out.println("\t"+su+"보다 작습니다.");
					else if(su<rnd)
						System.out.println("\t"+su+"보다 큽니다.");
					else {
						System.out.printf("**정답(%d)입니다.**",rnd);
						System.out.println("\n\n계속하려면 y/그만하려면 n을 눌러주세요.");
						String ans=sc.nextLine();
						if(ans.equalsIgnoreCase("y")) {
							System.out.println("새로운 게임을 시작합니다.");
							
						}
						else {
							break Exit;
						}
						
					}
				}
			}
			
		
		

	}

}
