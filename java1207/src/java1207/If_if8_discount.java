package java1207;

import java.util.Scanner;

public class If_if8_discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int purchase;
		int total;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("구매금액을 입력하세요.");
		purchase = scan.nextInt();
		
		System.out.println("구매금액: " + purchase);
		if (purchase >= 300000) {
			total = (purchase - 30000);
		} else if (purchase >= 100000) {
			total = (purchase - 5000);
		} else {
			total = (purchase - 0);
		}
		System.out.println("청구 금액: " + total);
		
		scan.close();
	}
}
