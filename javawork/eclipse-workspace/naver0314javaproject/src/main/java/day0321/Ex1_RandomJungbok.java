package day0321;

public class Ex1_RandomJungbok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []rand=new int[10];
		int a=0;
		loop:
		for(int i=0;i<rand.length;i++) {
			int n=(int)(Math.random()*30)+1;
			rand[i]=n;
			for(int j=0;j<i;j++) {
				if(rand[i]==rand[j]) {
					i--;
					continue loop;
				}
			}
		}
		System.out.println("1~30 사이 중복되지 않은 난수구하기");
		for(int i=0;i<rand.length;i++) {
			System.out.printf("%4d",rand[i]);
		}
		//순차적정렬(오름차순)
		System.out.println();
		System.out.println("정렬");
		for(int i=0;i<rand.length-1;i++) {
			for(int j=i+1;j<rand.length;j++) {
				if (rand[i]>rand[j]) {
					a=rand[i];
					rand[i]=rand[j];
					rand[j]=a;
				}
			}
		}
		for(int i=0;i<rand.length;i++) {
			System.out.printf("%4d",rand[i]);
		}
		
	}

}
