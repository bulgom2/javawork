package java1207;

import java.util.Scanner;

public class If_if4_graduate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int totalcreditearned;
		int toeic;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("총 이수학점을 입력하세요.");
		totalcreditearned = scan.nextInt();
		System.out.println("토익 점수를 입력하세요.");
		toeic = scan.nextInt();
	
		System.out.println("================");
		System.out.println("총 이수학점: " + totalcreditearned);
		System.out.println("토익 점수: " + toeic);
		if (totalcreditearned >= 140 && toeic >= 700) {
			System.out.println("졸업을 축하합니다.");	
		} else if (totalcreditearned >= 140 && toeic < 700) {
			System.out.println("수료하셨습니다.");
		} else {
			System.out.println("졸업이 불가합니다.");
		}
		System.out.println("================");
		
/*		//중첩 if 다른 예시
		if (totalcreditearned >= 140) {
			if (toeic >= 700) {
				System.out.println("졸업을 축하합니다.");
			} else {
				System.out.println("수료하셨습니다.");
			}
		} else {
			System.out.println("졸업이 불가합니다.");
		}
*/
		scan.close();
		
	}

}
