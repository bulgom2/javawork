package java0116;

public class I_DriverEx {

	public static void main(String[] args) {
		
		I_Driver driver = new I_Driver();
		
		I_Bus bus = new I_Bus();
		I_Taxi taxi = new I_Taxi();
		
		// 매개값으로 구현 객체 대입(다형성: 실행 결과가 다름)
		driver.drive(bus);
		driver.drive(taxi);
		

	}

}
