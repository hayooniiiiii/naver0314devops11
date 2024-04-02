package day0321;

public class Ex3_Arraystringsoft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []arr= {"하석진","강호동","강호마","candy","손석구"};

		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				//기준값이 더 클경우양수값이 발생
				//if(arr[i].compareTo(arr[j])>0);
				//오름차순
				if(arr[i].compareTo(arr[j])<0) {
					String stemp=arr[i];
					arr[i]=(String)arr[j];
					arr[j]=stemp;
					
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.printf("%10s",arr[i]);
		}
	}

}
