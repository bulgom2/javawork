package java0111;

public class Car {
//	String model;
//	int speed;
//	
//	Car(String model) {
//		this.model = model;
//	}
//	
//	void setSpeed(int speed) {
//		this.speed = speed;
//	}
//
//	void run() {
//		this.setSpeed(100);
//		System.out.println(this.model + "가 달립니다.(시속: " + this.speed + "km/h)");
//	}
	
//	// 인스턴스 필드
//	int speed;
//	
//	// 인스턴스 메소드
//	void run() {
//		System.out.println(speed + "으로 달립니다.");
//	}
//	
//	// 정적 메소드
//	static void simulate() {
//		Car myCar = new Car();
//		myCar.speed = 200;
//		myCar.run();
//	}
//	
//	public static void main(String[] args) {
//		simulate();	// 정적 메소드 호출
//		
//		Car meCar = new Car();
//		meCar.speed = 60;
//		meCar.run();
//		
//	}
	
	private int speed;
	private boolean stop;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
		
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		if (stop == true) this.speed = 0;
	}
	
	
	
}
