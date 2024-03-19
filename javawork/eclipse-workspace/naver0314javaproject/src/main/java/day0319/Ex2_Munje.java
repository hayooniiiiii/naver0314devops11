package day0319;

public class Ex2_Munje {

	public static void main(String[] args) {
		int sum=0;
		// TODO Auto-generated method stub
		loop:
			for(int i=1;i<15;i++) {
				sum=1;
				for(int j=1;j<=i;j++) {
					sum=sum*j;
					if(i==11) {
						break loop;
					}
				}
				System.out.printf("%d ",sum);
				System.out.println();
			}
		

	}

}
