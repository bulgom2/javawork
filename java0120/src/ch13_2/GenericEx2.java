package ch13_2;

public class GenericEx2 {
	public static void main(String[] args) {
		HomeAgency homeAgency = new HomeAgency();
		Home home = homeAgency.rent();
		home.turnOnLight();
		
		CarAgency carAgency = new CarAgency();
		Car2 car = carAgency.rent();
		car.run();
		
	}

}
