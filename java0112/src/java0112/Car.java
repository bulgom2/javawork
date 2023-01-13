package java0112;

class car1 {
	
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

public class Car {
	
	public static void main(String[] args) {
		// 객체를 생성하지 않으면 클래스 사용이 불가능하다.
		// System.out.println("시동 처음 초기화: " + car1.powerOn); 
		
		// car1 클래스를 이용해서 mycar 라는 객체 생성: car1 클래스안에 필드와 메소드 이용 가능
		car1 mycar = new car1();	
		System.out.println("시동 처음 초기화: " + mycar.powerOn);
		System.out.println("차량 색상 초기화: " + mycar.color);
		System.out.println("바퀴 수 초기화: " + mycar.wheel);
		System.out.println("속력 초기화: " + mycar.speed);
		System.out.println("와이퍼 작동 초기화: " + mycar.wiperOn);
		
		mycar.power();
		System.out.println("시동 메소드 동작: " + mycar.powerOn);
		mycar.power();
		System.out.println("시동 메소드 다시 동작: " + mycar.powerOn);
		
		mycar.color = "black";
		System.out.println("현재 차량 색상: " + mycar.color);
				
		
	}

}
