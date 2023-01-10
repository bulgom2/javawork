package java0109;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요.");
		String name = scan.nextLine();
		System.out.println("생년월일(mm/dd/yy)을 입력하세요.");
		String birth = scan.nextLine();
		
		String month = birth.substring(0,2);
		String day = birth.substring(3,5);
		String year = birth.substring(6);
		String birth2 = (year + "년 " + month + "월 " + day + "일 ");
		
		System.out.println("이름: " + name);
		System.out.println("생년월일: " + birth2);
		
		scan.close();
	}

}
