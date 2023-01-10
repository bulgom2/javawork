package java0109;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름, 학번과 학과를 입력하세요: (/로 구분)");
		String info = scan.nextLine();
		
		String[] tokens = info.split("/");
		System.out.println("이름: " + tokens[0]);
		System.out.println("학번: " + tokens[1]);
		System.out.println("학과: " + tokens[2]);
		
		scan.close();
	}

}
