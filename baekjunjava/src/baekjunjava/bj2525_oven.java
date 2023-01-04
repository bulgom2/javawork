package baekjunjava;

import java.util.Scanner;

public class bj2525_oven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int h = scan.nextInt();
		int m = scan.nextInt();
		int timer = scan.nextInt();
		m += timer;

			h += m/60;
			m %= 60;
			h %= 24;
			
		System.out.println(h +" "+ m);
		scan.close();
	}

}


//
//if (h+(m/60) > 23) {
//	h = h+(m/60)-24;
//
//} else {
//	h = h+(m/60);
//}
//m += m % 60;
//System.out.println(h + " " + m);