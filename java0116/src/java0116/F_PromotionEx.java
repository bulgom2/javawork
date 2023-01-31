package java0116;

public class F_PromotionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 구현 객체 생성
		F_B b = new F_B();
		F_C c = new F_C();
		F_D d = new F_D();
		F_E e = new F_E();
		
		// 인터페이스 A 변수 선언
		F_A a;
		
		// 변수에 구현 객체 대입
		a = b;		// 구현 클래스 -> 부모 인터페이스: 자동 타입 변환
		a = c;		// 구현 클래스 -> 부모 인터페이스: 자동 타입 변환
		a = d;		// 자식 클래스 -> 부모 인터페이스: 자동 타입 변환
		a = e;		// 자식 클래스 -> 부모 인터페이스: 자동 타입 변환
		
		// 구현클래스 <- (구현 클래스)부모 인터페이스: 강제 타입 변환
	}

}
