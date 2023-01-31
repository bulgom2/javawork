package ch9_1;

public class A {
	// 인스턴스 멤버 클래스
	class B {
		// 인스턴스 필드
		int field1 = 1;
		
		// 정적 필드(Java 17~)
//		static int field2 = 2;
		
		// 생성자
		B() {
			System.out.println("B-생성자 실행");
		}
		
		// 인스턴스 메소드
		void method1() {
			System.out.println("B-method1 실행");
		}
		
		// 정적 메소드(Java 17)
//		static void method2() {
//			System.out.println("B-method1 실행");
//		}
	}
	
	// 인스턴스 메소드
	void useB() {
		// B 객체 생성 및 인스턴스 필드 및 메소드 사용
		 B b = new B();
		 // 인스턴스 멤버 사용
		 System.out.println(b.field1);	// 인스턴스 필드
		 b.method1();					// 인스턴스 메소드
		 
//		 System.out.println(B.field2);	// 정적 필드
//		 B.method2();					// 정적 메소드
	}
}
	
public class A {
	// 인스턴스 멤버 클래스
		class B {}
	
	// 인스턴스 필드 값으로 B 객체 대입
	B field = new B();
	
	// 생성자
	A() {
		B b = new B();
	}
	
	void method() {
		B b = new B();
	}
}