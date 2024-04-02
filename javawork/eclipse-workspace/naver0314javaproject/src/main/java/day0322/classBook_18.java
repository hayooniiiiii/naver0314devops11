package day0322;
//19
class ShopService{
	private static ShopService singleton = new ShopService();
	private ShopService(){}
	
	static ShopService getInstance() {
		return singleton;
	}
}
public class classBook_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShopService obj1=ShopService.getInstance();
		ShopService obj2=ShopService.getInstance();
		
		if(obj1==obj2) {
			System.out.println("같은 shopservice 객체입니다.");
		
		}
		else {
			System.out.println("다른 shopservice 객체입니다.");
		}
	}

}
