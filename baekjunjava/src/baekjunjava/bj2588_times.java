package baekjunjava;

import java.util.Scanner;

public class bj2588_times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tmp;
		int hund;
		int ten;
		int one;
		
		Scanner scan = new Scanner(System.in);
		int first = scan.nextInt();
		int second = scan.nextInt();
		
		hund = second / 100;
		tmp = second % 100;
		ten = tmp / 10;
		tmp = tmp % 10;
		one = tmp / 1;
		System.out.println(first * one);
		System.out.println(first * ten);
		System.out.println(first * hund);
		System.out.println(first * second);
		
		scan.close();
	}

}
