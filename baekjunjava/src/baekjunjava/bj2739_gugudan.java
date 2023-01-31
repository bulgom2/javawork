package baekjunjava;

import java.util.Scanner;

public class bj2739_gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(N + " * " + i + " = " + (N*i));
		}
		scan.close();
	}
}
