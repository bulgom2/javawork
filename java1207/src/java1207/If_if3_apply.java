package java1207;

import java.util.Scanner;			// Ctrl + Sft + O

public class If_if3_apply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double grade;
		int toeic;
				
		Scanner scan = new Scanner(System.in);
		
		System.out.println("평점을 입력하세요.");
		grade = scan.nextDouble();
		System.out.println("토익 점수를 입력하세요.");
		toeic = scan.nextInt();
		
		System.out.println("평점: " + grade);
		System.out.println("토익 점수: " + toeic);
		
		if (grade >= 4.0 && toeic >= 700) {
			System.out.println("면접 대상자입니다.");
		} else if (grade >= 3.5 && toeic >= 700) {
			System.out.println("서류전형 대상자입니다.");
		} else if (grade >= 3.0 && toeic >= 700) {
			System.out.println("필기시험 대상자입니다.");
		} else {
			System.out.println("지원할 수 없습니다.");
		}
				
/* 		// 중첩 if문 사용 예시
		if (grade >= 4.0) {
			if (toeic >= 700) {
				System.out.println("면접 대상자입니다.");
			} else {
				System.out.println("지원할 수 없습니다.");
			}
		}
		else if (grade >= 3.5) {
			if (toeic >= 700) {
				System.out.println("서류전형 대상자입니다.");
			} else {
				System.out.println("지원할 수 없습니다.");
			}
		}
		else if (grade >= 3.0) {
			if (toeic >= 700) {
				System.out.println("필기시험 대상자입니다.");
			} else {
				System.out.println("지원할 수 없습니다.");
			}
		} else {
			System.out.println("지원할 수 없습니다.");
		}
*/		
		scan.close();
	}

}
