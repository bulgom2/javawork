package java0109;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("과일 이름을 입력하세요.");
		String fruits = scan.nextLine();
		String[] arr = fruits.split(" ");
		for (int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}
		scan.close();
		
	}

}
