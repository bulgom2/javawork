package java0116;

public class J_IntstanceofEx {
	public static void main(String[] args) {
		J_Taxi taxi = new J_Taxi();
		J_Bus bus = new J_Bus();
		
		ride(taxi);
		System.out.println();
		ride(bus);
	}

	public static void ride(J_Vehicle vehicle) {
		if (vehicle instanceof J_Bus) {
			J_Bus bus = (J_Bus) vehicle;
			bus.checkFare();
		}
		
		vehicle.run();
	}
}
