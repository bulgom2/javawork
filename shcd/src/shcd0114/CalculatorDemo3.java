package shcd0114;

class Calculator {
	static double PI = 3.14;		// 클래스 변수
	int left, right;	// 정수형 전역 변수
	
	public void setOprands(int left, int right) {		// 메소드 선언, 파라미터(매개변수) 존재
		this.left = left;		// this. -> 객체 전역에서 접근할 수 있는 변수를 지칭
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);		// 앞서 설정한 변수들의 값을 출력함
	}
	
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

public class CalculatorDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator c1 = new Calculator();		// Calculator() 인스턴스 생성 후 c1변수에 담아줌
		c1.setOprands(10, 20); 		// 인스턴스 안 변수의 값을 설정
		c1.sum();					// 인스턴스 안 변수들을 sum 메소드에 넣어 연산해줌
		c1.avg();
		
		Calculator c2 = new Calculator();		// new 연산자를 통해서 클래스를 통해 만들어진 인스턴스를 담아준다.
		c2.setOprands(20, 40);
		c2.sum();
		
		
		Calculator c3 = new Calculator();	
		c3.setOprands(1, 2);
		c3.sum();
		
		// c3 -> Calculator 객체를 담을 수 있는 컨테이너
		// Calculator -> 데이터 타입
		// 객체를 만든다 -> 데이터 타입을 직접 만든다.
		// 변수를 선언한다 -> 메모리의 한 공간에 변수로 받은 값을 저장한다.
		// 클래스를 만든다 -> 직접 메모리를 사용할 수 있게 된다.
		// 
		
		

	}

}
