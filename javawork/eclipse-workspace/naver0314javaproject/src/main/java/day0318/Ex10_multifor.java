package day0318;

import java.util.Iterator;

public class Ex10_multifor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
			for(int j=1;j<=3;j++) {
				System.out.println("Kitty");
			}
			System.out.println();
		}
		System.out.println("------------------");
		
		for (int i=1;i<=5;i++) {
			for(int j=1;j<=3;j++) {
				System.out.printf("i=%d,j=%d\n",i,j);
				if(j==2)
					break;
			}
			System.out.println();
			
		}

	}

}
