package java1209;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no1_numVote;
		int no2_numVote;
		int no1_total = 0;
		int no2_total = 0;
		int total = 0;
		String yn = "";
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("보고할 구가 있나요? (있으면 y, 없으면 n)");
			yn = scan.nextLine();
			
			if (yn.equals("y")) {
				System.out.println("첫번째 후보가 이 구에서 얻은 득표수를 입력하세요: ");
				no1_numVote = scan.nextInt();
				no1_total += no1_numVote;
				System.out.println("두번째 후보가 이 구에서 얻은 득표수를 입력하세요: ");
				no2_numVote = scan.nextInt();
				no2_total += no2_numVote;
				scan.nextLine();
			} else {
				total = no1_total + no2_total;
				break;
			}
		} while (yn.equals("y"));
		
		// int 끼리 나눠서 실수가 되면 표시가 안 되기 때문에 double로 바꿔주면 실수가 됨
		double rate1 = (no1_total / (double)total) * 100;		
		double rate2 = (no2_total / (double)total) * 100;
		
		System.out.println("첫번째 후보 총 투표수: " + no1_total);
		System.out.println("첫번째 후보 득표율: " + rate1);
	
		System.out.println("두번째 후보 총 투표수: " + no2_total);
		System.out.println("첫번째 후보 득표율: " + rate2);
		
		System.out.println("");
		
		if (rate1 > rate2) {
			System.out.println("첫번째 후보가 당선되었습니다.");
		} else if (rate1 < rate2) {
			System.out.println("두번째 후보가 당선되었습니다.");
		}
		
		scan.close();

	}

}
