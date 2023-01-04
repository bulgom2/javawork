package java1208;

import java.util.Scanner;

public class Practice_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int present;
		int assignment;
		int quiz;
		int midterm;
		int finalex;
		String answer;
		String subject;
		int s_count = 0;
		int A_count = 0;
		int B_count = 0;
		int C_count = 0;
		int D_count = 0;
		int F_count = 0;
	
		double A = 4.0;
		double B = 3.0;
		double C = 2.0;		
		double D = 1.0;
		double F = 0.0;
		
		// 영작문, 프로그래밍, 이산수학, 컴퓨터구조
		Scanner scan = new Scanner(System.in);
		
		do {
			s_count++;
			System.out.println("과목명: ");
			subject = scan.nextLine();
			
			System.out.println("출석 점수: ");
			present = scan.nextInt();
			System.out.println("과제 점수: ");
			assignment = scan.nextInt();
			System.out.println("수시시험 점수: ");
			quiz = scan.nextInt();
			System.out.println("중간시험 점수: ");
			midterm = scan.nextInt();
			System.out.println("기말시험 점수: ");
			finalex = scan.nextInt();
			
			double total = (present * 0.1) + (assignment * 0.4) + (quiz * 0.1) + (midterm * 0.2) + (finalex * 0.2);
			System.out.println(subject + " 과목의 총점: " + total);
			
			if (total >= 90) {
				System.out.println(subject + " 과목의 학점: A");
				A_count++;				
			} else if (total >= 80) {
				System.out.println(subject + " 과목의 학점: B");
				B_count++;
			} else if (total >= 70) {
				System.out.println(subject + " 과목의 학점: C");
				C_count++;
			} else if (total >= 60) {
				System.out.println(subject + " 과목의 학점: D");
				D_count++;
			} else {
				System.out.println(subject + " 과목의 학점: F");
				F_count++;
			}
			
			System.out.println("계속 하기를 원하세요? 그렇다면 y를, 아니면 n을 입력하세요: ");
			// 위에서 받는 nextInt들의 값을 입력할 때 쌓인 Enter 값이 nextLine을 만나면 그 값이 다 들어가서 자동으로 넘어가짐
			// 그래서 Enter값을 빼기 위해 임의의 nextLine 값을 넣어 없애줌.
			scan.nextLine();		
			answer = scan.nextLine();
		
		} while(answer.equals("y"));
		
		System.out.println("평점: " + ((A_count * A) + (B_count * B) + (C_count * C) + (D_count * D) + (F_count * F)) / s_count);
		scan.close();
	}

}
