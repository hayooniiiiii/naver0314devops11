package day0326;

/*abstract(추상화) 메서드는 오버라이드 만을 목적으로 body({})없이 구현하고자 할 경우,
 * 앞에 abstract를 붙여서 추상 메서드로 만든다.
 * abstract 메서드를 한개 이상 포함 하고 있는 클래스는 클래스 역시 추상화 ㅣ켜야한다.
 * 추상화 시키는 방법은 class 앞에 abstract를 붙이면 된다.
 * 단 추상 클래스를 상속받는 서브클래스는반드시 추상 메서드를 오버라이드 해야하는데
 * 만약 오버라이드 하지 않았을 경우 서브클래스 역시 추상화 시킨다.
 */

abstract class Animal{
	//public void sound() {
		//System.out.println("딱히 하는일없음 ");	}
	abstract public void sound();//미완성 메서드, 바디가 없음, 기능 자체가 없음, 오버라이드가 목적
	public void showTitle() {
		System.out.println("추상 클래스 공부중");
	}
}

class Cat extends Animal
{

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		//super.sound();
		System.out.println("야옹야옹!!");
	}
	
}
class Dog extends Animal
{
@Override
	public void sound() {
		// TODO Auto-generated method stub
		//super.sound();
		System.out.println("멍멍!!");
	}
}

class Chick extends Animal{

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		//super.sound();
		System.out.println("삐약삐약!!!");
	}
	
	
	
}

public class Ex1_Abstract {
	public static void hello(Animal ani) {
		ani.sound();
		ani.showTitle();
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hello(new Cat());
		hello(new Dog());
		hello(new Chick());
		//hello(new Animal());
	}

}
