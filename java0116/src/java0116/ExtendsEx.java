package java0116;

public class ExtendsEx {

	public static void main(String[] args) {
		
		
		InterfaceCImpl impl = new InterfaceCImpl();
	
		impl.methodA();
		impl.methodB();
		impl.methodC();
		
		InterfaceA ia = impl;		// InterfaceA: methodA()만 실행 가능
		ia.methodA();
//		ia.methodB();
//		ia.methodC();
		
		InterfaceB ib = impl;
//		ib.methodA();
		ib.methodB();
//		ib.methodC();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();

	

	}

}
