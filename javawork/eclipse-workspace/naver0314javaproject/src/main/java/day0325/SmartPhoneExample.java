package day0325;

public class SmartPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone myPhone= new SmartPhone("갤럭시","은색");
		
		System.out.println("모델: "+myPhone.model);
		System.out.println("색깔: "+myPhone.color);
		
		System.out.println("와이파이 상태: "+myPhone.wifi);
		myPhone.bell();
		myPhone.sendVoice("여보세요");
		myPhone.receiveVoice("안녕하세요! 저는 홍길동인데요");
		myPhone.sendVoice("반갑습니다.");
		myPhone.hangUp();
		myPhone.setWifi(true);
		myPhone.internet();

	}

}
