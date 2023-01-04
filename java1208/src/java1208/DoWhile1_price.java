package java1208;

import java.util.Scanner;

public class DoWhile1_price {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int price;
		int total;
		
		Scanner scan = new Scanner(System.in);
		
		//합계 값 초기화
		total = 0;
		
		// 구매한 상품 가격들의 합계가 100000원을 초과할 때까지 반복
		do {
			System.out.print("구매한 상품의 가격을 입력하세요.");
			price = scan.nextInt();
			
// 다른방법도 있음 //		
//			if (total <= 100000) {
//				break;
//			}
//			while(true);
			
			// 상품 가격을 누적시켜 합계에 넣어줌
			total += price;
			
		} while (total <= 100000);
		
		// 합계를 출력
		System.out.println("총 구매 가격: " + total);
		scan.close();
	}
}
