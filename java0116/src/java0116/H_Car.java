package java0116;

public class H_Car {
	
	H_Tire tire1 = new H_HankookTire();
	H_Tire tire2 = new H_HankookTire();
	
	void run() {
		tire1.roll();
		tire2.roll();
	}
	

}
