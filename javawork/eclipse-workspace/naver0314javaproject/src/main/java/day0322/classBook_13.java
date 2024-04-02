package day0322;
class Member1{
	private String name;
	private String id;
	private String password;
	private int age;
	
	public Member1(String name,String id) {
		this.name=name;
		this.id=id;
	}	
	public void disp() {
		System.out.println("이름: "+name);
		System.out.println("아이디: "+id);
	}
	
}
public class classBook_13 {
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member1 user1=new Member1("홍길동","hong");
		user1.disp();
	}

}
