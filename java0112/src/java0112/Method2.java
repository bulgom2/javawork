package java0112;

class Check {
	static int cv = 5;				// 정적 변수 멤버
	int iv = 4;						// 인스턴스 멤버
	
	static void cm() {}				// 정적 메소드
	
	void im() {}					// 인스턴스 메소드
	
	static void cm_Imember() {		// 정적 멤버 메소드에서 인스턴스 멤버 사용
		// System.out.println(iv);		// 클래스 멤버가 생성된 시점에 인스턴스 멤버에 대한 생성이 되지 않아서
		// im();						// 에러: 인스턴스 멤버의 객체 생성이 선언 안 됨
	}
	
	void im_Cmember() {				// 인스턴스 메소드에서 정적 멤버 사용
		System.out.println(cv);		
		cm();
	}
	
	static void cm_Cmember() {		// 정적 멤버 메소드에서 정적 멤버 사용
		System.out.println(cv);
		cm();
	}
	
	void im_Imember() {				// 인스턴스 멤버에서 인스턴스 메소드 사용
		System.out.println(iv);
		im();
	}
	
}

public class Method2 {
	int a;
	double b;
	
	Method2(int a){
		this.a = 10;
	}
	Method2(double b) {
		this.b = b;
	}
	

	public static void main(String[] args) {
		Check.cm_Imember();
		Check.cm_Cmember();
		
		Method2 myMet;
		myMet = new Method2(10.0); 
		int b = myMet.a;
		
		Check myinstance = new Check();
		myinstance.im_Cmember();
		myinstance.im_Imember();
		
	}
	


}
