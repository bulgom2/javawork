package java0113;

public class Car {
	
//	public int speed;
//	
//	public void speedUp() {
//		speed += 1;
//	}
//	
//	public final void stop() {
//		System.out.println("자동 멈춤");
//		speed = 0;
//	}

	// 필드 선언
	public Tire tire;
	
	// 메소드 선언
	public void run() {
		// tire 필드에 대입된 객체의 roll() 메소드 호출
		tire.roll();
	}
}
