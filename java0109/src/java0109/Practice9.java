package java0109;

import java.util.Scanner;

public class Practice9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("행을 입력하세요: ");
		int row = scan.nextInt();
		char[][] arr = new char[row][];
		//arr{{1,2,3},{2,3,4},{3,4,5}}
		for (int i=0; i<=row-1; i++) {
			System.out.println(i + "번째 열을 입력하세요: ");
			int column = scan.nextInt();
			arr[i] = new char[column];
		}
		//char ch = 'a';
		//for // 행 i로 결정(i를 arr.length 앞까지)
			//이중 for j는 열을 결정(arr[i].length 앞까지)
				//a 부터 순차적으로 a++		
		char ch = 'a';
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				arr[i][j] = ch++;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
