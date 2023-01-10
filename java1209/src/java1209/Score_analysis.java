package java1209;

import java.util.Scanner;

public class Score_analysis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int flag;
		int numStudent = 0;
		int[] scores=null;
		int hscore = 0;
		int total = 0;
		double avg = 0;
		
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("-------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-------------------------------------------------");
			System.out.print("선택> ");
			flag = scan.nextInt();
			
			switch(flag) {
			case 1:
				System.out.print("학생수> ");
				numStudent = scan.nextInt();
				scores = new int[numStudent];
				break;
			case 2:
				for (int i=0; i < numStudent; i++) {
					System.out.print("scores["+i+"]> ");
					scores[i] = scan.nextInt();
				}
				break;
			case 3:
				for (int i=0; i<numStudent; i++) {
					System.out.println("scores["+i+"]> " + scores[i]);
				}
				break;
			case 4:
				for (int i=0; i<numStudent; i++) {
					total += scores[i];
					for (int j=0; j<numStudent; j++) {
						if (scores[i] > scores[j]) {
							hscore = scores[i];
						}
					}
				}
				System.out.println("최고점수: " + hscore);
				avg = (double) total / numStudent;
				System.out.printf("평균점수: %.1f \n", avg);
				break;
			default:
			}
		} while(flag!=5);
		System.out.println("프로그램 종료");
		
		scan.close();

	}

}
