package java1207;

import java.util.Scanner;

public class If_if15_leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year;

		Scanner scan = new Scanner(System.in);
		System.out.println("연도를 입력하세요.");
		year = scan.nextInt();
		
		int d4 = (year % 4);
		int d100 = (year % 100);
		int d400 = (year % 400);
		
		if (d4 == 0) {		// 4로 나눠질 때
			if (d100 != 0) {		// 4로 나눠지면서 100으로 안 나눠질 때
				System.out.println(year + "년은 윤년입니다.");
			} else if (d400 == 0) {		// 4로 나눠지면서 100으로도 나눠지면서 400으로도 나눠질 때
				System.out.println(year + "년은 윤년입니다.");
			} else {		// 4로 나눠지면서 100으로도 나눠지면서 400으로는 안 나눠질 때 
				System.out.println(year + "년은 윤년이 아닙니다.");
			}
		} else {	// 4로 안 나눠질 
			System.out.println(year + "년은 윤년이 아닙니다.");
		}
		scan.close();
	}
}
