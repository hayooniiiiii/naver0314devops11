package day0321;

public class Ex2_ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20,temp;
		System.out.println("a="+a+",b="+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("a="+a+",b="+b);
		
		int []arr= {5,8,2,1,10};
		for(int i=0;i<arr.length-1;i++)//기준
		{
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.printf("%4d",arr[i]);
		}

	}
	

}
