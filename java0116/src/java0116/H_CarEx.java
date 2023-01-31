package java0116;

public class H_CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		H_Car myCar = new H_Car();
		
		myCar.run();
		
		myCar.tire1 = new H_KumhoTire();
		myCar.tire2 = new H_KumhoTire();
		
		myCar.run();

	}

}
