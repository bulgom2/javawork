package baekjunjava;

import java.util.Scanner;

public class bj2480_dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int d1, d2, d3;
		int prize;
		
		Scanner scan = new Scanner(System.in);
		
		d1 = scan.nextInt();
		d2 = scan.nextInt();
		d3 = scan.nextInt();
		
		if ( d1 == d2 && d2 == d3) {
			prize = 10000 + d1 * 1000;
		} else if (d1 == d2 && d1 != d3  || d1 == d3 && d1 != d2) {
			prize = 1000 + d1 * 100;
		} else if(d1 != d2 && d2 == d3) {
			prize = 1000 + d2 * 100;
		} else {
			if(d1 > d2 && d1 > d3) {
				prize = d1 * 100;
			} else if(d2 > d1 && d2 > d3) {
				prize = d2 * 100;
			}else {
				prize = d3 * 100;
			}
		
		}
		System.out.println(prize);	

		scan.close();
	
		
		
	}

}
