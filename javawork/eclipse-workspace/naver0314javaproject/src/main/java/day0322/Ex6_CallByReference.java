package day0322;
class Stu{
	String name="이영자";
	String blood="A";
	int age=12;
}

public class Ex6_CallByReference {
	public static void changeStu(Stu s) {
		s.blood="O";
		s.age=14;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stu s=new Stu();
		System.out.println(s.name+","+s.blood+","+s.age);
		changeStu(s);
		System.out.println("메서드 호출후 다시 출력");
		System.out.println(s.name+","+s.blood+","+s.age);

	}

}
