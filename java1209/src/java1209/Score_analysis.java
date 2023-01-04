package java1209;

import java.util.Scanner;

public class Score_analysis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int flag;
		int numStudent = 0;
		int[] scores=null;
		
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
				
				break;
			case 4:
				
				break;
			default:
			}
		}while(flag!=5);
		
		scan.close();

	}

}
