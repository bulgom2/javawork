package java1207;

import java.util.Scanner;

public class If_if13_salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int salary;
		int grade;
		String grade1 = "우수";
		String grade2 = "보통";
		String grade3 = "불량";		
		double markup;
		double newSalary;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("연봉을 입력하세요.");
		salary = scan.nextInt();
		System.out.println("근무 평가등급을 입력하세요.");
		grade = scan.nextInt();
		
		System.out.println("연봉: " + salary);
		if (grade == 1) {
			System.out.println("근무 평가등급: " + grade1);
			markup = salary * 0.06;
			newSalary = salary + markup;
			System.out.println("연봉 인상액: " + markup);
			System.out.println("새 연봉: " + newSalary);
		} else if (grade == 2) {
			System.out.println("근무 평가등급: " + grade2);
			markup = salary * 0.04;
			newSalary = salary + markup;
			System.out.println("연봉 인상액: " + markup);
			System.out.println("새 연봉: " + newSalary);
		} else {
			System.out.println("근무 평가등급: " + grade3);
			markup = salary * 0.02;
			newSalary = salary + markup;
			System.out.println("연봉 인상액: " + markup);
			System.out.println("새 연봉: " + newSalary);
		}
		scan.close();
	}

}
