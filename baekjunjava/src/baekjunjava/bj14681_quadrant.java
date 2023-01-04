package baekjunjava;

import java.util.Scanner;

public class bj14681_quadrant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x, y;
		int q = 0;
		
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		y = scan.nextInt();
		
		if (x > 0) {
			if (y > 0) {
				q = 1;
			} else if (y < 0) {
				q = 4;
			}
		} else if (x < 0) {
			if (y > 0) {
				q = 2;
			} else if (y < 0) {
				q = 3;
			}
		}
		System.out.println(q);
		scan.close();
	}

}
