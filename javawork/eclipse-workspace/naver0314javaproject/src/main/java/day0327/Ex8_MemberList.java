package day0327;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex8_MemberList {
	List<MemberDto> list=new ArrayList<MemberDto>();
	Scanner sc=new Scanner(System.in);
	static final String FILENAME="c:/naver0314/member.txt";
	
	public Ex8_MemberList() {
		memberReadFile();
	}
	//파일읽기-처음 생성시 자동으로 파일에서 멤버 읽어오기
	public void memberReadFile() {
		FileReader fr=null;
		BufferedReader br=null;
		try {
			fr=new FileReader(FILENAME);
			br=new BufferedReader(fr);
			
			while(true) {
				String s=br.readLine();
				if(s==null)
					break;
				
				//이효리,010-1234-1234,서울,ab 이런 형태로 읽어옴
				//,로 분리하기
				String []a=s.split(",");
				//MemberDto 생성후 setter로 데이터를 넣어줌
				
				MemberDto dto=new MemberDto();
				dto.setName(a[0]);
				dto.setHp(a[1]);
				dto.setAddr(a[2]);
				dto.setBlood(a[3]);
				
				list.add(dto);
			}
			System.out.println("총 "+list.size()+"명의 멤버 정보를 읽어왔어요!");
			
			
		}
		catch(FileNotFoundException e) {
			System.out.println("읽어올 멤버 정보가 없습니다.");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
				fr.close();
			}catch(IOException|NullPointerException e) {
				e.printStackTrace();//에러프린트
			}
		}
	}
	//종료시 파일 저장
	public void memberFileSave() {
		FileWriter fw=null;
		try {
			fw=new FileWriter(FILENAME);
			for(MemberDto dto:list) {
				String s=dto.getName()+","+dto.getHp()+","+dto.getAddr()+","+dto.getBlood()+"\n";
				fw.write(s);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fw.close();
			} catch (IOException|NullPointerException e) {//두가지 exception을 같이 처리하고자 하는 경우
				e.printStackTrace();
				// TODO: handle exception
			}
		}
	}
	
	//메뉴 선택
	public int getMenu() {
		int menu=0;
		System.out.println("1. 멤버 정보 추가");
		System.out.println("2.멤버 삭제");
		System.out.println("3. 전체 멤버 출력");
		System.out.println("4. 이름으로 검색");
		System.out.println("5. 핸드폰으로 검색");
		System.out.println("6. 저장후 종료");
		System.out.println("============");
		try {
			menu=Integer.parseInt(sc.nextLine());
		}catch(NumberFormatException e) {
			//문자 입력시 발생하는 exception
			System.out.println("번호를 숫자로 입력해주세요."); 
		}
		
		return menu;
	}
	
	//멤버 데이터 추가
	public void addMember() {
		System.out.println("이름을 입력하세요");
		String name=sc.nextLine();
		System.out.println("핸드폰을 입력하세요.");
		String hp=sc.nextLine();
		System.out.println("주소를 입력하세요.");
		String addr=sc.nextLine();
		System.out.println("혈액형을 입력하세요");
		String blood=sc.nextLine();
		MemberDto dto=new MemberDto(name,hp,addr,blood);
		list.add(dto);
		System.out.println(list.size()+"번째 멤버 정보를 추가하였습니다.");
		
	}
	//멤버 삭제
	public void deleteMember() {
		boolean f=false;
		System.out.println("삭제할 이름을 입력해주세요");
		String name=sc.nextLine();
		for(int i=0;i<list.size();i++) {
			MemberDto dto=list.get(i);
			if(dto.getName().equals(name)) {
				f=true;
				list.remove(i);
				break;
			}
			
		}
		if(f) {
			System.out.println(name+"님의 정보를 삭제함");
		}
		else {
			System.out.println(name+"님은 명단에 없어요.");
		}
	}
	//전체 멤버 출력
	public void writeMember() {
		System.out.println("\t** 전체 멤버 명단 **\n");
		System.out.println("=".repeat(40));
		System.out.println("번호\t이름\t핸드폰\t\t주소\t혈액형");
		System.out.println("=".repeat(40));
		System.out.println("=".repeat(40));
		for(int i=0;i<list.size();i++) {
			MemberDto dto=list.get(i);
			System.out.println(i+1+"\t"+dto.getName()+"\t"+dto.getHp()+"\t"+
								dto.getAddr()+"\t"+dto.getBlood().toUpperCase()+"형");
			
		}
		System.out.println("=".repeat(40));}
	//이름으로 검색
	public void searchName() {
		//이름을 입력하면 "강호동님은 2번째에 있습니다" 또는 "강호동님은 멤버명단에 없습니다"
				boolean f=false;
				System.out.println("검색할 이름을 입력해주세요");
				String name=sc.nextLine();
				for(int i=0;i<list.size();i++)
				{
					MemberDto dto=list.get(i);
					if(dto.getName().equals(name))
					{
						f=true;
						System.out.println(name+"님은 "+(i+1)+"번째에 있습니다");
					}
				}
				if(!f)
					System.out.println(name+" 님은 명단에 없습니다");
	}
	//전화번호로 검색
	public void searchPhone() {
		boolean f=false;
		System.out.println("핸드폰 끝자리를 입력해주세요");
		String Phone_number=sc.nextLine();
		for(int i=0;i<list.size();i++)
		{
			MemberDto dto=list.get(i);
			if(dto.getHp().endsWith(Phone_number))
			{
				f=true;
				System.out.println(dto.getName()+"님은 "+(i+1)+"번째에 있습니다");
			}
		}
		if(!f)

			System.out.println(Phone_number+"끝 번호를 가진 사람은 명단에 없습니다");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex8_MemberList ex=new Ex8_MemberList();
		while(true) {
			int menu=ex.getMenu();
			switch(menu) {
			case 1:
				ex.addMember();
				break;
			case 2:
				ex.deleteMember();
				break;
			case 3:
				ex.writeMember();
				break;
			case 4:
				ex.searchName();
				break;
			case 5:
				ex.searchPhone();
				break;
			case 6:
				ex.memberFileSave();
				System.out.println("**멤버 정보를 저장후 종료합니다.**");
				System.exit(0);//종료
			default:
				System.out.println("잘못된 번호 입니다.");
			}
			System.out.println();
		}
	}

}
