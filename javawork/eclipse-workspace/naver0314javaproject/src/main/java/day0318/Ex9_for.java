package day0318;

public class Ex9_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) 
			System.out.printf("%4d",i);
		System.out.println();
		
		for(int i=10;i>=1;i--)
			System.out.printf("%4d",i);
		System.out.println();
		
		for(int i=1;i<=10;i+=3)
			System.out.printf("%4d",i);
		System.out.println();
		
		for (int i='A';i<='Z';i++)
			System.out.printf("%c",(char)i);
		System.out.println();
		for(int i=65;i<=90;i++)
			System.out.printf("%c",(char)i);
		System.out.println();
	
		

	}

}
