package java1207;

import java.util.Scanner;

public class If_if7_multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int integer;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		integer = scan.nextInt();
		
		System.out.println("입력값: " + integer);
		if (integer % 3 == 0) {
			System.out.println("3의 배수입니다.");
		} else if (integer % 5 == 0) {
			System.out.println("5의 배수입니다.");
		} else if (integer % 8 == 0) {
			System.out.println("8의 배수입니다.");
		} else {
			System.out.println("어느 배수도 아닙니다.");
		}
		scan.close();
	}
}
