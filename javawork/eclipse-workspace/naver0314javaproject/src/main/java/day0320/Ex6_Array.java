package day0320;

public class Ex6_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열을 선언하면서 초기값을 주는 경우
		int []arr1= {4,6,8,10,30};
		System.out.println("**출력1**");
		for(int i=0;i<arr1.length;i++) {
			System.out.printf("%4d",arr1[i]);
			
		}
		System.out.println();
		System.out.println("**출력2**");
		for(int n:arr1) {
			System.out.printf("%4d",n);
		}
		System.out.println();
		System.out.println("=".repeat(30));
		
		int []arr2;
		arr2=new int[] {10,20,30,40};
		System.out.println("arr2의 갯수"+arr2.length);
		for(int n:arr2)
			System.out.printf("%4d",n);
		System.out.println();
		
		
		String []str1= {"김영자","이미자","강호동","이제성"};
		String []str2;
		str2=new String[] {"사과","오렌지","딸기"};
		
		for(int i=0;i<str1.length;i++) {
			System.out.println(str1[i]);
		}
		for (String s:str2) {
			System.out.println(s);
		}
	}
	
	

}
