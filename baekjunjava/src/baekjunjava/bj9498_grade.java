package baekjunjava;

import java.util.Scanner;

public class bj9498_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		score = score / 10;
		String grade;
		
		switch(score) {
		case 10:
		case 9: grade = "A";
			break;
		case 8: grade = "B";
			break;
		case 7: grade = "C";
			break;
		case 6: grade = "D";
			break;
		default: grade = "F";
			break;
		}
		System.out.println(grade);
		scan.close();
	}

}
