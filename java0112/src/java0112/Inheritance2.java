package java0112;

class Estudiante {
	void learn() {
		System.out.println("배우기");
	}
	void eat() {
		System.out.println("밥먹기");
	}
	void say() {
		System.out.println("선생님 안녕하세요!"); // 보통의 학생
	}
}

class Leader extends Estudiante {
	void lead() {
		
	}
	void say() {
		System.out.println("선생님께 인사"); // 오버라이딩
	}
}


public class Inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leader leader1 = new Leader();
		leader1.eat();	// 상속받은 메서드 사용
		leader1.say();	// 오버라이딩한 메서드 사용
		

	}

}
