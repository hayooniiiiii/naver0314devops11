package day0320;

public class Ex7_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []data= {23,100,200,-13,67,-123,78,345,3,110};
		int max,min;
		max=min=data[0];
		System.out.println(data.length);
		for(int i=1;i<data.length;i++) {
			if(max<data[i])
				max=data[i];
			if(min>data[i])
				min=data[i];
			
		}
		System.out.println("최대값:"+max);
		System.out.println("최소값"+min);
		
		int pcnt=0,mcnt=0;
		//배열데이터중 양수의 갯수와 음수의 갯수 출력
		
		for(int a:data) {
			if (a>0){
				pcnt++;
			}
			else if(a<0) {
				mcnt++;
			}
		}
		System.out.printf("양수 갯수:%d 음수 갯수:%d",pcnt,mcnt);
	}

}