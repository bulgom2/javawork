package java0116;

public class E_SmartTelevision implements E_RemoteControl, E_Searchable {

	// search() 추상 메소드 오버라이딩
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");		
	}
	
	// e_turnOn() 추상 메소드 오버라이딩
	@Override
	public void e_turnOn() {
		System.out.println("TV를 켭니다.");		
	}

	// e_turnOff() 추상 메소드 오버라이딩
	@Override
	public void e_turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	

}
