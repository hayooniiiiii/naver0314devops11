package day0322;
class MemberService{
	String password;
	String id;
	
	
	public boolean login(String id, String password) {
		// TODO Auto-generated method stub
		if(id=="hong") {
			return true;
		}
		else {
			return false;
		}
	}
	public static void logout(String id) {
		System.out.println(id+"님이 로그아웃되었어요");
	}
	
}
public class classBook_15 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberService memberService=new MemberService();
		boolean result=memberService.login("hong","12345");
		if(result){
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		}else {
			System.out.println("id또는 패스워드가 올바르지 않아요.");
		}
	}

}
