package day0322;

class Printer{
	public static void println(int num) {
		System.out.println(num);
	}
	public static void println(boolean t) {
		System.out.println(t);
	}
	public static void println(double db) {
		System.out.println(db);
	}
	public static void println(String st) {
		System.out.println(st);
	}
}

//94
public class classBook_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Printer.println(10);
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("홍길동");
	}

}
