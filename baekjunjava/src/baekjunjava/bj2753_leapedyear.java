package baekjunjava;

import java.util.Scanner;

public class bj2753_leapedyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int yn = 0;
		
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		
		if (year % 4 == 0) {
			if (year % 100 != 0) {
				yn = 1;
			}	else if (year % 400 == 0) {
				yn = 1;
			} else {
				yn = 0;
			}
		} else {
			yn = 0;
		}
		System.out.println(yn);
		scan.close();
	}

}
