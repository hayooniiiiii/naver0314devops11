package day0322;

class MyShop{
	private String sangpum;
	private int su,dan;
	private static String message;
	
	public static final String SHOP="24시간 이마트";

	public void setSangpum(String sangpum) {
		this.sangpum = sangpum;
	}

	public void setSu(int su) {
		this.su = su;
	}

	public void setDan(int dan) {
		this.dan = dan;
	}

	public static void setMessage(String message) {
		MyShop.message = message;
	}
	//STATIC 변수에 THIS를 사용 못하는 이유
	//THIS는 객체를 지정하기 위한 참조 명령어 이다.
	//STATIC은 클래스명으로 직접 참조해 사용 가능하다.
	
	public void setData(String sangpum,int su,int dan) {
		this.setSangpum(sangpum);
		this.setSu(su);
		this.setDan(dan);;
	}
	
	public void setData(String sangpum,int su,int dan,String message) {
		this.setSangpum(sangpum);
		this.setSu(su);
		this.setDan(dan);
		setMessage(message);
		
	}
	public void writeData() {
		System.out.println("상품명: "+sangpum);
		System.out.println("수량: "+su+" 단가: "+dan);
		System.out.println("총금액"+su*dan);
		System.out.println("오늘의 메시지: "+message);
		
		System.out.println("=".repeat(30));
		
		
	}
	
}
public class Ex3_Staticmethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyShop sang1=new MyShop();
		MyShop sang2=new MyShop();
		MyShop sang3=new MyShop();
		
		System.out.println("**상품 1**");
		sang1.setSangpum("딸기");
		sang1.setSu(3);
		sang1.setDan(2300);
		MyShop.setMessage("오늘 각종 과일 세일 합니다.");
		
		sang1.writeData();
		System.out.println("상품 2");
		sang2.setData("수박",2,30000);
		sang2.writeData();
		
		System.out.println("** 상품 3 **");
		sang3.setData("참외", 5, 2000, "오늘 세일 마감!!");
		sang3.writeData();
		System.out.println("** 상품 1 다시 출력 **");
		sang1.writeData();
		
		System.out.println("** 상품 2의 수량만 변경 **");
		sang2.setSu(5);
		sang2.writeData();
		
		

	}

}
