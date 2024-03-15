package day0315;

public class Ex4MainArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]+args[3]);//args는 문자만 받음
		//wrapper class 중 integer를 이용해서 변환
		int s1=Integer.parseInt(args[2]);//"10" 이 숫자 10으로 변환
		int s2=Integer.parseInt(args[3]);//"20" 이 숫자 20으로 변환
		System.out.println(s1+s2);
	}

}
