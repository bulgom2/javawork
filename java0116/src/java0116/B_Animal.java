package java0116;

public abstract class B_Animal {		// abstract 키워드 붙여서 추상 클래스
	
	public void breathe() {				// 일반 메서드
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();		// 추상 메서드 선언: 사운드라는 기능을 자식에서 반드시 구현
	

	
}
