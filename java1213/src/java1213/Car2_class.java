package java1213;

class Car_volvo {	// 차량 설계도
	// 속성: 변수
	boolean powerOn;		// 시동
	String color;			// 차량 색상
	int wheel;				// 바퀴 수
	int speed;				// 속력
	boolean wiperOn;		// 와이퍼
	// 메서드: 기능
	void power() { powerOn = !powerOn; }	// 시동 메서드
	void speedUp() { speed++; }				// 엑셀 메서드
	void speedDown() { speed--; }			// 브레이크 메서드
	void wiper() { wiperOn = !wiperOn; }	// 와이퍼 메서드
}

public class Car2_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car_volvo mycar1 = new Car_volvo();		// mycar1 인스턴스 생성
		Car_volvo mycar2 = new Car_volvo();		// mycar2 인스턴스 생성

		mycar1.color = "red";		// mycar1 빨강
		mycar2.color = "black";		// mycar2 검정
		
		mycar1.speedUp();			// mycar1 엑셀 메서드 호출
		mycar2.wiper();				// mycar2 와이퍼 메서드 호출
		
		System.out.println("mycar1 색상: " + mycar1.color);
		System.out.println("mycar2 색상: " + mycar2.color);
		System.out.println("mycar1 속력: " + mycar1.speed);
		System.out.println("mycar2 속력: " + mycar2.speed);
		System.out.println("mycar1 와이퍼 작동 여부: " + mycar1.wiperOn);
		System.out.println("mycar2 와이퍼 작동 여부: " + mycar2.wiperOn);
		
		
	}

}
