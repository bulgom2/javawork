package java1213;

class Car_tesla {
	
	static int wheel = 4;	// 클래스 변수 선언: 한군데서 생성 - 다른 인스턴스에서 변경시 전체에 영향
	int speed = 3;			// 인스턴스 변수 선언: 인스턴스마다 따로 생성 - 다른 인스턴스에서 변경시 영향을 미치지 못함
	
}

public class Car3_class {

	public static void main(String[] args) {
		// 클래스 변수는 인스턴스 생성이 필요 없이 바로 사용 가능
		System.out.println(Car_tesla.wheel);
		// 인스턴스 변수는 인스턴스를 생성해야지만 사용 가능
		// System.out.println(Car_tesla.speed);
		
		// 인스턴스 myCar1 생성
		Car_tesla myCar1 = new Car_tesla();
		System.out.println(myCar1.wheel);
		System.out.println(myCar1.speed);		// 인스턴스 생성 후에 사용이 가능
		
		// 인스턴스 myCar2 생성
		Car_tesla myCar2 = new Car_tesla();
		
		System.out.println("변경 전");
		System.out.println("myCar1의 바퀴 수: " + myCar1.wheel);
		System.out.println("myCar2의 바퀴 수: " + myCar2.wheel);
		System.out.println("myCar1의 속력: " + myCar1.speed);
		System.out.println("myCar2의 속력: " + myCar2.speed);
		System.out.println("==================================");
		
		myCar2.speed = 100;		// 인스턴스 변수. 인스턴스에 따라서 따로 저장됨
		myCar2.wheel = 5;		// 클래스 변수. 인스턴스가 다르더라도 같은 곳을 지정
				
		System.out.println("변경 후");
		System.out.println("myCar1의 바퀴 수: " + myCar1.wheel);
		System.out.println("myCar2의 바퀴 수: " + myCar2.wheel);
		System.out.println("myCar1의 속력: " + myCar1.speed);
		System.out.println("myCar2의 속력: " + myCar2.speed);
		
		
	}

}
