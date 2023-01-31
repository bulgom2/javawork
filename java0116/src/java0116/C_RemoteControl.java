package java0116;

//인터페이스에서는 상수와 추상메서드만 사용 가능
public interface C_RemoteControl {
	
	// 상수 선언
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 추상 메서드
	void c_turnOn();
	void c_turnOff();
	void setVolume(int volume);
	
	// 디폴트 인스턴스 메소드
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다.");
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	static void changeBattery() {
		System.out.println("리모콘 건전지를 교환합니다.");
	}

}


