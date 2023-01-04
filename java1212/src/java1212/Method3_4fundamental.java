package java1212;

import java.util.Scanner;

public class Method3_4fundamental {
	
	public static int nPlu(int a, int b) {
		int plus = (a + b);
		
		System.out.println("합: " + plus);
		
		return plus;
	}
	
	public static int nMin(int a, int b) {
		int minus = (a - b);
		
		System.out.println("차: " + minus);
		
		return minus;
	}
	
	public static int nTim(int a, int b) {
		int time = (a * b);
		
		System.out.println("곱: " + time);
		
		return time;
	}
	
	public static double nDiv(int a, int b) {
		double divide = (a / b);
		
		System.out.println("분: " + divide);
		
		return divide;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int first = 0;
		int second = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 정수를 입력하세요.");
		first = scan.nextInt();
		System.out.println("두번째 정수를 입력하세요.");
		second = scan.nextInt();
		
		scan.close();
		
		nPlu(first, second);
		nMin(first, second);
		nTim(first, second);
		nDiv(first, second);
		
		
		
		
		
		
		
		
		
		
		

	}

}
