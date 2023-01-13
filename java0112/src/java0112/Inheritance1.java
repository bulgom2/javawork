package java0112;

// 클래스 사람: 부모 클래스
class Person {
	void breath() {
		System.out.println("숨쉬기");
	}
	void eat() {
		System.out.println("밥먹기");
	}
	void say() {
		System.out.println("말하기");
	}
}

// 클래스 학생: 자식 클래스
// 부모가 가진 클래스의 모든 내용을 자식 클래스에 복사됨
// 부가적인 기능들을 자식 클래스에 추가해줌
// 상속 시에 반드시 부모 클래스는 하나만 지정이 가능함
class Student extends Person {	
	
	void learn() {
		System.out.println("배우기");
	}
}

// 클래스 선생: 자식 클래스
class Teacher extends Person {
	
	void teach() {
		System.out.println("가르치기");
	}
	
}

public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();	// 학생 객체 s1 생성
		
		s1.breath();	// 학생 클래스에는 breath() 기능이 정의돼있지 않음
						// breath() <- Person 부모 클래스에 정의됨.
						// 상속을 통해서 학생 클래스에서 부모가 가진 메소드 사용 가능
		s1.learn();
		
		Teacher t1 = new Teacher();
		t1.eat();		// eat() 부모가 가진 메소드
		t1.teach();		// teach() Teacher 클래스에 정의된 메소드

	}

}
