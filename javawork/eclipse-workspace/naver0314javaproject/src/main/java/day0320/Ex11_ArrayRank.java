package day0320;

public class Ex11_ArrayRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []score= {100,90,80,90,70};
		int[] rank=new int[5];
		for(int i=0;i<score.length;i++) {
			rank[i]=1;
			for(int j=0;j<score.length;j++) {
				if(score[i]<score[j]) {
					rank[i]++;
				}
			}
			
		}
		System.out.println("번호\t점수\t등수\t");
		System.out.println("=".repeat(20));
		for(int i=0;i<score.length;i++) {
			System.out.println(i+1+"\t"+score[i]+"\t"+rank[i]);
		}
		
	}

}