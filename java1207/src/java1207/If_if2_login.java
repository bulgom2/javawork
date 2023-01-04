package java1207;

import java.util.Scanner;

public class If_if2_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String id, password;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ID: ");
		id = scan.nextLine();
		
		if (id.equals("java")) {			// 내용이 같은지 확인할 때 equals() 사용
			System.out.println("일-치");
			System.out.println("PW: ");
			password = scan.nextLine();
			if (password.equals("abc123")) {
				System.out.println("일-치");
				System.out.println("로그인 성공");
			} else {
				System.out.println("PW 불일치");
			  }
		} else {
			System.out.println("ID 불일치");
		  }	
		scan.close();
	}

}
