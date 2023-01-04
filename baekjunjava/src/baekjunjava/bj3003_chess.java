package baekjunjava;

import java.util.Scanner;

public class bj3003_chess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int king = scan.nextInt();
		int queen = scan.nextInt();
		int rook = scan.nextInt();
		int knight = scan.nextInt();
		int bishop = scan.nextInt();
		int pawn = scan.nextInt();
		
		System.out.print(1 - king + " ");
		System.out.print(1 - queen + " ");
		System.out.print(2 - rook + " ");
		System.out.print(2 - knight + " ");
		System.out.print(2 - bishop + " ");
		System.out.print(8 - pawn + " ");
		
		scan.close();
	}

}
