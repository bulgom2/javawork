package java0110;

import java.util.Scanner;

public class Practice2Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String flag = "";
		int count = 0;
		Practice2 prac2 = new Practice2();
		Scanner scan = new Scanner(System.in);
		int[] num = new int[100];

		do {
			System.out.println("숫자를 입력하세요");
			num[count] = scan.nextInt();
			count++;
			scan.nextLine();
			System.out.println("계속하시겠습니까 y/n");
			flag = scan.nextLine();
			
		} while (!flag.equals("n"));
		
		int[] num1 = new int[count];
		
		for(int i = 0; i < num1.length; i++) {
			num1[i] = num[i];
		}
		System.out.println(prac2.sum(num1));
		System.out.println(prac2.avg(num1));

		scan.close();
	}

}
