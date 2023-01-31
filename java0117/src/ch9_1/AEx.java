package ch9_1;

public class AEx {

	public static void main(String[] args) {

		// A 객체 생성
		A a = new A();
		
		// B 객체 생성
		A.B b = a.new B();
		
		a.useB();
		

	}

}
