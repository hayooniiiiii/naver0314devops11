package day0319;

public class Ex3_Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stubm
		loop:
			for(int i=1;i<10;i++) {
				for(int j=1;j<10;j++) {
					int susik=((i*10)+j)+((j*10)+i);
					if (susik==121) {
						System.out.printf("%d%d+%d%d=121\n",i,j,j,i);
					}
				}
			}
	}

}
