package java1209;

import java.util.Scanner;
import java.util.Arrays;


public class Array_arrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] score = null;
		int numInt = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력할 정수의 개수를 입력하세요: ");
		numInt = scan.nextInt();
		score = new int[numInt];
		
		for (int i=0; i<numInt; i++) {
			System.out.println("숫자를 입력하세요: ");
			score[i] = scan.nextInt();
		}
		System.out.println("입력한 숫자: " + Arrays.toString(score));
		
		// 역순 정렬
		for (int i=0; i<score.length; i++) {
			for (int j=i+1; j<score.length; j++) {
					int temp = score[i];	
					score[i] = score[j];	
					score[j] = temp;		
			}
		}
		System.out.println("역순 정렬: " + Arrays.toString(score));
		
		// 오름차순 정렬
		for (int i=0; i<score.length; i++) {
			for (int j=i+1; j<score.length; j++) {
				if(score[i] > score[j]) {
					int temp = score[i];	
					score[i] = score[j];	
					score[j] = temp;		
				}
			}
		}
		System.out.println("오름차순 정렬: " + Arrays.toString(score));
		
		// 내림차순
		for (int i=0; i<score.length; i++) {
			for (int j=i+1; j<score.length; j++) {
				if(score[i] < score[j]) {
					int temp = score[i];	
					score[i] = score[j];	
					score[j] = temp;		
				}
			}
		}
		System.out.println("내림차순 정렬: " + Arrays.toString(score));
		scan.close();
	}

}
