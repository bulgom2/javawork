package ch12;

import java.util.Arrays;
import java.util.Random;

public class RandomEx2 {


	public static void main(String[] args) {
		boolean flag = true;
		int count =0;
		Random random = new Random();
		// 당첨번호
		int[] winningNumber = new int[6];	// 당첨번호 6개가 저장될 배열 생성
		
		for(int i=0; i<6; i++) {			// 당첨번호 6개를 얻어 배열에 저장
			winningNumber[i] = random.nextInt(45) + 1;
		}
		Arrays.sort(winningNumber);

		
		do {
		// 선택번호
		int[] selectNumber = new int[6];	// 선택번호 6개가 저장될 배열 생성
				// 선택번호를 얻기 위한 Random 객체 생성
		for(int i=0; i<6; i++) {			// 선택번호 6개를 얻어 배열에 저장
			selectNumber[i] = random.nextInt(45) + 1;
		}
		Arrays.sort(selectNumber);
		
		System.out.print("선택번호: ");
		for(int i=0; i<6; i++) {			// 선택번호 6개를 얻어 배열에 저장
			System.out.print(selectNumber[i] + " ");
		}
		
		for(int i=0; i<6; i++) {			// 선택번호 6개를 얻어 배열에 저장
			if(selectNumber[i] != winningNumber[i]) break;
			if(i==3 && selectNumber[i] == winningNumber[i]) flag = false;
		}
		count++;
		System.out.println();
		} while(flag);
		
		// 당첨여부
		// 비교 전 배열 항목을 정렬시킴
		
		System.out.println(count);
		System.out.print("당첨번호: ");
		for(int i=0; i<6; i++) {			// 당첨번호 6개를 얻어 배열에 저장
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println();
//		boolean result = Arrays.equals(selectNumber, winningNumber);
//		System.out.print("당첨여부: ");
//		if(result) {
//			System.out.println("1등에 당첨되셨습니다.");
//		} else {
//			System.out.println("당첨되지 않았습니다.");
//		}
	}
}