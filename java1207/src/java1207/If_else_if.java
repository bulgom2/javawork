package java1207;

import java.util.Scanner;

public class If_else_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age;
		Scanner scan = new Scanner(System.in);
		System.out.println("나이를 입력하세요: ");
//		String tmp = scan.nextLine();			
//		age = Integer.parseInt(tmp);			// 값을 문자형으로 받을 경우 숫자로 변환하는 법
		age = scan.nextInt();
	
		if (age > 64) {
			System.out.println("고령입니다.");
			System.out.println("고령 요금이 적용됩니다.");	
		}
		  else if (age > 19) {
			System.out.println("성인입니다.");
			System.out.println("성인 요금이 적용됩니다.");	
		} else if (age > 13) {
			System.out.println("청소년입니다.");
			System.out.println("청소년 요금이 적용됩니다.");
		} else if (age > 8) {
			System.out.println("어린이입니다.");
			System.out.println("어린이 요금이 적용됩니다.");
		} else {
			System.out.println("유아입니다.");
			System.out.println("유아 요금이 적용됩니다.");
		}
		System.out.println("결제를 진행해 주세요.");
		
		scan.close();
		
	}

}
