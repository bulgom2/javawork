package java1212;

import java.util.Scanner;

public class Recursive_method3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number;

		Scanner scan = new Scanner(System.in);
		
		System.out.println("양의 정수를 입력하세요.");
		number = scan.nextInt();
		
		System.out.println("반복 결과: " + evenNum(number));
		
		scan.close();
		
		System.out.println("재귀 결과: " + evenNumRecur(number));
		
		
	}
	
	public static int evenNum(int n) {
		int count = 0;
			
		while ( n > 0) {
			if (n % 2 == 0) {
				count++;
			}	
			n = n / 10;
		}
		return count;
	}
	
	public static int evenNumRecur(int n) {	
		if(n > 0) {
			if(n % 2 == 0) {
				return 1 + evenNumRecur(n / 10);
			} else return evenNumRecur(n / 10);
		} else return 0;
	}

/*
	위 재귀함수는 int일 경우에만 return함.
	0. 시작
	1. 2121을 넣었을 때
	if => 0 보다 큼
		if => 홀수임
		else return => 함수(n/10) => 212를 반환함. int가 아니라 함수이기 때문에 다시 위로 가서 반복함.
	2. 212를 넣었을 때
	if => 0 보다 큼
		if => 짝수임
			return 1 + 함수(n/10) => 21를 반환함. 마찬가지로 int가 아닌 함수로 끝났기 때문에 다시 위로 감.
	3. 21을 넣었을 때
	if => 0보다 큼
		if => 홀수임
		else return => 함수(n/10) => 2를 반환함. 마찬가지로 int가 아닌 함수로 끝났기 때문에 다시 위로 감.
	4. 2를 넣었을 때
	if => 0 보다 큼
		if => 짝수임
			return 1 + 함수(n/10) => 0을 반환함. 마찬가지로 int가 아닌 함수로 끝났기 때문에 다시 위로 감.
	5. 0을 넣었을 때
	if => 0 보다 작음.
	else return => 0. int로 끝났기 때문에 이제부터 밑에서 차례대로 return한 값을 수집하게 됨.
	
	5번 -> 4번 (return 값 정수 0을 가지고 감)
	4번 -> 3번 (return 값 정수 1을 가지고 감)
	3번 -> 2번 (return 값 정수 0을 가지고 감)
	2번 -> 1번 (return 값 정수 1을 가지고 감)
	1번 -> 0번[시작점] (return 값 정수 0을 가지고 감)
	총 return 값 2를 위의 main에서 호출된 변수에 입력되어 프린트됨.	
*/
	
}
