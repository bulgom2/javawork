package ch9_4;

public class A2 {
	// 메소드
	public void method1(int arg) {	// final
		// 로컬 변수
		int var = 1;				// final
		
		// 로컬 클래스
		class B {
			// 메소드
			void method2() {
				// 로컬 변수 읽기
				System.out.println("arg: " + arg);
				System.out.println("var: " + var);
				
				// 로컬 변수 수정
//				arg = 2;
//				var = 2;
			}
		}
		
		// 로컬 객체 생성
		B b = new B();
		// 로컬 객체 메소드 호출
		b.method2();
				
		// 로컬 변수 수정
//		arg = 3;
//		var = 3;
		
	}
	
	void method3() {
		method1(5);	// 매개 변수에 값을 넣어주려면 또 메소드를 만들어야 함
	}
	
	public static void main(String[] args) {
		A2 a2 = new A2();
		a2.method3();
	}

}
