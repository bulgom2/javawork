package java1208;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Taxi_driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat df = new DecimalFormat("###,###");
		int fare;
		int total = 0;
		String name = "";		// String 초기값
				
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("손님의 이름을 입력해주세요.");
			name = scan.nextLine();
			System.out.println("요금을 입력해주세요.");
			fare = scan.nextInt();
			total += fare;
			scan.nextLine();
			
			if (name.equals("워드")) {
				break;
			}
		}
		System.out.println("총 수입은 " + df.format(total) + "원 입니다.");
		scan.close();
	}

}
