package day0327;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*
 * 1. 이름추가 2.이름삭제 3.이름 출력 4. 이름 검색 5.저장 종료
 * 종료시 파일에 저장
 * 처음 생성시 파일에서 읽어올것
 */
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Ex7_Vector {
	//파일을 읽어 list에 저장된 이름 추가하기
	
	Scanner sc=new Scanner(System.in);
	List<String> list=new Vector<String>();
	static final String FILENAME="d:/naver0314/person.txt";
	
	public Ex7_Vector() throws IOException {
		personRead();
	}
	//생성자에서 호출
	public void personRead() throws IOException {
		FileReader fr=null;
		BufferedReader br=null;
		try {
			fr=new FileReader(FILENAME);
		}catch(FileNotFoundException e) {
			System.out.println("명단 없음");
		}finally {
			br.close();
			fr.close();
		}
	}
	//종료시 저장
	public void personSave() {
		
	}
	
	
	//메뉴 선택시 번호 반환
	public int getMenu() {
		int menu=0;
		System.out.println("-".repeat(30));
		System.out.println("1.이름 추가 2.이름 삭제 3.이름 출력 4. 이름 검색 5.종료");
		System.out.println("-".repeat(30));
		menu=Integer.parseInt(sc.nextLine());
		return menu;
	}
	
	public void addPerson() {
		System.out.println("추가할 이름 입력");
		String name=sc.nextLine();
		list.add(name);
		System.out.println(list.size()+"번째 멤버를 추가했어요!");
		
	}
	public void deletePerson() {
		System.out.println("삭제할 이름을 입력");
		String name=sc.nextLine();
		boolean f=list.remove(name);
		
		if(!f)//false==f
			System.out.println(name+"님은 명단에 없습니다.");
		else
			System.out.println(name+"님은 명단에 삭제했습니다.");
	}
	public void listPerson() {
		System.out.println("멤버 현황");
		for(int i=0;i<list.size();i++) {
			System.out.println(i+1+":"+list.get(i));
		}
		
	}
	public void searchPerson() {
		boolean f=false;
		System.out.println("검색할 이름을 입력");
		String name=sc.nextLine();
		for(int i=0;i<list.size();i++) {
			String listName=list.get(i);
			if(listName.equals(name)) {
				f=true;
				System.out.println(name+"님은 "+(i+1)+"번째에 있습니다.");
				
			}
			if(!f) {
				System.out.println("없어요");
			}
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Ex7_Vector ex=new Ex7_Vector();
		while(true) {
			int menu=ex.getMenu();
			if(menu==5) {
				ex.personSave();
				System.out.println("**종료합니다.**");
				break;
			}
			switch(menu) {
			case 1:
				ex.addPerson();
				break;
			case 2:
				ex.deletePerson();
				break;
			case 3:
				ex.listPerson();
				break;
			case 4:
				ex.searchPerson();
				break;
			default:
				System.out.println("**번호 입력이 잘못되었어요.**");
			
			}
			
		}
	}

}
