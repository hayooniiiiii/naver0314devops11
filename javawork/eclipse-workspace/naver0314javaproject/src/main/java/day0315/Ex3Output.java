package day0315;

public class Ex3Output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=2024;
		int month=3;
		int day=15;
		
		String msg="Have a Nice Day!";
		char blood='B';
		double avg=97.4567;
		System.out.println("**출력1**");
		System.out.println("날짜:"+year+"-"+month+"-"+day);
		System.out.println("혈액형:"+blood+"형");
		System.out.println("평균:"+avg);
		System.out.println("====================");
		//printf도 가능
		//변환기호를 이용해서 출력
		//정수:%d,실수:%f,문자:%c,문자열:%s
		System.out.printf("**%40s**\n\n",msg);
		System.out.printf("**%-40s**\n\n",msg);
		System.out.printf("**%s**\n",msg);
		System.out.printf("날짜:%d-%d-%d\n",year,month,day);
		System.out.printf("날짜:%2d-%2d-%2d\n",year,month,day);//2칸중 비어있는 곳이 공백으로 채워짐
		System.out.printf("날짜:%02d-%02d-%02d\n",year,month,day);//2칸중 비어있는 곳이 0으로 채워짐
		System.out.printf("평균:%f\n",avg);
		System.out.printf("평균:%3.1f\n",avg);//3.1:전체자리수3자리(모자라도 상관없음),소수점 이하 자리수 1자리
		System.out.printf("평균:%10.2f\n",avg);//전체자리수 10(남을경우 공백처리),소수점 이하 자리수 2자리
		System.out.printf("평균:%-10.2f\n",avg);//전체자리수 10(남을경우 공백처리),소수점 이하 자리수 2자리

	}

}