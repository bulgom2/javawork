package java1207;

import java.util.Scanner;

public class If_if16_bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int balance;
		int thisMonth;
		double interest = 0;
		double n_balance = 0;
		double deposit = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("이전 잔고(미결제금액): ");
		balance = scan.nextInt();
		System.out.println("당월 사용 금액: ");
		thisMonth = scan.nextInt();
		
		if (balance > 0 ) {
			interest = (balance + thisMonth) * 0.02;
			n_balance = balance + thisMonth + interest;
		}
		
		if (n_balance < 100000) {
			deposit = n_balance;
		} else if (n_balance <= 300000) {
			deposit = 100000;
		} else {
			deposit = n_balance * 0.2;
		} 
		
		System.out.println("당월 카드 이용 대금 명세서");
		System.out.println("==========================");
		System.out.println("미결제금액: " + balance + "원");
		System.out.println("당월 사용금액: " + thisMonth + "원");
		System.out.println("연체이자: " + interest + "원\n");
		System.out.println("입금 총 금액: " + n_balance + "원");
		System.out.println("최소입금액: " + deposit + "원");
		
		scan.close();
	}

}
