package day0321;

public class Ex4_ArrayAgeCount {
	public static void main(String[] args) {
		int []memberAges= {12,56,34,56,5,7,42};
		System.out.println("총 인원수:"+memberAges.length);
		String []word= {"10세 미만: ","10대: ","20대: ","30대: ","40대 ","50대 "};
		int []ageCount=new int[6];
		
		for(int i=0;i<memberAges.length;i++) {
			ageCount[memberAges[i]/10]++;
		}
		for(int i=0;i<6;i++) {
			System.out.printf("%4s %d명 ",word[i],ageCount[i]);
		}
	}
}
