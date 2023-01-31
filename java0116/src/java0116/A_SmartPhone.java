package java0116;

public class A_SmartPhone extends A_Phone{
	
	// 생성자 선언
	A_SmartPhone(String owner) {
		// Phone 생성자 호출
		super(owner);
	}
	
	// 메소드 선언
	void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}

}
