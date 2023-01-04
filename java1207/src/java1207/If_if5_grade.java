package java1207;

import java.util.Scanner;

public class If_if5_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int attend;
		int assignment;
		int quiz;
		int midtermexam;
		int finalexam;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("출석 점수 입력");
		attend = scan.nextInt();
		System.out.println("과제 점수 입력");
		assignment = scan.nextInt();
		System.out.println("수시시험 점수 입력");
		quiz = scan.nextInt();
		System.out.println("중간시험 점수 입력");
		midtermexam = scan.nextInt();
		System.out.println("기말시험 점수 입력");
		finalexam = scan.nextInt();
			
		double total = (attend * 0.1) + (assignment * 0.4) + (quiz * 0.1) + (midtermexam * 0.2) + (finalexam * 0.2);
		

		System.out.println("===============");
		System.out.println("출석 점수: " + attend);
		System.out.println("과제 점수: " + assignment);
		System.out.println("수시시험 점수: " + quiz);
		System.out.println("중간시험 점수: " + midtermexam);
		System.out.println("기말시험 점수: " + finalexam);
		System.out.println("총점: " + total);
		
		if (total >= 90) {
			System.out.println("학점: A");
		} else if (total >= 80) {
			System.out.println("학점: B");
		} else if (total >= 70) {
			System.out.println("학점: C");
		} else if (total >= 60) {
			System.out.println("학점: D");
		} else {
			System.out.println("학점: F");
		}
		System.out.println("===============");
		scan.close();				
	}

}
