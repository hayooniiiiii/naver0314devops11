package day0328;
/*자바에서의 함수형 프로그램인 람다 표현식은 인터페이스를 사용하는
 * 익명 내부 클래스의 또다른 표현식이다.
 * 단 인터페이스는 단하나의 추상메소드만 가지고 있어야한다.
 * 
 */
@FunctionalInterface //functionalinterface는메서드가 하나인지 아닌지검증하는역할, 오류발생


interface Orange{
	public void write();//추상 메서드 
	//public void play();//메서드가 추가되면 오류발생
	
}
@FunctionalInterface
interface DataAdd{
	public void add(int x,int y);
}
public class Ex2_Lambda {
	//우리가 알고 있는 익명 내부 클래스 형태로 orange구현
	Orange or=new Orange() {
		@Override
		public void write() {
			System.out.println("오렌지 먹고 싶어요!");
		}
	};
	
	public void lambdaMethod() {
		Orange or2=()->System.out.println("람다식 오렌지 먹고 싶어요!");
		or2.write();
		Orange or3=()->{
			System.out.println("안녕하세요");
			System.out.println("람다식공부중");
		};
		or3.write();
		
		
		//추상메서드 방식으로도 해보자
		Orange or4=new Orange() {
			@Override
			public void write() {
				System.out.println("다양한 방식으로 구현하기");
			}
		};
		
		or4.write();
	}
	
	public void lambdaMethod2() {
		DataAdd add1=(int x,int y)->System.out.println("두수의 합: "+(x+y));
		add1.add(10, 20);
		add1.add(20,40);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex2_Lambda ex=new Ex2_Lambda();
		ex.or.write();
		ex.lambdaMethod();
		
		ex.lambdaMethod2();
		
		
	}

}
