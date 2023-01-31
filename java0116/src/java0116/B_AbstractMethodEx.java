package java0116;

public class B_AbstractMethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B_Dog dog = new B_Dog();
		dog.sound();
		
		B_Cat cat = new B_Cat();
		cat.sound();
		
		//다형성
		animalSound(new B_Dog());
		animalSound(new B_Cat());
	}
	
	// 변수 대입이 아니라 객체 대입을 통해서 객체의 기능을 실행하게 한다.
	public static void animalSound(B_Animal animal) {
		animal.sound();
	}

}
