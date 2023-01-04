package java1208;

import java.util.Scanner;

public class Switch2_y_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("말해 YES or NO");
		String yn = scan.nextLine();
		
		switch(yn) {	// 다른 값을 하나의 결과로 출력할 때 케이스 조건을 쌓아서 쓰면 됨
			case "YES":
			case "Yes":
			case "yes":
			case "y":
			case "Y":
			case "예":
			case "네":
				System.out.println("Yes를 선택하셨습니다.");
				break;
			case "NO":
			case "No":
			case "no":
			case "n":
			case "N":
			case "아니오":
			case "아니요":
				System.out.println("No를 선택하셨습니다.");
				break;
			default:
				System.out.println("입력이 잘못됐습니다.");
				break;	
		}
		
		scan.close();
	}

}
