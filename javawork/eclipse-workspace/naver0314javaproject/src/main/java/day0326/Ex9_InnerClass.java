package day0326;

import static day0326.OuterClass.InnerClass.d;

class OuterClass{
	static int a=10;
	static int b=20;
	
	class InnerClass{
		int c=30;
		static int d=40;
		public void show() {
			System.out.println("a="+a);
			System.out.println("b="+b);
			System.out.println("c="+c);
			System.out.println("d="+d);
		}
		
	}
	static class InnerClass2{
		int e=50;
		static int f=60;
		public void show() {
			System.out.println("a="+a);//static 내부 클래스에서는 외부클래스에ㅢ 인스턴스 접근 불가
			System.out.println("b="+b);
			String c = "";
			System.out.println("e="+c);
			System.out.println("f="+d);
		}
	}
	
	public void disp() {
		InnerClass ic=new InnerClass();
		ic.show();
	}
	
	
}




public class Ex9_InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass outer=new OuterClass();
		outer.disp();

	}

}
