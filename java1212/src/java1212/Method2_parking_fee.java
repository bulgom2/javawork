package java1212;

import java.util.Scanner;

public class Method2_parking_fee {
	
	public static double parkingFee(double n) {
		double fee = 0;
		if (n <= 1.0 && n > 0) {
			fee = 1000;
			System.out.println("주차요금: " + (int)fee + "원");
		} else if (n > 1.0 && n <= 24.0) {
				fee = ((Math.ceil(n)-1.0)*500 + 1000);
				if (fee > 10000) {
					fee = 10000;
				}
				System.out.println("주차요금: " + (int)fee + "원");
		} 
		return fee;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double in_time = 0;
		double out_time = 0;
		double ptime;
		String flag = "";
		double sum_fee = 0;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("입차시간: ");
			in_time = scan.nextDouble();
			System.out.println("출차시간: ");
			out_time = scan.nextDouble();
			scan.nextLine();
		
			ptime = (out_time - in_time);
			sum_fee += parkingFee(ptime);
			 
			System.out.println("계속 하시려면 y를 누르세요.");
			flag=scan.nextLine();
		
		} while (flag.equals("y"));		
		System.out.println("누적 주차요금: " + (int)sum_fee + "원");
		scan.close();
	}
}
	
//	public static int parking_fee(double in_time, double out_time) {
//		
//		while (out_time < 24.0) {
//			
//		}
		
		
		
		
		
	


