package java1207;

import java.util.Scanner;

public class If_if9_income {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int income;
		double tax;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("연간 근로소득을 입력하세요. [단위: 만원]");
		income = scan.nextInt();
		
		// 변수 앞에 (int)를 삽입하여 자료형을 정수형으로 변환시키면 소수점이 떨어짐
		System.out.println("근로소득: " + income + "만원");
		if (income <= 2000) {
			tax = (income * 0.05);
			System.out.println("소득세: " + (int)tax + "만원");			
		} else if (income <= 4000) {
			tax = (income * 0.15);
			System.out.println("소득세: " + (int)tax + "만원");				
		} else if (income <= 8000) {
			tax = (income * 0.25);
			System.out.println("소득세: " + (int)tax+ "만원");				
		} else {
			tax = (income * 0.4);
			System.out.println("소득세: " + (int)tax + "만원");
		}
		scan.close();
	}
}

