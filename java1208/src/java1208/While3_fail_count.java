package java1208;

import java.util.Scanner;

public class While3_fail_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score;
		int numStudents = 0;
		int numPass = 0;
		int numFail = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 점수를 입력하세요.(종료: 음수 입력)");
		score = scan.nextInt();
		
		while (score >= 0) {
			numStudents++;
			
			if (score >= 60) numPass++;
			else numFail++;
			
			System.out.print("다음 점수를 입력하세요.(종료: 음수 입력)");
			score = scan.nextInt();
		}
		System.out.println();
		System.out.println("총 학생 수: " + numStudents);
		System.out.println("통과 학생 수: " + numPass);
		System.out.println("낙제 학생 수: " + numFail);
		scan.close();
	}

}
