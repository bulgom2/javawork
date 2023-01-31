package ch9_5;

public class A {
	
	// 바깥 클래스의 인스턴스 멤버
	int field1;
	void method1() {}
	
	// 바깥 클래스의 정적 멤버
	static int field2;
	static void method2() {}
	
	// 인스턴스 멤버 클래스: 바깥 클래스의 인스턴스 멤버, 정적 멤버에 접근이 가능하다.
	class B {
		
		// 정적 멤버 클래스: 바깥 클래스의 인스턴스 멤버 접근이 불가하다.
//		static class C {
			void method() {
			// A의 인스턴스 필드와 메소드 사용
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
			}
//		}
	}

	// 정적 멤버 클래스
	static class C {
		void method() {
//			field1 = 10;
//			method1();
			
			// A의 정적 필드와 메소드 사용
			field2 = 10;
			method2();
		}
	}
}
