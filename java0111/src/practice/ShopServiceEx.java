package practice;

class ShopService {
	private static ShopService shopService = new ShopService();
	
	private ShopService() {}
	
	static ShopService getInstance() {
		return shopService;
	}
}

public class ShopServiceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if (obj1 == obj2) {
			System.out.println("같은 ShopService 객체입니다.");
		} else {
			System.out.println("다른 ShopService 객체입니다.");
		}

	}

}
