package baekjunjava;

import java.util.Scanner;

public class bj2438_star1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		for(int i=1;i<=N;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		scan.close();
	}
}
