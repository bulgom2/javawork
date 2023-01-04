package java1212;

public class Method {
		// static은 쓸 때도 있고 안 쓸 때도 있는 것인가?
	public static int findMin (int number1, int number2) {
		// 과정 1. 최소값을 저장하는 변수 minimun 선언
		int minimum;
		
		// 과정 2. 최소값은 두 정수들을 비교하여 작은 값으로 한다.
		if (number1 < number2) {
			minimum = number1;
		} else {
			minimum = number2;
		}
		
		//과정 3. 최소값을 반환
		return minimum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 메소드의 반환되는 값을 저장할 변수
		int value1 = 65;
		int value2 = 82;
		int minimum1;
		minimum1 = findMin(value1, value2);
		
		System.out.print("두 개의 정수 중 작은 값: " + minimum1);
		
		

/* 
자바 프로그램 <- 클래스의 모음: 하나 이상의 클래스들로 구성
클래스 <- 데이터 선언들과 메소드 정의들로 구성
메소드: 클래스의 주요 구성요소
메소드 <- 특정 작업을 수행하는 자바문들의 모음
표준 클래스 라이브러리에 있는 메소드
- 메소드도 프린트 가능 -


*/		
		

/*
// 메소드 정의
메소드는 값을 반환하느냐 반환하지 않느냐에 따라 다르게 정의
모든 메소드는 클래스 내에 포함됨

메소드는 머리부와 몸체로 이루어짐

public 반환유형 메소드이름(형식매개변수 목록)	// 머리부
{										// 몸체
	문 1;
	문 2;
	...
	문 n;
	return <연산식>						// 반환값 정의
}
* 반환 유형이 void일 경우 반환되는 타입이 없다는 것이므로, 아무것도 리턴되지 않아야 에러가 발생하지 않음
* static 메소드의 경우 인스턴스를 생성하지 않아소 호출이 가능
	ex) 

// 예시1
public double computerAverage(int number1, int number2, int number3)
{
		return (number1 + number2 + number3) / 3/0;
}

// 예시2
public void dutchPay(int totalAmount, int count)
{
		int dutchpayAmount;
		
		if (count == 0) {
			System.out.println("인원수: 0");
			return;
		} else {
			dutchpayAmount = totalAmount / count;
			System.out.println("1인당 부담 금액: " + dutchpayAmount);
		}
}

// 메소드 작성
모든 메소드는 특정 작업을 수행한다.
한 메소드가 특정 작업을 어떻게 수행하는지는 보통 알고리즘에 의해 기술된다.
알고리즘은 특정 문제를 풀기 위한 과정을 단계별로 기술한 것이다.
알고리즘은 보통 의사코드(pseudocode)와 순서도(flowchart) 중 하나를 사용하여 기술한다.

의사코드는 한글 문장들과 자바 문들을 혼합한 것이다.
의사코드는 자바 언어의 구문 규칙들을 그대로 따르지 않고
코드가 어떻게 수행될 지를 보여주기 때문에 충분한 구조를 제공한다.
전문 프로그래머들은 의사코드가 자바로 프로그래밍하는 것에 더 가깝기 때문에 의사 코드를 선호한다.
다만 의사 코드는 복잡한 조건들을 다루거나 반복의 경우 초보자가 명확하게 기술하기가 쉽지 않다.
이런 경우 자주 사용되는 방법이 순서도이다.
순서도는 어떤 문제를 해결하는 데 필요한 논리적인 단계들을 그림으로 표시한 것이다.

// 예제
두 정수들을 넘겨 받아 그 중 작은 정수를 찾는 메소드를 작성

1. 메소드의 이름: findMin
2. 두 정수에 대한 변수 이름: number1, number2
3. 두 정수에 대한 데이터 형: int
4. 메소드 머리부: public int findMin(int number1, int number2)
5. 메소드가 수행하여 최소값을 구하는 것
=================================
(시작)
[최소값을 저장하는 변수 minimum 선언]
<< 조건: number1 < number2 >>
[true -> minimum = number1]		[false -> minimum = number2]
[minimum 반환]
(끝)
=================================
int minimum;
if (number1 < number2) {
	minimum = number1;
} else {
	minimum = number2;
}
return minimum;


*/		
		
		
	}

}
