package java1212;

import java.util.Scanner;

public class Method4_4fundamental3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int first = 0;
		int second = 0;
		int third = 0;
		int qty = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 개수를 입력하세요. [2/3]");
		qty = scan.nextInt();
		
		if (qty == 2) {
			System.out.println("두 정수를 입력하세요.");
			first = scan.nextInt();
			second = scan.nextInt();
			
			scan.close();
			
			nPlu(first, second);
			nMin(first, second);
			nTim(first, second);
			nDiv(first, second);
			
		} else if (qty == 3) {
			System.out.println("세 정수를 입력하세요.");
			first = scan.nextInt();
			second = scan.nextInt();
			third = scan.nextInt();
			
			scan.close();
			
			nPluC(first, second, third);
			nMinC(first, second, third);
			nTimC(first, second, third);
			nDivC(first, second, third);
		}
	}
	
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
	
	public static double nDiv(double a, double b) {
		double divide = (a / b);
		
		System.out.println("분: " + divide);
		
		return divide;
	}
	
	
	
	public static int nPluC(int a, int b, int c) {
		int plusC = (a + b + c);
		
		System.out.println("합: " + plusC);
		
		return plusC;
	}
	
	public static int nMinC(int a, int b, int c) {
		int minusC = (a - b - c);
		
		System.out.println("차: " + minusC);
		
		return minusC;
	}
	
	public static int nTimC(int a, int b, int c) {
		int timeC = (a * b * c);
		
		System.out.println("곱: " + timeC);
		
		return timeC;
	}
	
	public static double nDivC(double a, double b, double c) {
		double divideC = (a / b / c);
		
		System.out.println("분: " + divideC);
		
		return divideC;
	}

}
