package baekjunjava;

import java.util.Scanner;

public class bj2884_alarm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int m = scan.nextInt();
		
		m -= 45;
		if (m < 0) {		
			h = h -1;
				if (h < 0) {
					h = 23;
				}
			m += 60;
		}
		System.out.println(h + " " + m);
		scan.close();
	}

}
