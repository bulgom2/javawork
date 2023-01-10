package java0106;

import java.util.Scanner;

public class If_dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String flag = "n";
		int count = 0;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		
		Scanner scan = new Scanner(System.in);		
		
		do {
		count++;
		int dice1 = (int)(Math.random() * 6) +1;
		int dice2 = (int)(Math.random() * 6) +1;
		
		
		System.out.println(dice1);
		System.out.println(dice2);
		
		switch (dice1) {
		case 1: one++;
		 	break;
		case 2: two++;
			break;
		case 3: three++;
			break;
		case 4: four++;
			break;
		case 5: five++;
			break;
		default: six++;
			break;		
		}
		
		switch (dice2) {
		case 1: one++;
		 	break;
		case 2: two++;
			break;
		case 3: three++;
			break;
		case 4: four++;
			break;
		case 5: five++;
			break;
		default: six++;
			break;		
		}
		
		if (dice1 == dice2) {
			System.out.println("더블입니다!");
			System.out.println("주사위 던진 횟수: " + count);
			
			flag = "y";
		} else {
			System.out.println("주사위 던진 횟수: " + count);
			
			System.out.println("계속 던지시겠습니까? (y/n)");
			flag = scan.nextLine();
		}
		
		} while (flag.equals("y"));
		System.out.println("1번: " + one);
		System.out.println("2번: " + two);
		System.out.println("3번: " + three);
		System.out.println("4번: " + four);
		System.out.println("5번: " + five);
		System.out.println("6번: " + six);
		
		scan.close();
	}

}
