package java0112;

public class Car11 {
		
		//필드 (속성, 객체 변수)
			boolean powerOn;
			String color;
			int wheel;
			int speed;
			boolean wiperOn;
			
			// 메소드 (기능, 함수) 이름()
			void power() { powerOn = !powerOn; }
			void speedUp() { speed++; }
			void speedDown() { speed--; }
			void wiper() { wiperOn = !wiperOn; }
	}


