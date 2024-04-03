package day0326;

/*abstract(추상화)메서드는 오버라이드만을 목적으로 body({})없이 구현하고자 할 경우
앞에 abstract를 붙여서 추상메서드로 만든다.
abstract 메서드를 한개 이상 포함하고 있는 클래는 클래스 역시 추사화 시켜야한다.
추상화 시키는 방법은 class앞에 abstract를 붙이면 된다.
단 추상화 클래스는 그자체로 생성 할 수 없다.
추상 클래스를 상속받는 서브 클래스는 반드시 추상 메서드를 오버라이드를 해야만 하는데 만약
오버라이드를 하지 않았을 경우 서브클래스 역시 추상화 시킨다.
 */

import jdk.vm.ci.code.StackSlot;

import java.time.Clock;

abstract class Animal{
	/*public void sound(){
		System.out.println("딱히 하는 일 없음");
	}*/
	abstract public void sound();
	//추상 클래스에는 추상 메서드 뿐 아니라 일반 메서드도 포함 할 수 있다.
	public void showTitle(){
		System.out.println("추상 클래스 공부중!");

	}
}
class Dog extends Animal{
	@Override
	public void sound(){
		//super.sound();
		System.out.print("멍멍!");
	}

}

class Chick extends Animal{
	@Override
	public void sound(){
		System.out.println("삐약삐약");
	}
}

class Cat extends Animal{
	@Override
	public void sound(){
		System.out.println("야옹야옹");

	}
}

public class Ex1_Abstract{
	public static void hello(Animal ani){
		ani.showTitle();
		ani.sound();
		System.out.println();
	}

	public static void main(String[] args){
		hello(new Cat());
		hello(new Dog());
		hello(new Chick());
	}
}