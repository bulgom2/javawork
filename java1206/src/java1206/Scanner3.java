package java1206;

import java.util.Scanner;

public class Scanner3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int int1, int2, pl, mi, mt;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 정수: ");
		int1 = scan.nextInt();
		System.out.print("두번째 정수: ");
		int2 = scan.nextInt();
		
		pl = int1 + int2;
		mi = int1 - int2;
		mt = int1 * int2;
		System.out.println("합 = " + pl);
		System.out.println("차 = " + mi);
		System.out.println("곱 = " + mt);
		
		scan.close();
	}

}
