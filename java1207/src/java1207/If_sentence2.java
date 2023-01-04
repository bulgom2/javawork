package java1207;

import java.util.Scanner;

public class If_sentence2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("시험 점수 입력: ");
		int testScore = scan.nextInt();
		System.out.println("면접 점수 입력: ");
		int interviewScore = scan.nextInt();
		
		if (testScore >= 80 && interviewScore >= 60) {
			System.out.println("합격을 축하드립니다.");
			} else {
				System.out.println("불합격입니다.");
			}
		scan.close();
	}

}
