package java0116;

public class A_Phone {
	
	// 필드 선언
	String owner;
	
	// 생성자 선언
	A_Phone(String owner) {
		this.owner = owner;
	}
	
	//메소드 선언
	void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
