package java1207;

import java.util.Scanner;
import java.text.DecimalFormat;

public class If_if10_10discounts_df {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalFormat df = new DecimalFormat("###,###"); // 천단위 콤마 찍는 법
		int ea;
		int price = 100000;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("주문 수량을 입력하세요.");
		ea = scan.nextInt();
		
		System.out.println("제품 가격: 100,000원");
		System.out.println("주문 수량: " + ea + "개");
		int total = price * ea;
		if (ea >= 10) {
			System.out.println("합계: " + df.format(total) + "원");
			System.out.println("할인가: " + df.format((int)(total * 0.9)) + "원");
		} else {
			System.out.println("합계: " + df.format(total) + "원");
		}
		scan.close();
	}
}
