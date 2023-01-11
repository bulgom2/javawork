package exam03.pack2;

import exam03.pack1.*;

public class C {
	
	public C() {
		
		A a = new A();
		
		a.field1 = 1;	// public 접근 가능: 모든 패키지에서 접근
		a.field2 = 1;	// default 접근 불가능: 다른 패키지라서 접근 불가능
		a.field3 = 1;	// private 접근 불가능: 같은 클래스에 없기 때문에
		
		a.method1();	// public 접근 가능: 모든 패키지에서 접근
		a.method2();	// default 접근 불가능: 다른 패키지라서 접근 불가능
		a.method3();	// private 접근 불가능: 같은 클래스에 없기 때문에
	}

}
