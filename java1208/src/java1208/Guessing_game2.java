package java1208;

import java.util.Random;
import java.util.Scanner;

public class Guessing_game2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Random generator = new Random();
		 int answer = generator.nextInt(100) + 1;
		 int guess;
		 int tries = 0;
		 int stop = 0;
		 
		 Scanner scan = new Scanner(System.in);
		 
		 do {
			 System.out.println("1~100 사이 정수를 입력하세요.");
			 guess = scan.nextInt();
			 tries++;
			 
			 if (guess > answer) {
				 System.out.println("입력한 정수보다 작습니다.");
			 } else if (guess < answer) {
				 System.out.println("입력한 정수보다 큽니다.");
			 } else if (guess == answer) {
				 System.out.println("정답입니다!");
				 System.out.println("숫자 맞추기 게임을 끝내시려면 -1를 입력하세요.");
				 stop = scan.nextInt();
			}

		 } while(stop != -1 );
		 
		 System.out.println("게임이 종료되었습니다. 시도횟수: " + tries);
		 scan.close();
	}
}
