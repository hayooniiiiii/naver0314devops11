package day0327;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ex1_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Set 인터페이스를구현한클래스로는 TreeSet과 HashSet이 있다.
		 * Set 타입의 특징: 1. 중복 데이터를 허용하지 않음
		 * 				 2. 비순차적
		 * 				 3. Treeset은 오름차순
		 * 				 4. HashSet은 자기 마음대로 들어간다.
		 */
		//<Integer>:제네릭,해당컬렉션에는 Integer타입만넣을수 있다. 다른 타입넣을경우 컴파일 오류 발생
		//Set<Integer> set1=new HashSet<Integer>();//뒷부분 제네릭은 생략가능
		Set<Integer>set1=new TreeSet<Integer>();
		set1.add(100);//JDK5 이전에는 set1.add(100)(new Integer(100));이라고 씀 
		set1.add(78);
		set1.add(78);
		set1.add(100);
		set1.add(65);
		System.out.println("set1의 데이터 갯수: "+set1.size());//collection은 length아니고size, 중복데이터는 1번만 나옴
		
		System.out.println("**출력 1**");
		for(int n:set1) {
			System.out.println(n);
		}
		System.out.println("**출력 2**");
		Iterator<Integer> iter=set1.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
