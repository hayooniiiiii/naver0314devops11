package day0326;
interface Apple{
	public void one();
	
}
//인터페이스끼리 상속은 extends
interface Banana extends Apple{
	public void two();
}

class Orange implements Banana{

	@Override
	public void one() {
		// TODO Auto-generated method stub
		System.out.println("하나");
	}

	@Override
	public void two() {
		// TODO Auto-generated method stub
		System.out.println("둘");
	}
	public void three() {
		System.out.println("셋");
	}
}
public class Ex5_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banana b=new Orange();
		Orange or=new Orange();
		b.one();
		b.two();
		or.three();
	}

}
