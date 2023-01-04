package java1207;

import java.util.Scanner;

public class If_if11_movierate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("나이를 입력하세요.");
		age = scan.nextInt();
		
		if (age >= 19) {
			System.out.println("영화를 볼 수 있습니다.");
		} else if (age >= 15) {
			System.out.println("성인이 동반한 경우에만 영화를 볼 수 있습니다.");
		} else {
			System.out.println("영화를 볼 수 없습니다.");
		}
		scan.close();
	}

}
