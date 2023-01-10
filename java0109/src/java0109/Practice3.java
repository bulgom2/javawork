package java0109;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("한 줄의 문장을 입력하세요.");
		String autumn = scan.nextLine();
		
		if (autumn.contains("가을")) {
			System.out.println(autumn.replace("가을", "봄"));
		}
		scan.close();
	}

}
