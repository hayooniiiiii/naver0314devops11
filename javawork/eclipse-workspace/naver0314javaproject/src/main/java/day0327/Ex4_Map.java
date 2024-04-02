package day0327;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex4_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map:key와 valuee의 쌍으로 저장되는 형태
		//이때 key타입이 set이므로 중복된 데이터 허용 안하고 비순차적으로 들어간다.
		
		Map<String,String>map1=new HashMap<String,String>();
		map1.put("name","김태희");
		map1.put("age", "35세");
		map1.put("addr", "서울");
		System.out.println("map1의 갯수: "+map1.size());
		System.out.println("이름: "+map1.get("name"));
		System.out.println("나이: "+map1.get("age"));
		System.out.println("주소: "+map1.get("addr"))	;	
		System.out.println("핸드폰: "+map1.get("hp"))	;//없는 키값을 넣을경우 null반환
		System.out.println("=".repeat(20));
		//key값을 모두 얻어서 거기 매핑된 value값을 출력하고자 하는 경우
		
		Set<String> keys=map1.keySet();
		for(String k:keys) {
			String v=map1.get(k);
			System.out.println(k+":"+v);
		}
			
	}

}
