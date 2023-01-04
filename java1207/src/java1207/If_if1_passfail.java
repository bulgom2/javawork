package java1207;

import java.util.Scanner;

public class If_if1_passfail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Score;
		int ivScore;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("시험 점수를 입력하세요.");
		Score = scan.nextInt();
		
		if (Score >= 80) {
			System.out.println("면접 대상입니다.");
			System.out.println("면접 점수를 입력하세요.");
			ivScore = scan.nextInt();
			if (ivScore >= 60) {
				System.out.println("합격입니다.");
			} else {
				System.out.println("면접 불합격입니다.");
			}
		}	else {
			System.out.println("불합격");
			}
		scan.close();
	}
	

}
