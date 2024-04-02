package day0328;
//<T>는 T가 타입파라미터임을 뜻하는 기호로, 타입이 필요한 자리에 T를 사용한다.
//T는 클래스타입만 가능

public class GenericType<T> {
	T []v;
	public void set(T[] n) {
		v=n;
	}
	public void print() {
		for(T s:v)
			System.out.println(s+" ");
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []s= {"장미꽃","안개꽃","국화꽃","후라지아"};
		Integer []n= {100,89,50,78,66};
		Double []d= {34.2,50.5,65.5,68.2};
		GenericType<String> gt1=new GenericType<>();
		gt1.set(s);
		gt1.print();
		GenericType<Integer> gt2=new GenericType<>();
		gt2.set(n);
		gt2.print();
		
		GenericType<Double> gt3=new GenericType<>();
		gt3.set(d);
		gt3.print();
		
		}
	
		

}
