package java1207;

import java.util.Scanner;

public class If_if6_cheating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/// boolean 으로 부정행위 값 받는 법 ///
/// 	boolean cheat;		
///		char cheatFalse = 'X';
///		char cheatTrue = 'O';
		
		String cheat;
		int present;
		int total;
		
		Scanner scan = new Scanner(System.in);

///		System.out.println("부정행위 여부");
///		cheat = scan.nextBoolean();		
		System.out.println("부정행위 여부 [O/X]");	// cheat의 출력값을 O/X로 표시되게 설정함
		cheat = scan.nextLine();

		System.out.println("출석률");
		present = scan.nextInt();
		System.out.println("총점");
		total = scan.nextInt();
		
///		if (cheat == false) {
///			System.out.println("부정행위 여부: " + cheatFalse);
///		} else {
///			System.out.println("부정행위 여부: " + cheatTrue);
///		}
		System.out.println("부정행위 여부: " + cheat);
		System.out.println("출석률: " + present);
		System.out.println("총점: " + total);

/// 	if (cheat == false) {}
		if (cheat.equals("X")||cheat.equals("x")) {
			if (present >= 80) {
				if (total >= 90) {
					System.out.println("학점: A");
				} else if(total >= 80) {
					System.out.println("학점: B");
				} else if(total >= 70) {
					System.out.println("학점: C");
				} else if(total >= 60) {
					System.out.println("학점: D");				
				} else {
					System.out.println("학점: F");
				}
			} else {
				System.out.println("학점: F");
			}
		} else {
			System.out.println("학점: F");
		}
		scan.close();
	}
}
