package day0322;

class Orange{
	//private 접근지정자는 같은 클래스내에서만 접근이 가능하다.
	//멤버 변수는 자동 초기화
	private String name;
	private int age;
	private static String company="삼성";
	
	//getter 메서드: 멤버 변수의 값을 반환하는 메서드(규칙 getName,getAge)
	public String getName() {
		return name;
	}
	public int getAge() {
		return this.age;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public static String getCompany() {
		return company;
	}
}

public class Ex2_Object {

	public static void main(String[] args) {
		Orange or=new Orange();
		System.out.println("초기값을 확인");
		System.out.println("name:"+or.getName());
		System.out.println("age: "+or.getAge());
		System.out.println("이름과 나이 변경후 출력");
		or.setName("옥순이");
		or.setAge(20);
		System.out.println("name:"+or.getName());
		System.out.println("age: "+or.getAge());
		//static 메서드 호출도 클래스명으로 호출이 가능하다.
		System.out.println("회사명: "+Orange.getCompany());
	}

}
