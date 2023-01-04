package java1208;

import java.util.Scanner;

public class Change_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int price;
		int change;
		int temp;
		double change100;
		double change10;
		double change1;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("구매금액을 입력하세요. [0-500]");
		price = scan.nextInt();
		
		change = 500 - price;
		change100 = change / 100;
		temp = change % 100;
		change10 = temp / 10;
		temp = temp % 10;
		change1 = temp / 1;
		
		System.out.println(price + "원의 거스름돈은 다음과 같다.");
		System.out.println("100원짜리 동전: " + (int)change100);
		System.out.println("10원짜리 동전: " + (int)change10);
		System.out.println("1원짜리 동전: " + (int)change1);
		
		scan.close();
	}
}
