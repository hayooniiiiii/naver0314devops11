package day0327;
/*
 * 1.학생 정보 추가:이름 나이 3과목 점수 입력
 * 2. 학생정보 삭제:이름으로 찾아서삭제, 없을경우 메시지 출력
 * 3.전체 출력:번호,이름,자바점수,스프링점수,html점수,총점,평균,등급 출력
 * 4.평균으로 검색:평균값을 입력하면 그 평균 이상이 사람들 출력
 * 5.이름으로 검색: 입력한 이름을 포함하고 있으면 출력(contains)
 * 6.저장후 종료
 * 
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//메뉴 선택


public class Ex9_VectorMunje {
	
	List<StudentDto> list=new ArrayList<StudentDto>();
	Scanner sc=new Scanner(System.in);
	static final String FILENAME="c:/naver0314/student.txt";
	
	public Ex9_VectorMunje() {
		studentReadFile();
	}
	public void studentReadFile() {
		FileReader fr=null;
		BufferedReader br=null;
		try {
			fr=new FileReader(FILENAME);
			br=new BufferedReader(fr);
			while(true) {
				String s=br.readLine();
				if(s==null)
					break;
				String []a=s.split(",");
				
				StudentDto dto=new StudentDto();
				dto.setName(a[0]);
				dto.setAge(Integer.parseInt(a[1]));
				dto.setJava(Integer.parseInt(a[2]));
				dto.setSpring(Integer.parseInt(a[3]));
				dto.setHtml(Integer.parseInt(a[4]));
				
				list.add(dto);
				
			}
			System.out.println("총 "+list.size()+"명의 학생 정보를 읽어왔어요!");
		}
		catch(FileNotFoundException e) {
			System.out.println("읽어올 학생 정보가 없습니다.");
			
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
	public int getClick() {
		int click=0;
		System.out.println("1.학생 정보 추가");
		System.out.println("2.학생 정보 삭제");
		System.out.println("3.전체 학생 출력");
		System.out.println("4.평균으로 검색");
		System.out.println("5.이름으로 검색");
		try {
			click=Integer.parseInt(sc.nextLine());
			
		}catch(NumberFormatException e) {
			//문자 입력시 발생하는 exception
			System.out.println("번호를 숫자로 입력해주세요."); 
		}
		
		return click;
	}
	
	
	
	public void addStudent(){
		
		System.out.println("이름을 입력하세요");
		String name=sc.nextLine();
		System.out.println("나이를 입력하세요.");
		String age=sc.nextLine();
		System.out.println("자바 점수를 입력하세요.");
		String java=sc.nextLine();
		System.out.println("spring점수를 입력하세요");
		String spring=sc.nextLine();
		System.out.println("html점수를 입력하세요");
		String html=sc.nextLine();
	
		StudentDto dto=new StudentDto(name,age,java,spring,html);
		list.add(dto);
		System.out.println(list.size()+"번째 멤버 정보를 추가하였습니다.");
		
		
		
	}
	public void deleteStudent(){
		
		boolean f=false;
		System.out.println("삭제할 이름을 입력해주세요");
		String name=sc.nextLine();
		for(int i=0;i<list.size();i++) {
			StudentDto dto=list.get(i);
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
	public void printStudent(){
		System.out.println("\t** 전체 멤버 명단 **\n");
		System.out.println("=".repeat(40));
		System.out.println("이름\t나이\t자바\tspring\thtml");
		System.out.println("=".repeat(40));
		System.out.println("=".repeat(40));
		for(int i=0;i<list.size();i++) {
			StudentDto dto=list.get(i);
			System.out.println(i+1+"\t"+dto.getName()+"\t"+dto.getAge()+"\t"+
								dto.getJava()+"\t"+dto.getSpring()+"\t"+dto.getHtml());
			
		}
		System.out.println("=".repeat(40));
		}
		
	
	public void Searchavg(){
		int cou=0;
		boolean f=false;
		System.out.println("검색할 평균을 입력해주세요");
		double average=Integer.parseInt(sc.nextLine());
		
		for(int i=0;i<list.size();i++)
		{
			StudentDto dto=list.get(i);
			if(dto.getAvg(i, i, i)>=average)
			{
				f=true;
				cou++;
			}
		}
		System.out.println(cou+"명 있어요.");
		
	}
	//이름으로 검색
	public void searchName() {
		//이름을 입력하면 "강호동님은 2번째에 있습니다" 또는 "강호동님은 멤버명단에 없습니다"
				boolean f=false;
				System.out.println("검색할 이름을 입력해주세요");
				String name=sc.nextLine();
				for(int i=0;i<list.size();i++)
				{
					StudentDto dto=list.get(i);
					if(dto.getName().contains(name))
					{
						f=true;
						System.out.println(name+"가(이) 포함된 이름은"+ (i+1)+"번째에 있는"+dto.getName()+"있니다");
					}
				}
				if(!f)
					System.out.println(name+" 님은 명단에 없습니다");
	}
		
	public void Savestudemtfile() {
		FileWriter fw=null;
		try {
			fw=new FileWriter(FILENAME);
			for(StudentDto dto:list) {
				String s=dto.getName()+","+dto.getAge()+","+dto.getJava()+","+dto.getSpring()+","+dto.getHtml()+"\n";
				fw.write(s);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
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

	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex9_VectorMunje e9=new Ex9_VectorMunje();
		while(true) {
		int click=e9.getClick();
		switch(click) {
		case 1:
			e9.addStudent();
			break;
		case 2:
			e9.deleteStudent();
			break;
		case 3:
			e9.printStudent();
			break;
		case 4:		
			e9.Searchavg();
			break;
		case 5:
			e9.searchName();
			break;
		case 6:
			e9.Savestudemtfile();
			System.out.println("**멤버 정보를 저장후 종료합니다.**");
			System.exit(0);//종료
			break;
		default:
			System.out.println("잘못된 번호 입니다.");
			}
		System.out.println();
		}
	}
	

}
