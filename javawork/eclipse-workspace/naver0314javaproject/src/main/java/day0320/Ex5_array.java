package day0320;

public class Ex5_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr1;
		//arr1에 배열에몇개를 넣을지 갯수만큼 할당
		arr1=new int[5];
		System.out.println("arr1의 갯수:"+arr1.length);
		System.out.println("***arr1의 초기값 출력***");
		for(int i=0;i<arr1.length;i++) {
			System.out.println(i+":"+arr1[i]);
		}
		System.out.println("***배열값을 일부 변경***");
		arr1[0]=5;
		arr1[4]=30;
		for(int i=0;i<arr1.length;i++) {
			System.out.println(i+":"+arr1[i]);
		}
		System.out.println("***다른 방법으로 출력***");
		for(int a:arr1) {
			System.out.println(a);
		}
	}

}
