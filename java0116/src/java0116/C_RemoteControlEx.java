package java0116;

public class C_RemoteControlEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C_RemoteControl rc;				// 통합 리모컨
		rc = new C_Television();		// TV 버튼
		rc.c_turnOn();	
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.c_turnOff();
		
		rc = new C_Audio();				// Audio 버튼
		rc.c_turnOn();
		rc.setVolume(6);
		rc.setMute(true);
		rc.setMute(false);
		rc.c_turnOff();
		
		System.out.println();
		
		C_RemoteControl.changeBattery();
		
		// 그냥 클래스 내 필드를 불러오는 것이기 때문에 클래스와 도트 연산자로 이어서 써준다.
		System.out.println("리모콘 최대 볼륨: " + C_RemoteControl.MAX_VOLUME);
		System.out.println("리모콘 최소 볼륨: " + C_RemoteControl.MIN_VOLUME);
		
		
		
//		
//		C_Television tv = new C_Television();		// TV 리모컨
//		tv.c_turnOn();
//		C_Audio au = new C_Audio();					// Audio 리모컨
//		au.c_turnOn();

	}

}
