package java1214.exercise1214;

import java.util.Random;
import java.util.Scanner;

public class Object4_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random generator = new Random();
		int answer = generator.nextInt(100) + 1;
		int input = 0;
		int count = 0;
				
		Scanner scan = new Scanner(System.in);
		
		do {
			count++;
			System.out.print("1과 100 사이의 값을 입력하세요.");
			input = scan.nextInt();
			
			if (input > answer) {
				 System.out.println("입력한 정수보다 작습니다.");
			 } else if (input < answer) {
				 System.out.println("입력한 정수보다 큽니다.");
			 } else if (input == answer) {
				 System.out.println("정답입니다!");
				 System.out.println("시도 횟수: " + count);
				 break;
			 }
		} while(true);
		scan.close();
	}
}
