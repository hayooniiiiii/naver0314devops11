package day0327;

import java.util.Stack;

public class Ex5_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List 인터페이스를 구현한 클래스중 하나
		//LIFO 방식: 먼저 들어간게 나중에 나오는 방식
		
		Stack<String> stack1=new Stack<String>();
		//List<String> stack1=new Stack<STRING>();//PUSH는 오버라이드 메서드아님
		stack1.push("사과");
		stack1.push("바나나");
		stack1.push("사과");
		stack1.push("오렌지");
		stack1.push("딸기");
		
		System.out.println("총갯수:"+stack1.size());
		
		while(!stack1.isEmpty()) {
			System.out.println(stack1.pop());
		}
	}

}
