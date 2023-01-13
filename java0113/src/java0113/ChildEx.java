package java0113;

public class ChildEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		// 자식 객체 생성
//		Child child = new Child();
//		
//		// 자동 타입 변환
//		Parent parent = child;
//		
//		parent.method1();	// Parent-method1
//		parent.method2();	// Child-method2
//		// parent.method3();	// 실행 불가
//		
		
		// 객체 생성 및 자동 타입 변환
		Parent parent = new Child();
		
		// Parent 타입으로 필드와 메소드 사용
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/*// 불가능
		 parent.field2 = "data2";
		 parent.method3();
		 */
		
		// 강제 타입 변환
		Child child = (Child) parent;
		
		// Child 타입으로 필드와 메소드 사용
		child.field2 = "data2";
		child.method3();
	}

}
