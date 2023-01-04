package java1212;

import java.util.Scanner;

public class Recursive_method2_zerocount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number;
		Scanner scan = new Scanner(System.in);
		
		// 양의 정수 입력
		System.out.println("양의 정수를 입력하세요: ");
		number = scan.nextInt();
		
		// getNumberOfZerosIter 메소드 호출하여 양의 정수 내에 있는 숫자 0의 개수를 구함.
		System.out.println("반복 결과: " + getNumberOfZerosIter(number) + "개" );
		// getNumberOfZerosIter 메소드 호출하여 양의 정수 내에 있는 숫자 0의 개수를 구함.
		System.out.println("재귀 결과: " + getNumberOfZerosRecur(number) + "개");
		scan.close();
	}

	/*
	n(>0) 내에 있는 숫자 0의 개수를 반환한다.
	매개변수: n - 넘겨 받은 양의 정수
	반환값: n(>0) 내에 있는 숫자 0의 개수
	지역변수: count - 숫자 0의 개수
	*/

	public static int getNumberOfZerosIter(int n) {
		int count = 0;
		
		//n이 두자리 이상의 숫자인 동안 다음을 반복한다.
		while ( n >= 10) {
			// 마지막 숫자가 0이면 숫자 0의 개수를 1만큼 증가시킨다.
			if (n % 10 == 0) count++;
			
			// 마지막 숫자를 제거한 나머지 정수를 구한다.
			n = n / 10;
		}
		return count;
	}
	
	
	public static int getNumberOfZerosRecur(int n) {
		if (n < 10)
			return 0;		// 마지막 숫자가 10보다 작기 때문에 0이 아니다.
		else if (n % 10 == 0)
			// 마지막 숫자가 0이면 마지막 숫자를 제거한 나머지 정수 내의 숫자 0의 개수에 1을 더한다. count++와 같은 효과
			return getNumberOfZerosRecur(n / 10) + 1;
		else // 마지막 숫자가 0이 아니면 마지막 숫자를 제거한 나머지 정수 내의 숫자 0의 개수를 구한다.
			return getNumberOfZerosRecur(n / 10);
	}
}	