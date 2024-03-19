package day0319;

public class Ex1_Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Loop:
			for(int i=2;i<=100;i++) {
				for(int j=2;j<i;j++) {
					if(i%j==0)
						continue Loop;
				}
				count++;
				System.out.printf("%3d",i);
				if(count%5==0)
					System.out.println();
			}
		System.out.println("\n소수의 갯수:"+count);

	}

}
