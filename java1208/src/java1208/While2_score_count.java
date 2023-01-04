package java1208;

import java.util.Scanner;

public class While2_score_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int score;
		int totalCount = 0;
		int Acount = 0;
		int Bcount = 0;
		int Ccount = 0;
		int Dcount = 0;
		int Fcount = 0;

		Scanner scan = new Scanner(System.in);
		System.out.print("점수 입력 (종료하려면 -1 입력)");
		score = scan.nextInt();
		
		// 점수가 양수인 동안 다음 반복문을 계속한다.
		while (score >= 0) {
			// 입력값의 횟수를 누적
			totalCount++;
			
			// 점수에 해당하는 학점 수를 1만큼 증가
			if (score >= 90) Acount++;
			else if (score >= 80) Bcount++;
			else if (score >= 70) Ccount++;
			else if (score >= 60) Dcount++;
			else Fcount++;
			
			System.out.print("점수를 입력하세요(종료하려면 -1 입력)");
			score = scan.nextInt();
		}
		// 모든 점수들의 총 누적수를 출력
		System.out.println();
		System.out.println("총 입력 횟수: " + totalCount);
		System.out.println("A 학점 수: " + Acount);
		System.out.println("B 학점 수: " + Bcount);
		System.out.println("C 학점 수: " + Ccount);
		System.out.println("D 학점 수: " + Dcount);
		System.out.println("F 학점 수: " + Fcount);
		
		scan.close();
	}

}
