/* Student 클래스 > name assignmentScore examScore 변수 > toString(); getGrade(); 메서드

// 메서드
반환 타입: return 값이 있을 때 반환 타입 지정
void 타입: return 값이 없을 때

// 매서드
클래스 메서드는 인스턴스 생성하지 않아도 사용 가능
인스턴스 메서드는 인스턴스 생성을 한 후 사용

클래스 멤버: 클래스 변수, 클래스 메서드
인스턴스 멤버: 인스턴스 변수, 인스턴스 메서드


// 생성자
인스턴스를 생성할 때 호출되어 인스턴스 변수들을 초기화하는 일종의 메서드
생성자의 이름은 클래스의 이름과 같으며 생성자에는 리턴 값이 없다. (반환 타입도 붙지 않는다.)

// 기본 생성
클래스 이름() {}

모든 클래스에는 반드시 하나 이상의 생성자가 존재해야 한다.

	class Cellphone {
		String model;
		String color;
		int capacity;
		Cellphone() {};		// 컴파일 시에 컴파일러가 자동으로 생성자 추가
		}				
	
	// 인스턴스가 1~2개 정도로 인스턴스를 많이 생성하지 않을 때
	Cellphone myphone = new Cellphone();
	myphone.model = "galaxy"
	myphone.color = "gold"
	myphone.capacity = 32;
	
	// 인스턴스 종류가 많다면 인스턴스의 변수들을 초기화하면서 생성하는 것이 유리
	Cellphone myphone1 = new Cellphone("galaxy", "gold", 32);
	


*/


package java1213;

public class Student {
	
	// 객체 변수들
	public String name;					// 이름
	public int assignmentScore;			// 과제 점수
	public int examScore;				// 시험 점수
	
	// 객체 메소드들
	// 현 Student 객체의 정보에 대한 문자열을 반환한다.
	public String toString() {
		String str = "";
		str += "이름: " + name + "\n";
		str += "과제 점수: " + assignmentScore + "\n";
		str += "시험 점수: " + examScore + "\n";
		str += "학점: " + getGrade() + "\n";
		str += "===================================";

		return str;
	}

	//학생의 학점을 반환한다.
	public char getGrade() {
		char letterGrade; 			// 학생의 학점
		double total;				// 학생 점수 총점
		
		// 학생의 점수들의 총점을 계산
		total = assignmentScore * 0.4 + examScore * 0.6;
		
		// 총점에 따른 학점을 부여
		if (total >= 90) { letterGrade = 'A'; }
		else if (total >= 80) { letterGrade = 'B'; }
		else if (total >= 70) { letterGrade = 'C'; }
		else if (total >= 60) { letterGrade = 'D'; }
		else { letterGrade = 'F'; }
		
		return letterGrade;
	}

}
