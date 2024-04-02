package day0327;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Ex6_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<String> list1=new Vector<String>();
		List<String> list1=new ArrayList<String>();
		//List<String> list2=new Vector<String>(5);//5개가 넘을 경우 10개로 할당값 변경
		///List<String> list2=new Vector<String>(5,3);//5개가 넘을 경우 8개로 할당값 변경
		
		List<String> list2=new ArrayList<String>(5);
		System.out.println("List1 데이터 갯수: "+list1.size());
		System.out.println("List1의 할당된 갯수: "+((Vector<String>)list1).capacity());//capacity는 오버라이드메소드 아니고 vector가 갖고 있는 메서드임.
		System.out.println("List2의 데이터 갯수: "+list2.size());
		System.out.println("List3의 할당된 갯수: "+((Vector<String>)list2).capacity());
		
		String []str= {"red","blue","green","white","red","yellow","pink"};
		//list1,list2에 배열 데이터 추가
		for(String s:str) {
			list1.add(s);
			list2.add(s);
		}
		System.out.println("=".repeat(20));
		System.out.println("List1 데이터 갯수: "+list1.size());
		System.out.println("List1의 할당된 갯수: "+((Vector<String>)list1).capacity());//capacity는 오버라이드메소드 아니고 vector가 갖고 있는 메서드임.
		System.out.println("List2의 데이터 갯수: "+list2.size());
		System.out.println("List3의 할당된 갯수: "+((Vector<String>)list2).capacity());
		
		System.out.println("**출력 1**");
		for(String s:list1) {
			System.out.println(s);
		}
		System.out.println("**출력 2**");
		for(int i=0;i<list1.size();i++) {
			System.out.println(i+":"+list1.get(i));
		}
		System.out.println("**출력 3**");
		Iterator<String> iter=list1.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
		
		System.out.println("**출력 4**");
		Object []ob=list1.toArray();
		for(Object s:ob) {
			System.out.println((String) s);
		}
	}

}
