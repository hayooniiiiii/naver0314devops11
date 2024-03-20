package day0320;

import java.util.Date;
import java.util.Scanner;

public class Ex4_MyCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int year;
		int month;
		int week;
		int endday;
		System.out.println("달력을 조회할 년도와 월을 입력하세요.");
		year=sc.nextInt();
		month=sc.nextInt();
		if(month<1||month>12) {
			System.out.println("잘못된 숫자 입니다.");
			return;
		}
		System.out.printf("%10d년 %d월 달력\n\n",year,month);
		System.out.println("=".repeat(50));
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("=".repeat(50));
		
		Date date=new Date(year-1900,month-1,1);
		week=date.getDay();
		
		switch(month)
		{
		
		case 2:
			endday=year%4==0&&year%100!=0||year%400==0?29:28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			endday=30;
			break;
		default:
			endday=31;
		}

		for(int i=1;i<=week;i++) {
			System.out.printf("\t");
			
		}
		for(int i=1;i<=endday;i++) {
			System.out.printf("%2d\t",i);
			
			++week;
			if(week%7==0) {
				System.out.println("\n");
			}
		}
	}
		

}
