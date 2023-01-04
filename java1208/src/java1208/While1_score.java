package java1208;

import java.util.Scanner;

public class While1_score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 시험점수(0~100) 사이 값만 입력
		int score;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("시험 점수(0과 100 사이의 정수)를 입력하세요.");
		score = scan.nextInt();
		
		// 사용자가 유효한 시험 점수를 입력할 때까지 계속 점수 입력을 요청한다.
		while(score < 0 || score > 100) {
			System.out.println("범위를 벗어난 시험 점수가 입력되었습니다.");
			System.out.print("시험 점수(0과 100 사이의 정수)를 입력하세요.");
			score = scan.nextInt();
		}
		// 시험 점수 출력
		System.out.println("시험점수: " + score);
		scan.close();
	}

}
