package java1208;

import java.util.Random;
import java.util.Scanner;

public class Guessing_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random generator = new Random();
		int answer = generator.nextInt(10) + 1;
		int guess;

		Scanner scan = new Scanner(System.in);
		
		
		do {
			System.out.println("추측한 숫자를 입력하세요: ");
			guess = scan.nextInt();
			
			if (guess > answer) {
				System.out.println("입력한 숫자보다 작습니다.");
			} else if (guess < answer) {
				System.out.println("입력한 숫자보다 큽니다.");
			}
		} while (guess != answer);
		
		System.out.println("정답입니다!");
		
		scan.close();
		
	}

}
