package java0111;

public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Car myCar = new Car("Porsche");
//		Car my2Car = new Car("Benz");
	
//		myCar.run();
//		my2Car.run();
		
		Car myCar = new Car();
		
		myCar.setSpeed(-50);
		System.out.println("현재속도: " + myCar.getSpeed());
		
		myCar.setSpeed(60);
		System.out.println("현재속도: " + myCar.getSpeed());
		
		if (myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재속도: " + myCar.getSpeed());
		
	}

}
