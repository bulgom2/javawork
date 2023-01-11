package java0111;

public class Test {
	
	// 인스턴스 멤버와 메소드 선언 <- 객체가 생성돼야지만 메모리에 올라간다.
	int field1;
	void method1() {
	}

	// 정적 멤버와 메소드 선언 <- 클래스 파일 생성만으로도 정적 멤버와 메소드가 메모리에 올라간다.
	static int field2;
	static void method2() {
	}
	
	static {	
//		field1 = 10;
//		method1();
		field2 = 10;
		method2();
	}
	
	static void method3() {
		Test obj = new Test();
		obj.field1 = 10;
		obj.method1();
		field2 = 10;
		method2();
	}
}
