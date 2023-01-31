package java0116;

public class E_MultiInterfaceImplEx {

	public static void main(String[] args) {
		
		// E_RemoteControl 인터페이스 변수 선언 및 구현 객체 대입
		E_RemoteControl erc = new E_SmartTelevision();
		
		// E_RemoteControl 인터페이스에 선언된 추상 메소드만 호출 가능
		erc.e_turnOn();
		erc.e_turnOff();
		
		// E_Searchable 인터페이스 변수 선언 및 구현 객체 대입
		E_Searchable searchable = new E_SmartTelevision();
		
		// E_Searchable 인터페이스에 선언된 추상 메소드만 호출 가능
		searchable.search("https://www.youtube.com");
		
		E_SmartTelevision t = new E_SmartTelevision();
		t.e_turnOn();
		t.e_turnOff();
		t.search("https://www.youtube.com");
		
	}

}
