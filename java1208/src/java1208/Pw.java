package java1208;

import java.util.Scanner;

public class Pw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String password = "codehows";
		int count = 1;
			
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("비밀번호를 입력하세요.");
			password = scan.nextLine();
			
			if (password.equals("codehows")) {
				System.out.println("환영합니다.");
				break;
			} 
		
			if (count >= 3) {
				System.out.println("접속이 거부되었습니다.");
				break;
			}
			
			System.out.println("비밀번호가 틀렸습니다.");
			count++;
		}
		scan.close();
	}
}
